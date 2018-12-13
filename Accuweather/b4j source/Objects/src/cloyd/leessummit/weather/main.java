package cloyd.leessummit.weather;


import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("cloyd.leessummit.weather", "cloyd.leessummit.weather.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "cloyd.leessummit.weather.main", ba);
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
            frm.initWithStage(ba, stage, 800, 650);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static anywheresoftware.b4j.object.JavaObject _we = null;
public static anywheresoftware.b4j.object.JavaObject _temp = null;
public static anywheresoftware.b4j.objects.WebViewWrapper _wv1 = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _navbar = null;
public static String _startpage = "";
public static anywheresoftware.b4j.object.JavaObject _doc = null;
public static anywheresoftware.b4a.objects.collections.List _lis = null;
public static anywheresoftware.b4j.objects.ComboBoxWrapper _combo1 = null;
public static String  _alwaysontop(anywheresoftware.b4j.objects.Form _o,boolean _boo) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub AlwaysOnTop(o As Form,boo As Boolean)";
 //BA.debugLineNum = 82;BA.debugLine="getStage(o).RunMethod(\"setAlwaysOnTop\",Array(boo)";
_getstage((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_o))).RunMethod("setAlwaysOnTop",new Object[]{(Object)(_boo)});
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
 //BA.debugLineNum = 20;BA.debugLine="MainForm = Form1";
_mainform = _form1;
 //BA.debugLineNum = 21;BA.debugLine="lis.Initialize";
_lis.Initialize();
 //BA.debugLineNum = 22;BA.debugLine="we.InitializeNewInstance(\"javafx.scene.web.WebEng";
