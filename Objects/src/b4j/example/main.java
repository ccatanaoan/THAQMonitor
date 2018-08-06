package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 390, 710);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbtitle = null;
public static double _xmouse = 0;
public static double _ymouse = 0;
public static boolean _ismaximized = false;
public static anywheresoftware.b4j.objects.ImageViewWrapper _ivclose = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper _ivmax = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper _ivmin = null;
public static anywheresoftware.b4j.objects.ListViewWrapper _lstskins = null;
public static String _atualskin = "";
public static String _imginit = "";
public static double _f_x = 0;
public static double _f_y = 0;
public static double _f_w = 0;
public static double _f_h = 0;
public static anywheresoftware.b4j.objects.ButtonWrapper _button1 = null;
public static anywheresoftware.b4j.objects.CanvasWrapper _canvas1 = null;
public static anywheresoftware.b4j.objects.MqttAsyncClientWrapper _mqtt = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper _menubar1 = null;
public static String _user = "";
public static String _password = "";
public static b4j.example.gauge _gaugehometemp = null;
public static anywheresoftware.b4j.objects.B4XViewWrapper.XUI _xui = null;
public static b4j.example.gauge _gaugeairquality = null;
public static anywheresoftware.b4a.randomaccessfile.B4XSerializator _serializator = null;
public static b4j.example.gauge _gaugehomehumidity = null;
public static b4j.example.gauge _gaugebasementairquality = null;
public static b4j.example.gauge _gaugebasementhumidity = null;
public static b4j.example.gauge _gaugebasementtemp = null;
public static anywheresoftware.b4j.objects.LabelWrapper _labelgaugehometemp = null;
public static anywheresoftware.b4j.objects.LabelWrapper _labelgaugeairquality = null;
public static anywheresoftware.b4j.objects.LabelWrapper _labelgaugehomehumidity = null;
public static anywheresoftware.b4j.objects.LabelWrapper _labelgaugebasementtemp = null;
public static anywheresoftware.b4j.objects.LabelWrapper _labelgaugebasementairquality = null;
public static anywheresoftware.b4j.objects.LabelWrapper _labelgaugebasementhumidity = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lblstatus = null;
public static b4j.example.dateutils _dateutils = null;
public static class _circledata{
public boolean IsInitialized;
public double x;
public double y;
public int clr;
public void Initialize() {
IsInitialized = true;
x = 0;
y = 0;
clr = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static String  _alwaysontop(anywheresoftware.b4j.objects.Form _o,boolean _boo) throws Exception{
 //BA.debugLineNum = 277;BA.debugLine="Sub AlwaysOnTop(o As Form,boo As Boolean)";
 //BA.debugLineNum = 278;BA.debugLine="getStage(o).RunMethod(\"setAlwaysOnTop\",Array(boo)";
_getstage((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_o))).RunMethod("setAlwaysOnTop",new Object[]{(Object)(_boo)});
 //BA.debugLineNum = 279;BA.debugLine="End Sub";
return "";
}
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
String _skintemp = "";
String _skindefault = "";
anywheresoftware.b4j.agraham.reflection.Reflection _obj = null;
String _clientid = "";
anywheresoftware.b4j.objects.MqttAsyncClientWrapper.MqttConnectOptionsWrapper _mo = null;
 //BA.debugLineNum = 46;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
 //BA.debugLineNum = 47;BA.debugLine="Dim skinTemp As String";
_skintemp = "";
 //BA.debugLineNum = 48;BA.debugLine="Dim skinDefault As String";
_skindefault = "";
 //BA.debugLineNum = 50;BA.debugLine="If File.Exists(File.DirApp, \"skin.ini\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"skin.ini")) { 
 //BA.debugLineNum = 51;BA.debugLine="skinTemp = File.ReadString(File.DirApp, \"skin.in";
_skintemp = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"skin.ini");
 }else {
 //BA.debugLineNum = 53;BA.debugLine="File.WriteString(File.DirApp, \"skin.ini\", \"vdSk0";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"skin.ini","vdSk03");
 //BA.debugLineNum = 54;BA.debugLine="skinTemp = \"vdSk03\"";
_skintemp = "vdSk03";
 };
 //BA.debugLineNum = 57;BA.debugLine="If skinTemp = \"\" Then";
if ((_skintemp).equals("")) { 
 //BA.debugLineNum = 58;BA.debugLine="skinDefault = \"vdSk03\"";
_skindefault = "vdSk03";
 }else {
 //BA.debugLineNum = 60;BA.debugLine="If skinTemp = \"vdSk01\" Or skinTemp = \"vdSk02\" Or";
if ((_skintemp).equals("vdSk01") || (_skintemp).equals("vdSk02") || (_skintemp).equals("vdSk03") || (_skintemp).equals("vdSk04") || (_skintemp).equals("vdSk05") || (_skintemp).equals("vdSk06")) { 
 //BA.debugLineNum = 61;BA.debugLine="skinDefault = skinTemp";
_skindefault = _skintemp;
 }else {
 //BA.debugLineNum = 63;BA.debugLine="skinDefault = \"vdSk03\"";
_skindefault = "vdSk03";
 };
 };
 //BA.debugLineNum = 67;BA.debugLine="MainForm = Form1";
_mainform = _form1;
 //BA.debugLineNum = 68;BA.debugLine="MainForm.SetFormStyle(\"TRANSPARENT\")";
_mainform.SetFormStyle("TRANSPARENT");
 //BA.debugLineNum = 69;BA.debugLine="MainForm.RootPane.LoadLayout(skinDefault) 'Load t";
_mainform.getRootPane().LoadLayout(ba,_skindefault);
 //BA.debugLineNum = 70;BA.debugLine="AtualSkin = skinDefault";
_atualskin = _skindefault;
 //BA.debugLineNum = 71;BA.debugLine="MainForm.BackColor = fx.Colors.Transparent";
_mainform.setBackColor(_fx.Colors.Transparent);
 //BA.debugLineNum = 72;BA.debugLine="MainForm.RootPane.Style = \"-fx-background-color:t";
_mainform.getRootPane().setStyle("-fx-background-color:transparent;-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 1.0) , 15,0, 0.0, 0.0);");
 //BA.debugLineNum = 73;BA.debugLine="MainForm.Resizable = False";
_mainform.setResizable(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 74;BA.debugLine="MainForm.Icon = fx.LoadImage(File.DirAssets, \"ico";
_mainform.setIcon((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"icon.png").getObject()));
 //BA.debugLineNum = 75;BA.debugLine="lbTitle.MouseCursor = fx.Cursors.MOVE";
_lbtitle.setMouseCursor(_fx.Cursors.MOVE);
 //BA.debugLineNum = 76;BA.debugLine="lbTitle.Text = \"Catanaoan THAQ Monitor v1.0\"";
_lbtitle.setText("Catanaoan THAQ Monitor v1.0");
 //BA.debugLineNum = 77;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
 //BA.debugLineNum = 78;BA.debugLine="Obj.Target = ivClose";
_obj.Target = (Object)(_ivclose.getObject());
 //BA.debugLineNum = 79;BA.debugLine="Obj.AddEventHandler2(\"Close_Entered\", \"onMouseEnt";
_obj.AddEventHandler2(ba,"Close_Entered","onMouseEnteredProperty");
 //BA.debugLineNum = 80;BA.debugLine="Obj.AddEventHandler2(\"Close_Exited\", \"onMouseExit";
_obj.AddEventHandler2(ba,"Close_Exited","onMouseExitedProperty");
 //BA.debugLineNum = 81;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
 //BA.debugLineNum = 82;BA.debugLine="Obj.Target = ivMax";
_obj.Target = (Object)(_ivmax.getObject());
 //BA.debugLineNum = 83;BA.debugLine="Obj.AddEventHandler2(\"Max_Entered\", \"onMouseEnter";
_obj.AddEventHandler2(ba,"Max_Entered","onMouseEnteredProperty");
 //BA.debugLineNum = 84;BA.debugLine="Obj.AddEventHandler2(\"Max_Exited\", \"onMouseExited";
