package b4j.example;


import anywheresoftware.b4a.BA;

public class main extends Object{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.StandardBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) throws Exception{
        try {
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            ba.raiseEvent(null, "appstart", (Object)args);
        } catch (Throwable t) {
			BA.printException(t, true);
		
        } finally {
            anywheresoftware.b4a.keywords.Common.LogDebug("Program terminated (StartMessageLoop was not called).");
        }
    }
public static anywheresoftware.b4a.keywords.Common __c = null;
public static String _inputjar = "";
public static String _netframeworkcsc = "";
public static String _iconfile = "";
public static anywheresoftware.b4a.objects.collections.List _excludedmodules = null;
public static anywheresoftware.b4a.objects.collections.List _includedmodules = null;
public static String _javafxjmods = "";
public static String _java = "";
public static String _packagename = "";
public static String _tempfolder = "";
public static anywheresoftware.b4a.objects.collections.List _modules = null;
public static String _targetmodule = "";
public static String _javafxlibs = "";
public static float _version = 0f;
public static boolean _windows = false;
public static boolean _mac = false;
public static boolean _linux = false;
public static String  _appstart(String[] _args) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub AppStart (Args() As String)";
 //BA.debugLineNum = 30;BA.debugLine="Log($\"B4JPackager11 Version ${NumberFormat2(Versi";
anywheresoftware.b4a.keywords.Common.Log(("B4JPackager11 Version "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.NumberFormat2(_version,(int) (0),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)))+""));
 //BA.debugLineNum = 31;BA.debugLine="If ExcludedModules.IsInitialized = False Then Exc";
if (_excludedmodules.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
_excludedmodules.Initialize();};
 //BA.debugLineNum = 32;BA.debugLine="If IncludedModules.IsInitialized = False Then Inc";
if (_includedmodules.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
_includedmodules.Initialize();};
 //BA.debugLineNum = 33;BA.debugLine="If Args.Length > 0 Then";
if (_args.length>0) { 
 //BA.debugLineNum = 34;BA.debugLine="ParseInput (Args(0))";
_parseinput(_args[(int) (0)]);
 };
 //BA.debugLineNum = 36;BA.debugLine="Select DetectOS";
switch (BA.switchObjectToInt(_detectos(),"windows","mac","linux")) {
case 0: {
 //BA.debugLineNum = 38;BA.debugLine="Windows = True";
_windows = anywheresoftware.b4a.keywords.Common.True;
 break; }
case 1: {
 //BA.debugLineNum = 40;BA.debugLine="Mac = True";
_mac = anywheresoftware.b4a.keywords.Common.True;
 break; }
case 2: {
 //BA.debugLineNum = 42;BA.debugLine="Linux = True";
_linux = anywheresoftware.b4a.keywords.Common.True;
 break; }
}
;
 //BA.debugLineNum = 44;BA.debugLine="java = File.Combine(GetSystemProperty(\"java.home\"";
_java = anywheresoftware.b4a.keywords.Common.File.Combine(anywheresoftware.b4a.keywords.Common.GetSystemProperty("java.home",""),"bin");
 //BA.debugLineNum = 45;BA.debugLine="TempFolder = File.Combine(File.DirApp, \"temp\")";
_tempfolder = anywheresoftware.b4a.keywords.Common.File.Combine(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"temp");
 //BA.debugLineNum = 46;BA.debugLine="If GetSystemProperty(\"java.version\", \"\").StartsWi";
if (anywheresoftware.b4a.keywords.Common.GetSystemProperty("java.version","").startsWith("11")==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 47;BA.debugLine="Log(\"Java 11 is required (Tools - Configure Path";
anywheresoftware.b4a.keywords.Common.Log("Java 11 is required (Tools - Configure Paths).");
 //BA.debugLineNum = 48;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 50;BA.debugLine="JavafxJmods = ReplaceSlashes(File.Combine(java, \"";
_javafxjmods = _replaceslashes(anywheresoftware.b4a.keywords.Common.File.Combine(_java,"..\\javafx\\javafx-jmods"));
 //BA.debugLineNum = 51;BA.debugLine="JavaFXLibs = ReplaceSlashes(File.Combine(java, \".";
_javafxlibs = _replaceslashes(anywheresoftware.b4a.keywords.Common.File.Combine(_java,"..\\javafx\\lib"));
 //BA.debugLineNum = 53;BA.debugLine="Start";
_start();
 //BA.debugLineNum = 54;BA.debugLine="Tick";
_tick();
 //BA.debugLineNum = 55;BA.debugLine="StartMessageLoop";
anywheresoftware.b4a.keywords.Common.StartMessageLoop(ba);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _buildrunner() throws Exception{
ResumableSub_BuildRunner rsub = new ResumableSub_BuildRunner(null);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_BuildRunner extends BA.ResumableSub {
public ResumableSub_BuildRunner(b4j.example.main parent) {
this.parent = parent;
}
b4j.example.main parent;
String _filename = "";
String _target = "";
String _output = "";
anywheresoftware.b4j.object.JavaObject _jo = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 249;BA.debugLine="If Windows Then";
if (true) break;

case 1:
//if
this.state = 12;
if (parent._windows) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 251;BA.debugLine="Dim FileName As String = \"javaw.exe\"";
_filename = "javaw.exe";
 //BA.debugLineNum = 252;BA.debugLine="Dim target As String = \"winexe\"";
_target = "winexe";
 //BA.debugLineNum = 253;BA.debugLine="Dim output As String = \"run.exe\"";
_output = "run.exe";
 //BA.debugLineNum = 254;BA.debugLine="File.WriteString(TempFolder, \"runner.cs\", $\" 	 u";
anywheresoftware.b4a.keywords.Common.File.WriteString(parent._tempfolder,"runner.cs",("\n"+"	\n"+"using System;\n"+"using System.Diagnostics;\n"+"namespace B4JRunner\n"+"{\n"+"    class Program\n"+"    {\n"+"        static void Main(string[] args)\n"+"        {\n"+"            Process p = new Process();\n"+"            p.StartInfo.FileName = \""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filename))+"\";\n"+"            p.StartInfo.WorkingDirectory = @\"bin\";\n"+"            p.StartInfo.Arguments = \"@release_java_modules.txt -m "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._targetmodule))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._packagename))+".main\";\n"+"            p.Start();\n"+"        }\n"+"    }\n"+"}"));
 //BA.debugLineNum = 272;BA.debugLine="If IconFile = \"\" Then";
