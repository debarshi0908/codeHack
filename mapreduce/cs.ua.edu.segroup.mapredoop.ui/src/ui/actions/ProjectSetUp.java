package ui.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.LibraryLocation;

import cs.ua.edu.se.ui.internal.MapRedoopActivator;

import utils.FileUtils;


public class ProjectSetUp {
	private ICompilationUnit mapper_cu= null;
	private ICompilationUnit reducer_cu =null;
	private ICompilationUnit main_cu =null;
	
	public ProjectSetUp(String fileName, String hadoopPath) {
	     try {
			createProject(fileName, hadoopPath);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void createProject(String fileName, String hadoopPath) throws CoreException {
		String name = fileName.replaceAll("\\.","").replace("hdp", "");
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		String projectName = "JavaUtils";
		IProject project = root.getProject(projectName);
		IJavaProject javaProject = null;
		if(!project.exists()){
			project.create(null);
			project.open(null);
			IProjectDescription description = project.getDescription();
			description.setNatureIds(new String[] { JavaCore.NATURE_ID });
			project.setDescription(description, null);
			javaProject = JavaCore.create(project);
			IFolder binFolder = project.getFolder("bin");
			binFolder.create(false, true, null);
			javaProject.setOutputLocation(binFolder.getFullPath(), null);
			IFolder sourceFolder = project.getFolder("src");
			sourceFolder.create(false, true, null);
			List<IClasspathEntry> entries = new ArrayList<IClasspathEntry>();
			IVMInstall vmInstall = JavaRuntime.getDefaultVMInstall();
			LibraryLocation[] locations = JavaRuntime.getLibraryLocations(vmInstall);
			for (LibraryLocation element : locations) {
			 entries.add(JavaCore.newLibraryEntry(element.getSystemLibraryPath(), null, null));
			} 
			//add libs to project class path
			javaProject.setRawClasspath(entries.toArray(new IClasspathEntry[entries.size()]), null);
			IClasspathEntry srcEntry = JavaCore.newSourceEntry(new Path("/"+projectName+"/src"));
			IClasspathEntry containerEntry = JavaCore.newContainerEntry(new Path(
			        JavaRuntime.JRE_CONTAINER));
			
			IClasspathEntry libraryEntry = JavaCore.newLibraryEntry(new Path("/home/ferosh/research/cloud/hadoop-0.19.0"+"/hadoop-0.19.0-core.jar"), null, null, false);
			 
			javaProject.setRawClasspath(new IClasspathEntry[] { containerEntry, srcEntry, libraryEntry},
			        null);

		}
		else {
			
		javaProject = JavaCore.create(project);
		}
	    IFile file = FileUtils.writeToFile(name, "Main.java", "package hadoop."+ name + ";\n" +ITemplate.imports+ITemplate.mainpart);
	    IFile mapper = FileUtils.writeToFile(name, "MapperImpl.java", "package hadoop."+ name + ";\n"  +ITemplate.imports+ITemplate.mapperpart);
	    IFile reducer = FileUtils.writeToFile(name, "ReducerImpl.java", "package hadoop."+ name  +";\n" +ITemplate.imports +ITemplate.reducerpart);
	    IFile driver = FileUtils.writeToFile(name, "Driver.java", "package hadoop."+ name  +";\n" +ITemplate.driverClass);
        setMain_cu(JavaCore.createCompilationUnitFrom(file));
        setMapper_cu( JavaCore.createCompilationUnitFrom(mapper));
        setReducer_cu(JavaCore.createCompilationUnitFrom(reducer));
        }
             
		
	public void setMapper_cu(ICompilationUnit mapper_cu) {
		this.mapper_cu = mapper_cu;
	}

	public ICompilationUnit getMapper_cu() {
		return mapper_cu;
	}

	public void setReducer_cu(ICompilationUnit reducer_cu) {
		this.reducer_cu = reducer_cu;
	}

	public ICompilationUnit getReducer_cu() {
		return reducer_cu;
	}

	public void setMain_cu(ICompilationUnit main_cu) {
		this.main_cu = main_cu;
	}

	public ICompilationUnit getMain_cu() {
		return main_cu;
	}


}
