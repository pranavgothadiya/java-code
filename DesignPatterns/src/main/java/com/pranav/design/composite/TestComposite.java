package com.pranav.design.composite;

public class TestComposite {

	public static void main(String[] args) {
		Block block1 = new Block("1");
		Block block2 = new Block("2");
		Block block3 = new Block("3");
		
		Structure struc = new Structure();
		
		Structure struc1 = new Structure();
		Structure struc2 = new Structure();
		
		struc1.add(block1);
		struc1.add(block2);
		
		struc2.add(block1);
		struc2.add(block2);
		struc2.add(block3);
		
		struc.add(struc1);
		struc.add(struc2);
		
		struc.assemble();
	}
}
