package ui.commands;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;

import ui.launch.IMRLaunchConfigurationConstants;

public class CommandProcessor {
	
	String programName,hadoopPath, inputFileName, outputFileName;
	public CommandProcessor() {
		executeCommands();
	}
	
	public CommandProcessor(String programName, String hadoopPath,
			String inputFileName, String outputFileName) {
		this.hadoopPath= hadoopPath;
		this.programName=programName;
		this.inputFileName=inputFileName;
		this.outputFileName=outputFileName;
		executeCommands();
		
	}

	private void executeCommands() {
		try {
			
			String scriptPath = "/home/ferosh/research/cloud/scripts/mapredoop.sh";
			ProcessBuilder pb = new ProcessBuilder("sh", scriptPath, programName,hadoopPath, inputFileName, outputFileName);
		//	ProcessBuilder pb = new ProcessBuilder("ssh","-i","/home/ferosh/.ec2/id_rsa-gsg-keypair","root@ec2-50-16-160-158.compute-1.amazonaws.com","'/usr/local/hadoop-0.19.0/bin/hadoop dfs -ls'");
			//pb.command(new String[]{binpath+ "/src/contrib/ec2/bin/hadoop-ec2","launch-cluster", "segroup", "2"});
			Process p = pb.start();
			String line ="";
			MessageConsole myConsole = findConsole("MRRconsole");
			OutputStream outputStream = myConsole.newOutputStream();
		      BufferedReader input =
		          new BufferedReader
		            (new InputStreamReader(p.getInputStream()));
		      BufferedReader out =
		          new BufferedReader
		            (new InputStreamReader(p.getInputStream()));
		     
		      BufferedReader error =
		          new BufferedReader
		            (new InputStreamReader(p.getErrorStream()));
		      outputStream.write("Starting..".getBytes());
		        while (((line = input.readLine()) != null)||((line = error.readLine()) != null)) {
		          outputStream.write(("\n"+line).getBytes());
		         // if(myConsole.getInputStream()!=null) myConsole.geto
		        }
		        input.close();
		        error.close();
			outputStream.write("\ndone".getBytes());
			outputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (name.equals(existing[i].getName())) {
				conMan.showConsoleView(existing[i]);
				return (MessageConsole) existing[i];
			}
		// no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[] { myConsole });
		conMan.showConsoleView(myConsole);
		return myConsole;
	}
}
