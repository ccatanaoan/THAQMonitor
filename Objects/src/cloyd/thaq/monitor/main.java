package cloyd.thaq.monitor;


import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("cloyd.thaq.monitor", "cloyd.thaq.monitor.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "cloyd.thaq.monitor.main", ba);
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
public static anywheresoftware.b4j.objects.ButtonWrapper _button1 = null;
public static anywheresoftware.b4j.objects.CanvasWrapper _canvas1 = null;
public static anywheresoftware.b4j.objects.MqttAsyncClientWrapper _mqtt = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper _menubar1 = null;
public static cloyd.thaq.monitor.gauge _gaugehometemp = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static cloyd.thaq.monitor.gauge _gaugeairquality = null;
public static anywheresoftware.b4a.randomaccessfile.B4XSerializator _serializator = null;
public static cloyd.thaq.monitor.gauge _gaugehomehumidity = null;
public static cloyd.thaq.monitor.gauge _gaugebasementairquality = null;
public static cloyd.thaq.monitor.gauge _gaugebasementhumidity = null;
public static cloyd.thaq.monitor.gauge _gaugebasementtemp = null;
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
 //BA.debugLineNum = 321;BA.debugLine="Sub AlwaysOnTop(o As Form,boo As Boolean)";
 //BA.debugLineNum = 322;BA.debugLine="Try";
try { //BA.debugLineNum = 323;BA.debugLine="getStage(o).RunMethod(\"setAlwaysOnTop\",Array(boo";
_getstage((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_o))).RunMethod("setAlwaysOnTop",new Object[]{(Object)(_boo)});
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 325;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("71179652",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
 };
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return "";
}
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
String _skintemp = "";
String _skindefault = "";
anywheresoftware.b4j.agraham.reflection.Reflection _obj = null;
String _clientid = "";
 //BA.debugLineNum = 46;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
 //BA.debugLineNum = 47;BA.debugLine="Try";
try { //BA.debugLineNum = 48;BA.debugLine="Dim skinTemp As String";
_skintemp = "";
 //BA.debugLineNum = 49;BA.debugLine="Dim skinDefault As String";
_skindefault = "";
 //BA.debugLineNum = 51;BA.debugLine="If File.Exists(File.DirApp, \"skin.ini\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"skin.ini")) { 
 //BA.debugLineNum = 52;BA.debugLine="skinTemp = File.ReadString(File.DirApp, \"skin.i";
_skintemp = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"skin.ini");
 }else {
 //BA.debugLineNum = 54;BA.debugLine="File.WriteString(File.DirApp, \"skin.ini\", \"vdSk";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"skin.ini","vdSk03");
 //BA.debugLineNum = 55;BA.debugLine="skinTemp = \"vdSk03\"";
_skintemp = "vdSk03";
 };
 //BA.debugLineNum = 58;BA.debugLine="If skinTemp = \"\" Then";
if ((_skintemp).equals("")) { 
 //BA.debugLineNum = 59;BA.debugLine="skinDefault = \"vdSk03\"";
_skindefault = "vdSk03";
 }else {
 //BA.debugLineNum = 61;BA.debugLine="If skinTemp = \"vdSk01\" Or skinTemp = \"vdSk02\" O";
if ((_skintemp).equals("vdSk01") || (_skintemp).equals("vdSk02") || (_skintemp).equals("vdSk03") || (_skintemp).equals("vdSk04") || (_skintemp).equals("vdSk05") || (_skintemp).equals("vdSk06")) { 
 //BA.debugLineNum = 62;BA.debugLine="skinDefault = skinTemp";
_skindefault = _skintemp;
 }else {
 //BA.debugLineNum = 64;BA.debugLine="skinDefault = \"vdSk03\"";
_skindefault = "vdSk03";
 };
 };
 //BA.debugLineNum = 68;BA.debugLine="MainForm = Form1";
_mainform = _form1;
 //BA.debugLineNum = 69;BA.debugLine="MainForm.SetFormStyle(\"TRANSPARENT\")";
_mainform.SetFormStyle("TRANSPARENT");
 //BA.debugLineNum = 70;BA.debugLine="MainForm.RootPane.LoadLayout(skinDefault) 'Load";
_mainform.getRootPane().LoadLayout(ba,_skindefault);
 //BA.debugLineNum = 71;BA.debugLine="AtualSkin = skinDefault";
_atualskin = _skindefault;
 //BA.debugLineNum = 72;BA.debugLine="MainForm.BackColor = fx.Colors.Transparent";
_mainform.setBackColor(_fx.Colors.Transparent);
 //BA.debugLineNum = 73;BA.debugLine="MainForm.RootPane.Style = \"-fx-background-color:";
_mainform.getRootPane().setStyle("-fx-background-color:transparent;-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 1.0) , 15,0, 0.0, 0.0);");
 //BA.debugLineNum = 74;BA.debugLine="MainForm.Resizable = False";
_mainform.setResizable(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 75;BA.debugLine="MainForm.Icon = fx.LoadImage(File.DirAssets, \"ho";
_mainform.setIcon((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"home.png").getObject()));
 //BA.debugLineNum = 76;BA.debugLine="MainForm.Title = \"THAQ\"";
_mainform.setTitle("THAQ");
 //BA.debugLineNum = 77;BA.debugLine="lbTitle.MouseCursor = fx.Cursors.MOVE";
_lbtitle.setMouseCursor(_fx.Cursors.MOVE);
 //BA.debugLineNum = 78;BA.debugLine="lbTitle.Text = \"Catanaoan THAQ Monitor v1.0\"";
_lbtitle.setText("Catanaoan THAQ Monitor v1.0");
 //BA.debugLineNum = 79;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
 //BA.debugLineNum = 80;BA.debugLine="Obj.Target = ivClose";
_obj.Target = (Object)(_ivclose.getObject());
 //BA.debugLineNum = 81;BA.debugLine="Obj.AddEventHandler2(\"Close_Entered\", \"onMouseEn";
_obj.AddEventHandler2(ba,"Close_Entered","onMouseEnteredProperty");
 //BA.debugLineNum = 82;BA.debugLine="Obj.AddEventHandler2(\"Close_Exited\", \"onMouseExi";
_obj.AddEventHandler2(ba,"Close_Exited","onMouseExitedProperty");
 //BA.debugLineNum = 83;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
 //BA.debugLineNum = 84;BA.debugLine="Obj.Target = ivMax";
_obj.Target = (Object)(_ivmax.getObject());
 //BA.debugLineNum = 85;BA.debugLine="Obj.AddEventHandler2(\"Max_Entered\", \"onMouseEnte";
_obj.AddEventHandler2(ba,"Max_Entered","onMouseEnteredProperty");
 //BA.debugLineNum = 86;BA.debugLine="Obj.AddEventHandler2(\"Max_Exited\", \"onMouseExite";
_obj.AddEventHandler2(ba,"Max_Exited","onMouseExitedProperty");
 //BA.debugLineNum = 87;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
 //BA.debugLineNum = 88;BA.debugLine="Obj.Target = ivMin";
_obj.Target = (Object)(_ivmin.getObject());
 //BA.debugLineNum = 89;BA.debugLine="Obj.AddEventHandler2(\"Min_Entered\", \"onMouseEnte";
_obj.AddEventHandler2(ba,"Min_Entered","onMouseEnteredProperty");
 //BA.debugLineNum = 90;BA.debugLine="Obj.AddEventHandler2(\"Min_Exited\", \"onMouseExite";
_obj.AddEventHandler2(ba,"Min_Exited","onMouseExitedProperty");
 //BA.debugLineNum = 92;BA.debugLine="imgInit = AtualSkin.SubString(2).ToLowerCase";
_imginit = _atualskin.substring((int) (2)).toLowerCase();
 //BA.debugLineNum = 93;BA.debugLine="loadList";
_loadlist();
 //BA.debugLineNum = 94;BA.debugLine="Get_css";
_get_css();
 //BA.debugLineNum = 95;BA.debugLine="MainForm.Show";
_mainform.Show();
 //BA.debugLineNum = 97;BA.debugLine="lblStatus.TextColor = fx.Colors.Red";
_lblstatus.setTextColor(_fx.Colors.Red);
 //BA.debugLineNum = 98;BA.debugLine="lblStatus.Text = \"Status: *** Connecting to Hive";
_lblstatus.setText("Status: *** Connecting to HiveMQ ***");
 //BA.debugLineNum = 99;BA.debugLine="Dim clientId As String = Rnd(0, 999999999) & Dat";
_clientid = BA.NumberToString(anywheresoftware.b4a.keywords.Common.Rnd((int) (0),(int) (999999999)))+BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 100;BA.debugLine="mqtt.Initialize(\"mqtt\", \"tcp://broker.emqx.io:18";
_mqtt.Initialize(ba,"mqtt","tcp://broker.emqx.io:1883",_clientid);
 //BA.debugLineNum = 101;BA.debugLine="mqtt.Connect";
