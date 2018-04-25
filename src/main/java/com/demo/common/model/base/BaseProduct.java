package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseProduct<M extends BaseProduct<M>> extends Model<M> implements IBean {

	public M setId(java.math.BigInteger id) {
		set("id", id);
		return (M)this;
	}
	
	public java.math.BigInteger getId() {
		return get("id");
	}

	public M setProductCode(java.lang.String productCode) {
		set("product_code", productCode);
		return (M)this;
	}
	
	public java.lang.String getProductCode() {
		return getStr("product_code");
	}

	public M setProductName(java.lang.String productName) {
		set("product_name", productName);
		return (M)this;
	}
	
	public java.lang.String getProductName() {
		return getStr("product_name");
	}

	public M setProductIntro(java.lang.String productIntro) {
		set("product_intro", productIntro);
		return (M)this;
	}
	
	public java.lang.String getProductIntro() {
		return getStr("product_intro");
	}

	public M setProductLimit(java.math.BigDecimal productLimit) {
		set("product_limit", productLimit);
		return (M)this;
	}
	
	public java.math.BigDecimal getProductLimit() {
		return get("product_limit");
	}

	public M setProductPeriod(java.lang.Integer productPeriod) {
		set("product_period", productPeriod);
		return (M)this;
	}
	
	public java.lang.Integer getProductPeriod() {
		return getInt("product_period");
	}

	public M setProductRate(java.math.BigDecimal productRate) {
		set("product_rate", productRate);
		return (M)this;
	}
	
	public java.math.BigDecimal getProductRate() {
		return get("product_rate");
	}

	public M setInterestWay(java.lang.Integer interestWay) {
		set("interest_way", interestWay);
		return (M)this;
	}
	
	public java.lang.Integer getInterestWay() {
		return getInt("interest_way");
	}

	public M setDrawWay(java.lang.Integer drawWay) {
		set("draw_way", drawWay);
		return (M)this;
	}
	
	public java.lang.Integer getDrawWay() {
		return getInt("draw_way");
	}

	public M setApplyWay(java.lang.Integer applyWay) {
		set("apply_way", applyWay);
		return (M)this;
	}
	
	public java.lang.Integer getApplyWay() {
		return getInt("apply_way");
	}

	public M setExclude(java.lang.String exclude) {
		set("exclude", exclude);
		return (M)this;
	}
	
	public java.lang.String getExclude() {
		return getStr("exclude");
	}

	public M setInstitution(java.lang.String institution) {
		set("institution", institution);
		return (M)this;
	}
	
	public java.lang.String getInstitution() {
		return getStr("institution");
	}

	public M setLogoPath(java.lang.String logoPath) {
		set("logo_path", logoPath);
		return (M)this;
	}
	
	public java.lang.String getLogoPath() {
		return getStr("logo_path");
	}

	public M setProductType(java.lang.Integer productType) {
		set("product_type", productType);
		return (M)this;
	}
	
	public java.lang.Integer getProductType() {
		return getInt("product_type");
	}

	public M setProductStatus(java.lang.Integer productStatus) {
		set("product_status", productStatus);
		return (M)this;
	}
	
	public java.lang.Integer getProductStatus() {
		return getInt("product_status");
	}

}