if (true) break;

case 4:
//if
this.state = 9;
if ((parent._iconfile).equals("")) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 //BA.debugLineNum = 273;BA.debugLine="File.Copy(File.DirAssets, \"icon.ico\", TempFolde";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"icon.ico",parent._tempfolder,"icon.ico");
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 275;BA.debugLine="File.Copy(IconFile, \"\", TempFolder, \"icon.ico\")";
anywheresoftware.b4a.keywords.Common.File.Copy(parent._iconfile,"",parent._tempfolder,"icon.ico");
 if (true) break;

case 9:
//C
this.state = 12;
;
 //BA.debugLineNum = 277;BA.debugLine="Wait For (RunShell(True, NetFrameworkCSC , Array";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _runshell(anywheresoftware.b4a.keywords.Common.True,parent._netframeworkcsc,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(("/target:"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_target))+"")),(Object)("/win32icon:icon.ico"),(Object)(("/out:build\\"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_output))+"")),(Object)("runner.cs")})));
this.state = 13;
return;
case 13:
//C
this.state = 12;
_output = (String) result[0];
;
 //BA.debugLineNum = 278;BA.debugLine="File.WriteString(TempFolder, \"build\\run_debug.ba";
anywheresoftware.b4a.keywords.Common.File.WriteString(parent._tempfolder,"build\\run_debug.bat",("\n"+"	cd bin\n"+"java.exe @release_java_modules.txt -m "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._targetmodule))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._packagename))+".main\n"+"pause\n"+""));
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 284;BA.debugLine="File.WriteString(TempFolder, \"build/run.command\"";
anywheresoftware.b4a.keywords.Common.File.WriteString(parent._tempfolder,"build/run.command",("#!/bin/bash\n"+"cd -- \""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)("$"))+"(dirname -- \""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)("$"))+"BASH_SOURCE\")\"\n"+"cd bin\n"+"./java @release_java_modules.txt -m "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._targetmodule))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._packagename))+".main\n"+"exit 0\n"+" "));
 //BA.debugLineNum = 290;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 291;BA.debugLine="jo.InitializeNewInstance(\"java.io.File\", Array A";
_jo.InitializeNewInstance("java.io.File",(Object[])(new String[]{anywheresoftware.b4a.keywords.Common.File.Combine(parent._tempfolder,"build/run.command")}));
 //BA.debugLineNum = 292;BA.debugLine="jo.RunMethod(\"setExecutable\", Array As Object(Tr";
_jo.RunMethod("setExecutable",new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.True),(Object)(anywheresoftware.b4a.keywords.Common.False)});
 if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 294;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 //BA.debugLineNum = 295;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _complete(String _output) throws Exception{
}
public static String  _checkresult(boolean _success,int _exitcode,String _stdout,String _stderr) throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Private Sub CheckResult (Success As Boolean, ExitC";
 //BA.debugLineNum = 147;BA.debugLine="If Success = False Or ExitCode <> 0 Then";
if (_success==anywheresoftware.b4a.keywords.Common.False || _exitcode!=0) { 
 //BA.debugLineNum = 148;BA.debugLine="Log(StdOut)";
anywheresoftware.b4a.keywords.Common.Log(_stdout);
 //BA.debugLineNum = 149;BA.debugLine="Log(StdErr)";
anywheresoftware.b4a.keywords.Common.Log(_stderr);
 //BA.debugLineNum = 150;BA.debugLine="ExitApplication2(1)";
anywheresoftware.b4a.keywords.Common.ExitApplication2((int) (1));
 };
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _createmodulefile() throws Exception{
ResumableSub_CreateModuleFile rsub = new ResumableSub_CreateModuleFile(null);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CreateModuleFile extends BA.ResumableSub {
public ResumableSub_CreateModuleFile(b4j.example.main parent) {
this.parent = parent;
}
b4j.example.main parent;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
Object _module = null;
String _f = "";
anywheresoftware.b4a.objects.collections.List _args = null;
String _stdout = "";
String _output = "";
anywheresoftware.b4a.BA.IterableList group4;
int index4;
int groupLen4;
anywheresoftware.b4a.BA.IterableList group9;
int index9;
int groupLen9;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 192;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 193;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 194;BA.debugLine="sb.Append($\"module ${TargetModule} {\"$).Append(CR";
_sb.Append(("module "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._targetmodule))+" {")).Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 195;BA.debugLine="For Each Module In Modules";
if (true) break;

case 1:
//for
this.state = 4;
group4 = parent._modules;
index4 = 0;
groupLen4 = group4.getSize();
this.state = 13;
if (true) break;

case 13:
//C
this.state = 4;
if (index4 < groupLen4) {
this.state = 3;
_module = group4.Get(index4);}
if (true) break;

case 14:
//C
this.state = 13;
index4++;
if (true) break;

case 3:
//C
this.state = 14;
 //BA.debugLineNum = 196;BA.debugLine="sb.Append(\"requires \").Append(Module).Append(\";\"";
_sb.Append("requires ").Append(BA.ObjectToString(_module)).Append(";").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 198;BA.debugLine="sb.Append(\"exports \").Append(PackageName).Append(";
_sb.Append("exports ").Append(parent._packagename).Append(";").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 //BA.debugLineNum = 199;BA.debugLine="If File.Exists(TempFolder, ReplaceSlashes(\"META-I";
if (true) break;

case 5:
//if
this.state = 12;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent._tempfolder,_replaceslashes("META-INF\\services"))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 200;BA.debugLine="For Each f As String In File.ListFiles(File.Comb";
if (true) break;

