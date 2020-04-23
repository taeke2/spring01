package com.care.di_test03;

import java.util.ArrayList;

public class StudentClass implements Student {
	private PrintClass pc;
	private String name;
	private ArrayList<String> favorite;

	public StudentClass() {}
	public StudentClass(String name) {
		this.name = name;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		pc.print(favorite, name);
	}

	public PrintClass getPc() {
		return pc;
	}

	public void setPc(PrintClass pc) {
		this.pc = pc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getFavorite() {
		return favorite;
	}

	public void setFavorite(ArrayList<String> favorite) {
		this.favorite = favorite;
	}

}
