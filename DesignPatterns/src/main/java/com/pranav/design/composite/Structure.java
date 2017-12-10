package com.pranav.design.composite;

import java.util.ArrayList;
import java.util.List;

public class Structure implements Group{

	List<Group> groups = new ArrayList<Group>();
	
	public void add(Group group){
		groups.add(group);
	}
	
	public void assemble() {
		for (Group group : groups) {
			group.assemble();
		}
	}

}