case 8:
//for
this.state = 11;
group9 = anywheresoftware.b4a.keywords.Common.File.ListFiles(anywheresoftware.b4a.keywords.Common.File.Combine(parent._tempfolder,_replaceslashes("META-INF\\services")));
index9 = 0;
groupLen9 = group9.getSize();
this.state = 15;
if (true) break;

case 15:
//C
this.state = 11;
if (index9 < groupLen9) {
this.state = 10;
_f = BA.ObjectToString(group9.Get(index9));}
if (true) break;

case 16:
//C
this.state = 15;
index9++;
if (true) break;

case 10:
//C
this.state = 16;
 //BA.debugLineNum = 201;BA.debugLine="sb.Append(\"uses \").Append(f).Append(\";\").Append";
_sb.Append("uses ").Append(_f).Append(";").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 204;BA.debugLine="sb.Append(\"}\")";
_sb.Append("}");
 //BA.debugLineNum = 205;BA.debugLine="File.WriteString(TempFolder, \"module-info.java\",";
anywheresoftware.b4a.keywords.Common.File.WriteString(parent._tempfolder,"module-info.java",_sb.ToString());
 //BA.debugLineNum = 206;BA.debugLine="Dim args As List = Array($\"--patch-module\"$, $\"${";
_args = new anywheresoftware.b4a.objects.collections.List();
_args = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(("--patch-module")),(Object)((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._targetmodule))+"=jar.jar")),(Object)("-p"),(Object)(_q(parent._javafxlibs)),(Object)("module-info.java")});
 //BA.debugLineNum = 207;BA.debugLine="Wait For (RunShell(False, \"javac\", args)) Complet";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _runshell(anywheresoftware.b4a.keywords.Common.False,"javac",_args));
this.state = 17;
return;
case 17:
//C
this.state = -1;
_stdout = (String) result[0];
;
 //BA.debugLineNum = 208;BA.debugLine="Wait For (RunShell(False, \"jar\", Array(\"-uf\", \"ja";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _runshell(anywheresoftware.b4a.keywords.Common.False,"jar",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("-uf"),(Object)("jar.jar"),(Object)("module-info.class")})));
this.state = 18;
return;
case 18:
//C
this.state = -1;
_output = (String) result[0];
;
 //BA.debugLineNum = 209;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _deletefolderrecursive(String _folder) throws Exception{
