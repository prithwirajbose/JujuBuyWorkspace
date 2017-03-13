package com.jujubuy.bean;

import java.util.ArrayList;
import java.util.List;

public class ProductBean {
	private long id;
	private String code;
	private String name;
	private String shortDescription;
	private String longDescription;
	private String urlSlug;
	private List<ProductPriceBean> priceList = new ArrayList<ProductPriceBean>();
	private boolean isDisabled;
	private List<ProductImage> imageList = new ArrayList<ProductImage>();
	private ProductCategory category;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getLongDescription() {
		return longDescription;
	}
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	public String getUrlSlug() {
		return urlSlug;
	}
	public void setUrlSlug(String urlSlug) {
		this.urlSlug = urlSlug;
	}
	public List<ProductPriceBean> getPriceList() {
		return priceList;
	}
	public void setPriceList(List<ProductPriceBean> priceList) {
		this.priceList = priceList;
	}
	public boolean isDisabled() {
		return isDisabled;
	}
	public void setDisabled(boolean isDisabled) {
		this.isDisabled = isDisabled;
	}
	public List<ProductImage> getImageList() {
		return imageList;
	}
	public void setImageList(List<ProductImage> imageList) {
		this.imageList = imageList;
	}
	public ProductCategory getCategory() {
		return category;
	}
	public void setCategory(ProductCategory category) {
		this.category = category;
	}
	
}
