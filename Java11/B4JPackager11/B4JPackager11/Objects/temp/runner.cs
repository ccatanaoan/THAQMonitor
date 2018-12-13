
	
using System;
using System.Diagnostics;
namespace B4JRunner
{
    class Program
    {
        static void Main(string[] args)
        {
            Process p = new Process();
            p.StartInfo.FileName = "javaw.exe";
            p.StartInfo.WorkingDirectory = @"bin";
            p.StartInfo.Arguments = "@release_java_modules.txt -m b4j/cloyd.thaq.monitor.main";
            p.Start();
        }
    }
}