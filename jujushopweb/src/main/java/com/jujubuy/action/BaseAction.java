package com.jujubuy.action;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.StrutsStatics;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.jujubuy.bean.CartBean;
import com.jujubuy.utils.CommonConstants;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport implements SessionAware, RequestAware {

	private static final long serialVersionUID = 172119L;
	protected Map<String, Object> request = new HashMap<String, Object>();
	protected Map<String, Object> session = new HashMap<String, Object>();
	protected String PRODUCT_LIST = "productList";
	protected String PRODUCT_DETAIL = "productDetail";
	protected String HTTP404 = "http404";
	protected HttpServletRequest servletRequest = (HttpServletRequest) ActionContext.getContext().get(StrutsStatics.HTTP_REQUEST);
	protected static ResourceBundle rBundle = ResourceBundle.getBundle("message");

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
	
	public String setBasicSessionInformation() {
		if(session==null || session.isEmpty()) {
			session = new HashMap<String, Object>();
		}
		if(!session.containsKey(CommonConstants.SessionKeys.USER_CART) || session.get(CommonConstants.SessionKeys.USER_CART)==null) {
			session.put(CommonConstants.SessionKeys.USER_CART, new CartBean());
		}
		/*if(!session.containsKey(CommonConstants.SessionKeys.USER_PROFILE) || session.get(CommonConstants.SessionKeys.USER_PROFILE)==null) {
			session.put(CommonConstants.SessionKeys.USER_PROFILE, new CartBean());
		}*/
		return SUCCESS;
	}

	public HttpServletRequest getServletRequest() {
		return servletRequest;
	}

	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;
	}

	public ResourceBundle getrBundle() {
		return rBundle;
	}

	public void setrBundle(ResourceBundle rBundle) {
		this.rBundle = rBundle;
	}

}