String _f = "";
 //BA.debugLineNum = 229;BA.debugLine="Sub DeleteFolderRecursive(Folder As String)";
 //BA.debugLineNum = 230;BA.debugLine="For Each f As String In File.ListFiles(Folder)";
{
final anywheresoftware.b4a.BA.IterableList group1 = anywheresoftware.b4a.keywords.Common.File.ListFiles(_folder);
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_f = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 231;BA.debugLine="If File.IsDirectory(Folder, f) Then";
if (anywheresoftware.b4a.keywords.Common.File.IsDirectory(_folder,_f)) { 
 //BA.debugLineNum = 232;BA.debugLine="DeleteFolderRecursive (File.Combine(Folder, f))";
_deletefolderrecursive(anywheresoftware.b4a.keywords.Common.File.Combine(_folder,_f));
 };
 //BA.debugLineNum = 234;BA.debugLine="File.Delete(Folder, f)";
anywheresoftware.b4a.keywords.Common.File.Delete(_folder,_f);
 }
};
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return "";
}
public static String  _detectos() throws Exception{
String _os = "";
 //BA.debugLineNum = 320;BA.debugLine="Sub DetectOS As String";
 //BA.debugLineNum = 321;BA.debugLine="Dim os As String = GetSystemProperty(\"os.name\", \"";
_os = anywheresoftware.b4a.keywords.Common.GetSystemProperty("os.name","").toLowerCase();
 //BA.debugLineNum = 322;BA.debugLine="If os.Contains(\"win\") Then";
if (_os.contains("win")) { 
 //BA.debugLineNum = 323;BA.debugLine="Return \"windows\"";
if (true) return "windows";
 }else if(_os.contains("mac")) { 
 //BA.debugLineNum = 325;BA.debugLine="Return \"mac\"";
if (true) return "mac";
 }else {
 //BA.debugLineNum = 327;BA.debugLine="Return \"linux\"";
if (true) return "linux";
 };
 //BA.debugLineNum = 329;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _findpackagename() throws Exception{
ResumableSub_FindPackageName rsub = new ResumableSub_FindPackageName(null);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_FindPackageName extends BA.ResumableSub {
public ResumableSub_FindPackageName(b4j.example.main parent) {
this.parent = parent;
}
b4j.example.main parent;
String _stdout = "";
String _s = "";
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
 //BA.debugLineNum = 129;BA.debugLine="Wait For (RunShell(False, \"jar\", Array(\"xf\", \"jar";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _runshell(anywheresoftware.b4a.keywords.Common.False,"jar",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("xf"),(Object)("jar.jar"),(Object)("META-INF")})));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_stdout = (String) result[0];
;
 //BA.debugLineNum = 130;BA.debugLine="Dim s As String = File.ReadString(TempFolder, \"ME";
_s = anywheresoftware.b4a.keywords.Common.File.ReadString(parent._tempfolder,"META-INF/MANIFEST.MF");
 //BA.debugLineNum = 131;BA.debugLine="Dim m As Matcher = Regex.Matcher2($\"^JavaFX-Appli";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = anywheresoftware.b4a.keywords.Common.Regex.Matcher2(("^JavaFX-Application-Class:\\s+(.*)\\.main$"),anywheresoftware.b4a.keywords.Common.Regex.MULTILINE,_s);
 //BA.debugLineNum = 132;BA.debugLine="m.Find";
_m.Find();
 //BA.debugLineNum = 133;BA.debugLine="PackageName = m.Group(1)";
parent._packagename = _m.Group((int) (1));
 //BA.debugLineNum = 134;BA.debugLine="Log($\"Package name: ${PackageName}\"$)";
anywheresoftware.b4a.keywords.Common.Log(("Package name: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._packagename))+""));
 //BA.debugLineNum = 135;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _findrequiredmodules() throws Exception{
ResumableSub_FindRequiredModules rsub = new ResumableSub_FindRequiredModules(null);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_FindRequiredModules extends BA.ResumableSub {
public ResumableSub_FindRequiredModules(b4j.example.main parent) {
this.parent = parent;
}
b4j.example.main parent;
String _output = "";
anywheresoftware.b4a.objects.collections.Map _set = null;
String _module = "";
String _line = "";
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
anywheresoftware.b4a.BA.IterableList group4;
int index4;
int groupLen4;
String[] group7;
int index7;
int groupLen7;
anywheresoftware.b4a.BA.IterableList group16;
int index16;
int groupLen16;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 168;BA.debugLine="Wait For (RunShell(False, \"jdeps\", Array(\"--modul";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _runshell(anywheresoftware.b4a.keywords.Common.False,"jdeps",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("--module-path"),(Object)(_q(parent._javafxlibs)),(Object)("-s"),(Object)("jar.jar")})));
this.state = 22;
return;
case 22:
//C
this.state = 1;
_output = (String) result[0];
;
 //BA.debugLineNum = 169;BA.debugLine="Dim set As Map";
_set = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 170;BA.debugLine="set.Initialize";
_set.Initialize();
 //BA.debugLineNum = 171;BA.debugLine="For Each module As String In IncludedModules";
if (true) break;

case 1:
//for
this.state = 4;
group4 = parent._includedmodules;
index4 = 0;
groupLen4 = group4.getSize();
this.state = 23;
if (true) break;

case 23:
//C
this.state = 4;
if (index4 < groupLen4) {
this.state = 3;
_module = BA.ObjectToString(group4.Get(index4));}
if (true) break;

case 24:
//C
this.state = 23;
index4++;
if (true) break;

case 3:
//C
this.state = 24;
 //BA.debugLineNum = 172;BA.debugLine="set.Put(module, \"\")";
_set.Put((Object)(_module),(Object)(""));
 if (true) break;
if (true) break;
;
 //BA.debugLineNum = 174;BA.debugLine="For Each line As String In Regex.Split(\"[\\r\\n]+\",";

case 4:
//for
this.state = 17;
group7 = anywheresoftware.b4a.keywords.Common.Regex.Split("[\\r\\n]+",_output);
index7 = 0;
groupLen7 = group7.length;
this.state = 25;
if (true) break;

case 25:
//C
this.state = 17;
if (index7 < groupLen7) {
this.state = 6;
_line = group7[index7];}
if (true) break;

case 26:
//C
this.state = 25;
index7++;
if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 175;BA.debugLine="Dim m As Matcher = Regex.Matcher(\"->\\s+([a-zA-Z0";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = anywheresoftware.b4a.keywords.Common.Regex.Matcher("->\\s+([a-zA-Z0-9_\\-\\.]+)$",_line);
 //BA.debugLineNum = 176;BA.debugLine="If m.Find Then";
if (true) break;

case 7:
//if
this.state = 16;
if (_m.Find()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 177;BA.debugLine="Dim module As String = m.Group(1)";
_module = _m.Group((int) (1));
 //BA.debugLineNum = 178;BA.debugLine="If ExcludedModules.IndexOf(module) > -1 Then Co";
if (true) break;

case 10:
//if
this.state = 15;
if (parent._excludedmodules.IndexOf((Object)(_module))>-1) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
this.state = 26;
if (true) break;;
if (true) break;

case 15:
//C
this.state = 16;
;
 //BA.debugLineNum = 179;BA.debugLine="set.Put(module, \"\")";
_set.Put((Object)(_module),(Object)(""));
 if (true) break;

case 16:
//C
this.state = 26;
;
 if (true) break;
if (true) break;

case 17:
//C
this.state = 18;
;
 //BA.debugLineNum = 182;BA.debugLine="Modules.Initialize";
parent._modules.Initialize();
 //BA.debugLineNum = 183;BA.debugLine="For Each module As String In set.Keys";
if (true) break;

case 18:
//for
this.state = 21;
group16 = _set.Keys();
index16 = 0;
groupLen16 = group16.getSize();
this.state = 27;
if (true) break;

case 27:
//C
this.state = 21;
if (index16 < groupLen16) {
this.state = 20;
_module = BA.ObjectToString(group16.Get(index16));}
if (true) break;

case 28:
//C
this.state = 27;
index16++;
if (true) break;

case 20:
//C
this.state = 28;
 //BA.debugLineNum = 184;BA.debugLine="Modules.Add(module)";
parent._modules.Add((Object)(_module));
 if (true) break;
if (true) break;

case 21:
//C
this.state = -1;
;
 //BA.debugLineNum = 186;BA.debugLine="Log($\"Explicitly excluded modules: ${ExcludedModu";
anywheresoftware.b4a.keywords.Common.Log(("Explicitly excluded modules: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._excludedmodules.getObject()))+""));
 //BA.debugLineNum = 187;BA.debugLine="Log($\"Included modules: ${Modules}\"$)";
anywheresoftware.b4a.keywords.Common.Log(("Included modules: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._modules.getObject()))+""));
 //BA.debugLineNum = 188;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _guid() throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _stp = 0;
int _n = 0;
 //BA.debugLineNum = 297;BA.debugLine="Sub GUID As String";
 //BA.debugLineNum = 298;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 299;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 300;BA.debugLine="For Each stp As Int In Array(8, 4, 4, 4, 12)";
{
final Object[] group3 = new Object[]{(Object)(8),(Object)(4),(Object)(4),(Object)(4),(Object)(12)};
final int groupLen3 = group3.length
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_stp = (int)(BA.ObjectToNumber(group3[index3]));
 //BA.debugLineNum = 301;BA.debugLine="If sb.Length > 0 Then sb.Append(\"-\")";
if (_sb.getLength()>0) { 
_sb.Append("-");};
 //BA.debugLineNum = 302;BA.debugLine="For n = 1 To stp";
{
final int step5 = 1;
final int limit5 = _stp;
_n = (int) (1) ;
for (;_n <= limit5 ;_n = _n + step5 ) {
 //BA.debugLineNum = 303;BA.debugLine="sb.Append(Bit.ToHexString(Rnd(0, 16)).ToUpperCa";
_sb.Append(anywheresoftware.b4a.keywords.Common.Bit.ToHexString(anywheresoftware.b4a.keywords.Common.Rnd((int) (0),(int) (16))).toUpperCase());
 }
};
 }
};
 //BA.debugLineNum = 306;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _jlink() throws Exception{
ResumableSub_Jlink rsub = new ResumableSub_Jlink(null);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Jlink extends BA.ResumableSub {
public ResumableSub_Jlink(b4j.example.main parent) {
this.parent = parent;
}
b4j.example.main parent;
String _modulepath = "";
String _output = "";
String _r = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 215;BA.debugLine="File.WriteString(TempFolder, \"jlinkargs.txt\", $\"-";
anywheresoftware.b4a.keywords.Common.File.WriteString(parent._tempfolder,"jlinkargs.txt",("--add-modules "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_modulestostring()))+""));
 //BA.debugLineNum = 218;BA.debugLine="Dim modulepath As String = $\"${JavafxJmods};jar.j";
_modulepath = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._javafxjmods))+";jar.jar");
 //BA.debugLineNum = 219;BA.debugLine="If Windows = False Then modulepath = modulepath.R";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._windows==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
_modulepath = _modulepath.replace(";",":");
if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 220;BA.debugLine="Wait For (RunShell(False, \"jlink\", Array(\"--compr";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _runshell(anywheresoftware.b4a.keywords.Common.False,"jlink",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("--compress=2"),(Object)("--no-header-files"),(Object)("--strip-debug"),(Object)("--module-path"),(Object)(_modulepath),(Object)("--output"),(Object)("build"),(Object)("@jlinkargs.txt")})));
this.state = 7;
return;
case 7:
//C
this.state = -1;
_output = (String) result[0];
;
 //BA.debugLineNum = 222;BA.debugLine="Dim r As String = File.ReadString(File.DirAssets,";
