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
            frm.initWithStage(ba, stage, 350, 675);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static anywheresoftware.b4j.objects.CanvasWrapper _canvas1 = null;
public static anywheresoftware.b4j.objects.MqttAsyncClientWrapper _mqtt = null;
public static anywheresoftware.b4j.objects.StatusBarWrapper _statusbar1 = null;
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
 //BA.debugLineNum = 202;BA.debugLine="Sub AlwaysOnTop(o As Form,boo As Boolean)";
 //BA.debugLineNum = 203;BA.debugLine="getStage(o).RunMethod(\"setAlwaysOnTop\",Array(boo)";
_getstage((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_o))).RunMethod("setAlwaysOnTop",new Object[]{(Object)(_boo)});
 //BA.debugLineNum = 204;BA.debugLine="End Sub";
return "";
}
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
String _clientid = "";
anywheresoftware.b4j.objects.MqttAsyncClientWrapper.MqttConnectOptionsWrapper _mo = null;
 //BA.debugLineNum = 32;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
 //BA.debugLineNum = 33;BA.debugLine="MainForm = Form1";
_mainform = _form1;
 //BA.debugLineNum = 34;BA.debugLine="MainForm.SetFormStyle(\"UTILITY\") 'UNIFIED";
_mainform.SetFormStyle("UTILITY");
 //BA.debugLineNum = 35;BA.debugLine="MainForm.RootPane.LoadLayout(\"1\") 'Load the layou";
_mainform.getRootPane().LoadLayout(ba,"1");
 //BA.debugLineNum = 36;BA.debugLine="MainForm.Title = \"Catanaoan THAQ Monitor ver 1.0\"";
_mainform.setTitle("Catanaoan THAQ Monitor ver 1.0");
 //BA.debugLineNum = 37;BA.debugLine="MainForm.Resizable = False";
_mainform.setResizable(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 38;BA.debugLine="MainForm.Show";
_mainform.Show();
 //BA.debugLineNum = 39;BA.debugLine="StatusBar1.Initialize(\"StatusBar1\")";
_statusbar1.Initialize(ba,"StatusBar1");
 //BA.debugLineNum = 40;BA.debugLine="StatusBar1.Text = \"*** Connecting to Cloud MQTT *";
_statusbar1.setText("*** Connecting to Cloud MQTT ***");
 //BA.debugLineNum = 41;BA.debugLine="Dim clientId As String = Rnd(0, 999999999) & Date";
_clientid = BA.NumberToString(anywheresoftware.b4a.keywords.Common.Rnd((int) (0),(int) (999999999)))+BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 42;BA.debugLine="mqtt.Initialize(\"mqtt\", \"tcp://m14.cloudmqtt.com:";
_mqtt.Initialize(ba,"mqtt","tcp://m14.cloudmqtt.com:11816",_clientid);
 //BA.debugLineNum = 43;BA.debugLine="Dim mo As MqttConnectOptions";
_mo = new anywheresoftware.b4j.objects.MqttAsyncClientWrapper.MqttConnectOptionsWrapper();
 //BA.debugLineNum = 44;BA.debugLine="mo.Initialize(user, password)";
_mo.Initialize(_user,_password);
 //BA.debugLineNum = 45;BA.debugLine="mqtt.Connect2(mo)";
_mqtt.Connect2((org.eclipse.paho.client.mqttv3.MqttConnectOptions)(_mo.getObject()));
 //BA.debugLineNum = 47;BA.debugLine="MainForm.RootPane.AddNode(StatusBar1, 0, 0, -1, 3";
_mainform.getRootPane().AddNode((javafx.scene.Node)(_statusbar1.getObject()),0,0,-1,30);
 //BA.debugLineNum = 48;BA.debugLine="MainForm.RootPane.SetAnchors(StatusBar1, 0, -1, 0";
_mainform.getRootPane().SetAnchors((javafx.scene.Node)(_statusbar1.getObject()),0,-1,0,0);
 //BA.debugLineNum = 50;BA.debugLine="gaugeHomeTemp.SetRanges(Array(gaugeHomeTemp.Creat";
_gaugehometemp._setranges(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_gaugehometemp._createrange((float) (0),(float) (75),_xui.Color_Green)),(Object)(_gaugehometemp._createrange((float) (75),(float) (90),_xui.Color_Yellow)),(Object)(_gaugehometemp._createrange((float) (90),(float) (100),_xui.Color_Red))}));
 //BA.debugLineNum = 53;BA.debugLine="gaugeHomeTemp.CurrentValue=0";
