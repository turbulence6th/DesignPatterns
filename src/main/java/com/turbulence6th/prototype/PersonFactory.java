package com.turbulence6th.prototype;

import java.util.HashMap;
import java.util.Map;

public class PersonFactory {

	private static Map<String, Person> map = new HashMap<>();
	
	static {
		map.put("Tom", new Tom());
		map.put("Harry", new Harry());
		map.put("Lisa", new Lisa());
	}
	
	public static Person getPerson(String type) {
		return map.get(type).clonePerson();
	}
	
}
