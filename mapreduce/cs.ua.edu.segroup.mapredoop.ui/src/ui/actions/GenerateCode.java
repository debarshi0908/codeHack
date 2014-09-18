package ui.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import cs.ua.edu.se.MapRedoopStandaloneSetup;
import cs.ua.edu.se.mapRedoop.Content;
import cs.ua.edu.se.mapRedoop.Entity;
import cs.ua.edu.se.mapRedoop.Feature;
import cs.ua.edu.se.mapRedoop.ListofEntities;
import cs.ua.edu.se.mapRedoop.MapRedoop;


public class GenerateCode implements IObjectActionDelegate {

	private Shell shell;
	
	/**
	 * Constructor for Action1.
	 */
	public GenerateCode() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	private static MapRedoop  mapRedoop = null;
	public void run(IAction action) {
		if(currFile!=null){
			new MapRedoopStandaloneSetup().createInjectorAndDoEMFRegistration();
			ResourceSet rs = new ResourceSetImpl();
			Resource resource= rs.getResource(URI.createURI(currFile.getFullPath().toString()), true);
			
			 mapRedoop = (MapRedoop) resource.getContents().get(0);
			HelperHPDParser helper =  new HelperHPDParser(mapRedoop, currFile.getProject());
			helper.createClasses();
			 
			 String mainName =mapRedoop.getDeclaration().getName();
			 System.out.println(mainName);
			 EList<Content>  contents = mapRedoop.getContent();
			 for(Content content: contents){
			     ListofEntities entitieslist = content.getEntities();
			       for(Entity entity: entitieslist.getEntities()) {
			    	   for(Feature feature: entity.getFeatures()){
			    		   System.out.println("Entity=" + entity.getName() + " fieldName=" + feature.getName() +" type=" + feature.getType().getReferenced());
			    	   }
			       }
			 }

		}
		
	}

	IFile currFile = null;
	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			final IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			final Object object = structuredSelection.getFirstElement();
			if (object instanceof IFile) {
				currFile = (IFile) object;
		//		launch(mode);
			}
		}

	}

}
