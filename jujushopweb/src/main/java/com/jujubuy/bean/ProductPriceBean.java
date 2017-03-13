package com.jujubuy.bean;

public class ProductPriceBean {

	private double unitPrice;
	private int unitsAvailable;
	private ProductUnit unit;
	private boolean isDefault;
	
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getUnitsAvailable() {
		return unitsAvailable;
	}
	public void setUnitsAvailable(int unitsAvailable) {
		this.unitsAvailable = unitsAvailable;
	}
	public ProductUnit getUnit() {
		return unit;
	}
	public void setUnit(ProductUnit unit) {
		this.unit = unit;
	}
	public boolean isDefault() {
		return isDefault;
	}
	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}
}