_obj.AddEventHandler2(ba,"Max_Exited","onMouseExitedProperty");
 //BA.debugLineNum = 85;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
 //BA.debugLineNum = 86;BA.debugLine="Obj.Target = ivMin";
_obj.Target = (Object)(_ivmin.getObject());
 //BA.debugLineNum = 87;BA.debugLine="Obj.AddEventHandler2(\"Min_Entered\", \"onMouseEnter";
_obj.AddEventHandler2(ba,"Min_Entered","onMouseEnteredProperty");
 //BA.debugLineNum = 88;BA.debugLine="Obj.AddEventHandler2(\"Min_Exited\", \"onMouseExited";
_obj.AddEventHandler2(ba,"Min_Exited","onMouseExitedProperty");
 //BA.debugLineNum = 90;BA.debugLine="imgInit = AtualSkin.SubString(2).ToLowerCase";
_imginit = _atualskin.substring((int) (2)).toLowerCase();
 //BA.debugLineNum = 91;BA.debugLine="loadList";
_loadlist();
 //BA.debugLineNum = 92;BA.debugLine="Get_css";
_get_css();
 //BA.debugLineNum = 93;BA.debugLine="MainForm.Show";
_mainform.Show();
 //BA.debugLineNum = 95;BA.debugLine="lblStatus.TextColor = fx.Colors.Red";
_lblstatus.setTextColor(_fx.Colors.Red);
 //BA.debugLineNum = 96;BA.debugLine="lblStatus.Text = \"Status: *** Connecting to Cloud";
_lblstatus.setText("Status: *** Connecting to Cloud MQTT ***");
 //BA.debugLineNum = 97;BA.debugLine="Dim clientId As String = Rnd(0, 999999999) & Date";
_clientid = BA.NumberToString(anywheresoftware.b4a.keywords.Common.Rnd((int) (0),(int) (999999999)))+BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 98;BA.debugLine="mqtt.Initialize(\"mqtt\", \"tcp://m14.cloudmqtt.com:";
_mqtt.Initialize(ba,"mqtt","tcp://m14.cloudmqtt.com:11816",_clientid);
 //BA.debugLineNum = 99;BA.debugLine="Dim mo As MqttConnectOptions";
_mo = new anywheresoftware.b4j.objects.MqttAsyncClientWrapper.MqttConnectOptionsWrapper();
 //BA.debugLineNum = 100;BA.debugLine="mo.Initialize(user, password)";
_mo.Initialize(_user,_password);
 //BA.debugLineNum = 101;BA.debugLine="mqtt.Connect2(mo)";
_mqtt.Connect2((org.eclipse.paho.client.mqttv3.MqttConnectOptions)(_mo.getObject()));
 //BA.debugLineNum = 103;BA.debugLine="gaugeHomeTemp.SetRanges(Array(gaugeHomeTemp.Creat";
_gaugehometemp._setranges(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_gaugehometemp._createrange((float) (0),(float) (75),_xui.Color_Green)),(Object)(_gaugehometemp._createrange((float) (75),(float) (90),_xui.Color_Yellow)),(Object)(_gaugehometemp._createrange((float) (90),(float) (100),_xui.Color_Red))}));
 //BA.debugLineNum = 106;BA.debugLine="gaugeHomeTemp.CurrentValue=0";
_gaugehometemp._setcurrentvalue((float) (0));
 //BA.debugLineNum = 108;BA.debugLine="gaugeHomeHumidity.SetRanges(Array(gaugeHomeHumidi";
_gaugehomehumidity._setranges(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_gaugehomehumidity._createrange((float) (0),(float) (70),_xui.Color_Green)),(Object)(_gaugehomehumidity._createrange((float) (70),(float) (80),_xui.Color_Yellow)),(Object)(_gaugehomehumidity._createrange((float) (80),(float) (100),_xui.Color_Red))}));
 //BA.debugLineNum = 111;BA.debugLine="gaugeHomeHumidity.CurrentValue=0";
_gaugehomehumidity._setcurrentvalue((float) (0));
 //BA.debugLineNum = 113;BA.debugLine="GaugeAirQuality.SetRanges(Array(GaugeAirQuality.C";
_gaugeairquality._setranges(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_gaugeairquality._createrange((float) (0),(float) (100),_xui.Color_Green)),(Object)(_gaugeairquality._createrange((float) (100),(float) (400),_xui.Color_RGB((int) (100),(int) (240),(int) (23)))),(Object)(_gaugeairquality._createrange((float) (400),(float) (900),_xui.Color_Yellow)),(Object)(_gaugeairquality._createrange((float) (900),(float) (1000),_xui.Color_Red))}));
 //BA.debugLineNum = 117;BA.debugLine="GaugeAirQuality.CurrentValue = 0";
_gaugeairquality._setcurrentvalue((float) (0));
 //BA.debugLineNum = 119;BA.debugLine="gaugeBasementTemp.SetRanges(Array(gaugeBasementTe";
_gaugebasementtemp._setranges(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_gaugebasementtemp._createrange((float) (0),(float) (75),_xui.Color_Green)),(Object)(_gaugebasementtemp._createrange((float) (75),(float) (90),_xui.Color_Yellow)),(Object)(_gaugebasementtemp._createrange((float) (90),(float) (100),_xui.Color_Red))}));
 //BA.debugLineNum = 122;BA.debugLine="gaugeBasementTemp.CurrentValue=0";
_gaugebasementtemp._setcurrentvalue((float) (0));
 //BA.debugLineNum = 124;BA.debugLine="gaugeBasementHumidity.SetRanges(Array(gaugeBaseme";
_gaugebasementhumidity._setranges(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_gaugebasementhumidity._createrange((float) (0),(float) (70),_xui.Color_Green)),(Object)(_gaugebasementhumidity._createrange((float) (70),(float) (80),_xui.Color_Yellow)),(Object)(_gaugebasementhumidity._createrange((float) (80),(float) (100),_xui.Color_Red))}));
 //BA.debugLineNum = 127;BA.debugLine="gaugeBasementHumidity.CurrentValue=0";
_gaugebasementhumidity._setcurrentvalue((float) (0));
 //BA.debugLineNum = 129;BA.debugLine="GaugeBasementAirQuality.SetRanges(Array(GaugeBase";
_gaugebasementairquality._setranges(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_gaugebasementairquality._createrange((float) (0),(float) (100),_xui.Color_Green)),(Object)(_gaugebasementairquality._createrange((float) (100),(float) (400),_xui.Color_RGB((int) (100),(int) (240),(int) (23)))),(Object)(_gaugebasementairquality._createrange((float) (400),(float) (900),_xui.Color_Yellow)),(Object)(_gaugebasementairquality._createrange((float) (900),(float) (1000),_xui.Color_Red))}));
 //BA.debugLineNum = 133;BA.debugLine="GaugeBasementAirQuality.CurrentValue = 0";
_gaugebasementairquality._setcurrentvalue((float) (0));
 //BA.debugLineNum = 135;BA.debugLine="AlwaysOnTop(MainForm,True)";
