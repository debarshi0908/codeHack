package hdp.parser;


public class MainParser  {
	//private MDP mdp =null;
	public MainParser(String fileName) {
	getMapRedoop(fileName);
   }
	private void getMapRedoop(String fileName) {
		
		/*IFile file = FileBuffers.getWorkspaceFileAtLocation(new Path(fileName));
		String newFileName = file.getName().replaceAll(".hdp", ".tmp");
		FileUtils.copyToFile(file, null, newFileName);
		new MDPStandaloneSetup().createInjectorAndDoEMFRegistration();
		ResourceSet rs = new ResourceSetImpl();
		Resource resource= rs.getResource(URI.createURI("/JavaUtils/"+newFileName), true);
		 mdp = (MDP) resource.getContents().get(0);*/
	}
	public String getMapCode() {
		return null;// mdp.getMap().getMapCode();
	}
	public String getRed1Code() {
		return null;//mdp.getRed().getCodeFor();
	}
	public String getRed2Code() {
		return null;//mdp.getRed().getCodeRest();
	}
	

}
