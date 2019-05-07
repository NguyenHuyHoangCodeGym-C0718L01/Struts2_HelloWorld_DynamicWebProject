package com.huyhoang.service;

public class TutorialService {
	
	public String getTutorialSite(String language){
		if(language.equals("java")){
			return "Java Oracle";
		}else{
			return "Other language are not supported";
		}
	}
}
