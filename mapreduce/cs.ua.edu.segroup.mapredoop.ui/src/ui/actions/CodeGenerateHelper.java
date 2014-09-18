package ui.actions;

import java.util.List;

public class CodeGenerateHelper {
	
	protected List<CodeGenerateHelper.Field> fields = null;
    protected String className =null;
		
	
	public String createClass (String packageName, String className, List<CodeGenerateHelper.Field> fields){
		this.fields = fields;
		this.className = className;
		StringBuffer buffer = new  StringBuffer(getpackageDeclaration(packageName));
		buffer.append(getClassDeclaration(className));
		for(CodeGenerateHelper.Field field: fields){
			buffer.append(getFieldDeclaration(field));
		}
		buffer.append(getEndClass());
		return buffer.toString();
	}
	private String getpackageDeclaration(String name){
		return "package "+name+";\n\n";
	}
	protected String getClassDeclaration(String name){
		return "public class "+name+" {\n\n";
	}
	private String getFieldDeclaration(CodeGenerateHelper.Field field){
		String name = field.getFieldName();
		String type = field.getFieldtype();
		return
		"	private "+type+" "+name+";\n"+
		"	public void set"+name+"("+type+" "+name+") {\n"+
		"		this."+name+" = "+name+";\n"+
		"	}\n"+
		"	public "+type+" get"+name+"() {\n"+
		"		return "+name+";\n"+
		"	}\n";

	}
	protected String getEndClass() {
		return "\n"+
		"}\n";
		
	}
	public class Field {
		private String fieldName;
		private String fieldtype;
		public void setFieldName(String fieldName) {
			this.fieldName = fieldName;
		}
		public String getFieldName() {
			return fieldName;
		}
		public Field(String fieldName, String fieldtype) {
			super();
			this.fieldName = fieldName;
			this.fieldtype = fieldtype;
		}
		public void setFieldtype(String fieldtype) {
			this.fieldtype = fieldtype;
		}
		public String getFieldtype() {
			return fieldtype;
		}
		
	}
}
