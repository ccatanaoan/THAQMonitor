B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=6
@EndOfDesignText@
'Class clXToastMessage
'Description : shows a Toast Message similar to ToastMessageShow in B4A
'Author: UDG
'Revision: 0.3
'Last revision date: 2018-04-30

Sub Class_Globals
#if B4J
	Private fx As JFX
#else if B4A
	Private su As StringUtils
#end if
	Private xui As XUI
	Private mBase As B4XView				'base panel from calling Activity(B4A), Form (B4J), Page (B4i)
	Private mPanel As B4XView				'panel holding the message label
	Private mLbl As B4XView					'message label
	Private mPanelPos As Int				'message position relative to mBase
	Private TMList As List					'list of toast messages to display
	Private tempSettings As Map				'temporary settings for internal TM components
	Private displaying As Boolean			'True = a TM is currently displaying
	Private fading As Boolean				'True = fade effect 
	Private timer1 As Timer
	Public CONST TMPOS_TOP As Int = 0		'constant to set toast message position relative to mBase
	Public CONST TMPOS_CENTER As Int = 1	'			"			"		"		"
	Public CONST TMPOS_BOTTOM As Int = 2	'			"			"		"		"
	Public CONST VPOS_TOP As Int = 0		'constant to vertically set message label in its panel
	Public CONST VPOS_CENTER As Int = 1		'			"			"		"		"
	Public CONST VPOS_BOTTOM As Int = 2		'			"			"		"		"
	Public CONST HPOS_LEFT As Int = 0		'constant to horizontally set message label in its panel
	Public CONST HPOS_CENTER As Int = 1		'			"			"		"		"
	Public CONST HPOS_RIGHT As Int = 2		'			"			"		"		"
	Private CONST arHpos(3) As String = Array As String ("LEFT", "CENTER", "RIGHT")
	Private CONST arVpos(3) As String = Array As String ("TOP", "CENTER", "BOTTOM")
End Sub

'Initializes the object. 
'Base could be an Activity (B4A), MainForm.RootPane (B4J), Page1.RootPanel (B4i) or any other panel.
Public Sub Initialize(Base As B4XView)
	mBase = Base
	mBase.Tag = Me
	Dim l1 As Label
	l1.Initialize("")
#if B4A
	l1.SingleLine = False
#else if B4J
	l1.WrapText = True
#else If B4i
	l1.Multiline = True
#end if
	mLbl = l1
	mPanel = xui.CreatePanel("")
	mPanel.Visible = True
	mPanel.AddView(mLbl,5dip,0dip,mBase.Width-20dip,10dip)
	tempSettings = DuplicateMap(MakeDefaults)				'create and save default settings for TM internal components 
	TMList.initialize
	TMList.Add(DuplicateMap(tempSettings))					'save defaults to TMlist
	displaying = False
	fading = False
	timer1.Initialize("timer1", 2000)						'timer default setting on short duration
End Sub

'Returns a Map sporting default values for TM internal components
Private Sub MakeDefaults As Map
	Dim m1 As Map
	m1.Initialize
	'panel default options
	m1.Put("pColor",xui.Color_DarkGray)						'Background panel color
	m1.Put("pBColor",xui.Color_DarkGray)					'Background border color
	m1.Put("pBWidth", 0dip)									'Background border width
	m1.Put("pBRadius", 0dip)								'Background border radius
	m1.Put("pPos", TMPOS_BOTTOM)
	'label default options
	m1.Put("lTSize", 15)									'Message label text size
	m1.Put("lTColor", (xui.Color_White))					'Message label text color
	m1.Put("lHAlign", (HPOS_LEFT))							'Message label horizontal position
	m1.Put("lVAlign", (VPOS_CENTER))						'Message label vertical position
	'display duration options
	m1.Put("dShort", 2000)									'Message  display time, short duration
	m1.Put("dLong", 3000)									'Message  display time, long duration
	Return m1
End Sub

