
	
using System;
using System.Diagnostics;
using System.Text;
using System.Text.RegularExpressions;
using System.IO;
namespace B4JRunner
{
    class Program
    {
        static void Main(string[] args)
        {
            Process p = new Process();
            p.StartInfo.FileName = "CloydTHAQMonitor.exe";
            p.StartInfo.WorkingDirectory = Path.Combine(System.AppDomain.CurrentDomain.BaseDirectory, "bin");
            p.StartInfo.Arguments = "@release_java_modules.txt  -m b4j/cloyd.thaq.monitor.main";
			p.StartInfo.UseShellExecute = true;
			foreach (string a in args)
				p.StartInfo.Arguments += " " + "\"" + Regex.Replace(a, @"(\\+)$", @"$1$1") + "\"";
            p.Start();
        }
    }
}