_mqtt.Connect();
 //BA.debugLineNum = 103;BA.debugLine="gaugeHomeTemp.SetRanges(Array(gaugeHomeTemp.Crea";
_gaugehometemp._setranges /*String*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_gaugehometemp._createrange /*cloyd.thaq.monitor.gauge._gaugerange*/ ((float) (0),(float) (75),_xui.Color_Green)),(Object)(_gaugehometemp._createrange /*cloyd.thaq.monitor.gauge._gaugerange*/ ((float) (75),(float) (90),_xui.Color_Yellow)),(Object)(_gaugehometemp._createrange /*cloyd.thaq.monitor.gauge._gaugerange*/ ((float) (90),(float) (100),_xui.Color_Red))}));
 //BA.debugLineNum = 106;BA.debugLine="gaugeHomeTemp.CurrentValue=0";
_gaugehometemp._setcurrentvalue /*float*/ ((float) (0));
 //BA.debugLineNum = 108;BA.debugLine="gaugeHomeHumidity.SetRanges(Array(gaugeHomeHumid";
_gaugehomehumidity._setranges /*String*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_gaugehomehumidity._createrange /*cloyd.thaq.monitor.gauge._gaugerange*/ ((float) (0),(float) (70),_xui.Color_Green)),(Object)(_gaugehomehumidity._createrange /*cloyd.thaq.monitor.gauge._gaugerange*/ ((float) (70),(float) (80),_xui.Color_Yellow)),(Object)(_gaugehomehumidity._createrange /*cloyd.thaq.monitor.gauge._gaugerange*/ ((float) (80),(float) (100),_xui.Color_Red))}));
 //BA.debugLineNum = 111;BA.debugLine="gaugeHomeHumidity.CurrentValue=0";
_gaugehomehumidity._setcurrentvalue /*float*/ ((float) (0));
 //BA.debugLineNum = 113;BA.debugLine="GaugeAirQuality.SetRanges(Array(GaugeAirQuality.";
_gaugeairquality._setranges /*String*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_gaugeairquality._createrange /*cloyd.thaq.monitor.gauge._gaugerange*/ ((float) (0),(float) (10),_xui.Color_Green)),(Object)(_gaugeairquality._createrange /*cloyd.thaq.monitor.gauge._gaugerange*/ ((float) (10),(float) (40),_xui.Color_RGB((int) (100),(int) (240),(int) (23)))),(Object)(_gaugeairquality._createrange /*cloyd.thaq.monitor.gauge._gaugerange*/ ((float) (40),(float) (90),_xui.Color_Yellow)),(Object)(_gaugeairquality._createrange /*cloyd.thaq.monitor.gauge._gaugerange*/ ((float) (90),(float) (100),_xui.Color_Red))}));
 //BA.debugLineNum = 117;BA.debugLine="GaugeAirQuality.CurrentValue = 0";
_gaugeairquality._setcurrentvalue /*float*/ ((float) (0));
 //BA.debugLineNum = 119;BA.debugLine="gaugeBasementTemp.SetRanges(Array(gaugeBasementT";
_gaugebasementtemp._setranges /*String*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_gaugebasementtemp._createrange /*cloyd.thaq.monitor.gauge._gaugerange*/ ((float) (0),(float) (75),_xui.Color_Green)),(Object)(_gaugebasementtemp._createrange /*cloyd.thaq.monitor.gauge._gaugerange*/ ((float) (75),(float) (90),_xui.Color_Yellow)),(Object)(_gaugebasementtemp._createrange /*cloyd.thaq.monitor.gauge._gaugerange*/ ((float) (90),(float) (100),_xui.Color_Red))}));
 //BA.debugLineNum = 122;BA.debugLine="gaugeBasementTemp.CurrentValue=0";
_gaugebasementtemp._setcurrentvalue /*float*/ ((float) (0));
 //BA.debugLineNum = 124;BA.debugLine="gaugeBasementHumidity.SetRanges(Array(gaugeBasem";
_gaugebasementhumidity._setranges /*String*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_gaugebasementhumidity._createrange /*cloyd.thaq.monitor.gauge._gaugerange*/ ((float) (0),(float) (70),_xui.Color_Green)),(Object)(_gaugebasementhumidity._createrange /*cloyd.thaq.monitor.gauge._gaugerange*/ ((float) (70),(float) (80),_xui.Color_Yellow)),(Object)(_gaugebasementhumidity._createrange /*cloyd.thaq.monitor.gauge._gaugerange*/ ((float) (80),(float) (100),_xui.Color_Red))}));
 //BA.debugLineNum = 127;BA.debugLine="gaugeBasementHumidity.CurrentValue=0";
_gaugebasementhumidity._setcurrentvalue /*float*/ ((float) (0));
 //BA.debugLineNum = 129;BA.debugLine="GaugeBasementAirQuality.SetRanges(Array(GaugeBas";
_gaugebasementairquality._setranges /*String*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_gaugebasementairquality._createrange /*cloyd.thaq.monitor.gauge._gaugerange*/ ((float) (0),(float) (10),_xui.Color_Green)),(Object)(_gaugebasementairquality._createrange /*cloyd.thaq.monitor.gauge._gaugerange*/ ((float) (10),(float) (40),_xui.Color_RGB((int) (100),(int) (240),(int) (23)))),(Object)(_gaugebasementairquality._createrange /*cloyd.thaq.monitor.gauge._gaugerange*/ ((float) (40),(float) (90),_xui.Color_Yellow)),(Object)(_gaugebasementairquality._createrange /*cloyd.thaq.monitor.gauge._gaugerange*/ ((float) (90),(float) (100),_xui.Color_Red))}));
 //BA.debugLineNum = 133;BA.debugLine="GaugeBasementAirQuality.CurrentValue = 0";
_gaugebasementairquality._setcurrentvalue /*float*/ ((float) (0));
 //BA.debugLineNum = 135;BA.debugLine="AlwaysOnTop(MainForm,True)";
_alwaysontop(_mainform,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 139;BA.debugLine="MainForm.WindowLeft = CheckMonitor.MaxX	- MainFo";
_mainform.setWindowLeft(_checkmonitor().getMaxX()-_mainform.getWidth());
 //BA.debugLineNum = 140;BA.debugLine="MainForm.WindowTop = CheckMonitor.MaxY - MainFor";
_mainform.setWindowTop(_checkmonitor().getMaxY()-_mainform.getHeight()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
 } 
       catch (Exception e67) {
			ba.setLastException(e67); //BA.debugLineNum = 142;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("765632",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
 };
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public static String  _button1_action() throws Exception{
 //BA.debugLineNum = 312;BA.debugLine="Private Sub Button1_Action";
 //BA.debugLineNum = 313;BA.debugLine="Try";
try { //BA.debugLineNum = 314;BA.debugLine="ivMax.Visible = Not(ivMax.Visible)";
_ivmax.setVisible(anywheresoftware.b4a.keywords.Common.Not(_ivmax.getVisible()));
 //BA.debugLineNum = 315;BA.debugLine="ivMin.Visible = Not(ivMin.Visible)";
_ivmin.setVisible(anywheresoftware.b4a.keywords.Common.Not(_ivmin.getVisible()));
 } 
       catch (Exception e5) {
			ba.setLastException(e5); //BA.debugLineNum = 317;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("71114117",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
 };
 //BA.debugLineNum = 319;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.objects.JFX.ScreenWrapper  _checkmonitor() throws Exception{
anywheresoftware.b4a.objects.collections.List _slist = null;
anywheresoftware.b4j.objects.JFX.ScreenWrapper _s = null;
 //BA.debugLineNum = 337;BA.debugLine="Sub CheckMonitor() As Screen";
 //BA.debugLineNum = 338;BA.debugLine="Try";
try { //BA.debugLineNum = 339;BA.debugLine="If fx.Screens.Size= 1 Then";
if (_fx.getScreens().getSize()==1) { 
 //BA.debugLineNum = 340;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 341;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s = (anywheresoftware.b4j.objects.JFX.ScreenWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.ScreenWrapper(), (javafx.stage.Screen)(_slist.Get((int) (0))));
 //BA.debugLineNum = 343;BA.debugLine="Return S";
if (true) return _s;
 }else if(_fx.getScreens().getSize()>1) { 
 //BA.debugLineNum = 345;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 346;BA.debugLine="Dim S As Screen = SList.Get(2)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s = (anywheresoftware.b4j.objects.JFX.ScreenWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.ScreenWrapper(), (javafx.stage.Screen)(_slist.Get((int) (2))));
 //BA.debugLineNum = 348;BA.debugLine="Return S";
if (true) return _s;
 }else {
 //BA.debugLineNum = 350;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 351;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s = (anywheresoftware.b4j.objects.JFX.ScreenWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.ScreenWrapper(), (javafx.stage.Screen)(_slist.Get((int) (0))));
 //BA.debugLineNum = 353;BA.debugLine="Return S";
if (true) return _s;
 };
 } 
       catch (Exception e16) {
			ba.setLastException(e16); //BA.debugLineNum = 356;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 357;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s = (anywheresoftware.b4j.objects.JFX.ScreenWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.ScreenWrapper(), (javafx.stage.Screen)(_slist.Get((int) (0))));
 //BA.debugLineNum = 359;BA.debugLine="Return S";
if (true) return _s;
 };
 //BA.debugLineNum = 361;BA.debugLine="End Sub";
return null;
}
public static String  _close_entered_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 170;BA.debugLine="Private Sub Close_Entered_Event(e As Event)";
 //BA.debugLineNum = 171;BA.debugLine="Try";
try { //BA.debugLineNum = 172;BA.debugLine="ivClose.SetImage(fx.LoadImage(File.DirAssets, im";
_ivclose.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btCloseEnt.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 174;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("7327684",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
 };
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return "";
}
public static String  _close_exited_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Private Sub Close_Exited_Event(e As Event)";
 //BA.debugLineNum = 179;BA.debugLine="Try";
try { //BA.debugLineNum = 180;BA.debugLine="ivClose.SetImage(fx.LoadImage(File.DirAssets, im";
_ivclose.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btClose.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 182;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("7393220",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
 };
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return "";
}
public static String  _get_css() throws Exception{
anywheresoftware.b4j.object.JavaObject _jform = null;
anywheresoftware.b4j.object.JavaObject _scene = null;
anywheresoftware.b4a.objects.collections.List _stylesheets = null;
 //BA.debugLineNum = 300;BA.debugLine="Public Sub Get_css";
 //BA.debugLineNum = 301;BA.debugLine="Try";
try { //BA.debugLineNum = 302;BA.debugLine="Dim jForm As JavaObject = MainForm";
_jform = new anywheresoftware.b4j.object.JavaObject();
_jform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_mainform));
 //BA.debugLineNum = 303;BA.debugLine="Dim scene As JavaObject = jForm.GetField(\"scene\"";
_scene = new anywheresoftware.b4j.object.JavaObject();
_scene = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jform.GetField("scene")));
 //BA.debugLineNum = 304;BA.debugLine="Dim stylesheets As List = scene.RunMethod(\"getSt";