'Sets default values for the Toast Message internal components
'Background panel is darkgrey, no border, no radius; its position relative to its parent is BOTTOM
'Message label has size 15, color white; its alignment in the background panel is LEFT (horizontal) - CENTER (vertical)
'Display duration: short = 2s; long = 3s
Public Sub SetTMDefaults
	Dim m As Map = TMList.Get(0)
	tempSettings = DuplicateMap(m)
End Sub

'Sets short and long durations (in milliseconds) for message showing
Public Sub SetTMDuration(ShortDuration As Int, LongDuration As Int)
	tempSettings.Put("dShort", ShortDuration)
	tempSettings.Put("dLong", LongDuration)
End Sub

'Sets Backgroud color, Border width, color and radius for panel holding the Toast Message
Public Sub SetTMBackground(BackgroundColor As Object, BorderWidth As Double, BorderColor As Object, BorderCornerRadius As Double)
	tempSettings.Put("pColor",xui.PaintOrColorToColor(BackgroundColor))
	tempSettings.Put("pBColor",xui.PaintOrColorToColor(BorderColor))
	tempSettings.Put("pBWidth", BorderWidth)
	tempSettings.Put("pBRadius", BorderCornerRadius)
End Sub

'Sets Text message properties: text size, horizontal alignment, vertical alignment, text color
'Vertical Alignment values: VPOS_TOP, VPOS_CENTER or VPOS_BOTTOM
'Horizontal Alignment values: HPOS_LEFT, HPOS_CENTER, or HPOS_RIGHT
Public Sub SetTMTextProp(aSize As Double, HAlignment As Int, VAlignment As Int, aColor As Object)
	tempSettings.Put("lTSize", aSize)
	If HAlignment >=0 And HAlignment <=2 Then tempSettings.Put("lHAlign", (HAlignment))
	If VAlignment >=0 And VAlignment <=2 Then tempSettings.Put("lVAlign", (VAlignment))
	tempSettings.Put("lTColor", (xui.PaintOrColorToColor(aColor)))	
End Sub

'Sets the position (TMPOS_TOP, TMPOS_CENTER or TMPOS_BOTTOM) where the Toast Message should be displayed relative to its parent
Public Sub SetTMPosition(aPos As Int)
	If aPos >=0 And aPos <= 2 Then tempSettings.Put("pPos", aPos)
End Sub

'Shows toast message or queues it for later showing
'LongDuration: True = use long duration setting (default 3s); False = use short duration setting (2s)
'FadeEffect: True = use fade in/ fade ou effect; False = use immediate showing/clearing
Public Sub TMShow (Message As String, LongDuration As Boolean, FadeEffect As Boolean)
	'push parameters to FIFO list
	tempSettings.Put("lText", Message)
	tempSettings.Put("tmfade", FadeEffect)
	tempSettings.Put("tmdur", LongDuration)
	TMList.Add(DuplicateMap(tempSettings))
	If displaying Then Return
	ShowMessage
End Sub

'Like TMShow but it first stops abruptly an eventually displaying toast message
Public Sub TMClearAndShow(Message As String, LongDuration As Boolean, FadeEffect As Boolean)
	timer1.Enabled = False
	displaying = False
	TMList.Clear
	Dim m1 As Map = DuplicateMap(MakeDefaults)
	TMList.Add(m1)														'item #0 = defaults
	For i = 0 To m1.Size - 1
		If Not(tempSettings.ContainsKey(m1.GetKeyAt(i))) Then _
			tempSettings.Put(m1.GetKeyAt(i), m1.GetValueAt(i))
	Next
	'push parameters to FIFO list
	tempSettings.Put("lText", Message)
	tempSettings.Put("tmfade", FadeEffect)
	tempSettings.Put("tmdur", LongDuration)
	TMList.Add(DuplicateMap(tempSettings))								'item #1 = message to show
	mPanel.RemoveViewFromParent
	mBase.Tag = Null
	ShowMessage
End Sub

