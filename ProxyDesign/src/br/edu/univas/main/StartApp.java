package br.edu.univas.main;

import br.edu.univas.interfaces.Internet;
import br.edu.univas.vo.ProxyInternet;

public class StartApp {

	public static void main(String[] args) {
		Internet internet = new ProxyInternet(); 
		
		internet.connectTo("twitter.com"); 
		internet.connectTo("cdf.com.org"); 
		internet.connectTo("github.com"); 
        internet.connectTo("youtube.com"); 
	}

}
