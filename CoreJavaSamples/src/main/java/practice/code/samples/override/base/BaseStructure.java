package practice.code.samples.override.base;

public class BaseStructure {
	
	private Object[] fields;
	
	protected BaseStructure() {
		System.out.println("BaseStructure Test");
	}
	
	protected Object getFields(int fieldId){
		return fields[fieldId];
	}

}