_stylesheets = new anywheresoftware.b4a.objects.collections.List();
_stylesheets = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_scene.RunMethod("getStylesheets",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
 //BA.debugLineNum = 305;BA.debugLine="stylesheets.Clear";
_stylesheets.Clear();
 //BA.debugLineNum = 306;BA.debugLine="stylesheets.Add(File.GetUri(File.DirAssets, imgI";
_stylesheets.Add((Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+".css")));
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 308;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("71048584",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
 };
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return "";
}
public static String  _getairquality(int _number) throws Exception{
 //BA.debugLineNum = 433;BA.debugLine="Sub GetAirQuality(number As Int) As String 'ignore";
 //BA.debugLineNum = 436;BA.debugLine="Try";
try { //BA.debugLineNum = 437;BA.debugLine="If number <= 10 Then";
if (_number<=10) { 
 //BA.debugLineNum = 438;BA.debugLine="Return(\"Carbon monoxide perfect\")";
if (true) return ("Carbon monoxide perfect");
 }else if(((_number>10) && (_number<40)) || _number==40) { 
 //BA.debugLineNum = 440;BA.debugLine="Return(\"Carbon monoxide normal\")";
if (true) return ("Carbon monoxide normal");
 }else if(((_number>40) && (_number<90)) || _number==90) { 
 //BA.debugLineNum = 442;BA.debugLine="Return(\"Carbon monoxide high\")";
if (true) return ("Carbon monoxide high");
 }else if(_number>90) { 
 //BA.debugLineNum = 444;BA.debugLine="Return(\"ALARM Carbon monoxide very high\")";
if (true) return ("ALARM Carbon monoxide very high");
 }else {
 //BA.debugLineNum = 446;BA.debugLine="Return(\"MQ-7 - cant read any value - check the";
if (true) return ("MQ-7 - cant read any value - check the sensor!");
 };
 } 
       catch (Exception e14) {
			ba.setLastException(e14); //BA.debugLineNum = 449;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("71507344",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
 };
 //BA.debugLineNum = 451;BA.debugLine="End Sub";
return "";
}
public static String  _getcomfort(String _dht11comfortstatus) throws Exception{
String _localcomfortstatus = "";
 //BA.debugLineNum = 402;BA.debugLine="Sub GetComfort(DHT11ComfortStatus As String) As St";
 //BA.debugLineNum = 403;BA.debugLine="Try";
try { //BA.debugLineNum = 404;BA.debugLine="Dim localcomfortstatus As String";
_localcomfortstatus = "";
 //BA.debugLineNum = 405;BA.debugLine="Select Case DHT11ComfortStatus";
switch (BA.switchObjectToInt(_dht11comfortstatus,BA.NumberToString(0),BA.NumberToString(1),BA.NumberToString(2),BA.NumberToString(4),BA.NumberToString(5),BA.NumberToString(6),BA.NumberToString(8),BA.NumberToString(9),BA.NumberToString(10))) {
case 0: {
 //BA.debugLineNum = 407;BA.debugLine="localcomfortstatus = \"OK\"";
_localcomfortstatus = "OK";
 break; }
case 1: {
 //BA.debugLineNum = 409;BA.debugLine="localcomfortstatus = \"Too hot\"";
_localcomfortstatus = "Too hot";
 break; }
case 2: {
 //BA.debugLineNum = 411;BA.debugLine="localcomfortstatus = \"Too cold\"";
_localcomfortstatus = "Too cold";
 break; }
case 3: {
 //BA.debugLineNum = 413;BA.debugLine="localcomfortstatus = \"Too dry\"";
_localcomfortstatus = "Too dry";
 break; }
case 4: {
 //BA.debugLineNum = 415;BA.debugLine="localcomfortstatus = \"Hot and dry\"";
_localcomfortstatus = "Hot and dry";
 break; }
case 5: {
 //BA.debugLineNum = 417;BA.debugLine="localcomfortstatus = \"Cold and dry\"";
_localcomfortstatus = "Cold and dry";
 break; }
case 6: {
 //BA.debugLineNum = 419;BA.debugLine="localcomfortstatus = \"Too humid\"";
_localcomfortstatus = "Too humid";
 break; }
case 7: {
 //BA.debugLineNum = 421;BA.debugLine="localcomfortstatus = \"Hot and humid\"";
_localcomfortstatus = "Hot and humid";
 break; }
case 8: {
 //BA.debugLineNum = 423;BA.debugLine="localcomfortstatus = \"Cold and humid\"";
_localcomfortstatus = "Cold and humid";
 break; }
default: {
 //BA.debugLineNum = 425;BA.debugLine="localcomfortstatus = \"Unknown\"";
_localcomfortstatus = "Unknown";
 break; }
}
;
 //BA.debugLineNum = 427;BA.debugLine="Return localcomfortstatus";
if (true) return _localcomfortstatus;
 } 
       catch (Exception e27) {
			ba.setLastException(e27); //BA.debugLineNum = 429;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("71441819",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
 };
 //BA.debugLineNum = 431;BA.debugLine="End Sub";
return "";
}
public static String  _getperception(String _dht11perception) throws Exception{
String _localperception = "";
 //BA.debugLineNum = 364;BA.debugLine="Sub GetPerception(DHT11Perception As String) As St";
 //BA.debugLineNum = 375;BA.debugLine="Try";
try { //BA.debugLineNum = 376;BA.debugLine="Dim localperception As String";
_localperception = "";
 //BA.debugLineNum = 377;BA.debugLine="Select Case DHT11Perception";
switch (BA.switchObjectToInt(_dht11perception,BA.NumberToString(0),BA.NumberToString(1),BA.NumberToString(2),BA.NumberToString(3),BA.NumberToString(4),BA.NumberToString(5),BA.NumberToString(6),BA.NumberToString(7))) {
case 0: {
 //BA.debugLineNum = 380;BA.debugLine="localperception = \"A bit dry\"";
_localperception = "A bit dry";
 break; }
case 1: {
 //BA.debugLineNum = 382;BA.debugLine="localperception = \"Very comfortable\"";
_localperception = "Very comfortable";
 break; }
case 2: {
 //BA.debugLineNum = 384;BA.debugLine="localperception = \"Comfortable\"";
_localperception = "Comfortable";
 break; }
case 3: {
 //BA.debugLineNum = 386;BA.debugLine="localperception = \"Okay but sticky\"";
_localperception = "Okay but sticky";
 break; }
case 4: {
 //BA.debugLineNum = 388;BA.debugLine="localperception = \"Slightly uncomfortable and";
_localperception = "Slightly uncomfortable and the humidity is at upper limit";
 break; }
case 5: {
 //BA.debugLineNum = 390;BA.debugLine="localperception = \"Very humid and uncomfortabl";
_localperception = "Very humid and uncomfortable";
 break; }
case 6: {
 //BA.debugLineNum = 392;BA.debugLine="localperception = \"Extremely uncomfortable and";
_localperception = "Extremely uncomfortable and oppressive";
 break; }
case 7: {
 //BA.debugLineNum = 394;BA.debugLine="localperception = \"Humidity is severely high a";
_localperception = "Humidity is severely high and intolerable";
 break; }
}
;
 //BA.debugLineNum = 396;BA.debugLine="Return localperception";
if (true) return _localperception;
 } 
       catch (Exception e23) {
			ba.setLastException(e23); //BA.debugLineNum = 398;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("71376290",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
 };
 //BA.debugLineNum = 400;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.object.JavaObject  _getstage(anywheresoftware.b4j.object.JavaObject _o) throws Exception{
 //BA.debugLineNum = 329;BA.debugLine="private Sub getStage(o As JavaObject) As JavaObjec";
 //BA.debugLineNum = 330;BA.debugLine="Try";
try { //BA.debugLineNum = 331;BA.debugLine="Return o.GetFieldJO(\"stage\")";
if (true) return _o.GetFieldJO("stage");
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 333;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("71245188",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
 };
 //BA.debugLineNum = 335;BA.debugLine="End Sub";
return null;
}
public static String  _ivclose_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Private Sub ivClose_MouseClicked (EventData As Mou";
 //BA.debugLineNum = 167;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return "";
}
public static String  _ivmin_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
anywheresoftware.b4j.object.JavaObject _jmf = null;
anywheresoftware.b4j.object.JavaObject _stage = null;
 //BA.debugLineNum = 211;BA.debugLine="Private Sub ivMin_MouseClicked (EventData As Mouse";
 //BA.debugLineNum = 212;BA.debugLine="Try";
try { //BA.debugLineNum = 213;BA.debugLine="Dim jmf As JavaObject = MainForm";
_jmf = new anywheresoftware.b4j.object.JavaObject();
_jmf = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_mainform));
 //BA.debugLineNum = 214;BA.debugLine="Dim stage As JavaObject = jmf.GetField(\"stage\")";