_gaugehometemp._setcurrentvalue((float) (0));
 //BA.debugLineNum = 55;BA.debugLine="gaugeHomeHumidity.SetRanges(Array(gaugeHomeHumidi";
_gaugehomehumidity._setranges(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_gaugehomehumidity._createrange((float) (0),(float) (70),_xui.Color_Green)),(Object)(_gaugehomehumidity._createrange((float) (70),(float) (80),_xui.Color_Yellow)),(Object)(_gaugehomehumidity._createrange((float) (80),(float) (100),_xui.Color_Red))}));
 //BA.debugLineNum = 58;BA.debugLine="gaugeHomeHumidity.CurrentValue=0";
_gaugehomehumidity._setcurrentvalue((float) (0));
 //BA.debugLineNum = 60;BA.debugLine="GaugeAirQuality.SetRanges(Array(GaugeAirQuality.C";
_gaugeairquality._setranges(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_gaugeairquality._createrange((float) (0),(float) (100),_xui.Color_Green)),(Object)(_gaugeairquality._createrange((float) (100),(float) (400),_xui.Color_RGB((int) (100),(int) (240),(int) (23)))),(Object)(_gaugeairquality._createrange((float) (400),(float) (900),_xui.Color_Yellow)),(Object)(_gaugeairquality._createrange((float) (900),(float) (1000),_xui.Color_Red))}));
 //BA.debugLineNum = 64;BA.debugLine="GaugeAirQuality.CurrentValue = 0";
_gaugeairquality._setcurrentvalue((float) (0));
 //BA.debugLineNum = 66;BA.debugLine="gaugeBasementTemp.SetRanges(Array(gaugeBasementTe";
_gaugebasementtemp._setranges(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_gaugebasementtemp._createrange((float) (0),(float) (75),_xui.Color_Green)),(Object)(_gaugebasementtemp._createrange((float) (75),(float) (90),_xui.Color_Yellow)),(Object)(_gaugebasementtemp._createrange((float) (90),(float) (100),_xui.Color_Red))}));
 //BA.debugLineNum = 69;BA.debugLine="gaugeBasementTemp.CurrentValue=0";
_gaugebasementtemp._setcurrentvalue((float) (0));
 //BA.debugLineNum = 71;BA.debugLine="gaugeBasementHumidity.SetRanges(Array(gaugeBaseme";
_gaugebasementhumidity._setranges(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_gaugebasementhumidity._createrange((float) (0),(float) (70),_xui.Color_Green)),(Object)(_gaugebasementhumidity._createrange((float) (70),(float) (80),_xui.Color_Yellow)),(Object)(_gaugebasementhumidity._createrange((float) (80),(float) (100),_xui.Color_Red))}));
 //BA.debugLineNum = 74;BA.debugLine="gaugeBasementHumidity.CurrentValue=0";
_gaugebasementhumidity._setcurrentvalue((float) (0));
 //BA.debugLineNum = 76;BA.debugLine="GaugeBasementAirQuality.SetRanges(Array(GaugeBase";
_gaugebasementairquality._setranges(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_gaugebasementairquality._createrange((float) (0),(float) (100),_xui.Color_Green)),(Object)(_gaugebasementairquality._createrange((float) (100),(float) (400),_xui.Color_RGB((int) (100),(int) (240),(int) (23)))),(Object)(_gaugebasementairquality._createrange((float) (400),(float) (900),_xui.Color_Yellow)),(Object)(_gaugebasementairquality._createrange((float) (900),(float) (1000),_xui.Color_Red))}));
 //BA.debugLineNum = 80;BA.debugLine="GaugeBasementAirQuality.CurrentValue = 0";
_gaugebasementairquality._setcurrentvalue((float) (0));
 //BA.debugLineNum = 82;BA.debugLine="AlwaysOnTop(MainForm,True)";
