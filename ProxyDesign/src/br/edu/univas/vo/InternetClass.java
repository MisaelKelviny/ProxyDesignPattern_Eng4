package br.edu.univas.vo;

import br.edu.univas.interfaces.Internet;

public class InternetClass implements Internet{

	@Override
	public void connectTo(String hosting) {
		System.out.println("Connecting to "+ hosting); 
	}
	
}