_stage = new anywheresoftware.b4j.object.JavaObject();
_stage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jmf.GetField("stage")));
 //BA.debugLineNum = 215;BA.debugLine="stage.RunMethod(\"setIconified\", Array As Object(";
_stage.RunMethod("setIconified",new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.True)});
 } 
       catch (Exception e6) {
			ba.setLastException(e6); //BA.debugLineNum = 217;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("7655366",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
 };
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return "";
}
public static String  _jsl_processcompleted(boolean _success,int _exitcode,String _stdout,String _stderr) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Sub jsl_ProcessCompleted (Success As Boolean, Exit";
 //BA.debugLineNum = 187;BA.debugLine="If Success And ExitCode = 0 Then";
if (_success && _exitcode==0) { 
 //BA.debugLineNum = 188;BA.debugLine="Log(\"Success\")";
anywheresoftware.b4a.keywords.Common.LogImpl("7458754","Success",0);
 //BA.debugLineNum = 189;BA.debugLine="Log(StdOut)";
anywheresoftware.b4a.keywords.Common.LogImpl("7458755",_stdout,0);
 }else {
 //BA.debugLineNum = 191;BA.debugLine="Log(\"Error: \" & StdErr)";
anywheresoftware.b4a.keywords.Common.LogImpl("7458757","Error: "+_stderr,0);
 };
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return "";
}
public static String  _lbtitle_mousedragged(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 146;BA.debugLine="Private Sub lbTitle_MouseDragged (EventData As Mou";
 //BA.debugLineNum = 147;BA.debugLine="Try";
try { //BA.debugLineNum = 148;BA.debugLine="If isMaximized Then Return";
if (_ismaximized) { 
if (true) return "";};
 //BA.debugLineNum = 149;BA.debugLine="Dim jo As JavaObject = EventData";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_eventdata.getObject()));
 //BA.debugLineNum = 150;BA.debugLine="MainForm.WindowLeft = jo.RunMethod(\"getScreenX\",";
_mainform.setWindowLeft((double)(BA.ObjectToNumber(_jo.RunMethod("getScreenX",(Object[])(anywheresoftware.b4a.keywords.Common.Null))))-_xmouse);
 //BA.debugLineNum = 151;BA.debugLine="MainForm.WindowTop = jo.RunMethod(\"getScreenY\",";
_mainform.setWindowTop((double)(BA.ObjectToNumber(_jo.RunMethod("getScreenY",(Object[])(anywheresoftware.b4a.keywords.Common.Null))))-_ymouse);
 } 
       catch (Exception e7) {
			ba.setLastException(e7); //BA.debugLineNum = 153;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("7131079",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
 };
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return "";
}
public static String  _lbtitle_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Private Sub lbTitle_MousePressed (EventData As Mou";
 //BA.debugLineNum = 158;BA.debugLine="Try";
try { //BA.debugLineNum = 159;BA.debugLine="xMouse = EventData.X + lbTitle.Left + 15";
_xmouse = _eventdata.getX()+_lbtitle.getLeft()+15;
 //BA.debugLineNum = 160;BA.debugLine="yMouse = EventData.Y + lbTitle.Top + 15";
_ymouse = _eventdata.getY()+_lbtitle.getTop()+15;
 } 
       catch (Exception e5) {
			ba.setLastException(e5); //BA.debugLineNum = 162;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("7196613",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
 };
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return "";
}
public static String  _loadlist() throws Exception{
int _i = 0;
anywheresoftware.b4j.objects.LabelWrapper _lb = null;
String _n = "";
short _lg = (short)0;
 //BA.debugLineNum = 279;BA.debugLine="Private Sub loadList";
 //BA.debugLineNum = 280;BA.debugLine="Try";
try { //BA.debugLineNum = 281;BA.debugLine="lstSkins.Items.Clear";
_lstskins.getItems().Clear();
 //BA.debugLineNum = 282;BA.debugLine="For i = 1 To 6";
{
final int step3 = 1;
final int limit3 = (int) (6);
_i = (int) (1) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 283;BA.debugLine="Dim lb As Label";
_lb = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 284;BA.debugLine="lb.Initialize(\"\")";
_lb.Initialize(ba,"");
 //BA.debugLineNum = 285;BA.debugLine="Dim n As String =  i";
_n = BA.NumberToString(_i);
 //BA.debugLineNum = 286;BA.debugLine="Dim lg As Short = n .Length";
_lg = (short) (_n.length());
 //BA.debugLineNum = 287;BA.debugLine="Do Until lg = 2";
while (!(_lg==2)) {
 //BA.debugLineNum = 288;BA.debugLine="n = \"0\" & n";
_n = "0"+_n;
 //BA.debugLineNum = 289;BA.debugLine="lg = n .Length";
_lg = (short) (_n.length());
 }
;
 //BA.debugLineNum = 291;BA.debugLine="lb.Text = \"Skin #\"  &  n";
_lb.setText("Skin #"+_n);
 //BA.debugLineNum = 292;BA.debugLine="lb.Tag = \"vdSk\" & n";
_lb.setTag((Object)("vdSk"+_n));
 //BA.debugLineNum = 293;BA.debugLine="lstSkins.Items.Add(lb)";
_lstskins.getItems().Add((Object)(_lb.getObject()));
 }
};
 } 
       catch (Exception e17) {
			ba.setLastException(e17); //BA.debugLineNum = 296;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("7983057",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
 };
 //BA.debugLineNum = 298;BA.debugLine="End Sub";
