package ui.launch;

import hdp.parser.MainParser;


import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.jdt.launching.JavaLaunchDelegate;

import ui.actions.ProjectSetUp;
import ui.commands.CommandProcessor;
import ui.refactoring.MapperRefactoring;
import ui.refactoring.ReducerRefactoring;


public class MRLaunchConfigurationDelegate extends JavaLaunchDelegate {

	private ILaunchConfiguration configuration=null;
	@Override
	public void launch(final ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
        this.configuration= configuration;
       ProjectSetUp projectSetUp = new ProjectSetUp(new Path(getFileName()).lastSegment(), getHadoopPath());
       MainParser parser = new MainParser(getFileName());
       new MapperRefactoring(projectSetUp.getMapper_cu(),parser.getMapCode()).refactor();
       String code = parser.getRed2Code();
       
       new ReducerRefactoring(projectSetUp.getReducer_cu(),parser.getRed1Code(), code).refactor();
       
       String[] args = getFileName().replaceAll(".hdp", "").split("/"); 
       
         new CommandProcessor(args[args.length-1], getHadoopPath(),getInputFileName(), getOutputFileName()); 
      
   }




	private String getFileName() {
	      try {
			return configuration.getAttribute(IMRLaunchConfigurationConstants.MR_FILE_NAME, "");
		} catch (CoreException e) {
			e.printStackTrace();
		}
		throw new RuntimeException("File doesn't exist");
	}


	private String getHadoopPath() {
	      try {
			return configuration.getAttribute(IMRLaunchConfigurationConstants.HADOOP_DISTRIBUTION, "");
		} catch (CoreException e) {
			e.printStackTrace();
		}
		throw new RuntimeException("File doesn't exist");
	}
	private String getInputFileName() {
	      try {
			return configuration.getAttribute(IMRLaunchConfigurationConstants.HADOOP_INPUT_FILE, "");
		} catch (CoreException e) {
			e.printStackTrace();
		}
		throw new RuntimeException("File doesn't exist");
	}
	private String getOutputFileName() {
	      try {
			return configuration.getAttribute(IMRLaunchConfigurationConstants.HADOOP_OUTPUT_FILE, "");
		} catch (CoreException e) {
			e.printStackTrace();
		}
		throw new RuntimeException("File doesn't exist");
	}
}
