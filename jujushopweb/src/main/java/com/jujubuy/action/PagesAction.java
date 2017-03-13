package com.jujubuy.action;

public class PagesAction extends BaseAction {
	private String layoutName = "indexLayout";
	
	public String index() {
	    String url = servletRequest.getRequestURL().toString();
	    if(!(url!=null && (url.equals(rBundle.getString("application.fullurl")) || url.equals(rBundle.getString("application.fullurl") + "/")))) {
	    	return HTTP404;
	    }
		setBasicSessionInformation();
		layoutName = "indexLayout";
		return SUCCESS;
	}
	
	public String getLayoutName() {
		return layoutName;
	}

	public void setLayoutName(String layoutName) {
		this.layoutName = layoutName;
	}

}
