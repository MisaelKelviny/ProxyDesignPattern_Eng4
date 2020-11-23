package br.edu.univas.main;

import br.edu.univas.vo.Internet;

public class StartApp {

	public static void main(String[] args) {
		
		Internet internet = new Internet();

		internet.bannedSites("youtube.com");
		internet.bannedSites("twitter.com");
		internet.bannedSites("facebook.com");
		
		internet.connectTo("instagram.com");
		internet.connectTo("cdf.com.org");
		internet.connectTo("github.com");
		internet.connectTo("youtube.com");
	}

}
