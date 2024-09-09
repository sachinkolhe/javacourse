package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;

public class TekSystem {

	static String msg;
	static {
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("init.txt"));
			reader.lines().findFirst().orElse(null);
		}catch(IOException ex) {
			throw new NoSuchElementException();
		}
	}
	public static void main(String[] args) {
		
	}
}