_alwaysontop(_mainform,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 139;BA.debugLine="MainForm.WindowLeft = CheckMonitor.MaxX	- MainFor";
_mainform.setWindowLeft(_checkmonitor().getMaxX()-_mainform.getWidth());
 //BA.debugLineNum = 140;BA.debugLine="MainForm.WindowTop = CheckMonitor.MaxY - MainForm";
_mainform.setWindowTop(_checkmonitor().getMaxY()-_mainform.getHeight()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public static String  _button1_action() throws Exception{
 //BA.debugLineNum = 272;BA.debugLine="Private Sub Button1_Action";
 //BA.debugLineNum = 273;BA.debugLine="ivMax.Visible = Not(ivMax.Visible)";
_ivmax.setVisible(anywheresoftware.b4a.keywords.Common.Not(_ivmax.getVisible()));
 //BA.debugLineNum = 274;BA.debugLine="ivMin.Visible = Not(ivMin.Visible)";
_ivmin.setVisible(anywheresoftware.b4a.keywords.Common.Not(_ivmin.getVisible()));
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.objects.JFX.ScreenWrapper  _checkmonitor() throws Exception{
anywheresoftware.b4a.objects.collections.List _slist = null;
anywheresoftware.b4j.objects.JFX.ScreenWrapper _s = null;
 //BA.debugLineNum = 285;BA.debugLine="Sub CheckMonitor() As Screen";
 //BA.debugLineNum = 286;BA.debugLine="Try";
try { //BA.debugLineNum = 287;BA.debugLine="If fx.Screens.Size= 1 Then";
if (_fx.getScreens().getSize()==1) { 
 //BA.debugLineNum = 288;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 289;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
 //BA.debugLineNum = 291;BA.debugLine="Return S";
if (true) return _s;
 }else if(_fx.getScreens().getSize()>1) { 
 //BA.debugLineNum = 293;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 294;BA.debugLine="Dim S As Screen = SList.Get(1)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (1))));
 //BA.debugLineNum = 296;BA.debugLine="Return S";
if (true) return _s;
 }else {
 //BA.debugLineNum = 298;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 299;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
 //BA.debugLineNum = 301;BA.debugLine="Return S";
if (true) return _s;
 };
 } 
       catch (Exception e16) {
			ba.setLastException(e16); //BA.debugLineNum = 304;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 305;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
 //BA.debugLineNum = 307;BA.debugLine="Return S";
if (true) return _s;
 };
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
return null;
}
public static String  _close_entered_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Private Sub Close_Entered_Event(e As Event)";
 //BA.debugLineNum = 160;BA.debugLine="ivClose.SetImage(fx.LoadImage(File.DirAssets, img";
_ivclose.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btCloseEnt.png").getObject()));
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return "";
}
public static String  _close_exited_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 163;BA.debugLine="Private Sub Close_Exited_Event(e As Event)";
 //BA.debugLineNum = 164;BA.debugLine="ivClose.SetImage(fx.LoadImage(File.DirAssets, img";
_ivclose.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btClose.png").getObject()));
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return "";
}
public static String  _get_css() throws Exception{
anywheresoftware.b4j.object.JavaObject _jform = null;
anywheresoftware.b4j.object.JavaObject _scene = null;
anywheresoftware.b4a.objects.collections.List _stylesheets = null;
 //BA.debugLineNum = 264;BA.debugLine="Public Sub Get_css";
 //BA.debugLineNum = 265;BA.debugLine="Dim jForm As JavaObject = MainForm";
_jform = new anywheresoftware.b4j.object.JavaObject();
_jform.setObject((java.lang.Object)(_mainform));
 //BA.debugLineNum = 266;BA.debugLine="Dim scene As JavaObject = jForm.GetField(\"scene\")";
_scene = new anywheresoftware.b4j.object.JavaObject();
_scene.setObject((java.lang.Object)(_jform.GetField("scene")));
 //BA.debugLineNum = 267;BA.debugLine="Dim stylesheets As List = scene.RunMethod(\"getSty";
_stylesheets = new anywheresoftware.b4a.objects.collections.List();
_stylesheets.setObject((java.util.List)(_scene.RunMethod("getStylesheets",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
 //BA.debugLineNum = 268;BA.debugLine="stylesheets.Clear";
_stylesheets.Clear();
 //BA.debugLineNum = 269;BA.debugLine="stylesheets.Add(File.GetUri(File.DirAssets, imgIn";
_stylesheets.Add((Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+".css")));
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return "";
}
public static String  _getairquality(int _number) throws Exception{
 //BA.debugLineNum = 372;BA.debugLine="Sub GetAirQuality(number As Int) As String";
 //BA.debugLineNum = 375;BA.debugLine="If number <= 100 Then";
if (_number<=100) { 
 //BA.debugLineNum = 376;BA.debugLine="Return(\"Carbon monoxide perfect\")";
if (true) return ("Carbon monoxide perfect");
 }else if(((_number>100) && (_number<400)) || _number==400) { 
 //BA.debugLineNum = 378;BA.debugLine="Return(\"Carbon monoxide normal\")";
if (true) return ("Carbon monoxide normal");
 }else if(((_number>400) && (_number<900)) || _number==900) { 
 //BA.debugLineNum = 380;BA.debugLine="Return(\"Carbon monoxide high\")";
if (true) return ("Carbon monoxide high");
 }else if(_number>900) { 
 //BA.debugLineNum = 382;BA.debugLine="Return(\"ALARM Carbon monoxide very high\")";
if (true) return ("ALARM Carbon monoxide very high");
 }else {
 //BA.debugLineNum = 384;BA.debugLine="Return(\"MQ-7 - cant read any value - check the s";
if (true) return ("MQ-7 - cant read any value - check the sensor!");
 };
 //BA.debugLineNum = 386;BA.debugLine="End Sub";
return "";
}
public static String  _getcomfort(String _dht11comfortstatus) throws Exception{
String _localcomfortstatus = "";
 //BA.debugLineNum = 345;BA.debugLine="Sub GetComfort(DHT11ComfortStatus As String) As St";
 //BA.debugLineNum = 346;BA.debugLine="Dim localcomfortstatus As String";
_localcomfortstatus = "";
 //BA.debugLineNum = 347;BA.debugLine="Select Case DHT11ComfortStatus";
switch (BA.switchObjectToInt(_dht11comfortstatus,BA.NumberToString(0),BA.NumberToString(1),BA.NumberToString(2),BA.NumberToString(4),BA.NumberToString(5),BA.NumberToString(6),BA.NumberToString(8),BA.NumberToString(9),BA.NumberToString(10))) {
case 0: {
 //BA.debugLineNum = 349;BA.debugLine="localcomfortstatus = \"OK\"";
_localcomfortstatus = "OK";
 break; }
case 1: {
 //BA.debugLineNum = 351;BA.debugLine="localcomfortstatus = \"Too hot\"";
_localcomfortstatus = "Too hot";
 break; }
case 2: {
 //BA.debugLineNum = 353;BA.debugLine="localcomfortstatus = \"Too cold\"";
_localcomfortstatus = "Too cold";
 break; }
case 3: {
 //BA.debugLineNum = 355;BA.debugLine="localcomfortstatus = \"Too dry\"";
_localcomfortstatus = "Too dry";
 break; }
case 4: {
 //BA.debugLineNum = 357;BA.debugLine="localcomfortstatus = \"Hot and dry\"";
_localcomfortstatus = "Hot and dry";
 break; }
case 5: {
 //BA.debugLineNum = 359;BA.debugLine="localcomfortstatus = \"Cold and dry\"";
_localcomfortstatus = "Cold and dry";
 break; }
case 6: {
 //BA.debugLineNum = 361;BA.debugLine="localcomfortstatus = \"Too humid\"";
_localcomfortstatus = "Too humid";
 break; }
case 7: {
 //BA.debugLineNum = 363;BA.debugLine="localcomfortstatus = \"Hot and humid\"";
_localcomfortstatus = "Hot and humid";
 break; }
case 8: {
 //BA.debugLineNum = 365;BA.debugLine="localcomfortstatus = \"Cold and humid\"";
_localcomfortstatus = "Cold and humid";
 break; }
default: {
 //BA.debugLineNum = 367;BA.debugLine="localcomfortstatus = \"Unknown\"";
_localcomfortstatus = "Unknown";
 break; }
}
;
 //BA.debugLineNum = 369;BA.debugLine="Return localcomfortstatus";
if (true) return _localcomfortstatus;
 //BA.debugLineNum = 370;BA.debugLine="End Sub";
return "";
}
public static String  _getperception(String _dht11perception) throws Exception{
String _localperception = "";
 //BA.debugLineNum = 312;BA.debugLine="Sub GetPerception(DHT11Perception As String) As St";
 //BA.debugLineNum = 323;BA.debugLine="Dim localperception As String";
_localperception = "";
 //BA.debugLineNum = 324;BA.debugLine="Select Case DHT11Perception";
switch (BA.switchObjectToInt(_dht11perception,BA.NumberToString(0),BA.NumberToString(1),BA.NumberToString(2),BA.NumberToString(3),BA.NumberToString(4),BA.NumberToString(5),BA.NumberToString(6),BA.NumberToString(7))) {
case 0: {
 //BA.debugLineNum = 326;BA.debugLine="localperception = \"Feels like the western US, a";
_localperception = "Feels like the western US, a bit dry to some";
 break; }
case 1: {
 //BA.debugLineNum = 328;BA.debugLine="localperception = \"Very comfortable\"";
_localperception = "Very comfortable";
 break; }
case 2: {
 //BA.debugLineNum = 330;BA.debugLine="localperception = \"Comfortable\"";
_localperception = "Comfortable";
 break; }
case 3: {
 //BA.debugLineNum = 332;BA.debugLine="localperception = \"OK but humidity is at upper";
_localperception = "OK but humidity is at upper limit";
 break; }
case 4: {
 //BA.debugLineNum = 334;BA.debugLine="localperception = \"Uncomfortable and the humidi";
_localperception = "Uncomfortable and the humidity is at upper limit";
 break; }
case 5: {
 //BA.debugLineNum = 336;BA.debugLine="localperception = \"Very humid, quite uncomforta";
_localperception = "Very humid, quite uncomfortable";
 break; }
case 6: {
 //BA.debugLineNum = 338;BA.debugLine="localperception = \"Extremely uncomfortable, opp";
_localperception = "Extremely uncomfortable, oppressive";
 break; }
case 7: {
 //BA.debugLineNum = 340;BA.debugLine="localperception = \"Severely high, even deadly f";
_localperception = "Severely high, even deadly for asthma related illnesses";
 break; }
}
;
 //BA.debugLineNum = 342;BA.debugLine="Return localperception";
if (true) return _localperception;
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.object.JavaObject  _getstage(anywheresoftware.b4j.object.JavaObject _o) throws Exception{
 //BA.debugLineNum = 281;BA.debugLine="private Sub getStage(o As JavaObject) As JavaObjec";
 //BA.debugLineNum = 282;BA.debugLine="Return o.GetFieldJO(\"stage\")";
if (true) return _o.GetFieldJO("stage");
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return null;
}
public static String  _ivclose_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Private Sub ivClose_MouseClicked (EventData As Mou";
 //BA.debugLineNum = 156;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return "";
}
public static String  _ivmax_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
anywheresoftware.b4j.objects.JFX.ScreenWrapper _scr = null;
 //BA.debugLineNum = 167;BA.debugLine="Private Sub ivMax_MouseClicked (EventData As Mouse";
 //BA.debugLineNum = 172;BA.debugLine="Dim scr As Screen = fx.PrimaryScreen";
_scr = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_scr = _fx.getPrimaryScreen();
 //BA.debugLineNum = 173;BA.debugLine="If isMaximized Then";
if (_ismaximized) { 
 //BA.debugLineNum = 174;BA.debugLine="MainForm.WindowLeft = f_X";
_mainform.setWindowLeft(_f_x);
 //BA.debugLineNum = 175;BA.debugLine="MainForm.WindowTop = f_Y";
_mainform.setWindowTop(_f_y);
 //BA.debugLineNum = 176;BA.debugLine="MainForm.WindowWidth = f_W";
_mainform.setWindowWidth(_f_w);
 //BA.debugLineNum = 177;BA.debugLine="MainForm.WindowHeight = f_H";
_mainform.setWindowHeight(_f_h);
 }else {
 //BA.debugLineNum = 179;BA.debugLine="f_X = MainForm.WindowLeft";
_f_x = _mainform.getWindowLeft();
 //BA.debugLineNum = 180;BA.debugLine="f_Y = MainForm.WindowTop";
_f_y = _mainform.getWindowTop();
 //BA.debugLineNum = 181;BA.debugLine="f_W = MainForm.WindowWidth";
_f_w = _mainform.getWindowWidth();
 //BA.debugLineNum = 182;BA.debugLine="f_H = MainForm.WindowHeight";
_f_h = _mainform.getWindowHeight();
 //BA.debugLineNum = 183;BA.debugLine="MainForm.WindowLeft = 0";
_mainform.setWindowLeft(0);
 //BA.debugLineNum = 184;BA.debugLine="MainForm.WindowTop = 0";
_mainform.setWindowTop(0);
 //BA.debugLineNum = 185;BA.debugLine="MainForm.WindowWidth = scr.MaxX";
_mainform.setWindowWidth(_scr.getMaxX());
 //BA.debugLineNum = 186;BA.debugLine="MainForm.WindowHeight = scr.MaxY + 40";
_mainform.setWindowHeight(_scr.getMaxY()+40);
 };
 //BA.debugLineNum = 188;BA.debugLine="isMaximized = Not(isMaximized)";
_ismaximized = anywheresoftware.b4a.keywords.Common.Not(_ismaximized);
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return "";
}
public static String  _ivmin_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
anywheresoftware.b4j.object.JavaObject _jmf = null;
anywheresoftware.b4j.object.JavaObject _stage = null;
 //BA.debugLineNum = 199;BA.debugLine="Private Sub ivMin_MouseClicked (EventData As Mouse";
 //BA.debugLineNum = 200;BA.debugLine="Dim jmf As JavaObject = MainForm";
_jmf = new anywheresoftware.b4j.object.JavaObject();
_jmf.setObject((java.lang.Object)(_mainform));
 //BA.debugLineNum = 201;BA.debugLine="Dim stage As JavaObject = jmf.GetField(\"stage\")";
_stage = new anywheresoftware.b4j.object.JavaObject();
_stage.setObject((java.lang.Object)(_jmf.GetField("stage")));
 //BA.debugLineNum = 202;BA.debugLine="stage.RunMethod(\"setIconified\", Array As Object(T";
_stage.RunMethod("setIconified",new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.True)});
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return "";
}
public static String  _lbtitle_mousedragged(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 143;BA.debugLine="Private Sub lbTitle_MouseDragged (EventData As Mou";
 //BA.debugLineNum = 144;BA.debugLine="If isMaximized Then Return";
if (_ismaximized) { 
if (true) return "";};
 //BA.debugLineNum = 145;BA.debugLine="Dim jo As JavaObject = EventData";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(_eventdata.getObject()));
 //BA.debugLineNum = 146;BA.debugLine="MainForm.WindowLeft = jo.RunMethod(\"getScreenX";
_mainform.setWindowLeft((double)(BA.ObjectToNumber(_jo.RunMethod("getScreenX",(Object[])(anywheresoftware.b4a.keywords.Common.Null))))-_xmouse);
 //BA.debugLineNum = 147;BA.debugLine="MainForm.WindowTop = jo.RunMethod(\"getScreenY\"";
_mainform.setWindowTop((double)(BA.ObjectToNumber(_jo.RunMethod("getScreenY",(Object[])(anywheresoftware.b4a.keywords.Common.Null))))-_ymouse);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return "";
}
public static String  _lbtitle_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Private Sub lbTitle_MousePressed (EventData As Mou";
 //BA.debugLineNum = 151;BA.debugLine="xMouse = EventData.X + lbTitle.Left + 15";
_xmouse = _eventdata.getX()+_lbtitle.getLeft()+15;
 //BA.debugLineNum = 152;BA.debugLine="yMouse = EventData.Y + lbTitle.Top + 15";
_ymouse = _eventdata.getY()+_lbtitle.getTop()+15;
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return "";
}
public static String  _loadlist() throws Exception{
int _i = 0;
anywheresoftware.b4j.objects.LabelWrapper _lb = null;
String _n = "";
short _lg = (short)0;
 //BA.debugLineNum = 247;BA.debugLine="Private Sub loadList";
 //BA.debugLineNum = 248;BA.debugLine="lstSkins.Items.Clear";
_lstskins.getItems().Clear();
 //BA.debugLineNum = 249;BA.debugLine="For i = 1 To 6";
{
final int step2 = 1;
final int limit2 = (int) (6);
_i = (int) (1) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 250;BA.debugLine="Dim lb As Label";
_lb = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 251;BA.debugLine="lb.Initialize(\"\")";
_lb.Initialize(ba,"");
 //BA.debugLineNum = 252;BA.debugLine="Dim n As String =  i";
_n = BA.NumberToString(_i);
 //BA.debugLineNum = 253;BA.debugLine="Dim lg As Short = n .Length";
_lg = (short) (_n.length());
 //BA.debugLineNum = 254;BA.debugLine="Do Until lg = 2";
while (!(_lg==2)) {
 //BA.debugLineNum = 255;BA.debugLine="n = \"0\" & n";
_n = "0"+_n;
 //BA.debugLineNum = 256;BA.debugLine="lg = n .Length";
_lg = (short) (_n.length());
 }
;
 //BA.debugLineNum = 258;BA.debugLine="lb.Text = \"Skin #\"  &  n";
_lb.setText("Skin #"+_n);
 //BA.debugLineNum = 259;BA.debugLine="lb.Tag = \"vdSk\" & n";
_lb.setTag((Object)("vdSk"+_n));
 //BA.debugLineNum = 260;BA.debugLine="lstSkins.Items.Add(lb)";
_lstskins.getItems().Add((Object)(_lb.getObject()));
 }
};
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return "";
}
public static String  _loadskin(String _sk) throws Exception{
anywheresoftware.b4j.agraham.reflection.Reflection _obj = null;
 //BA.debugLineNum = 223;BA.debugLine="Private Sub loadSkin(Sk As String)";
 //BA.debugLineNum = 224;BA.debugLine="MainForm.RootPane.RemoveAllNodes";
_mainform.getRootPane().RemoveAllNodes();
 //BA.debugLineNum = 225;BA.debugLine="MainForm.RootPane.LoadLayout(Sk)";
_mainform.getRootPane().LoadLayout(ba,_sk);
 //BA.debugLineNum = 226;BA.debugLine="MainForm.BackColor = fx.Colors.Transparent";
_mainform.setBackColor(_fx.Colors.Transparent);
 //BA.debugLineNum = 227;BA.debugLine="MainForm.RootPane.Style = \"-fx-background-color:t";
_mainform.getRootPane().setStyle("-fx-background-color:transparent;-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 1.0) , 15,0, 0.0, 0.0);");
 //BA.debugLineNum = 228;BA.debugLine="MainForm.Resizable = False";
_mainform.setResizable(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 229;BA.debugLine="lbTitle.MouseCursor = fx.Cursors.MOVE";
_lbtitle.setMouseCursor(_fx.Cursors.MOVE);
 //BA.debugLineNum = 230;BA.debugLine="lbTitle.Text = \"Title  -  \" & Sk";
_lbtitle.setText("Title  -  "+_sk);
 //BA.debugLineNum = 231;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
 //BA.debugLineNum = 232;BA.debugLine="Obj.Target = ivClose";
_obj.Target = (Object)(_ivclose.getObject());
 //BA.debugLineNum = 233;BA.debugLine="Obj.AddEventHandler2(\"Close_Entered\", \"onMouseEnt";
_obj.AddEventHandler2(ba,"Close_Entered","onMouseEnteredProperty");
 //BA.debugLineNum = 234;BA.debugLine="Obj.AddEventHandler2(\"Close_Exited\", \"onMouseExit";
_obj.AddEventHandler2(ba,"Close_Exited","onMouseExitedProperty");
 //BA.debugLineNum = 235;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
 //BA.debugLineNum = 236;BA.debugLine="Obj.Target = ivMax";
_obj.Target = (Object)(_ivmax.getObject());
 //BA.debugLineNum = 237;BA.debugLine="Obj.AddEventHandler2(\"Max_Entered\", \"onMouseEnter";
_obj.AddEventHandler2(ba,"Max_Entered","onMouseEnteredProperty");
 //BA.debugLineNum = 238;BA.debugLine="Obj.AddEventHandler2(\"Max_Exited\", \"onMouseExited";
_obj.AddEventHandler2(ba,"Max_Exited","onMouseExitedProperty");
 //BA.debugLineNum = 239;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
 //BA.debugLineNum = 240;BA.debugLine="Obj.Target = ivMin";
_obj.Target = (Object)(_ivmin.getObject());
 //BA.debugLineNum = 241;BA.debugLine="Obj.AddEventHandler2(\"Min_Entered\", \"onMouseEnter";
_obj.AddEventHandler2(ba,"Min_Entered","onMouseEnteredProperty");
 //BA.debugLineNum = 242;BA.debugLine="Obj.AddEventHandler2(\"Min_Exited\", \"onMouseExited";
_obj.AddEventHandler2(ba,"Min_Exited","onMouseExitedProperty");
 //BA.debugLineNum = 243;BA.debugLine="Get_css";
_get_css();
 //BA.debugLineNum = 244;BA.debugLine="loadList";
_loadlist();
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return "";
}
public static String  _lstskins_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
short _idx = (short)0;
anywheresoftware.b4j.objects.LabelWrapper _lb = null;
 //BA.debugLineNum = 213;BA.debugLine="Private Sub lstSkins_MouseClicked (EventData As Mo";
 //BA.debugLineNum = 214;BA.debugLine="Dim idx As Short = lstSkins.SelectedIndex";
_idx = (short) (_lstskins.getSelectedIndex());
 //BA.debugLineNum = 215;BA.debugLine="If idx = -1 Then Return";
if (_idx==-1) { 
if (true) return "";};
 //BA.debugLineNum = 216;BA.debugLine="Dim lb As Label = lstSkins.Items.Get(idx)";
_lb = new anywheresoftware.b4j.objects.LabelWrapper();
_lb.setObject((javafx.scene.control.Label)(_lstskins.getItems().Get((int) (_idx))));
 //BA.debugLineNum = 217;BA.debugLine="If lb.tag = AtualSkin Then Return";
if ((_lb.getTag()).equals((Object)(_atualskin))) { 
if (true) return "";};
 //BA.debugLineNum = 218;BA.debugLine="AtualSkin = lb.tag";
_atualskin = BA.ObjectToString(_lb.getTag());
 //BA.debugLineNum = 219;BA.debugLine="imgInit = AtualSkin.SubString(2).ToLowerCase";
_imginit = _atualskin.substring((int) (2)).toLowerCase();
 //BA.debugLineNum = 220;BA.debugLine="loadSkin(AtualSkin)";
_loadskin(_atualskin);
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return "";
}
public static String  _mainform_closed() throws Exception{
 //BA.debugLineNum = 393;BA.debugLine="Sub MainForm_Closed";
 //BA.debugLineNum = 394;BA.debugLine="mqtt.Close";
_mqtt.Close();
 //BA.debugLineNum = 395;BA.debugLine="End Sub";
return "";
}
public static String  _max_entered_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Private Sub Max_Entered_Event(e As Event)";
 //BA.debugLineNum = 192;BA.debugLine="ivMax.SetImage(fx.LoadImage(File.DirAssets, imgIn";
