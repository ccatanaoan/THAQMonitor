package cloyd.thaq.monitor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javafx.scene.text.Font;
import javafx.scene.text.TextBoundsType;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class clxtoastmessage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("cloyd.thaq.monitor", "cloyd.thaq.monitor.clxtoastmessage", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", cloyd.thaq.monitor.clxtoastmessage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mpanel = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mlbl = null;
public int _mpanelpos = 0;
public anywheresoftware.b4a.objects.collections.List _tmlist = null;
public anywheresoftware.b4a.objects.collections.Map _tempsettings = null;
public boolean _displaying = false;
public boolean _fading = false;
public anywheresoftware.b4a.objects.Timer _timer1 = null;
public int _tmpos_top = 0;
public int _tmpos_center = 0;
public int _tmpos_bottom = 0;
public int _vpos_top = 0;
public int _vpos_center = 0;
public int _vpos_bottom = 0;
public int _hpos_left = 0;
public int _hpos_center = 0;
public int _hpos_right = 0;
public String[] _arhpos = null;
public String[] _arvpos = null;
public b4j.example.dateutils _dateutils = null;
public cloyd.thaq.monitor.main _main = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 13;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 14;BA.debugLine="Private mBase As B4XView				'base panel from call";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private mPanel As B4XView				'panel holding the m";
_mpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private mLbl As B4XView					'message label";
_mlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private mPanelPos As Int				'message position rel";
_mpanelpos = 0;
 //BA.debugLineNum = 18;BA.debugLine="Private TMList As List					'list of toast message";
_tmlist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 19;BA.debugLine="Private tempSettings As Map				'temporary setting";
_tempsettings = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 20;BA.debugLine="Private displaying As Boolean			'True = a TM is c";
_displaying = false;
 //BA.debugLineNum = 21;BA.debugLine="Private fading As Boolean				'True = fade effect";
_fading = false;
 //BA.debugLineNum = 22;BA.debugLine="Private timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 23;BA.debugLine="Public CONST TMPOS_TOP As Int = 0		'constant to s";
_tmpos_top = (int) (0);
 //BA.debugLineNum = 24;BA.debugLine="Public CONST TMPOS_CENTER As Int = 1	'			\"			\"		\"";
_tmpos_center = (int) (1);
 //BA.debugLineNum = 25;BA.debugLine="Public CONST TMPOS_BOTTOM As Int = 2	'			\"			\"		\"";
_tmpos_bottom = (int) (2);
 //BA.debugLineNum = 26;BA.debugLine="Public CONST VPOS_TOP As Int = 0		'constant to ve";
_vpos_top = (int) (0);
 //BA.debugLineNum = 27;BA.debugLine="Public CONST VPOS_CENTER As Int = 1		'			\"			\"		\"";
_vpos_center = (int) (1);
 //BA.debugLineNum = 28;BA.debugLine="Public CONST VPOS_BOTTOM As Int = 2		'			\"			\"		\"";
_vpos_bottom = (int) (2);
 //BA.debugLineNum = 29;BA.debugLine="Public CONST HPOS_LEFT As Int = 0		'constant to h";
_hpos_left = (int) (0);
 //BA.debugLineNum = 30;BA.debugLine="Public CONST HPOS_CENTER As Int = 1		'			\"			\"		\"";
_hpos_center = (int) (1);
 //BA.debugLineNum = 31;BA.debugLine="Public CONST HPOS_RIGHT As Int = 2		'			\"			\"		\"";
_hpos_right = (int) (2);
 //BA.debugLineNum = 32;BA.debugLine="Private CONST arHpos(3) As String = Array As Stri";
_arhpos = new String[]{"LEFT","CENTER","RIGHT"};
 //BA.debugLineNum = 33;BA.debugLine="Private CONST arVpos(3) As String = Array As Stri";
_arvpos = new String[]{"TOP","CENTER","BOTTOM"};
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _duplicatemap(anywheresoftware.b4a.objects.collections.Map _source) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m1 = null;
int _i = 0;
 //BA.debugLineNum = 236;BA.debugLine="Private Sub DuplicateMap(Source As Map) As Map";
 //BA.debugLineNum = 237;BA.debugLine="Dim m1 As Map";
_m1 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 238;BA.debugLine="m1.Initialize";
_m1.Initialize();
 //BA.debugLineNum = 239;BA.debugLine="For i = 0 To Source.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_source.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 240;BA.debugLine="m1.Put(Source.GetKeyAt(i), Source.GetValueAt(i))";
_m1.Put(_source.GetKeyAt(_i),_source.GetValueAt(_i));
 }
};
 //BA.debugLineNum = 242;BA.debugLine="Return m1";