return "";
}
public static String  _loadskin(String _sk) throws Exception{
anywheresoftware.b4j.agraham.reflection.Reflection _obj = null;
 //BA.debugLineNum = 251;BA.debugLine="Private Sub loadSkin(Sk As String)";
 //BA.debugLineNum = 252;BA.debugLine="Try";
try { //BA.debugLineNum = 253;BA.debugLine="MainForm.RootPane.RemoveAllNodes";
_mainform.getRootPane().RemoveAllNodes();
 //BA.debugLineNum = 254;BA.debugLine="MainForm.RootPane.LoadLayout(Sk)";
_mainform.getRootPane().LoadLayout(ba,_sk);
 //BA.debugLineNum = 255;BA.debugLine="MainForm.BackColor = fx.Colors.Transparent";
_mainform.setBackColor(_fx.Colors.Transparent);
 //BA.debugLineNum = 256;BA.debugLine="MainForm.RootPane.Style = \"-fx-background-color:";
_mainform.getRootPane().setStyle("-fx-background-color:transparent;-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 1.0) , 15,0, 0.0, 0.0);");
 //BA.debugLineNum = 257;BA.debugLine="MainForm.Resizable = False";
_mainform.setResizable(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 258;BA.debugLine="lbTitle.MouseCursor = fx.Cursors.MOVE";
_lbtitle.setMouseCursor(_fx.Cursors.MOVE);
 //BA.debugLineNum = 259;BA.debugLine="lbTitle.Text = \"Title  -  \" & Sk";
_lbtitle.setText("Title  -  "+_sk);
 //BA.debugLineNum = 260;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
 //BA.debugLineNum = 261;BA.debugLine="Obj.Target = ivClose";
_obj.Target = (Object)(_ivclose.getObject());
 //BA.debugLineNum = 262;BA.debugLine="Obj.AddEventHandler2(\"Close_Entered\", \"onMouseEn";
_obj.AddEventHandler2(ba,"Close_Entered","onMouseEnteredProperty");
 //BA.debugLineNum = 263;BA.debugLine="Obj.AddEventHandler2(\"Close_Exited\", \"onMouseExi";
_obj.AddEventHandler2(ba,"Close_Exited","onMouseExitedProperty");
 //BA.debugLineNum = 264;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
 //BA.debugLineNum = 265;BA.debugLine="Obj.Target = ivMax";
_obj.Target = (Object)(_ivmax.getObject());
 //BA.debugLineNum = 266;BA.debugLine="Obj.AddEventHandler2(\"Max_Entered\", \"onMouseEnte";
_obj.AddEventHandler2(ba,"Max_Entered","onMouseEnteredProperty");
 //BA.debugLineNum = 267;BA.debugLine="Obj.AddEventHandler2(\"Max_Exited\", \"onMouseExite";
_obj.AddEventHandler2(ba,"Max_Exited","onMouseExitedProperty");
 //BA.debugLineNum = 268;BA.debugLine="Dim Obj As Reflector";
_obj = new anywheresoftware.b4j.agraham.reflection.Reflection();
 //BA.debugLineNum = 269;BA.debugLine="Obj.Target = ivMin";
_obj.Target = (Object)(_ivmin.getObject());
 //BA.debugLineNum = 270;BA.debugLine="Obj.AddEventHandler2(\"Min_Entered\", \"onMouseEnte";
_obj.AddEventHandler2(ba,"Min_Entered","onMouseEnteredProperty");
 //BA.debugLineNum = 271;BA.debugLine="Obj.AddEventHandler2(\"Min_Exited\", \"onMouseExite";
_obj.AddEventHandler2(ba,"Min_Exited","onMouseExitedProperty");
 //BA.debugLineNum = 272;BA.debugLine="Get_css";
_get_css();
 //BA.debugLineNum = 273;BA.debugLine="loadList";
_loadlist();
 } 
       catch (Exception e24) {
			ba.setLastException(e24); //BA.debugLineNum = 275;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("7917528",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
 };
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return "";
}
public static String  _lstskins_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
short _idx = (short)0;
anywheresoftware.b4j.objects.LabelWrapper _lb = null;
 //BA.debugLineNum = 237;BA.debugLine="Private Sub lstSkins_MouseClicked (EventData As Mo";
 //BA.debugLineNum = 238;BA.debugLine="Try";
try { //BA.debugLineNum = 239;BA.debugLine="Dim idx As Short = lstSkins.SelectedIndex";
_idx = (short) (_lstskins.getSelectedIndex());
 //BA.debugLineNum = 240;BA.debugLine="If idx = -1 Then Return";
if (_idx==-1) { 
if (true) return "";};
 //BA.debugLineNum = 241;BA.debugLine="Dim lb As Label = lstSkins.Items.Get(idx)";
_lb = new anywheresoftware.b4j.objects.LabelWrapper();
_lb = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(_lstskins.getItems().Get((int) (_idx))));
 //BA.debugLineNum = 242;BA.debugLine="If lb.tag = AtualSkin Then Return";
if ((_lb.getTag()).equals((Object)(_atualskin))) { 
if (true) return "";};
 //BA.debugLineNum = 243;BA.debugLine="AtualSkin = lb.tag";
_atualskin = BA.ObjectToString(_lb.getTag());
 //BA.debugLineNum = 244;BA.debugLine="imgInit = AtualSkin.SubString(2).ToLowerCase";
_imginit = _atualskin.substring((int) (2)).toLowerCase();
 //BA.debugLineNum = 245;BA.debugLine="loadSkin(AtualSkin)";
_loadskin(_atualskin);
 } 
       catch (Exception e10) {
			ba.setLastException(e10); //BA.debugLineNum = 247;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("7851978",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
 };
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return "";
}
public static String  _mainform_closed() throws Exception{
 //BA.debugLineNum = 462;BA.debugLine="Sub MainForm_Closed";
 //BA.debugLineNum = 463;BA.debugLine="mqtt.Close";
_mqtt.Close();
 //BA.debugLineNum = 464;BA.debugLine="End Sub";
return "";
}
public static String  _max_entered_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Private Sub Max_Entered_Event(e As Event)";
 //BA.debugLineNum = 196;BA.debugLine="Try";
try { //BA.debugLineNum = 197;BA.debugLine="ivMax.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmax.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMaxEnt.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 199;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("7524292",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
 };
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return "";
}
public static String  _max_exited_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Private Sub Max_Exited_Event(e As Event)";
 //BA.debugLineNum = 204;BA.debugLine="Try";
try { //BA.debugLineNum = 205;BA.debugLine="ivMax.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmax.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMax.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 207;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("7589828",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
 };
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return "";
}
public static String  _min_entered_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Private Sub Min_Entered_Event(e As Event)";
 //BA.debugLineNum = 222;BA.debugLine="Try";