_ivmax.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMaxEnt.png").getObject()));
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return "";
}
public static String  _max_exited_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Private Sub Max_Exited_Event(e As Event)";
 //BA.debugLineNum = 196;BA.debugLine="ivMax.SetImage(fx.LoadImage(File.DirAssets, imgIn";
_ivmax.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMax.png").getObject()));
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return "";
}
public static String  _min_entered_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 205;BA.debugLine="Private Sub Min_Entered_Event(e As Event)";
 //BA.debugLineNum = 206;BA.debugLine="ivMin.SetImage(fx.LoadImage(File.DirAssets, imgIn";
_ivmin.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMinEnt.png").getObject()));
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return "";
}
public static String  _min_exited_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Private Sub Min_Exited_Event(e As Event)";
 //BA.debugLineNum = 210;BA.debugLine="ivMin.SetImage(fx.LoadImage(File.DirAssets, imgIn";
_ivmin.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMin.png").getObject()));
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return "";
}
public static String  _mqtt_connected(boolean _success) throws Exception{
 //BA.debugLineNum = 397;BA.debugLine="Sub mqtt_Connected (Success As Boolean)";
 //BA.debugLineNum = 398;BA.debugLine="If Success = False Then";
if (_success==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 399;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 //BA.debugLineNum = 400;BA.debugLine="lblStatus.TextColor = fx.Colors.Red";
_lblstatus.setTextColor(_fx.Colors.Red);
 //BA.debugLineNum = 401;BA.debugLine="lblStatus.Text = \"Status: Error connecting\"";
_lblstatus.setText("Status: Error connecting");
 }else {
 //BA.debugLineNum = 403;BA.debugLine="lblStatus.TextColor = fx.Colors.White";
_lblstatus.setTextColor(_fx.Colors.White);
 //BA.debugLineNum = 404;BA.debugLine="lblStatus.Text = \"Status: Connected to Cloud MQT";
_lblstatus.setText("Status: Connected to Cloud MQTT");
 //BA.debugLineNum = 405;BA.debugLine="MenuBar1.Enabled = True";
_menubar1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 406;BA.debugLine="mqtt.Subscribe(\"TempHumid\", 0)";
_mqtt.Subscribe("TempHumid",(int) (0));
 //BA.debugLineNum = 407;BA.debugLine="mqtt.Subscribe(\"MQ7\", 0)";
_mqtt.Subscribe("MQ7",(int) (0));
 //BA.debugLineNum = 408;BA.debugLine="mqtt.Subscribe(\"TempHumidBasement\", 0)";
_mqtt.Subscribe("TempHumidBasement",(int) (0));
 //BA.debugLineNum = 409;BA.debugLine="mqtt.Subscribe(\"MQ7Basement\", 0)";
_mqtt.Subscribe("MQ7Basement",(int) (0));
 //BA.debugLineNum = 410;BA.debugLine="mqtt.Publish(\"MQ7\", serializator.ConvertObjectTo";
_mqtt.Publish("MQ7",_serializator.ConvertObjectToBytes((Object)("Read voltage")));
 //BA.debugLineNum = 411;BA.debugLine="mqtt.Publish(\"MQ7Basement\", serializator.Convert";
_mqtt.Publish("MQ7Basement",_serializator.ConvertObjectToBytes((Object)("Read voltage")));
 };
 //BA.debugLineNum = 413;BA.debugLine="End Sub";
return "";
}
public static void  _mqtt_disconnected() throws Exception{
ResumableSub_mqtt_Disconnected rsub = new ResumableSub_mqtt_Disconnected(null);
rsub.resume(ba, null);
}
public static class ResumableSub_mqtt_Disconnected extends BA.ResumableSub {
public ResumableSub_mqtt_Disconnected(b4j.example.main parent) {
this.parent = parent;
}
b4j.example.main parent;
anywheresoftware.b4j.objects.MqttAsyncClientWrapper.MqttConnectOptionsWrapper _mo = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 416;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 6;
this.catchState = 5;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 6;
this.catchState = 5;
 //BA.debugLineNum = 417;BA.debugLine="lblStatus.TextColor = fx.Colors.Red";
parent._lblstatus.setTextColor(parent._fx.Colors.Red);
 //BA.debugLineNum = 418;BA.debugLine="lblStatus.Text = \"Status: Disconnected from Clou";
parent._lblstatus.setText("Status: Disconnected from Cloud MQTT");
 //BA.debugLineNum = 419;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
 //BA.debugLineNum = 420;BA.debugLine="MenuBar1.Enabled = False";
parent._menubar1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 421;BA.debugLine="Dim mo As MqttConnectOptions";
_mo = new anywheresoftware.b4j.objects.MqttAsyncClientWrapper.MqttConnectOptionsWrapper();
 //BA.debugLineNum = 422;BA.debugLine="mo.Initialize(user, password)";
_mo.Initialize(parent._user,parent._password);
 //BA.debugLineNum = 423;BA.debugLine="mqtt.Connect2(mo)";
parent._mqtt.Connect2((org.eclipse.paho.client.mqttv3.MqttConnectOptions)(_mo.getObject()));
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 //BA.debugLineNum = 425;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 428;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public static String  _mqtt_messagearrived(String _topic,byte[] _payload) throws Exception{
String _s = "";
String[] _a = null;
long _ticks = 0L;
long _lngticks = 0L;
b4j.example.dateutils._period _p = null;
 //BA.debugLineNum = 430;BA.debugLine="Private Sub mqtt_MessageArrived (Topic As String,";
 //BA.debugLineNum = 431;BA.debugLine="If Topic = \"TempHumid\" Then";
if ((_topic).equals("TempHumid")) { 
 //BA.debugLineNum = 432;BA.debugLine="Dim s As String = BytesToString(Payload, 0, Payl";
_s = anywheresoftware.b4a.keywords.Common.BytesToString(_payload,(int) (0),_payload.length,"utf8");
 //BA.debugLineNum = 433;BA.debugLine="Dim a() As String = Regex.Split(\"\\|\",s)";
_a = anywheresoftware.b4a.keywords.Common.Regex.Split("\\|",_s);
 //BA.debugLineNum = 434;BA.debugLine="If a.Length = 9 Then";
if (_a.length==9) { 
 //BA.debugLineNum = 435;BA.debugLine="gaugeHomeTemp.CurrentValue=a(1)";
_gaugehometemp._setcurrentvalue((float)(Double.parseDouble(_a[(int) (1)])));
 //BA.debugLineNum = 436;BA.debugLine="gaugeHomeHumidity.CurrentValue=a(2)";
_gaugehomehumidity._setcurrentvalue((float)(Double.parseDouble(_a[(int) (2)])));
 //BA.debugLineNum = 437;BA.debugLine="labelgaugeHomeTemp.Text = GetPerception(a(3))";
_labelgaugehometemp.setText(_getperception(_a[(int) (3)]));
 //BA.debugLineNum = 438;BA.debugLine="labelgaugeHomeHumidity.Text = GetComfort(a(4))";
_labelgaugehomehumidity.setText(_getcomfort(_a[(int) (4)]));
 //BA.debugLineNum = 440;BA.debugLine="If a(3) > 3 Then";
if ((double)(Double.parseDouble(_a[(int) (3)]))>3) { 
 //BA.debugLineNum = 441;BA.debugLine="labelgaugeHomeTemp.TextColor = fx.Colors.Red";
_labelgaugehometemp.setTextColor(_fx.Colors.Red);
 }else {
 //BA.debugLineNum = 443;BA.debugLine="labelgaugeHomeTemp.TextColor = fx.Colors.Black";
_labelgaugehometemp.setTextColor(_fx.Colors.Black);
 };
 //BA.debugLineNum = 445;BA.debugLine="If a(4) > 0 Then";
if ((double)(Double.parseDouble(_a[(int) (4)]))>0) { 
 //BA.debugLineNum = 446;BA.debugLine="labelgaugeHomeHumidity.TextColor = fx.Colors.R";
_labelgaugehomehumidity.setTextColor(_fx.Colors.Red);
 }else {
 //BA.debugLineNum = 448;BA.debugLine="labelgaugeHomeHumidity.TextColor = fx.Colors.B";
_labelgaugehomehumidity.setTextColor(_fx.Colors.Black);
 };
 //BA.debugLineNum = 451;BA.debugLine="DateTime.DateFormat = \"yy-MM-dd HH:mm:ss z\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yy-MM-dd HH:mm:ss z");
 //BA.debugLineNum = 452;BA.debugLine="Dim ticks As Long = DateTime.DateParse(a(7) & \"";
_ticks = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_a[(int) (7)]+" "+_a[(int) (8)]+" GMT");
 //BA.debugLineNum = 453;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a z\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("MMM d, yyyy h:mm:ss a z");
 //BA.debugLineNum = 454;BA.debugLine="Dim lngTicks As Long = ticks";
_lngticks = _ticks;
 //BA.debugLineNum = 455;BA.debugLine="Dim p As Period = DateUtils.PeriodBetween(lngTi";
_p = _dateutils._periodbetween(_lngticks,anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 457;BA.debugLine="If p.Minutes > = 5 Then";
if (_p.Minutes>=5) { 
 //BA.debugLineNum = 458;BA.debugLine="labelgaugeHomeTemp.Text = \"Message is \" & p.Ho";
_labelgaugehometemp.setText("Message is "+BA.NumberToString(_p.Hours)+"hr "+BA.NumberToString(_p.Minutes)+"m old.");
 //BA.debugLineNum = 459;BA.debugLine="labelgaugeHomeTemp.TextColor = fx.Colors.Red";
_labelgaugehometemp.setTextColor(_fx.Colors.Red);
 //BA.debugLineNum = 460;BA.debugLine="labelgaugeHomeHumidity.Text = \"Message is \" &";
_labelgaugehomehumidity.setText("Message is "+BA.NumberToString(_p.Hours)+"hr "+BA.NumberToString(_p.Minutes)+"m old.");
 //BA.debugLineNum = 461;BA.debugLine="labelgaugeHomeHumidity.TextColor = fx.Colors.R";
_labelgaugehomehumidity.setTextColor(_fx.Colors.Red);
 };
 };
 }else if((_topic).equals("MQ7")) { 
 //BA.debugLineNum = 466;BA.debugLine="Dim s As String = BytesToString(Payload, 0, Payl";
_s = anywheresoftware.b4a.keywords.Common.BytesToString(_payload,(int) (0),_payload.length,"utf8");
 //BA.debugLineNum = 467;BA.debugLine="Dim a() As String = Regex.Split(\"\\|\",s)";
_a = anywheresoftware.b4a.keywords.Common.Regex.Split("\\|",_s);
 //BA.debugLineNum = 468;BA.debugLine="If a.Length = 3 Then";
if (_a.length==3) { 
 //BA.debugLineNum = 469;BA.debugLine="GaugeAirQuality.CurrentValue=a(0)";
_gaugeairquality._setcurrentvalue((float)(Double.parseDouble(_a[(int) (0)])));
 //BA.debugLineNum = 470;BA.debugLine="labelGaugeAirQuality.Text = GetAirQuality(a(0))";
_labelgaugeairquality.setText(_getairquality((int)(Double.parseDouble(_a[(int) (0)]))));
 //BA.debugLineNum = 471;BA.debugLine="If a(0) > 400 Then";
if ((double)(Double.parseDouble(_a[(int) (0)]))>400) { 
 //BA.debugLineNum = 472;BA.debugLine="labelGaugeAirQuality.TextColor = fx.Colors.Red";
_labelgaugeairquality.setTextColor(_fx.Colors.Red);
 }else {
 //BA.debugLineNum = 474;BA.debugLine="labelGaugeAirQuality.TextColor = fx.Colors.Bla";
_labelgaugeairquality.setTextColor(_fx.Colors.Black);
 };
 //BA.debugLineNum = 477;BA.debugLine="DateTime.DateFormat = \"yy-MM-dd HH:mm:ss z\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yy-MM-dd HH:mm:ss z");
 //BA.debugLineNum = 478;BA.debugLine="Dim ticks As Long = DateTime.DateParse(a(1) & \"";
_ticks = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_a[(int) (1)]+" "+_a[(int) (2)]+" GMT");
 //BA.debugLineNum = 479;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a z\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("MMM d, yyyy h:mm:ss a z");
 //BA.debugLineNum = 480;BA.debugLine="Dim lngTicks As Long = ticks";
_lngticks = _ticks;
 //BA.debugLineNum = 481;BA.debugLine="Dim p As Period = DateUtils.PeriodBetween(lngTi";
_p = _dateutils._periodbetween(_lngticks,anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 483;BA.debugLine="If p.Minutes > = 5 Then";
if (_p.Minutes>=5) { 
 //BA.debugLineNum = 484;BA.debugLine="labelGaugeAirQuality.Text = \"Message is \" & p.";
_labelgaugeairquality.setText("Message is "+BA.NumberToString(_p.Hours)+"hr "+BA.NumberToString(_p.Minutes)+"m old.");
 //BA.debugLineNum = 485;BA.debugLine="labelGaugeAirQuality.TextColor = fx.Colors.Red";
_labelgaugeairquality.setTextColor(_fx.Colors.Red);
 };
 };
 }else if((_topic).equals("TempHumidBasement")) { 
 //BA.debugLineNum = 490;BA.debugLine="Dim s As String = BytesToString(Payload, 0, Payl";
_s = anywheresoftware.b4a.keywords.Common.BytesToString(_payload,(int) (0),_payload.length,"utf8");
 //BA.debugLineNum = 491;BA.debugLine="Dim a() As String = Regex.Split(\"\\|\",s)";
_a = anywheresoftware.b4a.keywords.Common.Regex.Split("\\|",_s);
 //BA.debugLineNum = 492;BA.debugLine="If a.Length = 9 Then";
if (_a.length==9) { 
 //BA.debugLineNum = 493;BA.debugLine="gaugeBasementTemp.CurrentValue=a(1)";
_gaugebasementtemp._setcurrentvalue((float)(Double.parseDouble(_a[(int) (1)])));
 //BA.debugLineNum = 494;BA.debugLine="gaugeBasementHumidity.CurrentValue=a(2)";
_gaugebasementhumidity._setcurrentvalue((float)(Double.parseDouble(_a[(int) (2)])));
 //BA.debugLineNum = 495;BA.debugLine="labelgaugeBasementTemp.Text = GetPerception(a(3";
_labelgaugebasementtemp.setText(_getperception(_a[(int) (3)]));
 //BA.debugLineNum = 496;BA.debugLine="labelgaugeBasementHumidity.Text = GetComfort(a(";
_labelgaugebasementhumidity.setText(_getcomfort(_a[(int) (4)]));
 //BA.debugLineNum = 497;BA.debugLine="If a(3) > 3 Then";
if ((double)(Double.parseDouble(_a[(int) (3)]))>3) { 
 //BA.debugLineNum = 498;BA.debugLine="labelgaugeBasementTemp.TextColor = fx.Colors.R";
_labelgaugebasementtemp.setTextColor(_fx.Colors.Red);
 }else {
 //BA.debugLineNum = 500;BA.debugLine="labelgaugeBasementTemp.TextColor = fx.Colors.B";
_labelgaugebasementtemp.setTextColor(_fx.Colors.Black);
 };
 //BA.debugLineNum = 502;BA.debugLine="If a(4) > 0 Then";
if ((double)(Double.parseDouble(_a[(int) (4)]))>0) { 
 //BA.debugLineNum = 503;BA.debugLine="labelgaugeBasementHumidity.TextColor = fx.Colo";
_labelgaugebasementhumidity.setTextColor(_fx.Colors.Red);
 }else {
 //BA.debugLineNum = 505;BA.debugLine="labelgaugeBasementHumidity.TextColor = fx.Colo";
_labelgaugebasementhumidity.setTextColor(_fx.Colors.Black);
 };
 //BA.debugLineNum = 508;BA.debugLine="DateTime.DateFormat = \"yy-MM-dd HH:mm:ss z\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yy-MM-dd HH:mm:ss z");
 //BA.debugLineNum = 509;BA.debugLine="Dim ticks As Long = DateTime.DateParse(a(7) & \"";
_ticks = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_a[(int) (7)]+" "+_a[(int) (8)]+" GMT");
 //BA.debugLineNum = 510;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a z\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("MMM d, yyyy h:mm:ss a z");
 //BA.debugLineNum = 511;BA.debugLine="Dim lngTicks As Long = ticks";
_lngticks = _ticks;
 //BA.debugLineNum = 512;BA.debugLine="Dim p As Period = DateUtils.PeriodBetween(lngTi";
_p = _dateutils._periodbetween(_lngticks,anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 514;BA.debugLine="If p.Minutes > = 5 Then";
if (_p.Minutes>=5) { 
 //BA.debugLineNum = 515;BA.debugLine="labelgaugeBasementTemp.Text = \"Message is \" &";
_labelgaugebasementtemp.setText("Message is "+BA.NumberToString(_p.Hours)+"hr "+BA.NumberToString(_p.Minutes)+"m old.");
 //BA.debugLineNum = 516;BA.debugLine="labelgaugeBasementTemp.TextColor = fx.Colors.R";
_labelgaugebasementtemp.setTextColor(_fx.Colors.Red);
 //BA.debugLineNum = 517;BA.debugLine="labelgaugeBasementHumidity.Text = \"Message is";
_labelgaugebasementhumidity.setText("Message is "+BA.NumberToString(_p.Hours)+"hr "+BA.NumberToString(_p.Minutes)+"m old.");
 //BA.debugLineNum = 518;BA.debugLine="labelgaugeBasementHumidity.TextColor = fx.Colo";
_labelgaugebasementhumidity.setTextColor(_fx.Colors.Red);
 };
 };
 }else if((_topic).equals("MQ7Basement")) { 
 //BA.debugLineNum = 523;BA.debugLine="Dim s As String = BytesToString(Payload, 0, Payl";
_s = anywheresoftware.b4a.keywords.Common.BytesToString(_payload,(int) (0),_payload.length,"utf8");
 //BA.debugLineNum = 524;BA.debugLine="Dim a() As String = Regex.Split(\"\\|\",s)";
_a = anywheresoftware.b4a.keywords.Common.Regex.Split("\\|",_s);
 //BA.debugLineNum = 525;BA.debugLine="If a.Length = 3 Then";
if (_a.length==3) { 
 //BA.debugLineNum = 526;BA.debugLine="GaugeBasementAirQuality.CurrentValue=a(0)";
_gaugebasementairquality._setcurrentvalue((float)(Double.parseDouble(_a[(int) (0)])));
 //BA.debugLineNum = 527;BA.debugLine="labelGaugeBasementAirQuality.Text = GetAirQuali";
_labelgaugebasementairquality.setText(_getairquality((int)(Double.parseDouble(_a[(int) (0)]))));
 //BA.debugLineNum = 528;BA.debugLine="If a(0) > 400 Then";
if ((double)(Double.parseDouble(_a[(int) (0)]))>400) { 
 //BA.debugLineNum = 529;BA.debugLine="labelGaugeBasementAirQuality.TextColor = fx.Co";
_labelgaugebasementairquality.setTextColor(_fx.Colors.Red);
 }else {
 //BA.debugLineNum = 531;BA.debugLine="labelGaugeBasementAirQuality.TextColor = fx.Co";
_labelgaugebasementairquality.setTextColor(_fx.Colors.Black);
 };
 //BA.debugLineNum = 534;BA.debugLine="DateTime.DateFormat = \"yy-MM-dd HH:mm:ss z\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yy-MM-dd HH:mm:ss z");
 //BA.debugLineNum = 535;BA.debugLine="Dim ticks As Long = DateTime.DateParse(a(1) & \"";
_ticks = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_a[(int) (1)]+" "+_a[(int) (2)]+" GMT");
 //BA.debugLineNum = 536;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a z\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("MMM d, yyyy h:mm:ss a z");
 //BA.debugLineNum = 537;BA.debugLine="Dim lngTicks As Long = ticks";
_lngticks = _ticks;
 //BA.debugLineNum = 538;BA.debugLine="Dim p As Period = DateUtils.PeriodBetween(lngTi";
_p = _dateutils._periodbetween(_lngticks,anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 540;BA.debugLine="If p.Minutes > = 5 Then";
if (_p.Minutes>=5) { 
 //BA.debugLineNum = 541;BA.debugLine="labelGaugeBasementAirQuality.Text = \"Message i";
_labelgaugebasementairquality.setText("Message is "+BA.NumberToString(_p.Hours)+"hr "+BA.NumberToString(_p.Minutes)+"m old.");
 //BA.debugLineNum = 542;BA.debugLine="labelGaugeBasementAirQuality.TextColor = fx.Co";
_labelgaugebasementairquality.setTextColor(_fx.Colors.Red);
 };
 };
 };
 //BA.debugLineNum = 547;BA.debugLine="End Sub";
return "";
}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        b4j.example.dateutils._process_globals();
main._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 8;BA.debugLine="Private MainForm As Form";
_mainform = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 9;BA.debugLine="Private lbTitle As Label 'ignore";
_lbtitle = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private xMouse, yMouse As Double";
_xmouse = 0;
_ymouse = 0;
 //BA.debugLineNum = 11;BA.debugLine="Private isMaximized As Boolean = False";
