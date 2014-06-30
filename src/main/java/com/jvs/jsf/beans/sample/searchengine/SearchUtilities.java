package com.jvs.jsf.beans.sample.searchengine;

import java.util.ArrayList;
import java.util.List;

public class SearchUtilities {

	public static String makeURL(String strEngine, String strSearch){
		System.out.println("strEngine selected: " + strEngine);
		String url = "";
		if(strEngine.equals("Google")){
			url = "http://www.google.com";	
		}else if(strEngine.equals("Yahoo")){
			url = "https://search.yahoo.com";
		}else if(strEngine.equals("Excite")){
			url = "http://www.excite.com";
		}		
		return url + "/search?q=" + strSearch;
	}
	
	public static List<String> searchEngineNames(){
		List<String> listEngineNames = new ArrayList<String>();
		listEngineNames.add("Google");
		listEngineNames.add("Yahoo");
		listEngineNames.add("Excite");		
		return listEngineNames;
	}
	
}