if (true) return _m1;
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _base) throws Exception{
innerInitialize(_ba);
anywheresoftware.b4j.objects.LabelWrapper _l1 = null;
 //BA.debugLineNum = 38;BA.debugLine="Public Sub Initialize(Base As B4XView)";
 //BA.debugLineNum = 39;BA.debugLine="mBase = Base";
_mbase = _base;
 //BA.debugLineNum = 40;BA.debugLine="mBase.Tag = Me";
_mbase.setTag(this);
 //BA.debugLineNum = 41;BA.debugLine="Dim l1 As Label";
_l1 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 42;BA.debugLine="l1.Initialize(\"\")";
_l1.Initialize(ba,"");
 //BA.debugLineNum = 46;BA.debugLine="l1.WrapText = True";
_l1.setWrapText(__c.True);
 //BA.debugLineNum = 50;BA.debugLine="mLbl = l1";
_mlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_l1.getObject()));
 //BA.debugLineNum = 51;BA.debugLine="mPanel = xui.CreatePanel(\"\")";
_mpanel = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 52;BA.debugLine="mPanel.Visible = True";
_mpanel.setVisible(__c.True);
 //BA.debugLineNum = 53;BA.debugLine="mPanel.AddView(mLbl,5dip,0dip,mBase.Width-20dip,1";
