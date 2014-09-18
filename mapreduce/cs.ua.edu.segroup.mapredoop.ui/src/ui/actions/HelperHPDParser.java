package ui.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

import utils.FileUtils;
import cs.ua.edu.se.mapRedoop.Argument;
import cs.ua.edu.se.mapRedoop.Content;
import cs.ua.edu.se.mapRedoop.Entity;
import cs.ua.edu.se.mapRedoop.Feature;
import cs.ua.edu.se.mapRedoop.ListofEntities;
import cs.ua.edu.se.mapRedoop.MRBlock;
import cs.ua.edu.se.mapRedoop.MapRedoop;
import cs.ua.edu.se.mapRedoop.Type;

public class HelperHPDParser {

	private MapRedoop mapRedoop = null;
	private IProject project =null;
	public HelperHPDParser(MapRedoop mapRedoop, IProject iProject) {
		this.mapRedoop = mapRedoop;
		this.project =  iProject;
	}
	public void createClasses() {
		
		 updateClassPaths();	
		 for(Content content: mapRedoop.getContent()){
		     ListofEntities entitieslist = content.getEntities();
		       for(Entity entity: entitieslist.getEntities()) {
		    	   
		    	   List<CodeGenerateHelper.Field> fields = new ArrayList<CodeGenerateHelper.Field>();
		    	   CodeGenerateHelper codeGenerateHelper =  getCodeGenerator(entity.getName());
		    	   for(Feature feature: entity.getFeatures()){
		    		 fields.add(  codeGenerateHelper.new Field(feature.getName(), getFieldType(feature.getType().getReferenced())));
		    	   }
		    	   String classString =  codeGenerateHelper.createClass("hadoop.ds", entity.getName(), fields);
		    	   FileUtils.writeToFile("ds", entity.getName()+".java", classString, project);
		       }
		 }
	

		
	}
	private void updateClassPaths() {
	
		try {
			 IJavaProject javaProject =JavaCore.create(project);
			IClasspathEntry[] entries = javaProject.getRawClasspath();
			IClasspathEntry[] newentries = new IClasspathEntry[entries.length+1];
			for(int i=0; i< entries.length;i++){
				IClasspathEntry entry = entries[i];
				if( entry.getPath().toOSString().contains("hadoop-")) return ;
				newentries[i] = entries[i];
			}
			IClasspathEntry libraryEntry = JavaCore.newLibraryEntry(new Path("/home/ferosh/research/cloud/hadoop-0.20.2/hadoop-0.20.2-core.jar"), null, null, false);
			newentries[entries.length]= libraryEntry;
			javaProject.setRawClasspath(newentries, null);
			
			
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private CodeGenerateHelper getCodeGenerator(String name) {
		if(key(name)) 
		return new MRCodeGenerateHelper();
		else return new CodeGenerateHelper();
	}
	private boolean key(String name) {
		for(Content content: mapRedoop.getContent()){
                MRBlock block = content.getMrBlocks();
                if(block==null) continue;
                String fieldType  = getArgumentType( block.getMapper().getInkey());
                if(fieldType.equals(name))
                	return true;
                 fieldType  = getArgumentType( block.getMapper().getInkey());
                if(fieldType.equals(name))
                	return true;
                fieldType  = getArgumentType( block.getMapper().getOutkey());
                if(fieldType.equals(name))
                	return true;
                fieldType  = getArgumentType( block.getMapper().getInvalue());
                if(fieldType.equals(name))
                	return true;
                fieldType  = getArgumentType( block.getMapper().getOutvalue());
                if(fieldType.equals(name))
                	return true;
                fieldType  = getArgumentType( block.getReducer().getOutkey());
                if(fieldType.equals(name))
                	return true;
                fieldType  = getArgumentType( block.getReducer().getOutvalue());
                if(fieldType.equals(name))
                	return true;
                
		}
		return false;
	}
	private String  getFieldType(Type type) {
		if( type.getName()==null)
			return type.getType();
		else return type.getName();
	}
	private String  getArgumentType(Argument arg) {
		Type type = arg.getType();
		if( type.getName()==null)
			return type.getType();
		else return type.getName();
	}
	
   
	

}
