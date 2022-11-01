package com.capgemini.in.SpringInjectionUsingCollections;

import java.util.Iterator;
import java.util.List;

public class Person {
		int id;
		String name;
		List <String> characterstics;
		
		
		
	public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
		}



		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public List<String> getCharacterstics() {
			return characterstics;
		}



		public void setCharacterstics(List<String> characterstics) {
			this.characterstics = characterstics;
		}



	public void showCharacterstics() {
		System.out.println(id);
		System.out.println("Below are the characterstics of " + name);
		Iterator itr = characterstics.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
