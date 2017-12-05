package practice.code.samples.override.child;

import practice.code.samples.override.base.BaseStructure;

public class MyBaseStructure extends BaseStructure{

	MyBaseStructure() {
		super();
	}
	
	@Override
	protected Object getFields(int fieldId) {
		return super.getFields(fieldId);
	}

}
