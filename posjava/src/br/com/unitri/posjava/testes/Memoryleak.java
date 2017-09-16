package br.com.unitri.posjava.testes;

import java.util.ArrayList;
import java.util.List;

public class Memoryleak {
	
	public static void main(String[] args) {
		
		List<String> strings = new ArrayList<String>();
		
		
		while(true) {
			
			strings.add(String.valueOf(System.currentTimeMillis()));
			
		}
		
	}

}