_alwaysontop(_mainform,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 87;BA.debugLine="MainForm.WindowLeft = CheckMonitor.MaxX	- MainFor";
_mainform.setWindowLeft(_checkmonitor().getMaxX()-_mainform.getWidth()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)));
 //BA.debugLineNum = 89;BA.debugLine="MainForm.WindowTop = CheckMonitor.MaxY - MainForm";
_mainform.setWindowTop(_checkmonitor().getMaxY()-_mainform.getHeight()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60)));
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.objects.JFX.ScreenWrapper  _checkmonitor() throws Exception{
anywheresoftware.b4a.objects.collections.List _slist = null;
anywheresoftware.b4j.objects.JFX.ScreenWrapper _s = null;
 //BA.debugLineNum = 286;BA.debugLine="Sub CheckMonitor() As Screen";
 //BA.debugLineNum = 287;BA.debugLine="Try";
try { //BA.debugLineNum = 288;BA.debugLine="If fx.Screens.Size= 1 Then";
if (_fx.getScreens().getSize()==1) { 
 //BA.debugLineNum = 289;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 290;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
 //BA.debugLineNum = 292;BA.debugLine="Return S";
if (true) return _s;
 }else if(_fx.getScreens().getSize()>1) { 
 //BA.debugLineNum = 294;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 295;BA.debugLine="Dim S As Screen = SList.Get(1)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (1))));
 //BA.debugLineNum = 297;BA.debugLine="Return S";
if (true) return _s;
 }else {
 //BA.debugLineNum = 299;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 300;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
 //BA.debugLineNum = 302;BA.debugLine="Return S";
if (true) return _s;
 };
 } 
       catch (Exception e16) {
			ba.setLastException(e16); //BA.debugLineNum = 305;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 306;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
 //BA.debugLineNum = 308;BA.debugLine="Return S";
if (true) return _s;
 };
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return null;
}
public static String  _getairquality(int _number) throws Exception{
 //BA.debugLineNum = 270;BA.debugLine="Sub GetAirQuality(number As Int) As String";
 //BA.debugLineNum = 273;BA.debugLine="If number <= 100 Then";
if (_number<=100) { 
 //BA.debugLineNum = 274;BA.debugLine="Return(\"Carbon monoxide perfect\")";
if (true) return ("Carbon monoxide perfect");
 }else if(((_number>100) && (_number<400)) || _number==400) { 
 //BA.debugLineNum = 276;BA.debugLine="Return(\"Carbon monoxide normal\")";
if (true) return ("Carbon monoxide normal");
 }else if(((_number>400) && (_number<900)) || _number==900) { 
 //BA.debugLineNum = 278;BA.debugLine="Return(\"Carbon monoxide high\")";
if (true) return ("Carbon monoxide high");
 }else if(_number>900) { 
 //BA.debugLineNum = 280;BA.debugLine="Return(\"ALARM Carbon monoxide very high\")";
if (true) return ("ALARM Carbon monoxide very high");
 }else {
 //BA.debugLineNum = 282;BA.debugLine="Return(\"MQ-7 - cant read any value - check the s";
if (true) return ("MQ-7 - cant read any value - check the sensor!");
 };
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return "";
}
public static String  _getcomfort(String _dht11comfortstatus) throws Exception{
String _localcomfortstatus = "";
 //BA.debugLineNum = 243;BA.debugLine="Sub GetComfort(DHT11ComfortStatus As String) As St";
 //BA.debugLineNum = 244;BA.debugLine="Dim localcomfortstatus As String";
_localcomfortstatus = "";
 //BA.debugLineNum = 245;BA.debugLine="Select Case DHT11ComfortStatus";
switch (BA.switchObjectToInt(_dht11comfortstatus,BA.NumberToString(0),BA.NumberToString(1),BA.NumberToString(2),BA.NumberToString(4),BA.NumberToString(5),BA.NumberToString(6),BA.NumberToString(8),BA.NumberToString(9),BA.NumberToString(10))) {
case 0: {
 //BA.debugLineNum = 247;BA.debugLine="localcomfortstatus = \"OK\"";
_localcomfortstatus = "OK";
 break; }
case 1: {
 //BA.debugLineNum = 249;BA.debugLine="localcomfortstatus = \"Too hot\"";
_localcomfortstatus = "Too hot";
 break; }
case 2: {
 //BA.debugLineNum = 251;BA.debugLine="localcomfortstatus = \"Too cold\"";
_localcomfortstatus = "Too cold";
 break; }
case 3: {
 //BA.debugLineNum = 253;BA.debugLine="localcomfortstatus = \"Too dry\"";
_localcomfortstatus = "Too dry";
 break; }
case 4: {
 //BA.debugLineNum = 255;BA.debugLine="localcomfortstatus = \"Hot and dry\"";
_localcomfortstatus = "Hot and dry";
 break; }
case 5: {
 //BA.debugLineNum = 257;BA.debugLine="localcomfortstatus = \"Cold and dry\"";
_localcomfortstatus = "Cold and dry";
 break; }
case 6: {
 //BA.debugLineNum = 259;BA.debugLine="localcomfortstatus = \"Too humid\"";
_localcomfortstatus = "Too humid";
 break; }
case 7: {
 //BA.debugLineNum = 261;BA.debugLine="localcomfortstatus = \"Hot and humid\"";
_localcomfortstatus = "Hot and humid";
 break; }
case 8: {
 //BA.debugLineNum = 263;BA.debugLine="localcomfortstatus = \"Cold and humid\"";
_localcomfortstatus = "Cold and humid";
 break; }
default: {
 //BA.debugLineNum = 265;BA.debugLine="localcomfortstatus = \"Unknown\"";
_localcomfortstatus = "Unknown";
 break; }
}
;
 //BA.debugLineNum = 267;BA.debugLine="Return localcomfortstatus";
if (true) return _localcomfortstatus;
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
return "";
}
public static String  _getperception(String _dht11perception) throws Exception{
String _localperception = "";
 //BA.debugLineNum = 210;BA.debugLine="Sub GetPerception(DHT11Perception As String) As St";
 //BA.debugLineNum = 221;BA.debugLine="Dim localperception As String";
_localperception = "";
 //BA.debugLineNum = 222;BA.debugLine="Select Case DHT11Perception";
switch (BA.switchObjectToInt(_dht11perception,BA.NumberToString(0),BA.NumberToString(1),BA.NumberToString(2),BA.NumberToString(3),BA.NumberToString(4),BA.NumberToString(5),BA.NumberToString(6),BA.NumberToString(7))) {
case 0: {
 //BA.debugLineNum = 224;BA.debugLine="localperception = \"Feels like the western US, a";
_localperception = "Feels like the western US, a bit dry to some";
 break; }
case 1: {
 //BA.debugLineNum = 226;BA.debugLine="localperception = \"Very comfortable\"";
_localperception = "Very comfortable";
 break; }
case 2: {
 //BA.debugLineNum = 228;BA.debugLine="localperception = \"Comfortable\"";
_localperception = "Comfortable";
 break; }
case 3: {
 //BA.debugLineNum = 230;BA.debugLine="localperception = \"OK but humidity is at upper";
_localperception = "OK but humidity is at upper limit";
 break; }
case 4: {
 //BA.debugLineNum = 232;BA.debugLine="localperception = \"Uncomfortable and the humidi";
_localperception = "Uncomfortable and the humidity is at upper limit";
 break; }
case 5: {
 //BA.debugLineNum = 234;BA.debugLine="localperception = \"Very humid, quite uncomforta";
_localperception = "Very humid, quite uncomfortable";
 break; }
case 6: {
 //BA.debugLineNum = 236;BA.debugLine="localperception = \"Extremely uncomfortable, opp";
_localperception = "Extremely uncomfortable, oppressive";
 break; }
case 7: {
 //BA.debugLineNum = 238;BA.debugLine="localperception = \"Severely high, even deadly f";
_localperception = "Severely high, even deadly for asthma related illnesses";
 break; }
}
;
 //BA.debugLineNum = 240;BA.debugLine="Return localperception";
if (true) return _localperception;
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.object.JavaObject  _getstage(anywheresoftware.b4j.object.JavaObject _o) throws Exception{
 //BA.debugLineNum = 206;BA.debugLine="private Sub getStage(o As JavaObject) As JavaObjec";
 //BA.debugLineNum = 207;BA.debugLine="Return o.GetFieldJO(\"stage\")";
if (true) return _o.GetFieldJO("stage");
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public static String  _mainform_closed() throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub MainForm_Closed";
 //BA.debugLineNum = 99;BA.debugLine="mqtt.Close";
_mqtt.Close();
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public static String  _menubar1_action() throws Exception{
anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _item = null;
 //BA.debugLineNum = 192;BA.debugLine="Sub MenuBar1_Action";
 //BA.debugLineNum = 193;BA.debugLine="Dim item As MenuItem = Sender";
_item = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
_item.setObject((javafx.scene.control.MenuItem)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
 //BA.debugLineNum = 194;BA.debugLine="Select item.Text";
switch (BA.switchObjectToInt(_item.getText(),"_Clear","_Close All")) {
case 0: {
 break; }
case 1: {
 break; }
}
;
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return "";
}
public static String  _mqtt_connected(boolean _success) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub mqtt_Connected (Success As Boolean)";
 //BA.debugLineNum = 103;BA.debugLine="If Success = False Then";
if (_success==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 104;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)));
 //BA.debugLineNum = 105;BA.debugLine="StatusBar1.Text = \"Error connecting\"";
_statusbar1.setText("Error connecting");
 }else {
 //BA.debugLineNum = 107;BA.debugLine="StatusBar1.Text = \"Connected to Cloud MQTT\"";
_statusbar1.setText("Connected to Cloud MQTT");
 //BA.debugLineNum = 108;BA.debugLine="MenuBar1.Enabled = True";
_menubar1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 109;BA.debugLine="mqtt.Subscribe(\"TempHumid\", 0)";
_mqtt.Subscribe("TempHumid",(int) (0));
 //BA.debugLineNum = 110;BA.debugLine="mqtt.Subscribe(\"MQ7\", 0)";
_mqtt.Subscribe("MQ7",(int) (0));
 //BA.debugLineNum = 111;BA.debugLine="mqtt.Subscribe(\"TempHumidBasement\", 0)";
_mqtt.Subscribe("TempHumidBasement",(int) (0));
 //BA.debugLineNum = 112;BA.debugLine="mqtt.Subscribe(\"MQ7Basement\", 0)";
_mqtt.Subscribe("MQ7Basement",(int) (0));
 //BA.debugLineNum = 113;BA.debugLine="mqtt.Publish(\"MQ7\", serializator.ConvertObjectTo";
_mqtt.Publish("MQ7",_serializator.ConvertObjectToBytes((Object)("Read voltage")));
 //BA.debugLineNum = 114;BA.debugLine="mqtt.Publish(\"MQ7Basement\", serializator.Convert";
_mqtt.Publish("MQ7Basement",_serializator.ConvertObjectToBytes((Object)("Read voltage")));
 };
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public static String  _mqtt_disconnected() throws Exception{
anywheresoftware.b4j.objects.MqttAsyncClientWrapper.MqttConnectOptionsWrapper _mo = null;
 //BA.debugLineNum = 118;BA.debugLine="Private Sub mqtt_Disconnected";
 //BA.debugLineNum = 119;BA.debugLine="StatusBar1.Text = \"Disconnected from Cloud MQTT\"";
_statusbar1.setText("Disconnected from Cloud MQTT");
 //BA.debugLineNum = 120;BA.debugLine="MenuBar1.Enabled = False";
_menubar1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 121;BA.debugLine="Dim mo As MqttConnectOptions";
_mo = new anywheresoftware.b4j.objects.MqttAsyncClientWrapper.MqttConnectOptionsWrapper();
 //BA.debugLineNum = 122;BA.debugLine="mo.Initialize(user, password)";
_mo.Initialize(_user,_password);
 //BA.debugLineNum = 123;BA.debugLine="mqtt.Connect2(mo)";
_mqtt.Connect2((org.eclipse.paho.client.mqttv3.MqttConnectOptions)(_mo.getObject()));
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return "";
}
public static String  _mqtt_messagearrived(String _topic,byte[] _payload) throws Exception{
String _s = "";
String[] _a = null;
 //BA.debugLineNum = 126;BA.debugLine="Private Sub mqtt_MessageArrived (Topic As String,";
 //BA.debugLineNum = 127;BA.debugLine="If Topic = \"TempHumid\" Then";
if ((_topic).equals("TempHumid")) { 
 //BA.debugLineNum = 128;BA.debugLine="Dim s As String = BytesToString(Payload, 0, Payl";
_s = anywheresoftware.b4a.keywords.Common.BytesToString(_payload,(int) (0),_payload.length,"utf8");
 //BA.debugLineNum = 129;BA.debugLine="Dim a() As String = Regex.Split(\"\\|\",s)";
_a = anywheresoftware.b4a.keywords.Common.Regex.Split("\\|",_s);
 //BA.debugLineNum = 130;BA.debugLine="If a.Length = 9 Then";
if (_a.length==9) { 
 //BA.debugLineNum = 131;BA.debugLine="gaugeHomeTemp.CurrentValue=a(1)";
_gaugehometemp._setcurrentvalue((float)(Double.parseDouble(_a[(int) (1)])));
 //BA.debugLineNum = 132;BA.debugLine="gaugeHomeHumidity.CurrentValue=a(2)";
_gaugehomehumidity._setcurrentvalue((float)(Double.parseDouble(_a[(int) (2)])));
 //BA.debugLineNum = 133;BA.debugLine="labelgaugeHomeTemp.Text = GetPerception(a(3))";
_labelgaugehometemp.setText(_getperception(_a[(int) (3)]));
 //BA.debugLineNum = 134;BA.debugLine="labelgaugeHomeHumidity.Text = GetComfort(a(4))";
_labelgaugehomehumidity.setText(_getcomfort(_a[(int) (4)]));
 //BA.debugLineNum = 135;BA.debugLine="If a(3) > 3 Then";
if ((double)(Double.parseDouble(_a[(int) (3)]))>3) { 
 //BA.debugLineNum = 136;BA.debugLine="labelgaugeHomeTemp.TextColor = fx.Colors.Red";
_labelgaugehometemp.setTextColor(_fx.Colors.Red);
 }else {
 //BA.debugLineNum = 138;BA.debugLine="labelgaugeHomeTemp.TextColor = fx.Colors.black";
_labelgaugehometemp.setTextColor(_fx.Colors.Black);
 };
 //BA.debugLineNum = 140;BA.debugLine="If a(4) > 0 Then";
if ((double)(Double.parseDouble(_a[(int) (4)]))>0) { 
 //BA.debugLineNum = 141;BA.debugLine="labelgaugeHomeHumidity.TextColor = fx.Colors.R";
_labelgaugehomehumidity.setTextColor(_fx.Colors.Red);
 }else {
 //BA.debugLineNum = 143;BA.debugLine="labelgaugeHomeHumidity.TextColor = fx.Colors.b";
_labelgaugehomehumidity.setTextColor(_fx.Colors.Black);
 };
 };
 }else if((_topic).equals("MQ7")) { 
 //BA.debugLineNum = 147;BA.debugLine="Dim s As String = BytesToString(Payload, 0, Payl";
_s = anywheresoftware.b4a.keywords.Common.BytesToString(_payload,(int) (0),_payload.length,"utf8");
 //BA.debugLineNum = 148;BA.debugLine="Dim a() As String = Regex.Split(\"\\|\",s)";
_a = anywheresoftware.b4a.keywords.Common.Regex.Split("\\|",_s);
 //BA.debugLineNum = 149;BA.debugLine="If a.Length = 3 Then";
if (_a.length==3) { 
 //BA.debugLineNum = 150;BA.debugLine="GaugeAirQuality.CurrentValue=a(0)";
_gaugeairquality._setcurrentvalue((float)(Double.parseDouble(_a[(int) (0)])));
 //BA.debugLineNum = 151;BA.debugLine="labelGaugeAirQuality.Text = GetAirQuality(a(0))";
_labelgaugeairquality.setText(_getairquality((int)(Double.parseDouble(_a[(int) (0)]))));
 //BA.debugLineNum = 152;BA.debugLine="If a(0) > 400 Then";
if ((double)(Double.parseDouble(_a[(int) (0)]))>400) { 
 //BA.debugLineNum = 153;BA.debugLine="labelGaugeAirQuality.TextColor = fx.Colors.Red";
_labelgaugeairquality.setTextColor(_fx.Colors.Red);
 }else {
 //BA.debugLineNum = 155;BA.debugLine="labelGaugeAirQuality.TextColor = fx.Colors.bla";
_labelgaugeairquality.setTextColor(_fx.Colors.Black);
 };
 };
 }else if((_topic).equals("TempHumidBasement")) { 
 //BA.debugLineNum = 159;BA.debugLine="Dim s As String = BytesToString(Payload, 0, Payl";
_s = anywheresoftware.b4a.keywords.Common.BytesToString(_payload,(int) (0),_payload.length,"utf8");
 //BA.debugLineNum = 160;BA.debugLine="Dim a() As String = Regex.Split(\"\\|\",s)";
_a = anywheresoftware.b4a.keywords.Common.Regex.Split("\\|",_s);
 //BA.debugLineNum = 161;BA.debugLine="If a.Length = 9 Then";
if (_a.length==9) { 
 //BA.debugLineNum = 162;BA.debugLine="gaugeBasementTemp.CurrentValue=a(1)";
_gaugebasementtemp._setcurrentvalue((float)(Double.parseDouble(_a[(int) (1)])));
 //BA.debugLineNum = 163;BA.debugLine="gaugeBasementHumidity.CurrentValue=a(2)";
_gaugebasementhumidity._setcurrentvalue((float)(Double.parseDouble(_a[(int) (2)])));
 //BA.debugLineNum = 164;BA.debugLine="labelgaugeBasementTemp.Text = GetPerception(a(3";
_labelgaugebasementtemp.setText(_getperception(_a[(int) (3)]));
 //BA.debugLineNum = 165;BA.debugLine="labelgaugeBasementHumidity.Text = GetComfort(a(";
_labelgaugebasementhumidity.setText(_getcomfort(_a[(int) (4)]));
 //BA.debugLineNum = 166;BA.debugLine="If a(3) > 3 Then";
if ((double)(Double.parseDouble(_a[(int) (3)]))>3) { 
 //BA.debugLineNum = 167;BA.debugLine="labelgaugeBasementTemp.TextColor = fx.Colors.R";
_labelgaugebasementtemp.setTextColor(_fx.Colors.Red);
 }else {
 //BA.debugLineNum = 169;BA.debugLine="labelgaugeBasementTemp.TextColor = fx.Colors.b";
_labelgaugebasementtemp.setTextColor(_fx.Colors.Black);
 };
 //BA.debugLineNum = 171;BA.debugLine="If a(4) > 0 Then";
if ((double)(Double.parseDouble(_a[(int) (4)]))>0) { 
 //BA.debugLineNum = 172;BA.debugLine="labelgaugeBasementHumidity.TextColor = fx.Colo";
_labelgaugebasementhumidity.setTextColor(_fx.Colors.Red);
 }else {
 //BA.debugLineNum = 174;BA.debugLine="labelgaugeBasementHumidity.TextColor = fx.Colo";
_labelgaugebasementhumidity.setTextColor(_fx.Colors.Black);
 };
 };
 }else if((_topic).equals("MQ7Basement")) { 
 //BA.debugLineNum = 178;BA.debugLine="Dim s As String = BytesToString(Payload, 0, Payl";
_s = anywheresoftware.b4a.keywords.Common.BytesToString(_payload,(int) (0),_payload.length,"utf8");
 //BA.debugLineNum = 179;BA.debugLine="Dim a() As String = Regex.Split(\"\\|\",s)";
_a = anywheresoftware.b4a.keywords.Common.Regex.Split("\\|",_s);
 //BA.debugLineNum = 180;BA.debugLine="If a.Length = 3 Then";
if (_a.length==3) { 
 //BA.debugLineNum = 181;BA.debugLine="GaugeBasementAirQuality.CurrentValue=a(0)";
_gaugebasementairquality._setcurrentvalue((float)(Double.parseDouble(_a[(int) (0)])));
 //BA.debugLineNum = 182;BA.debugLine="labelGaugeBasementAirQuality.Text = GetAirQuali";
_labelgaugebasementairquality.setText(_getairquality((int)(Double.parseDouble(_a[(int) (0)]))));
 //BA.debugLineNum = 183;BA.debugLine="If a(0) > 400 Then";
if ((double)(Double.parseDouble(_a[(int) (0)]))>400) { 
 //BA.debugLineNum = 184;BA.debugLine="labelGaugeBasementAirQuality.TextColor = fx.Co";
_labelgaugebasementairquality.setTextColor(_fx.Colors.Red);
 }else {
 //BA.debugLineNum = 186;BA.debugLine="labelGaugeBasementAirQuality.TextColor = fx.Co";
_labelgaugebasementairquality.setTextColor(_fx.Colors.Black);
 };
 };
 };
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return "";
}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
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
 //BA.debugLineNum = 9;BA.debugLine="Private Canvas1 As Canvas";