_mpanel.AddView((javafx.scene.Node)(_mlbl.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (0)),_mbase.getWidth()-__c.DipToCurrent((int) (20)),__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 54;BA.debugLine="tempSettings = DuplicateMap(MakeDefaults)				'cre";
_tempsettings = _duplicatemap(_makedefaults());
 //BA.debugLineNum = 55;BA.debugLine="TMList.initialize";
_tmlist.Initialize();
 //BA.debugLineNum = 56;BA.debugLine="TMList.Add(DuplicateMap(tempSettings))					'save";
_tmlist.Add((Object)(_duplicatemap(_tempsettings).getObject()));
 //BA.debugLineNum = 57;BA.debugLine="displaying = False";
_displaying = __c.False;
 //BA.debugLineNum = 58;BA.debugLine="fading = False";
_fading = __c.False;
 //BA.debugLineNum = 59;BA.debugLine="timer1.Initialize(\"timer1\", 2000)						'timer def";
_timer1.Initialize(ba,"timer1",(long) (2000));
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _makedefaults() throws Exception{
anywheresoftware.b4a.objects.collections.Map _m1 = null;
 //BA.debugLineNum = 63;BA.debugLine="Private Sub MakeDefaults As Map";
 //BA.debugLineNum = 64;BA.debugLine="Dim m1 As Map";
_m1 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 65;BA.debugLine="m1.Initialize";
_m1.Initialize();
 //BA.debugLineNum = 67;BA.debugLine="m1.Put(\"pColor\",xui.Color_DarkGray)						'Backgro";
_m1.Put((Object)("pColor"),(Object)(_xui.Color_DarkGray));
 //BA.debugLineNum = 68;BA.debugLine="m1.Put(\"pBColor\",xui.Color_DarkGray)					'Backgro";
_m1.Put((Object)("pBColor"),(Object)(_xui.Color_DarkGray));
 //BA.debugLineNum = 69;BA.debugLine="m1.Put(\"pBWidth\", 0dip)									'Background borde";
_m1.Put((Object)("pBWidth"),(Object)(__c.DipToCurrent((int) (0))));
 //BA.debugLineNum = 70;BA.debugLine="m1.Put(\"pBRadius\", 0dip)								'Background borde";
_m1.Put((Object)("pBRadius"),(Object)(__c.DipToCurrent((int) (0))));
 //BA.debugLineNum = 71;BA.debugLine="m1.Put(\"pPos\", TMPOS_BOTTOM)";
_m1.Put((Object)("pPos"),(Object)(_tmpos_bottom));
 //BA.debugLineNum = 73;BA.debugLine="m1.Put(\"lTSize\", 15)									'Message label text";
_m1.Put((Object)("lTSize"),(Object)(15));
 //BA.debugLineNum = 74;BA.debugLine="m1.Put(\"lTColor\", (xui.Color_White))					'Message";
_m1.Put((Object)("lTColor"),(Object)((_xui.Color_White)));
 //BA.debugLineNum = 75;BA.debugLine="m1.Put(\"lHAlign\", (HPOS_LEFT))							'Message lab";
_m1.Put((Object)("lHAlign"),(Object)((_hpos_left)));
 //BA.debugLineNum = 76;BA.debugLine="m1.Put(\"lVAlign\", (VPOS_CENTER))						'Message la";
_m1.Put((Object)("lVAlign"),(Object)((_vpos_center)));
 //BA.debugLineNum = 78;BA.debugLine="m1.Put(\"dShort\", 2000)									'Message  display";
_m1.Put((Object)("dShort"),(Object)(2000));
 //BA.debugLineNum = 79;BA.debugLine="m1.Put(\"dLong\", 3000)									'Message  display t";
_m1.Put((Object)("dLong"),(Object)(3000));
 //BA.debugLineNum = 80;BA.debugLine="Return m1";
if (true) return _m1;
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public double  _measuremultilinetextheight(anywheresoftware.b4j.objects.JFX.FontWrapper _font,double _width,String _text) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 216;BA.debugLine="Private Sub MeasureMultilineTextHeight (Font As Fo";
 //BA.debugLineNum = 217;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
 //BA.debugLineNum = 218;BA.debugLine="Return jo.RunMethod(\"MeasureMultilineTextHeight\",";
if (true) return (double)(BA.ObjectToNumber(_jo.RunMethod("MeasureMultilineTextHeight",new Object[]{(Object)(_font.getObject()),(Object)(_text),(Object)(_width)})));
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return 0;
}
public String  _settmbackground(Object _backgroundcolor,double _borderwidth,Object _bordercolor,double _bordercornerradius) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Public Sub SetTMBackground(BackgroundColor As Obje";
 //BA.debugLineNum = 100;BA.debugLine="tempSettings.Put(\"pColor\",xui.PaintOrColorToColor";
_tempsettings.Put((Object)("pColor"),(Object)(_xui.PaintOrColorToColor(_backgroundcolor)));
 //BA.debugLineNum = 101;BA.debugLine="tempSettings.Put(\"pBColor\",xui.PaintOrColorToColo";
_tempsettings.Put((Object)("pBColor"),(Object)(_xui.PaintOrColorToColor(_bordercolor)));
 //BA.debugLineNum = 102;BA.debugLine="tempSettings.Put(\"pBWidth\", BorderWidth)";
_tempsettings.Put((Object)("pBWidth"),(Object)(_borderwidth));
 //BA.debugLineNum = 103;BA.debugLine="tempSettings.Put(\"pBRadius\", BorderCornerRadius)";
_tempsettings.Put((Object)("pBRadius"),(Object)(_bordercornerradius));
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public String  _settmdefaults() throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 87;BA.debugLine="Public Sub SetTMDefaults";
 //BA.debugLineNum = 88;BA.debugLine="Dim m As Map = TMList.Get(0)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_tmlist.Get((int) (0))));
 //BA.debugLineNum = 89;BA.debugLine="tempSettings = DuplicateMap(m)";
_tempsettings = _duplicatemap(_m);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public String  _settmduration(int _shortduration,int _longduration) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Public Sub SetTMDuration(ShortDuration As Int, Lon";
 //BA.debugLineNum = 94;BA.debugLine="tempSettings.Put(\"dShort\", ShortDuration)";
_tempsettings.Put((Object)("dShort"),(Object)(_shortduration));
 //BA.debugLineNum = 95;BA.debugLine="tempSettings.Put(\"dLong\", LongDuration)";
_tempsettings.Put((Object)("dLong"),(Object)(_longduration));
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public String  _settmposition(int _apos) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Public Sub SetTMPosition(aPos As Int)";
 //BA.debugLineNum = 118;BA.debugLine="If aPos >=0 And aPos <= 2 Then tempSettings.Put(\"";
if (_apos>=0 && _apos<=2) { 
_tempsettings.Put((Object)("pPos"),(Object)(_apos));};
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return "";
}
public String  _settmtextprop(double _asize,int _halignment,int _valignment,Object _acolor) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Public Sub SetTMTextProp(aSize As Double, HAlignme";
 //BA.debugLineNum = 110;BA.debugLine="tempSettings.Put(\"lTSize\", aSize)";
_tempsettings.Put((Object)("lTSize"),(Object)(_asize));
 //BA.debugLineNum = 111;BA.debugLine="If HAlignment >=0 And HAlignment <=2 Then tempSet";
if (_halignment>=0 && _halignment<=2) { 
_tempsettings.Put((Object)("lHAlign"),(Object)((_halignment)));};
 //BA.debugLineNum = 112;BA.debugLine="If VAlignment >=0 And VAlignment <=2 Then tempSet";
if (_valignment>=0 && _valignment<=2) { 
_tempsettings.Put((Object)("lVAlign"),(Object)((_valignment)));};
 //BA.debugLineNum = 113;BA.debugLine="tempSettings.Put(\"lTColor\", (xui.PaintOrColorToCo";
_tempsettings.Put((Object)("lTColor"),(Object)((_xui.PaintOrColorToColor(_acolor))));
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public String  _showmessage() throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
String _hpos = "";
String _vpos = "";
int _lduration = 0;
int _sduration = 0;
double _onerow = 0;
 //BA.debugLineNum = 156;BA.debugLine="Private Sub ShowMessage";
 //BA.debugLineNum = 157;BA.debugLine="Dim m As Map = TMList.Get(1)										'item #1 =";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_tmlist.Get((int) (1))));
 //BA.debugLineNum = 159;BA.debugLine="mPanel.SetColorAndBorder(xui.PaintOrColorToColor(";
_mpanel.SetColorAndBorder(_xui.PaintOrColorToColor(_m.Get((Object)("pColor"))),(double)(BA.ObjectToNumber(_m.Get((Object)("pBWidth")))),_xui.PaintOrColorToColor(_m.Get((Object)("pBColor"))),(double)(BA.ObjectToNumber(_m.Get((Object)("pBRadius")))));
 //BA.debugLineNum = 160;BA.debugLine="mLbl.TextSize = m.Get(\"lTSize\")";
_mlbl.setTextSize((double)(BA.ObjectToNumber(_m.Get((Object)("lTSize")))));
 //BA.debugLineNum = 161;BA.debugLine="Dim hpos,vpos As String";
_hpos = "";
_vpos = "";
 //BA.debugLineNum = 162;BA.debugLine="hpos = arHpos(m.Get(\"lHAlign\"))";
_hpos = _arhpos[(int)(BA.ObjectToNumber(_m.Get((Object)("lHAlign"))))];
 //BA.debugLineNum = 163;BA.debugLine="vpos = arVpos(m.Get(\"lVAlign\"))";
_vpos = _arvpos[(int)(BA.ObjectToNumber(_m.Get((Object)("lVAlign"))))];
 //BA.debugLineNum = 164;BA.debugLine="mLbl.SetTextAlignment(vpos, hpos)";
_mlbl.SetTextAlignment(_vpos,_hpos);
 //BA.debugLineNum = 165;BA.debugLine="mLbl.TextColor = xui.PaintOrColorToColor(m.Get(\"l";
_mlbl.setTextColor(_xui.PaintOrColorToColor(_m.Get((Object)("lTColor"))));
 //BA.debugLineNum = 166;BA.debugLine="mLbl.Text = m.Get(\"lText\") 'Message";
_mlbl.setText(BA.ObjectToString(_m.Get((Object)("lText"))));
 //BA.debugLineNum = 167;BA.debugLine="mPanelPos = m.Get(\"pPos\")";
_mpanelpos = (int)(BA.ObjectToNumber(_m.Get((Object)("pPos"))));
 //BA.debugLineNum = 168;BA.debugLine="Private LDuration, SDuration As Int";
_lduration = 0;
_sduration = 0;
 //BA.debugLineNum = 169;BA.debugLine="SDuration = m.get(\"dShort\")";
_sduration = (int)(BA.ObjectToNumber(_m.Get((Object)("dShort"))));
 //BA.debugLineNum = 170;BA.debugLine="LDuration = m.get(\"dLong\")";
_lduration = (int)(BA.ObjectToNumber(_m.Get((Object)("dLong"))));
 //BA.debugLineNum = 173;BA.debugLine="Dim onerow As Double = MeasureMultilineTextHeight";
_onerow = _measuremultilinetextheight(_fx.DefaultFont(_mlbl.getTextSize()),_mbase.getWidth(),"a");
 //BA.debugLineNum = 174;BA.debugLine="mLbl.Height = MeasureMultilineTextHeight(fx.Defau";
_mlbl.setHeight(_measuremultilinetextheight(_fx.DefaultFont(_mlbl.getTextSize()),_mbase.getWidth(),_mlbl.getText())+_onerow);
 //BA.debugLineNum = 185;BA.debugLine="mPanel.Height = mLbl.Height + 2dip 'accounts for";
_mpanel.setHeight(_mlbl.getHeight()+__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 186;BA.debugLine="Select mPanelPos";
switch (BA.switchObjectToInt(_mpanelpos,_tmpos_top,_tmpos_center,_tmpos_bottom)) {
case 0: {
 //BA.debugLineNum = 188;BA.debugLine="mBase.AddView(mPanel, 5dip, 5dip, mBase.Width-1";
_mbase.AddView((javafx.scene.Node)(_mpanel.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (5)),_mbase.getWidth()-__c.DipToCurrent((int) (10)),_mpanel.getHeight());
 break; }
case 1: {
 //BA.debugLineNum = 190;BA.debugLine="mBase.AddView(mPanel, 5dip,(mBase.Height-mPanel";
_mbase.AddView((javafx.scene.Node)(_mpanel.getObject()),__c.DipToCurrent((int) (5)),(_mbase.getHeight()-_mpanel.getHeight())/(double)2,_mbase.getWidth()-__c.DipToCurrent((int) (10)),_mpanel.getHeight());
 break; }
case 2: {
 //BA.debugLineNum = 192;BA.debugLine="mBase.AddView(mPanel, 5dip, mBase.Height-mPanel";
_mbase.AddView((javafx.scene.Node)(_mpanel.getObject()),__c.DipToCurrent((int) (5)),_mbase.getHeight()-_mpanel.getHeight()-__c.DipToCurrent((int) (5)),_mbase.getWidth()-__c.DipToCurrent((int) (10)),_mpanel.getHeight());
 break; }
}
;
 //BA.debugLineNum = 194;BA.debugLine="fading = tempSettings.get(\"tmfade\")";
_fading = BA.ObjectToBoolean(_tempsettings.Get((Object)("tmfade")));
 //BA.debugLineNum = 195;BA.debugLine="If fading Then	mPanel.SetVisibleAnimated(400, Tru";
if (_fading) { 
_mpanel.SetVisibleAnimated(ba,(int) (400),__c.True);}
else {
_mpanel.SetVisibleAnimated(ba,(int) (0),__c.True);};
 //BA.debugLineNum = 196;BA.debugLine="displaying = True";
_displaying = __c.True;
 //BA.debugLineNum = 197;BA.debugLine="If tempSettings.get(\"tmdur\") Then timer1.Interval";
if (BA.ObjectToBoolean(_tempsettings.Get((Object)("tmdur")))) { 
_timer1.setInterval((long) (_lduration));}
else {
_timer1.setInterval((long) (_sduration));};
 //BA.debugLineNum = 198;BA.debugLine="timer1.Enabled = True";
_timer1.setEnabled(__c.True);
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return "";
}
public void  _timer1_tick() throws Exception{
ResumableSub_timer1_tick rsub = new ResumableSub_timer1_tick(this);
rsub.resume(ba, null);
}
public static class ResumableSub_timer1_tick extends BA.ResumableSub {
public ResumableSub_timer1_tick(cloyd.thaq.monitor.clxtoastmessage parent) {
this.parent = parent;
}
cloyd.thaq.monitor.clxtoastmessage parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 203;BA.debugLine="If fading Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._fading) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 204;BA.debugLine="mPanel.SetVisibleAnimated(400, False)";
parent._mpanel.SetVisibleAnimated(ba,(int) (400),parent.__c.False);
 //BA.debugLineNum = 205;BA.debugLine="Sleep(500)";
parent.__c.Sleep(ba,this,(int) (500));
this.state = 13;
return;
case 13:
//C
this.state = 4;
;
 //BA.debugLineNum = 206;BA.debugLine="fading = False";
parent._fading = parent.__c.False;
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 208;BA.debugLine="timer1.Enabled = False";
parent._timer1.setEnabled(parent.__c.False);
 //BA.debugLineNum = 209;BA.debugLine="mPanel.RemoveViewFromParent";
parent._mpanel.RemoveViewFromParent();
 //BA.debugLineNum = 210;BA.debugLine="mBase.Tag = Null";
parent._mbase.setTag(parent.__c.Null);
 //BA.debugLineNum = 211;BA.debugLine="TMList.RemoveAt(1)";
parent._tmlist.RemoveAt((int) (1));
 //BA.debugLineNum = 212;BA.debugLine="If TMList.Size > 1 Then ShowMessage Else displayi";
if (true) break;

case 5:
//if
this.state = 12;
if (parent._tmlist.getSize()>1) { 
this.state = 7;
;}
else {
this.state = 9;
;}if (true) break;

case 7:
//C
this.state = 12;
parent._showmessage();
if (true) break;

case 9:
//C
this.state = 12;
parent._displaying = parent.__c.False;
if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _tmclearandshow(String _message,boolean _longduration,boolean _fadeeffect) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m1 = null;
int _i = 0;
 //BA.debugLineNum = 135;BA.debugLine="Public Sub TMClearAndShow(Message As String, LongD";
 //BA.debugLineNum = 136;BA.debugLine="timer1.Enabled = False";
_timer1.setEnabled(__c.False);
 //BA.debugLineNum = 137;BA.debugLine="displaying = False";
_displaying = __c.False;
 //BA.debugLineNum = 138;BA.debugLine="TMList.Clear";
_tmlist.Clear();
 //BA.debugLineNum = 139;BA.debugLine="Dim m1 As Map = DuplicateMap(MakeDefaults)";
_m1 = new anywheresoftware.b4a.objects.collections.Map();
_m1 = _duplicatemap(_makedefaults());
 //BA.debugLineNum = 140;BA.debugLine="TMList.Add(m1)														'item #0 = defaults";
_tmlist.Add((Object)(_m1.getObject()));
 //BA.debugLineNum = 141;BA.debugLine="For i = 0 To m1.Size - 1";
{
final int step6 = 1;
final int limit6 = (int) (_m1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
 //BA.debugLineNum = 142;BA.debugLine="If Not(tempSettings.ContainsKey(m1.GetKeyAt(i)))";
if (__c.Not(_tempsettings.ContainsKey(_m1.GetKeyAt(_i)))) { 
_tempsettings.Put(_m1.GetKeyAt(_i),_m1.GetValueAt(_i));};
 }
};
 //BA.debugLineNum = 146;BA.debugLine="tempSettings.Put(\"lText\", Message)";
_tempsettings.Put((Object)("lText"),(Object)(_message));
 //BA.debugLineNum = 147;BA.debugLine="tempSettings.Put(\"tmfade\", FadeEffect)";
_tempsettings.Put((Object)("tmfade"),(Object)(_fadeeffect));
 //BA.debugLineNum = 148;BA.debugLine="tempSettings.Put(\"tmdur\", LongDuration)";
_tempsettings.Put((Object)("tmdur"),(Object)(_longduration));
 //BA.debugLineNum = 149;BA.debugLine="TMList.Add(DuplicateMap(tempSettings))								'it";
_tmlist.Add((Object)(_duplicatemap(_tempsettings).getObject()));
 //BA.debugLineNum = 150;BA.debugLine="mPanel.RemoveViewFromParent";
_mpanel.RemoveViewFromParent();
 //BA.debugLineNum = 151;BA.debugLine="mBase.Tag = Null";
_mbase.setTag(__c.Null);
 //BA.debugLineNum = 152;BA.debugLine="ShowMessage";
_showmessage();
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return "";
}
public String  _tmshow(String _message,boolean _longduration,boolean _fadeeffect) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Public Sub TMShow (Message As String, LongDuration";
 //BA.debugLineNum = 126;BA.debugLine="tempSettings.Put(\"lText\", Message)";
_tempsettings.Put((Object)("lText"),(Object)(_message));
 //BA.debugLineNum = 127;BA.debugLine="tempSettings.Put(\"tmfade\", FadeEffect)";
_tempsettings.Put((Object)("tmfade"),(Object)(_fadeeffect));
 //BA.debugLineNum = 128;BA.debugLine="tempSettings.Put(\"tmdur\", LongDuration)";
_tempsettings.Put((Object)("tmdur"),(Object)(_longduration));
 //BA.debugLineNum = 129;BA.debugLine="TMList.Add(DuplicateMap(tempSettings))";
_tmlist.Add((Object)(_duplicatemap(_tempsettings).getObject()));
 //BA.debugLineNum = 130;BA.debugLine="If displaying Then Return";
if (_displaying) { 
if (true) return "";};
 //BA.debugLineNum = 131;BA.debugLine="ShowMessage";
_showmessage();
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
public static double MeasureMultilineTextHeight(Font f, String text, double width) throws Exception {
  Method m = Class.forName("com.sun.javafx.scene.control.skin.Utils").getDeclaredMethod("computeTextHeight",
  Font.class, String.class, double.class, TextBoundsType.class);
  m.setAccessible(true);
  return (Double)m.invoke(null, f, text, width, TextBoundsType.LOGICAL_VERTICAL_CENTER);
  }
}
