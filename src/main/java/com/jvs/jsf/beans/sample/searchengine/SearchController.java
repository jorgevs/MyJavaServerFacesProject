package com.jvs.jsf.beans.sample.searchengine;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;

@ManagedBean(name = "searchController")
@RequestScoped
public class SearchController {

	private String searchString;
	private String searchEngine;

	public String doSearch() throws IOException {
		System.out.println("searchString: " + searchString);

		searchString = URLEncoder.encode(searchString, "utf-8");
		String searchURL = SearchUtilities.makeURL(searchEngine, searchString);
		System.out.println("searchURL: " + searchURL);		
		
		ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();			
		HttpServletResponse response = (HttpServletResponse) context.getResponse();
		response.sendRedirect(searchURL);
		return null;
	}

	public String getSearchString() {
		return searchString;
	}

	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}

	public String getSearchEngine() {
		return searchEngine;
	}

	public void setSearchEngine(String searchEngine) {
		this.searchEngine = searchEngine;
	}

	public List<String> getSearchEngineNames() {
		List<String> listEngineNames = SearchUtilities.searchEngineNames();
		return listEngineNames;
	}

}