_r = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"release_java_modules.txt");
 //BA.debugLineNum = 223;BA.debugLine="r = r.Replace(\"ALL-UNNAMED\", TargetModule)";
_r = _r.replace("ALL-UNNAMED",parent._targetmodule);
 //BA.debugLineNum = 224;BA.debugLine="r = r & \" --add-modules=\" & ModulesToString";
_r = _r+" --add-modules="+_modulestostring();
 //BA.debugLineNum = 225;BA.debugLine="File.WriteString(TempFolder, ReplaceSlashes(\"buil";
anywheresoftware.b4a.keywords.Common.File.WriteString(parent._tempfolder,_replaceslashes("build\\bin\\release_java_modules.txt"),_r);
 //BA.debugLineNum = 226;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _modulestostring() throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _m = "";
 //BA.debugLineNum = 238;BA.debugLine="Private Sub ModulesToString As String";
 //BA.debugLineNum = 239;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 240;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 241;BA.debugLine="sb.Append(TargetModule)";
_sb.Append(_targetmodule);
 //BA.debugLineNum = 242;BA.debugLine="For Each m As String In Modules";
{
final anywheresoftware.b4a.BA.IterableList group4 = _modules;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_m = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 243;BA.debugLine="sb.Append(\",\").Append(m)";
_sb.Append(",").Append(_m);
 }
};
 //BA.debugLineNum = 245;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _openexplorer() throws Exception{