try { //BA.debugLineNum = 223;BA.debugLine="ivMin.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmin.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMinEnt.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 225;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("7720900",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
 };
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return "";
}
public static String  _min_exited_event(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _e) throws Exception{
 //BA.debugLineNum = 229;BA.debugLine="Private Sub Min_Exited_Event(e As Event)";
 //BA.debugLineNum = 230;BA.debugLine="Try";
try { //BA.debugLineNum = 231;BA.debugLine="ivMin.SetImage(fx.LoadImage(File.DirAssets, imgI";
_ivmin.SetImage((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_imginit+"_btMin.png").getObject()));
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 233;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("7786436",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
 };
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return "";
}
public static void  _mqtt_connected(boolean _success) throws Exception{
ResumableSub_mqtt_Connected rsub = new ResumableSub_mqtt_Connected(null,_success);
rsub.resume(ba, null);
}
public static class ResumableSub_mqtt_Connected extends BA.ResumableSub {
public ResumableSub_mqtt_Connected(cloyd.thaq.monitor.main parent,boolean _success) {
this.parent = parent;
this._success = _success;
}
cloyd.thaq.monitor.main parent;
boolean _success;

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
 //BA.debugLineNum = 467;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
 //BA.debugLineNum = 468;BA.debugLine="If Success = False Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_success==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 //BA.debugLineNum = 469;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("71703939",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
 //BA.debugLineNum = 470;BA.debugLine="lblStatus.TextColor = fx.Colors.Red";
parent._lblstatus.setTextColor(parent._fx.Colors.Red);
 //BA.debugLineNum = 471;BA.debugLine="lblStatus.Text = \"Status: Error connecting. Rec";
parent._lblstatus.setText("Status: Error connecting. Reconnecting...");
 //BA.debugLineNum = 472;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
this.state = 13;
return;
case 13:
//C
this.state = 9;
;
 //BA.debugLineNum = 473;BA.debugLine="MenuBar1.Enabled = False";
parent._menubar1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 474;BA.debugLine="mqtt.Connect";
parent._mqtt.Connect();
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 476;BA.debugLine="lblStatus.TextColor = fx.Colors.White";
parent._lblstatus.setTextColor(parent._fx.Colors.White);
 //BA.debugLineNum = 477;BA.debugLine="lblStatus.Text = \"Status: Connected to HiveMQ\"";
parent._lblstatus.setText("Status: Connected to HiveMQ");
 //BA.debugLineNum = 478;BA.debugLine="MenuBar1.Enabled = True";
parent._menubar1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 479;BA.debugLine="mqtt.Subscribe(\"TempHumid\", 0)";
parent._mqtt.Subscribe("TempHumid",(int) (0));
 //BA.debugLineNum = 480;BA.debugLine="mqtt.Subscribe(\"MQ7LivingRoomCloyd\", 0)";
parent._mqtt.Subscribe("MQ7LivingRoomCloyd",(int) (0));
 //BA.debugLineNum = 481;BA.debugLine="mqtt.Subscribe(\"TempHumidBasement\", 0)";
parent._mqtt.Subscribe("TempHumidBasement",(int) (0));
 //BA.debugLineNum = 482;BA.debugLine="mqtt.Subscribe(\"MQ7Basement\", 0)";
parent._mqtt.Subscribe("MQ7Basement",(int) (0));
 //BA.debugLineNum = 483;BA.debugLine="mqtt.Publish(\"MQ7LivingRoomCloyd\", serializator";
parent._mqtt.Publish("MQ7LivingRoomCloyd",parent._serializator.ConvertObjectToBytes((Object)("Read voltage")));
 //BA.debugLineNum = 484;BA.debugLine="mqtt.Publish(\"MQ7Basement\", serializator.Conver";
parent._mqtt.Publish("MQ7Basement",parent._serializator.ConvertObjectToBytes((Object)("Read voltage")));
 //BA.debugLineNum = 485;BA.debugLine="mqtt.Publish(\"TempHumid\", serializator.ConvertO";
parent._mqtt.Publish("TempHumid",parent._serializator.ConvertObjectToBytes((Object)("Read weather")));
 //BA.debugLineNum = 486;BA.debugLine="mqtt.Publish(\"TempHumidBasement\", serializator.";
parent._mqtt.Publish("TempHumidBasement",parent._serializator.ConvertObjectToBytes((Object)("Read weather")));
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 //BA.debugLineNum = 489;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("71703959",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 491;BA.debugLine="End Sub";
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
public static void  _mqtt_disconnected() throws Exception{
ResumableSub_mqtt_Disconnected rsub = new ResumableSub_mqtt_Disconnected(null);
rsub.resume(ba, null);
}
public static class ResumableSub_mqtt_Disconnected extends BA.ResumableSub {
public ResumableSub_mqtt_Disconnected(cloyd.thaq.monitor.main parent) {
this.parent = parent;
}
cloyd.thaq.monitor.main parent;

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
 //BA.debugLineNum = 494;BA.debugLine="Try";
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
 //BA.debugLineNum = 495;BA.debugLine="lblStatus.TextColor = fx.Colors.Red";
parent._lblstatus.setTextColor(parent._fx.Colors.Red);
 //BA.debugLineNum = 496;BA.debugLine="lblStatus.Text = \"Status: Disconnected. Reconnec";
parent._lblstatus.setText("Status: Disconnected. Reconnecting...");
 //BA.debugLineNum = 497;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
 //BA.debugLineNum = 498;BA.debugLine="MenuBar1.Enabled = False";
parent._menubar1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 499;BA.debugLine="mqtt.Connect";
parent._mqtt.Connect();
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 //BA.debugLineNum = 501;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("71769480",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 504;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 506;BA.debugLine="Private Sub mqtt_MessageArrived (Topic As String,";
 //BA.debugLineNum = 507;BA.debugLine="Try";
try { //BA.debugLineNum = 508;BA.debugLine="If Topic = \"TempHumid\" Then";
if ((_topic).equals("TempHumid")) { 
 //BA.debugLineNum = 509;BA.debugLine="Dim s As String = BytesToString(Payload, 0, Pay";
_s = anywheresoftware.b4a.keywords.Common.BytesToString(_payload,(int) (0),_payload.length,"utf8");
 //BA.debugLineNum = 510;BA.debugLine="Dim a() As String = Regex.Split(\"\\|\",s)";
_a = anywheresoftware.b4a.keywords.Common.Regex.Split("\\|",_s);
 //BA.debugLineNum = 511;BA.debugLine="If a.Length = 9 Then";
if (_a.length==9) { 
 //BA.debugLineNum = 512;BA.debugLine="gaugeHomeTemp.CurrentValue=a(1)";
_gaugehometemp._setcurrentvalue /*float*/ ((float)(Double.parseDouble(_a[(int) (1)])));
 //BA.debugLineNum = 513;BA.debugLine="gaugeHomeHumidity.CurrentValue=a(2)";
_gaugehomehumidity._setcurrentvalue /*float*/ ((float)(Double.parseDouble(_a[(int) (2)])));
 //BA.debugLineNum = 514;BA.debugLine="labelgaugeHomeTemp.Text = GetPerception(a(3))";
_labelgaugehometemp.setText(_getperception(_a[(int) (3)]));
 //BA.debugLineNum = 515;BA.debugLine="labelgaugeHomeHumidity.Text = GetComfort(a(4))";
_labelgaugehomehumidity.setText(_getcomfort(_a[(int) (4)]));
 //BA.debugLineNum = 517;BA.debugLine="If a(4) = 2 Or a(4) = 6 Or a(4) = 10 Then";
if ((_a[(int) (4)]).equals(BA.NumberToString(2)) || (_a[(int) (4)]).equals(BA.NumberToString(6)) || (_a[(int) (4)]).equals(BA.NumberToString(10))) { 
 //BA.debugLineNum = 518;BA.debugLine="labelgaugeHomeHumidity.TextColor = fx.Colors.";
_labelgaugehomehumidity.setTextColor(_fx.Colors.Blue);
 }else if((_a[(int) (4)]).equals(BA.NumberToString(0))) { 
 //BA.debugLineNum = 520;BA.debugLine="labelgaugeHomeHumidity.TextColor = fx.Colors.";
_labelgaugehomehumidity.setTextColor(_fx.Colors.Black);
 }else {
 //BA.debugLineNum = 522;BA.debugLine="labelgaugeHomeHumidity.TextColor = fx.Colors.";
_labelgaugehomehumidity.setTextColor(_fx.Colors.Red);
 };
 //BA.debugLineNum = 524;BA.debugLine="If a(3) > 3 Then";
if ((double)(Double.parseDouble(_a[(int) (3)]))>3) { 
 //BA.debugLineNum = 525;BA.debugLine="labelgaugeHomeTemp.TextColor = fx.Colors.Red";
_labelgaugehometemp.setTextColor(_fx.Colors.Red);
 }else {
 //BA.debugLineNum = 527;BA.debugLine="labelgaugeHomeTemp.TextColor = fx.Colors.Blac";
_labelgaugehometemp.setTextColor(_fx.Colors.Black);
 };
 //BA.debugLineNum = 530;BA.debugLine="DateTime.DateFormat = \"yy-MM-dd HH:mm:ss z\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yy-MM-dd HH:mm:ss z");
 //BA.debugLineNum = 531;BA.debugLine="Dim ticks As Long = DateTime.DateParse(a(7) &";
_ticks = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_a[(int) (7)]+" "+_a[(int) (8)]+" GMT");
 //BA.debugLineNum = 532;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a z";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("MMM d, yyyy h:mm:ss a z");
 //BA.debugLineNum = 533;BA.debugLine="Dim lngTicks As Long = ticks";
_lngticks = _ticks;
 //BA.debugLineNum = 534;BA.debugLine="Dim p As Period = DateUtils.PeriodBetween(lngT";
_p = _dateutils._periodbetween(_lngticks,anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 536;BA.debugLine="If p.Minutes <= -5 Then";
if (_p.Minutes<=-5) { 
 //BA.debugLineNum = 537;BA.debugLine="labelgaugeHomeTemp.Text = \"Timestamp is \" & p";
_labelgaugehometemp.setText("Timestamp is "+BA.NumberToString(_p.Hours)+"hr "+BA.NumberToString(_p.Minutes)+"m old");
 //BA.debugLineNum = 538;BA.debugLine="labelgaugeHomeTemp.TextColor = fx.Colors.Red";
_labelgaugehometemp.setTextColor(_fx.Colors.Red);
 //BA.debugLineNum = 539;BA.debugLine="labelgaugeHomeHumidity.Text = \"Timestamp is \"";
_labelgaugehomehumidity.setText("Timestamp is "+BA.NumberToString(_p.Hours)+"hr "+BA.NumberToString(_p.Minutes)+"m old");
 //BA.debugLineNum = 540;BA.debugLine="labelgaugeHomeHumidity.TextColor = fx.Colors.";
_labelgaugehomehumidity.setTextColor(_fx.Colors.Red);
 }else if(_p.Minutes>=5) { 
 //BA.debugLineNum = 542;BA.debugLine="labelgaugeHomeTemp.Text = \"Timestamp is \" & p";
_labelgaugehometemp.setText("Timestamp is "+BA.NumberToString(_p.Hours)+"hr "+BA.NumberToString(_p.Minutes)+"m advance");
 //BA.debugLineNum = 543;BA.debugLine="labelgaugeHomeTemp.TextColor = fx.Colors.Red";
_labelgaugehometemp.setTextColor(_fx.Colors.Red);
 //BA.debugLineNum = 544;BA.debugLine="labelgaugeHomeHumidity.Text = \"Timestamp is \"";
_labelgaugehomehumidity.setText("Timestamp is "+BA.NumberToString(_p.Hours)+"hr "+BA.NumberToString(_p.Minutes)+"m advance");
 //BA.debugLineNum = 545;BA.debugLine="labelgaugeHomeHumidity.TextColor = fx.Colors.";
_labelgaugehomehumidity.setTextColor(_fx.Colors.Red);
 };
 };
 }else if((_topic).equals("MQ7LivingRoomCloyd")) { 
 //BA.debugLineNum = 550;BA.debugLine="Dim s As String = BytesToString(Payload, 0, Pay";
_s = anywheresoftware.b4a.keywords.Common.BytesToString(_payload,(int) (0),_payload.length,"utf8");
 //BA.debugLineNum = 551;BA.debugLine="Dim a() As String = Regex.Split(\"\\|\",s)";
_a = anywheresoftware.b4a.keywords.Common.Regex.Split("\\|",_s);
 //BA.debugLineNum = 552;BA.debugLine="If a.Length = 3 Then";
if (_a.length==3) { 
 //BA.debugLineNum = 553;BA.debugLine="GaugeAirQuality.CurrentValue=(a(0)/10)";
_gaugeairquality._setcurrentvalue /*float*/ ((float) (((double)(Double.parseDouble(_a[(int) (0)]))/(double)10)));
 //BA.debugLineNum = 554;BA.debugLine="labelGaugeAirQuality.Text = GetAirQuality((a(0";
_labelgaugeairquality.setText(_getairquality((int) (((double)(Double.parseDouble(_a[(int) (0)]))/(double)10))));
 //BA.debugLineNum = 555;BA.debugLine="If (a(0)/10) > 40 Then";
if (((double)(Double.parseDouble(_a[(int) (0)]))/(double)10)>40) { 
 //BA.debugLineNum = 556;BA.debugLine="labelGaugeAirQuality.TextColor = fx.Colors.Re";
_labelgaugeairquality.setTextColor(_fx.Colors.Red);
 }else {
 //BA.debugLineNum = 558;BA.debugLine="labelGaugeAirQuality.TextColor = fx.Colors.Bl";
_labelgaugeairquality.setTextColor(_fx.Colors.Black);
 };
 //BA.debugLineNum = 561;BA.debugLine="DateTime.DateFormat = \"yy-MM-dd HH:mm:ss z\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yy-MM-dd HH:mm:ss z");
 //BA.debugLineNum = 562;BA.debugLine="Dim ticks As Long = DateTime.DateParse(a(1) &";
_ticks = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_a[(int) (1)]+" "+_a[(int) (2)]+" GMT");
 //BA.debugLineNum = 563;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a z";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("MMM d, yyyy h:mm:ss a z");
 //BA.debugLineNum = 564;BA.debugLine="Dim lngTicks As Long = ticks";
_lngticks = _ticks;
 //BA.debugLineNum = 565;BA.debugLine="Dim p As Period = DateUtils.PeriodBetween(lngT";
_p = _dateutils._periodbetween(_lngticks,anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 567;BA.debugLine="If p.Minutes <= -5 Then";
if (_p.Minutes<=-5) { 
 //BA.debugLineNum = 568;BA.debugLine="labelGaugeAirQuality.Text = \"Timestamp is \" &";
_labelgaugeairquality.setText("Timestamp is "+BA.NumberToString(_p.Hours)+"hr "+BA.NumberToString(_p.Minutes)+"m old");
 //BA.debugLineNum = 569;BA.debugLine="labelGaugeAirQuality.TextColor = fx.Colors.Re";
_labelgaugeairquality.setTextColor(_fx.Colors.Red);
 }else if(_p.Minutes>=5) { 
 //BA.debugLineNum = 571;BA.debugLine="labelGaugeAirQuality.Text = \"Timestamp is \" &";
_labelgaugeairquality.setText("Timestamp is "+BA.NumberToString(_p.Hours)+"hr "+BA.NumberToString(_p.Minutes)+"m advance");
 //BA.debugLineNum = 572;BA.debugLine="labelGaugeAirQuality.TextColor = fx.Colors.Re";
_labelgaugeairquality.setTextColor(_fx.Colors.Red);
 };
 };
 }else if((_topic).equals("TempHumidBasement")) { 
 //BA.debugLineNum = 577;BA.debugLine="Dim s As String = BytesToString(Payload, 0, Pay";
_s = anywheresoftware.b4a.keywords.Common.BytesToString(_payload,(int) (0),_payload.length,"utf8");
 //BA.debugLineNum = 578;BA.debugLine="Dim a() As String = Regex.Split(\"\\|\",s)";
_a = anywheresoftware.b4a.keywords.Common.Regex.Split("\\|",_s);
 //BA.debugLineNum = 579;BA.debugLine="If a.Length = 9 Then";
if (_a.length==9) { 
 //BA.debugLineNum = 580;BA.debugLine="gaugeBasementTemp.CurrentValue=a(1)";
_gaugebasementtemp._setcurrentvalue /*float*/ ((float)(Double.parseDouble(_a[(int) (1)])));
 //BA.debugLineNum = 581;BA.debugLine="gaugeBasementHumidity.CurrentValue=a(2)";
_gaugebasementhumidity._setcurrentvalue /*float*/ ((float)(Double.parseDouble(_a[(int) (2)])));
 //BA.debugLineNum = 582;BA.debugLine="labelgaugeBasementTemp.Text = GetPerception(a(";
_labelgaugebasementtemp.setText(_getperception(_a[(int) (3)]));
 //BA.debugLineNum = 583;BA.debugLine="labelgaugeBasementHumidity.Text = GetComfort(a";
_labelgaugebasementhumidity.setText(_getcomfort(_a[(int) (4)]));
 //BA.debugLineNum = 584;BA.debugLine="If a(4) = 2 Or a(4) = 6 Or a(4) = 10 Then";
if ((_a[(int) (4)]).equals(BA.NumberToString(2)) || (_a[(int) (4)]).equals(BA.NumberToString(6)) || (_a[(int) (4)]).equals(BA.NumberToString(10))) { 
 //BA.debugLineNum = 585;BA.debugLine="labelgaugeBasementHumidity.TextColor = fx.Col";
_labelgaugebasementhumidity.setTextColor(_fx.Colors.Blue);
 }else if((_a[(int) (4)]).equals(BA.NumberToString(0))) { 
 //BA.debugLineNum = 587;BA.debugLine="labelgaugeBasementHumidity.TextColor = fx.Col";
_labelgaugebasementhumidity.setTextColor(_fx.Colors.Black);
 }else {
 //BA.debugLineNum = 589;BA.debugLine="labelgaugeBasementHumidity.TextColor = fx.Col";
_labelgaugebasementhumidity.setTextColor(_fx.Colors.Red);
 };
 //BA.debugLineNum = 591;BA.debugLine="If a(3) > 3 Then";
if ((double)(Double.parseDouble(_a[(int) (3)]))>3) { 
 //BA.debugLineNum = 592;BA.debugLine="labelgaugeBasementTemp.TextColor = fx.Colors.";
_labelgaugebasementtemp.setTextColor(_fx.Colors.Red);
 }else {
 //BA.debugLineNum = 594;BA.debugLine="labelgaugeBasementTemp.TextColor = fx.Colors.";
_labelgaugebasementtemp.setTextColor(_fx.Colors.Black);
 };
 //BA.debugLineNum = 597;BA.debugLine="DateTime.DateFormat = \"yy-MM-dd HH:mm:ss z\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yy-MM-dd HH:mm:ss z");
 //BA.debugLineNum = 598;BA.debugLine="Dim ticks As Long = DateTime.DateParse(a(7) &";
_ticks = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_a[(int) (7)]+" "+_a[(int) (8)]+" GMT");
 //BA.debugLineNum = 599;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a z";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("MMM d, yyyy h:mm:ss a z");
 //BA.debugLineNum = 600;BA.debugLine="Dim lngTicks As Long = ticks";
_lngticks = _ticks;
 //BA.debugLineNum = 601;BA.debugLine="Dim p As Period = DateUtils.PeriodBetween(lngT";
_p = _dateutils._periodbetween(_lngticks,anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 603;BA.debugLine="If p.Minutes <= -5 Then";
if (_p.Minutes<=-5) { 
 //BA.debugLineNum = 604;BA.debugLine="labelgaugeBasementTemp.Text = \"Timestamp is \"";
_labelgaugebasementtemp.setText("Timestamp is "+BA.NumberToString(_p.Hours)+"hr "+BA.NumberToString(_p.Minutes)+"m old");
 //BA.debugLineNum = 605;BA.debugLine="labelgaugeBasementTemp.TextColor = fx.Colors.";
_labelgaugebasementtemp.setTextColor(_fx.Colors.Red);
 //BA.debugLineNum = 606;BA.debugLine="labelgaugeBasementHumidity.Text = \"Timestamp";
_labelgaugebasementhumidity.setText("Timestamp is "+BA.NumberToString(_p.Hours)+"hr "+BA.NumberToString(_p.Minutes)+"m old");
 //BA.debugLineNum = 607;BA.debugLine="labelgaugeBasementHumidity.TextColor = fx.Col";
_labelgaugebasementhumidity.setTextColor(_fx.Colors.Red);
 }else if(_p.Minutes>=5) { 
 //BA.debugLineNum = 609;BA.debugLine="labelgaugeBasementTemp.Text = \"Timestamp is \"";
_labelgaugebasementtemp.setText("Timestamp is "+BA.NumberToString(_p.Hours)+"hr "+BA.NumberToString(_p.Minutes)+"m advance");
 //BA.debugLineNum = 610;BA.debugLine="labelgaugeBasementTemp.TextColor = fx.Colors.";
_labelgaugebasementtemp.setTextColor(_fx.Colors.Red);
 //BA.debugLineNum = 611;BA.debugLine="labelgaugeBasementHumidity.Text = \"Timestamp";
_labelgaugebasementhumidity.setText("Timestamp is "+BA.NumberToString(_p.Hours)+"hr "+BA.NumberToString(_p.Minutes)+"m advance");
 //BA.debugLineNum = 612;BA.debugLine="labelgaugeBasementHumidity.TextColor = fx.Col";
_labelgaugebasementhumidity.setTextColor(_fx.Colors.Red);
 };
 };
 }else if((_topic).equals("MQ7Basement")) { 
 //BA.debugLineNum = 617;BA.debugLine="Dim s As String = BytesToString(Payload, 0, Pay";
_s = anywheresoftware.b4a.keywords.Common.BytesToString(_payload,(int) (0),_payload.length,"utf8");
 //BA.debugLineNum = 618;BA.debugLine="Dim a() As String = Regex.Split(\"\\|\",s)";
_a = anywheresoftware.b4a.keywords.Common.Regex.Split("\\|",_s);
 //BA.debugLineNum = 619;BA.debugLine="If a.Length = 3 Then";
if (_a.length==3) { 
 //BA.debugLineNum = 620;BA.debugLine="GaugeBasementAirQuality.CurrentValue=(a(0)/10)";
_gaugebasementairquality._setcurrentvalue /*float*/ ((float) (((double)(Double.parseDouble(_a[(int) (0)]))/(double)10)));
 //BA.debugLineNum = 621;BA.debugLine="labelGaugeBasementAirQuality.Text = GetAirQual";
_labelgaugebasementairquality.setText(_getairquality((int) (((double)(Double.parseDouble(_a[(int) (0)]))/(double)10))));
 //BA.debugLineNum = 622;BA.debugLine="If (a(0)/10) > 40 Then";
if (((double)(Double.parseDouble(_a[(int) (0)]))/(double)10)>40) { 
 //BA.debugLineNum = 623;BA.debugLine="labelGaugeBasementAirQuality.TextColor = fx.C";
_labelgaugebasementairquality.setTextColor(_fx.Colors.Red);
 }else {
 //BA.debugLineNum = 625;BA.debugLine="labelGaugeBasementAirQuality.TextColor = fx.C";
_labelgaugebasementairquality.setTextColor(_fx.Colors.Black);
 };
 //BA.debugLineNum = 628;BA.debugLine="DateTime.DateFormat = \"yy-MM-dd HH:mm:ss z\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yy-MM-dd HH:mm:ss z");
 //BA.debugLineNum = 629;BA.debugLine="Dim ticks As Long = DateTime.DateParse(a(1) &";
_ticks = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_a[(int) (1)]+" "+_a[(int) (2)]+" GMT");
 //BA.debugLineNum = 630;BA.debugLine="DateTime.DateFormat = \"MMM d, yyyy h:mm:ss a z";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("MMM d, yyyy h:mm:ss a z");
 //BA.debugLineNum = 631;BA.debugLine="Dim lngTicks As Long = ticks";
_lngticks = _ticks;
 //BA.debugLineNum = 632;BA.debugLine="Dim p As Period = DateUtils.PeriodBetween(lngT";
_p = _dateutils._periodbetween(_lngticks,anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 634;BA.debugLine="If p.Minutes <= -5 Then";
if (_p.Minutes<=-5) { 
 //BA.debugLineNum = 635;BA.debugLine="labelGaugeBasementAirQuality.Text = \"Timestam";
_labelgaugebasementairquality.setText("Timestamp is "+BA.NumberToString(_p.Hours)+"hr "+BA.NumberToString(_p.Minutes)+"m old");
 //BA.debugLineNum = 636;BA.debugLine="labelGaugeBasementAirQuality.TextColor = fx.C";
_labelgaugebasementairquality.setTextColor(_fx.Colors.Red);
 }else if(_p.Minutes>=5) { 
 //BA.debugLineNum = 638;BA.debugLine="labelGaugeBasementAirQuality.Text = \"Timestam";
_labelgaugebasementairquality.setText("Timestamp is "+BA.NumberToString(_p.Hours)+"hr "+BA.NumberToString(_p.Minutes)+"m advance");
 //BA.debugLineNum = 639;BA.debugLine="labelGaugeBasementAirQuality.TextColor = fx.C";
_labelgaugebasementairquality.setTextColor(_fx.Colors.Red);
 };
 };
 };
 } 
       catch (Exception e126) {
			ba.setLastException(e126); //BA.debugLineNum = 645;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("71835147",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
 };
 //BA.debugLineNum = 647;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 9;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 11;BA.debugLine="Private MainForm As Form";
_mainform = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 12;BA.debugLine="Private lbTitle As Label 'ignore";
_lbtitle = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private xMouse, yMouse As Double";
_xmouse = 0;
_ymouse = 0;
 //BA.debugLineNum = 14;BA.debugLine="Private isMaximized As Boolean = False";
_ismaximized = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 15;BA.debugLine="Private ivClose As ImageView";
_ivclose = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private ivMax As ImageView";
_ivmax = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private ivMin As ImageView";
_ivmin = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private lstSkins As ListView 'ignore";
_lstskins = new anywheresoftware.b4j.objects.ListViewWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private AtualSkin As String";
_atualskin = "";
 //BA.debugLineNum = 20;BA.debugLine="Private imgInit As String";
_imginit = "";
 //BA.debugLineNum = 21;BA.debugLine="Private isMaximized As Boolean = False";
_ismaximized = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 22;BA.debugLine="Private Button1 As Button 'ignore";
_button1 = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 24;BA.debugLine="Private MainForm As Form";
_mainform = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 25;BA.debugLine="Private Canvas1 As Canvas 'ignore";
_canvas1 = new anywheresoftware.b4j.objects.CanvasWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private mqtt As MqttClient";
_mqtt = new anywheresoftware.b4j.objects.MqttAsyncClientWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Type CircleData (x As Double, y As Double, clr As";
;
 //BA.debugLineNum = 28;BA.debugLine="Private MenuBar1 As MenuBar 'ignore";
_menubar1 = new anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private gaugeHomeTemp As Gauge 'ignore";
_gaugehometemp = new cloyd.thaq.monitor.gauge();
 //BA.debugLineNum = 30;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 31;BA.debugLine="Private GaugeAirQuality As Gauge 'ignore";
_gaugeairquality = new cloyd.thaq.monitor.gauge();
 //BA.debugLineNum = 32;BA.debugLine="Private serializator As B4XSerializator";
_serializator = new anywheresoftware.b4a.randomaccessfile.B4XSerializator();
 //BA.debugLineNum = 33;BA.debugLine="Private gaugeHomeHumidity As Gauge 'ignore";
_gaugehomehumidity = new cloyd.thaq.monitor.gauge();
 //BA.debugLineNum = 34;BA.debugLine="Private GaugeBasementAirQuality As Gauge 'ignore";
_gaugebasementairquality = new cloyd.thaq.monitor.gauge();
 //BA.debugLineNum = 35;BA.debugLine="Private gaugeBasementHumidity As Gauge 'ignore";
_gaugebasementhumidity = new cloyd.thaq.monitor.gauge();
 //BA.debugLineNum = 36;BA.debugLine="Private gaugeBasementTemp As Gauge 'ignore";
_gaugebasementtemp = new cloyd.thaq.monitor.gauge();
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
 //BA.debugLineNum = 453;BA.debugLine="Sub RotateNode(n As Node, Degree As Double) 'ignor";
 //BA.debugLineNum = 454;BA.debugLine="Try";
try { //BA.debugLineNum = 455;BA.debugLine="Dim jo As JavaObject = n";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_n.getObject()));
 //BA.debugLineNum = 456;BA.debugLine="jo.RunMethod(\"setRotate\", Array(Degree))";
_jo.RunMethod("setRotate",new Object[]{(Object)(_degree)});
 } 
       catch (Exception e5) {
			ba.setLastException(e5); //BA.debugLineNum = 458;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("71572869",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
 };
 //BA.debugLineNum = 460;BA.debugLine="End Sub";
return "";
}
}