_we.InitializeNewInstance("javafx.scene.web.WebEngine",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 23;BA.debugLine="doc.InitializeStatic(\"org.w3c.dom.Document\")";
_doc.InitializeStatic("org.w3c.dom.Document");
 //BA.debugLineNum = 24;BA.debugLine="MainForm.RootPane.LoadLayout(\"webengine\") 'Load t";
_mainform.getRootPane().LoadLayout(ba,"webengine");
 //BA.debugLineNum = 25;BA.debugLine="MainForm.Icon = fx.LoadImage(File.DirAssets,\"accu";
_mainform.setIcon((javafx.scene.image.Image)(_fx.LoadImage(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"accuweather.png").getObject()));
 //BA.debugLineNum = 26;BA.debugLine="temp = wv1";
_temp.setObject((java.lang.Object)(_wv1.getObject()));
 //BA.debugLineNum = 27;BA.debugLine="we = temp.RunMethod(\"getEngine\",Null)";
_we.setObject((java.lang.Object)(_temp.RunMethod("getEngine",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
 //BA.debugLineNum = 28;BA.debugLine="wv1.Enabled = True";
_wv1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 29;BA.debugLine="wv1.Visible = True";
_wv1.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 30;BA.debugLine="we.RunMethod(\"load\",Array As Object(startPage))";
_we.RunMethod("load",new Object[]{(Object)(_startpage)});
 //BA.debugLineNum = 31;BA.debugLine="navBar.TooltipText = \"[WEB}    http://website.com";
_navbar.setTooltipText("[WEB}    http://website.com"+anywheresoftware.b4a.keywords.Common.CRLF+"[FILES]  file:pathandname.ext");
 //BA.debugLineNum = 34;BA.debugLine="MainForm.SetFormStyle(\"DECORATED\")";
_mainform.SetFormStyle("DECORATED");
 //BA.debugLineNum = 35;BA.debugLine="MainForm.Show";
_mainform.Show();
 //BA.debugLineNum = 37;BA.debugLine="AlwaysOnTop(MainForm,True)";
_alwaysontop(_mainform,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 41;BA.debugLine="MainForm.WindowLeft = CheckMonitor.MaxX	- MainFor";
_mainform.setWindowLeft(_checkmonitor().getMaxX()-_mainform.getWidth()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (400)));
 //BA.debugLineNum = 42;BA.debugLine="MainForm.WindowTop = CheckMonitor.MaxY - MainForm";
_mainform.setWindowTop(_checkmonitor().getMaxY()-_mainform.getHeight()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (75)));
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public static String  _backbutton_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub BackButton_MouseClicked (EventData As MouseEve";
 //BA.debugLineNum = 45;BA.debugLine="we.RunMethod(\"executeScript\",Array As Object(\"his";
_we.RunMethod("executeScript",new Object[]{(Object)("history.back()")});
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.objects.JFX.ScreenWrapper  _checkmonitor() throws Exception{
anywheresoftware.b4a.objects.collections.List _slist = null;
anywheresoftware.b4j.objects.JFX.ScreenWrapper _s = null;
 //BA.debugLineNum = 89;BA.debugLine="Sub CheckMonitor() As Screen";
 //BA.debugLineNum = 90;BA.debugLine="Try";
try { //BA.debugLineNum = 91;BA.debugLine="If fx.Screens.Size= 1 Then";
if (_fx.getScreens().getSize()==1) { 
 //BA.debugLineNum = 92;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 93;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
 //BA.debugLineNum = 95;BA.debugLine="Return S";
if (true) return _s;
 }else if(_fx.getScreens().getSize()>1) { 
 //BA.debugLineNum = 97;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 98;BA.debugLine="Dim S As Screen = SList.Get(1)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (1))));
 //BA.debugLineNum = 100;BA.debugLine="Return S";
if (true) return _s;
 }else {
 //BA.debugLineNum = 102;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 103;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
 //BA.debugLineNum = 105;BA.debugLine="Return S";
if (true) return _s;
 };
 } 
       catch (Exception e16) {
			ba.setLastException(e16); //BA.debugLineNum = 108;BA.debugLine="Dim SList As List = fx.Screens";
_slist = new anywheresoftware.b4a.objects.collections.List();
_slist = _fx.getScreens();
 //BA.debugLineNum = 109;BA.debugLine="Dim S As Screen = SList.Get(0)";
_s = new anywheresoftware.b4j.objects.JFX.ScreenWrapper();
_s.setObject((javafx.stage.Screen)(_slist.Get((int) (0))));
 //BA.debugLineNum = 111;BA.debugLine="Return S";
if (true) return _s;
 };
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public static String  _combo1_selectedindexchanged(int _index,Object _value) throws Exception{
String _s = "";
 //BA.debugLineNum = 76;BA.debugLine="Sub combo1_SelectedIndexChanged(Index As Int, Valu";
 //BA.debugLineNum = 77;BA.debugLine="Dim s As String = Value";
_s = BA.ObjectToString(_value);
 //BA.debugLineNum = 78;BA.debugLine="we.RunMethod(\"load\",Array As Object(s))";
_we.RunMethod("load",new Object[]{(Object)(_s)});
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public static String  _forwardbutton_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub forwardButton_MouseClicked (EventData As Mouse";
 //BA.debugLineNum = 48;BA.debugLine="we.RunMethod(\"executeScript\",Array As Object(\"his";
_we.RunMethod("executeScript",new Object[]{(Object)("history.forward()")});
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.object.JavaObject  _getstage(anywheresoftware.b4j.object.JavaObject _o) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="private Sub getStage(o As JavaObject) As JavaObjec";
 //BA.debugLineNum = 86;BA.debugLine="Return o.GetFieldJO(\"stage\")";
if (true) return _o.GetFieldJO("stage");
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public static String  _gobutton_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub goButton_MouseClicked (EventData As MouseEvent";
 //BA.debugLineNum = 54;BA.debugLine="we.RunMethod(\"load\",Array As Object(navBar.Text))";
_we.RunMethod("load",new Object[]{(Object)(_navbar.getText())});
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public static String  _homebutton_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub homeButton_MouseClicked (EventData As MouseEve";
 //BA.debugLineNum = 51;BA.debugLine="we.RunMethod(\"load\",Array As Object(startPage))";
_we.RunMethod("load",new Object[]{(Object)(_startpage)});
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 9;BA.debugLine="Private we,temp As JavaObject";
_we = new anywheresoftware.b4j.object.JavaObject();
_temp = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 10;BA.debugLine="Private wv1 As WebView";
_wv1 = new anywheresoftware.b4j.objects.WebViewWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private navBar As TextField";
_navbar = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private startPage As String = \"https://www.accuwe";
_startpage = "https://www.accuweather.com/en/us/lees-summit-mo/64081/hourly-weather-forecast/28179_pc";
 //BA.debugLineNum = 13;BA.debugLine="Private doc As JavaObject		' JavaObject library";
_doc = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 15;BA.debugLine="Private lis As List";
_lis = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 16;BA.debugLine="Private combo1 As ComboBox";
_combo1 = new anywheresoftware.b4j.objects.ComboBoxWrapper();
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public static String  _wv1_pagefinished(String _url) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub wv1_PageFinished (Url As String)";
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
}
