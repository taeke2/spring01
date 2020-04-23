package com.care.di_test03;

import java.util.ArrayList;

public class PrintClass {
	public void print(ArrayList<String> favorite, String name) {
		System.out.println(name);
		for(String s : favorite) {
			System.out.println(s);
		}
	}
}