_canvas1 = new anywheresoftware.b4j.objects.CanvasWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private mqtt As MqttClient";
_mqtt = new anywheresoftware.b4j.objects.MqttAsyncClientWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Type CircleData (x As Double, y As Double, clr As";
;
 //BA.debugLineNum = 12;BA.debugLine="Private StatusBar1 As StatusBar";
_statusbar1 = new anywheresoftware.b4j.objects.StatusBarWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private MenuBar1 As MenuBar";
_menubar1 = new anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private user As String = \"vynckfaq\"";
_user = "vynckfaq";
 //BA.debugLineNum = 15;BA.debugLine="Private password As String = \"KHSV1Q1qSUUY\"";
_password = "KHSV1Q1qSUUY";
 //BA.debugLineNum = 16;BA.debugLine="Private gaugeHomeTemp As Gauge";
_gaugehometemp = new b4j.example.gauge();
 //BA.debugLineNum = 17;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4j.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 18;BA.debugLine="Private GaugeAirQuality As Gauge";
_gaugeairquality = new b4j.example.gauge();
 //BA.debugLineNum = 19;BA.debugLine="Private serializator As B4XSerializator";
_serializator = new anywheresoftware.b4a.randomaccessfile.B4XSerializator();
 //BA.debugLineNum = 20;BA.debugLine="Private gaugeHomeHumidity As Gauge";
_gaugehomehumidity = new b4j.example.gauge();
 //BA.debugLineNum = 21;BA.debugLine="Private GaugeBasementAirQuality As Gauge";
_gaugebasementairquality = new b4j.example.gauge();
 //BA.debugLineNum = 22;BA.debugLine="Private gaugeBasementHumidity As Gauge";
_gaugebasementhumidity = new b4j.example.gauge();
 //BA.debugLineNum = 23;BA.debugLine="Private gaugeBasementTemp As Gauge";
_gaugebasementtemp = new b4j.example.gauge();
 //BA.debugLineNum = 24;BA.debugLine="Private labelgaugeHomeTemp As Label";
_labelgaugehometemp = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private labelGaugeAirQuality As Label";
_labelgaugeairquality = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private labelgaugeHomeHumidity As Label";
_labelgaugehomehumidity = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private labelgaugeBasementTemp As Label";
_labelgaugebasementtemp = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private labelGaugeBasementAirQuality As Label";
_labelgaugebasementairquality = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private labelgaugeBasementHumidity As Label";
_labelgaugebasementhumidity = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public static String  _rotatenode(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _n,double _degree) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 93;BA.debugLine="Sub RotateNode(n As Node, Degree As Double) 'ignor";
 //BA.debugLineNum = 94;BA.debugLine="Dim jo As JavaObject = n";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(_n.getObject()));
 //BA.debugLineNum = 95;BA.debugLine="jo.RunMethod(\"setRotate\", Array(Degree))";
_jo.RunMethod("setRotate",new Object[]{(Object)(_degree)});
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
}