_ismaximized = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 12;BA.debugLine="Private ivClose As ImageView";
_ivclose = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private ivMax As ImageView";
_ivmax = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private ivMin As ImageView";
_ivmin = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private lstSkins As ListView 'ignore";
_lstskins = new anywheresoftware.b4j.objects.ListViewWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private AtualSkin As String";
_atualskin = "";
 //BA.debugLineNum = 17;BA.debugLine="Private imgInit As String";
_imginit = "";
 //BA.debugLineNum = 18;BA.debugLine="Private isMaximized As Boolean = False";
_ismaximized = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 19;BA.debugLine="Private f_X, f_Y, f_W, f_H As Double";
_f_x = 0;
_f_y = 0;
_f_w = 0;
_f_h = 0;
 //BA.debugLineNum = 20;BA.debugLine="Private Button1 As Button 'ignore";
_button1 = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 22;BA.debugLine="Private MainForm As Form";
_mainform = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 23;BA.debugLine="Private Canvas1 As Canvas 'ignore";
_canvas1 = new anywheresoftware.b4j.objects.CanvasWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private mqtt As MqttClient";
_mqtt = new anywheresoftware.b4j.objects.MqttAsyncClientWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Type CircleData (x As Double, y As Double, clr As";
;
 //BA.debugLineNum = 26;BA.debugLine="Private MenuBar1 As MenuBar 'ignore";
_menubar1 = new anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private user As String = \"vynckfaq\"";
_user = "vynckfaq";
 //BA.debugLineNum = 28;BA.debugLine="Private password As String = \"KHSV1Q1qSUUY\"";
_password = "KHSV1Q1qSUUY";
 //BA.debugLineNum = 29;BA.debugLine="Private gaugeHomeTemp As Gauge 'ignore";
_gaugehometemp = new b4j.example.gauge();
 //BA.debugLineNum = 30;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4j.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 31;BA.debugLine="Private GaugeAirQuality As Gauge 'ignore";
_gaugeairquality = new b4j.example.gauge();
 //BA.debugLineNum = 32;BA.debugLine="Private serializator As B4XSerializator";
_serializator = new anywheresoftware.b4a.randomaccessfile.B4XSerializator();
 //BA.debugLineNum = 33;BA.debugLine="Private gaugeHomeHumidity As Gauge 'ignore";
_gaugehomehumidity = new b4j.example.gauge();
 //BA.debugLineNum = 34;BA.debugLine="Private GaugeBasementAirQuality As Gauge 'ignore";
_gaugebasementairquality = new b4j.example.gauge();
 //BA.debugLineNum = 35;BA.debugLine="Private gaugeBasementHumidity As Gauge 'ignore";
_gaugebasementhumidity = new b4j.example.gauge();
 //BA.debugLineNum = 36;BA.debugLine="Private gaugeBasementTemp As Gauge 'ignore";
_gaugebasementtemp = new b4j.example.gauge();
 //BA.debugLineNum = 37;BA.debugLine="Private labelgaugeHomeTemp As Label 'ignore";
_labelgaugehometemp = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private labelGaugeAirQuality As Label 'ignore";
_labelgaugeairquality = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private labelgaugeHomeHumidity As Label 'ignore";
_labelgaugehomehumidity = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private labelgaugeBasementTemp As Label 'ignore";
_labelgaugebasementtemp = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private labelGaugeBasementAirQuality As Label 'ig";
_labelgaugebasementairquality = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private labelgaugeBasementHumidity As Label 'igno";
_labelgaugebasementhumidity = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private lblStatus As Label 'ignore";
_lblstatus = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public static String  _rotatenode(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _n,double _degree) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 388;BA.debugLine="Sub RotateNode(n As Node, Degree As Double) 'ignor";
 //BA.debugLineNum = 389;BA.debugLine="Dim jo As JavaObject = n";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(_n.getObject()));
 //BA.debugLineNum = 390;BA.debugLine="jo.RunMethod(\"setRotate\", Array(Degree))";
_jo.RunMethod("setRotate",new Object[]{(Object)(_degree)});
 //BA.debugLineNum = 391;BA.debugLine="End Sub";
return "";
}
}
