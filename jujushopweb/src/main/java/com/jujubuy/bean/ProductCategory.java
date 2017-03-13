package com.jujubuy.bean;

import java.util.ArrayList;
import java.util.List;

public class ProductCategory {
	private int id;
	private String name;
	private String description;
	private String urlSlug;
	private List<ProductImage> imageList = new ArrayList<ProductImage>();
	private ProductCategory parentCategory;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrlSlug() {
		return urlSlug;
	}
	public void setUrlSlug(String urlSlug) {
		this.urlSlug = urlSlug;
	}
	public List<ProductImage> getImageList() {
		return imageList;
	}
	public void setImageList(List<ProductImage> imageList) {
		this.imageList = imageList;
	}
	public ProductCategory getParentCategory() {
		return parentCategory;
	}
	public void setParentCategory(ProductCategory parentCategory) {
		this.parentCategory = parentCategory;
	}
	public boolean isMainCategory() {
		if(parentCategory==null || parentCategory.getId()==0) {
			return true;
		}
		else {
			return false;
		}
	}
}
