package com.care.di_ex03;

import java.util.ArrayList;
import java.util.HashMap;

public class SaveClass {
	private PrintClass pc;
	private String name;
	private ArrayList<String> hobby;
	private HashMap<String, String> weather;
	
	// 기본 생성자가 있어야 다른 생성자를 만들 때 오류가 나지 않는다. / ** 생성자 오버라이딩
	public SaveClass() {
		
	}
	
	public SaveClass(String name, ArrayList hobby, HashMap weather) {
		this.name = name;
		this.hobby = hobby;
		this.weather = weather;
	}

	public void pcFunc() {
		pc.print(name, hobby, weather);
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

	public ArrayList<String> getHobby() {
		return hobby;
	}

	public void setHobby(ArrayList<String> hobby) {
		this.hobby = hobby;
	}

	public HashMap<String, String> getWeather() {
		return weather;
	}

	public void setWeather(HashMap<String, String> weather) {
		this.weather = weather;
	}

}