ResumableSub_OpenExplorer rsub = new ResumableSub_OpenExplorer(null);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_OpenExplorer extends BA.ResumableSub {
public ResumableSub_OpenExplorer(b4j.example.main parent) {
this.parent = parent;
}
b4j.example.main parent;
String _output = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 310;BA.debugLine="If Windows Then";
if (true) break;

case 1:
//if
this.state = 8;
if (parent._windows) { 
this.state = 3;
}else if(parent._mac) { 
this.state = 5;
}else {
this.state = 7;
}if (true) break;

case 3:
//C
this.state = 8;
 //BA.debugLineNum = 311;BA.debugLine="Wait For (RunShell(True, \"explorer.exe\", Array(\"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _runshell(anywheresoftware.b4a.keywords.Common.True,"explorer.exe",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("/select"),(Object)(","),(Object)(_q(anywheresoftware.b4a.keywords.Common.File.Combine(parent._tempfolder,"build\\run.exe")))})));
this.state = 9;
return;
case 9:
//C
this.state = 8;
_output = (String) result[0];
;
 if (true) break;

case 5:
//C
this.state = 8;
 //BA.debugLineNum = 313;BA.debugLine="Wait For (RunShell(True, \"open\", Array(File.Comb";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _runshell(anywheresoftware.b4a.keywords.Common.True,"open",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.File.Combine(parent._tempfolder,"build"))})));
this.state = 10;
return;
case 10:
//C
this.state = 8;
_output = (String) result[0];
;
 if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 315;BA.debugLine="Log($\"Build folder: ${File.Combine(TempFolder, \"";
anywheresoftware.b4a.keywords.Common.Log(("Build folder: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.File.Combine(parent._tempfolder,"build")))+""));
 if (true) break;

case 8:
//C
this.state = -1;
;
 //BA.debugLineNum = 317;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _parseinput(String _filename) throws Exception{
anywheresoftware.b4j.objects.collections.JSONParser _p = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 58;BA.debugLine="Private Sub ParseInput (FileName As String)";
 //BA.debugLineNum = 59;BA.debugLine="Dim p As JSONParser";
_p = new anywheresoftware.b4j.objects.collections.JSONParser();
 //BA.debugLineNum = 60;BA.debugLine="p.Initialize(File.ReadString(\"\", FileName))";
_p.Initialize(anywheresoftware.b4a.keywords.Common.File.ReadString("",_filename));
 //BA.debugLineNum = 61;BA.debugLine="Dim m As Map = p.NextObject";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = _p.NextObject();
 //BA.debugLineNum = 62;BA.debugLine="InputJar = m.GetDefault(\"InputJar\", InputJar)";
_inputjar = BA.ObjectToString(_m.GetDefault((Object)("InputJar"),(Object)(_inputjar)));
 //BA.debugLineNum = 63;BA.debugLine="ExcludedModules = m.GetDefault(\"ExcludedModules\",";
_excludedmodules.setObject((java.util.List)(_m.GetDefault((Object)("ExcludedModules"),(Object)(_excludedmodules.getObject()))));
 //BA.debugLineNum = 64;BA.debugLine="IncludedModules = m.GetDefault(\"IncludedModules\",";
_includedmodules.setObject((java.util.List)(_m.GetDefault((Object)("IncludedModules"),(Object)(_includedmodules.getObject()))));
 //BA.debugLineNum = 65;BA.debugLine="IconFile = m.GetDefault(\"IconFile\", IconFile)";
_iconfile = BA.ObjectToString(_m.GetDefault((Object)("IconFile"),(Object)(_iconfile)));
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _preparefolders() throws Exception{
ResumableSub_PrepareFolders rsub = new ResumableSub_PrepareFolders(null);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PrepareFolders extends BA.ResumableSub {
public ResumableSub_PrepareFolders(b4j.example.main parent) {
this.parent = parent;
}
b4j.example.main parent;
String _output = "";
String _s = "";
String _f = "";
Object[] group24;
int index24;
int groupLen24;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 96;BA.debugLine="If InputJar = \"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((parent._inputjar).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 97;BA.debugLine="Log(\"InputJar not set\")";
anywheresoftware.b4a.keywords.Common.Log("InputJar not set");
 //BA.debugLineNum = 98;BA.debugLine="ExitApplication2(-1)";
anywheresoftware.b4a.keywords.Common.ExitApplication2((int) (-1));
 if (true) break;
;
 //BA.debugLineNum = 100;BA.debugLine="If File.Exists(TempFolder, \"\") Then";

case 4:
//if
this.state = 7;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent._tempfolder,"")) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 101;BA.debugLine="DeleteFolderRecursive(TempFolder)";
_deletefolderrecursive(parent._tempfolder);
 //BA.debugLineNum = 102;BA.debugLine="File.Delete(TempFolder, \"\")";
anywheresoftware.b4a.keywords.Common.File.Delete(parent._tempfolder,"");
 if (true) break;
;
 //BA.debugLineNum = 104;BA.debugLine="If File.Exists(TempFolder, \"\") Then";

case 7:
//if
this.state = 10;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent._tempfolder,"")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 105;BA.debugLine="Log(\"Failed to delete temp folder\")";
anywheresoftware.b4a.keywords.Common.Log("Failed to delete temp folder");
 //BA.debugLineNum = 106;BA.debugLine="ExitApplication2(1)";
anywheresoftware.b4a.keywords.Common.ExitApplication2((int) (1));
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 108;BA.debugLine="File.MakeDir(TempFolder, \"\")";
anywheresoftware.b4a.keywords.Common.File.MakeDir(parent._tempfolder,"");
 //BA.debugLineNum = 109;BA.debugLine="Log(\"InputJar: \" & InputJar)";
anywheresoftware.b4a.keywords.Common.Log("InputJar: "+parent._inputjar);
 //BA.debugLineNum = 110;BA.debugLine="File.Copy(InputJar, \"\", TempFolder, \"jar.jar\")";
anywheresoftware.b4a.keywords.Common.File.Copy(parent._inputjar,"",parent._tempfolder,"jar.jar");
 //BA.debugLineNum = 111;BA.debugLine="If Windows Then";
if (true) break;

case 11:
//if
this.state = 14;
if (parent._windows) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 112;BA.debugLine="File.Copy(File.DirAssets, \"FindDosPath.exe\", Tem";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"FindDosPath.exe",parent._tempfolder,"FindDosPath.exe");
 //BA.debugLineNum = 113;BA.debugLine="Wait For (RunShell(True, File.Combine(TempFolder";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _runshell(anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.File.Combine(parent._tempfolder,"FindDosPath.exe"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_q(parent._javafxjmods))})));
this.state = 22;
return;
case 22:
//C
this.state = 14;
_output = (String) result[0];
;
 //BA.debugLineNum = 114;BA.debugLine="JavafxJmods = Output.Trim";
parent._javafxjmods = _output.trim();
 //BA.debugLineNum = 115;BA.debugLine="Dim s As String = File.ReadString(File.DirAssets";
_s = anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"InstallerScript.iss");
 //BA.debugLineNum = 116;BA.debugLine="s = s.Replace(\"$GUID$\", GUID)";
_s = _s.replace("$GUID$",_guid());
 //BA.debugLineNum = 117;BA.debugLine="File.WriteString(TempFolder, \"InstallerScript-Te";
anywheresoftware.b4a.keywords.Common.File.WriteString(parent._tempfolder,"InstallerScript-Template.iss",_s);
 if (true) break;
;
 //BA.debugLineNum = 119;BA.debugLine="For Each f As String In Array(JavafxJmods, JavaFX";

case 14:
//for
this.state = 21;
group24 = new Object[]{(Object)(parent._javafxjmods),(Object)(parent._javafxlibs)};
index24 = 0;
groupLen24 = group24.length;
this.state = 23;
if (true) break;

case 23:
//C
this.state = 21;
if (index24 < groupLen24) {
this.state = 16;
_f = BA.ObjectToString(group24[index24]);}
if (true) break;

case 24:
//C
this.state = 23;
index24++;
if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 120;BA.debugLine="If File.Exists(f, \"\") = False Then";
if (true) break;

case 17:
//if
this.state = 20;
if (anywheresoftware.b4a.keywords.Common.File.Exists(_f,"")==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 121;BA.debugLine="Log($\"Folder not found: ${f}\"$)";
anywheresoftware.b4a.keywords.Common.Log(("Folder not found: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_f))+""));
 //BA.debugLineNum = 122;BA.debugLine="ExitApplication2(-1)";
anywheresoftware.b4a.keywords.Common.ExitApplication2((int) (-1));
 if (true) break;

case 20:
//C
this.state = 24;
;
 if (true) break;
if (true) break;

case 21:
//C
this.state = -1;
;
 //BA.debugLineNum = 125;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
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
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private InputJar As String = \"C:\\Users\\ccatanaoan";
_inputjar = "C:\\Users\\ccatanaoan\\Desktop\\IoT\\THAQ Monitor\\Objects\\CloydTHAQMonitor.jar";
 //BA.debugLineNum = 10;BA.debugLine="Private NetFrameworkCSC As String = \"C:\\Windows\\M";
_netframeworkcsc = "C:\\Windows\\Microsoft.NET\\Framework64\\v4.0.30319\\csc.exe";
 //BA.debugLineNum = 11;BA.debugLine="Private IconFile As String = \"C:\\Users\\ccatanaoan";
_iconfile = "C:\\Users\\ccatanaoan\\Desktop\\IoT\\THAQ Monitor\\Files\\home.ico";
 //BA.debugLineNum = 12;BA.debugLine="Private ExcludedModules As List";
_excludedmodules = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 14;BA.debugLine="Private IncludedModules As List";
_includedmodules = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 16;BA.debugLine="Private JavafxJmods As String";
_javafxjmods = "";
 //BA.debugLineNum = 17;BA.debugLine="Private java As String";
_java = "";
 //BA.debugLineNum = 18;BA.debugLine="Private PackageName As String";
_packagename = "";
 //BA.debugLineNum = 19;BA.debugLine="Private TempFolder As String";
_tempfolder = "";
 //BA.debugLineNum = 20;BA.debugLine="Private Modules As List";
_modules = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 21;BA.debugLine="Private TargetModule As String = \"b4j\"";
_targetmodule = "b4j";
 //BA.debugLineNum = 22;BA.debugLine="Private JavaFXLibs As String";
_javafxlibs = "";
 //BA.debugLineNum = 23;BA.debugLine="Private Version As Float = 1.01";
_version = (float) (1.01);
 //BA.debugLineNum = 24;BA.debugLine="Private Windows As Boolean";
_windows = false;
 //BA.debugLineNum = 25;BA.debugLine="Private Mac As Boolean";
_mac = false;
 //BA.debugLineNum = 26;BA.debugLine="Private Linux As Boolean 'ignore";
_linux = false;
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public static String  _q(String _s) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub Q(s As String) As String";
 //BA.debugLineNum = 139;BA.debugLine="If Windows Then";
if (_windows) { 
 //BA.debugLineNum = 140;BA.debugLine="Return QUOTE & s & QUOTE";
if (true) return anywheresoftware.b4a.keywords.Common.QUOTE+_s+anywheresoftware.b4a.keywords.Common.QUOTE;
 }else {
 //BA.debugLineNum = 142;BA.debugLine="Return s";
if (true) return _s;
 };
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public static String  _replaceslashes(String _s) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Private Sub ReplaceSlashes (s As String) As String";
 //BA.debugLineNum = 71;BA.debugLine="If Windows Then Return s";
if (_windows) { 
if (true) return _s;};
 //BA.debugLineNum = 72;BA.debugLine="Return s.Replace(\"\\\", \"/\")";
if (true) return _s.replace("\\","/");
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _runshell(boolean _absolutepath,String _executable,anywheresoftware.b4a.objects.collections.List _args) throws Exception{
ResumableSub_RunShell rsub = new ResumableSub_RunShell(null,_absolutepath,_executable,_args);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RunShell extends BA.ResumableSub {
public ResumableSub_RunShell(b4j.example.main parent,boolean _absolutepath,String _executable,anywheresoftware.b4a.objects.collections.List _args) {
this.parent = parent;
this._absolutepath = _absolutepath;
this._executable = _executable;
this._args = _args;
}
b4j.example.main parent;
boolean _absolutepath;
String _executable;
anywheresoftware.b4a.objects.collections.List _args;
anywheresoftware.b4j.objects.Shell _shl = null;
boolean _success = false;
int _exitcode = 0;
String _stdout = "";
String _stderr = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 155;BA.debugLine="Dim shl As Shell";
_shl = new anywheresoftware.b4j.objects.Shell();
 //BA.debugLineNum = 156;BA.debugLine="If AbsolutePath = False Then Executable = File.Co";
if (true) break;

case 1:
//if
this.state = 6;
if (_absolutepath==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
_executable = anywheresoftware.b4a.keywords.Common.File.Combine(parent._java,_executable);
if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 157;BA.debugLine="shl.InitializeDoNotHandleQuotes(\"shl\",Executable,";
_shl.InitializeDoNotHandleQuotes("shl",_executable,_args);
 //BA.debugLineNum = 158;BA.debugLine="shl.WorkingDirectory = TempFolder";
_shl.setWorkingDirectory(parent._tempfolder);
 //BA.debugLineNum = 159;BA.debugLine="Log($\"Running: ${Executable}\"$)";
anywheresoftware.b4a.keywords.Common.Log(("Running: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_executable))+""));
 //BA.debugLineNum = 160;BA.debugLine="shl.Run(-1)";
_shl.Run(ba,(long) (-1));
 //BA.debugLineNum = 161;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
anywheresoftware.b4a.keywords.Common.WaitFor("shl_processcompleted", ba, this, null);
this.state = 7;
return;
case 7:
//C
this.state = -1;
_success = (boolean) result[0];
_exitcode = (int) result[1];
_stdout = (String) result[2];
_stderr = (String) result[3];
;
 //BA.debugLineNum = 162;BA.debugLine="CheckResult(Success, ExitCode, StdOut, StdErr)";
_checkresult(_success,_exitcode,_stdout,_stderr);
 //BA.debugLineNum = 163;BA.debugLine="Return StdOut";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_stdout));return;};
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _shl_processcompleted(boolean _success,int _exitcode,String _stdout,String _stderr) throws Exception{
}
public static void  _start() throws Exception{
ResumableSub_Start rsub = new ResumableSub_Start(null);
rsub.resume(ba, null);
}
public static class ResumableSub_Start extends BA.ResumableSub {
public ResumableSub_Start(b4j.example.main parent) {
this.parent = parent;
}
b4j.example.main parent;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 84;BA.debugLine="Wait For (PrepareFolders) Complete (Success As Bo";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _preparefolders());
this.state = 1;
return;
case 1:
//C
this.state = -1;
_success = (boolean) result[0];
;
 //BA.debugLineNum = 85;BA.debugLine="Wait For (FindPackageName) Complete (Success As B";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _findpackagename());
this.state = 2;
return;
case 2:
//C
this.state = -1;
_success = (boolean) result[0];
;
 //BA.debugLineNum = 86;BA.debugLine="Wait For (FindRequiredModules) Complete (Success";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _findrequiredmodules());
this.state = 3;
return;
case 3:
//C
this.state = -1;
_success = (boolean) result[0];
;
 //BA.debugLineNum = 87;BA.debugLine="Wait For (CreateModuleFile) Complete (Success As";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _createmodulefile());
this.state = 4;
return;
case 4:
//C
this.state = -1;
_success = (boolean) result[0];
;
 //BA.debugLineNum = 88;BA.debugLine="Wait For (Jlink) Complete (Success As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _jlink());
this.state = 5;
return;
case 5:
//C
this.state = -1;
_success = (boolean) result[0];
;
 //BA.debugLineNum = 89;BA.debugLine="Wait For (BuildRunner) Complete (Success As Boole";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _buildrunner());
this.state = 6;
return;
case 6:
//C
this.state = -1;
_success = (boolean) result[0];
;
 //BA.debugLineNum = 90;BA.debugLine="Wait For (OpenExplorer) Complete (Success As Bool";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, this, _openexplorer());
this.state = 7;
return;
case 7:
//C
this.state = -1;
_success = (boolean) result[0];
;
 //BA.debugLineNum = 91;BA.debugLine="Log(\"Done!\")";
anywheresoftware.b4a.keywords.Common.Log("Done!");
 //BA.debugLineNum = 92;BA.debugLine="StopMessageLoop";
anywheresoftware.b4a.keywords.Common.StopMessageLoop(ba);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _tick() throws Exception{
ResumableSub_Tick rsub = new ResumableSub_Tick(null);
rsub.resume(ba, null);
}
public static class ResumableSub_Tick extends BA.ResumableSub {
public ResumableSub_Tick(b4j.example.main parent) {
this.parent = parent;
}
b4j.example.main parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 76;BA.debugLine="Do While True";
if (true) break;

case 1:
//do while
this.state = 4;
while (anywheresoftware.b4a.keywords.Common.True) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 1;
 //BA.debugLineNum = 77;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,this,(int) (1000));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
 //BA.debugLineNum = 78;BA.debugLine="Log(\".\")";
anywheresoftware.b4a.keywords.Common.Log(".");
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}
