package com.jujubuy;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport implements SessionAware, RequestAware {

	private static final long serialVersionUID = 172119L;
	protected Map<String, Object> request;
	protected Map<String, Object> session;
	protected String PRODUCT_LIST = "productList";
	protected String PRODUCT_DETAIL = "productDetail";
	

	public void setRequest(Map<String, Object> arg0) {
		request = arg0;
	}

	public void setSession(Map<String, Object> arg0) {
		session = arg0;
	}

	public Map<String, Object> getRequest() {
		return request;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	
	public String execute() {
		return SUCCESS;
	}

}