'Internal sub that manages TM showing based on relative options
Private Sub ShowMessage
	Dim m As Map = TMList.Get(1)										'item #1 = message to show
	'set options based on settings saved along the message
	mPanel.SetColorAndBorder(xui.PaintOrColorToColor(m.Get("pColor")), m.Get("pBWidth"), xui.PaintOrColorToColor(m.Get("pBColor")), m.Get("pBRadius"))
	mLbl.TextSize = m.Get("lTSize")
	Dim hpos,vpos As String
	hpos = arHpos(m.Get("lHAlign"))
	vpos = arVpos(m.Get("lVAlign"))
	mLbl.SetTextAlignment(vpos, hpos)
	mLbl.TextColor = xui.PaintOrColorToColor(m.Get("lTColor"))
	mLbl.Text = m.Get("lText") 'Message
	mPanelPos = m.Get("pPos")
	Private LDuration, SDuration As Int
	SDuration = m.get("dShort")
	LDuration = m.get("dLong")
	'determine message height based on context (B4A, B4J, B4i)
#if B4J		
	Dim onerow As Double = MeasureMultilineTextHeight(fx.DefaultFont(mLbl.TextSize), mBase.Width, "a")
	mLbl.Height = MeasureMultilineTextHeight(fx.DefaultFont(mLbl.TextSize), mBase.Width, mLbl.text) + onerow
#end if
#if B4A
	mLbl.Height = su.MeasureMultilineTextHeight(mLbl, mLbl.text) '+ onerow
#End If
#if B4i
	dim lbl as label = mLbl
	lbl.Font = DefaultTextFont
	lbl.SizeToFit
	mLbl.Height = lbl.Height
#End If
	mPanel.Height = mLbl.Height + 2dip 'accounts for descends and eventual alignment set to BOTTOM
	Select mPanelPos
		Case TMPOS_TOP
			mBase.AddView(mPanel, 5dip, 5dip, mBase.Width-10dip, mPanel.Height)
		Case TMPOS_CENTER
			mBase.AddView(mPanel, 5dip,(mBase.Height-mPanel.Height)/2, mBase.Width-10dip, mPanel.Height)
		Case TMPOS_BOTTOM
			mBase.AddView(mPanel, 5dip, mBase.Height-mPanel.Height-5dip, mBase.Width-10dip, mPanel.Height)
	End Select
	fading = tempSettings.get("tmfade")
	If fading Then	mPanel.SetVisibleAnimated(400, True) Else mPanel.SetVisibleAnimated(0, True)
	displaying = True
	If tempSettings.get("tmdur") Then timer1.Interval = LDuration Else timer1.Interval = SDuration
	timer1.Enabled = True
End Sub

'Used to stop message showing
Private Sub timer1_tick
	If fading Then
		mPanel.SetVisibleAnimated(400, False)
		Sleep(500)	
		fading = False
	End If
	timer1.Enabled = False
	mPanel.RemoveViewFromParent
	mBase.Tag = Null
	TMList.RemoveAt(1)
	If TMList.Size > 1 Then ShowMessage Else displaying = False
End Sub

#if B4J
Private Sub MeasureMultilineTextHeight (Font As Font, Width As Double, Text As String) As Double
	Dim jo As JavaObject = Me
	Return jo.RunMethod("MeasureMultilineTextHeight", Array(Font, Text, Width))
End Sub

#if Java
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javafx.scene.text.Font;
import javafx.scene.text.TextBoundsType;
public static double MeasureMultilineTextHeight(Font f, String text, double width) throws Exception {
  Method m = Class.forName("com.sun.javafx.scene.control.skin.Utils").getDeclaredMethod("computeTextHeight",
  Font.class, String.class, double.class, TextBoundsType.class);
  m.setAccessible(true);
  return (Double)m.invoke(null, f, text, width, TextBoundsType.LOGICAL_VERTICAL_CENTER);
  }
#End If
#end if

'Returns a new map having the same key/value pairs of the source one
Private Sub DuplicateMap(Source As Map) As Map
	Dim m1 As Map
	m1.Initialize
	For i = 0 To Source.Size - 1
		m1.Put(Source.GetKeyAt(i), Source.GetValueAt(i))
	Next
	Return m1
End Sub
