package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseProduct<M extends BaseProduct<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Long getId() {
		return getLong("id");
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

	public M setLoanTerm(java.lang.Integer loanTerm) {
		set("loan_term", loanTerm);
		return (M)this;
	}
	
	public java.lang.Integer getLoanTerm() {
		return getInt("loan_term");
	}

	public M setLoanAmount(java.math.BigDecimal loanAmount) {
		set("loan_amount", loanAmount);
		return (M)this;
	}
	
	public java.math.BigDecimal getLoanAmount() {
		return get("loan_amount");
	}

	public M setLoanWork(java.lang.String loanWork) {
		set("loan_work", loanWork);
		return (M)this;
	}
	
	public java.lang.String getLoanWork() {
		return getStr("loan_work");
	}

	public M setLoanIncome(java.math.BigDecimal loanIncome) {
		set("loan_income", loanIncome);
		return (M)this;
	}
	
	public java.math.BigDecimal getLoanIncome() {
		return get("loan_income");
	}

	public M setLoanWorkyears(java.lang.Integer loanWorkyears) {
		set("loan_workyears", loanWorkyears);
		return (M)this;
	}
	
	public java.lang.Integer getLoanWorkyears() {
		return getInt("loan_workyears");
	}

	public M setLoanBisincome(java.math.BigDecimal loanBisincome) {
		set("loan_bisincome", loanBisincome);
		return (M)this;
	}
	
	public java.math.BigDecimal getLoanBisincome() {
		return get("loan_bisincome");
	}

	public M setLoanBisyears(java.lang.Integer loanBisyears) {
		set("loan_bisyears", loanBisyears);
		return (M)this;
	}
	
	public java.lang.Integer getLoanBisyears() {
		return getInt("loan_bisyears");
	}

	public M setLoanHouse(java.lang.String loanHouse) {
		set("loan_house", loanHouse);
		return (M)this;
	}
	
	public java.lang.String getLoanHouse() {
		return getStr("loan_house");
	}

	public M setLoanCar(java.lang.String loanCar) {
		set("loan_car", loanCar);
		return (M)this;
	}
	
	public java.lang.String getLoanCar() {
		return getStr("loan_car");
	}

	public M setLoanInsurance(java.lang.String loanInsurance) {
		set("loan_insurance", loanInsurance);
		return (M)this;
	}
	
	public java.lang.String getLoanInsurance() {
		return getStr("loan_insurance");
	}

	public M setLoanCredit(java.lang.String loanCredit) {
		set("loan_credit", loanCredit);
		return (M)this;
	}
	
	public java.lang.String getLoanCredit() {
		return getStr("loan_credit");
	}

	public M setLoanAge(java.lang.String loanAge) {
		set("loan_age", loanAge);
		return (M)this;
	}
	
	public java.lang.String getLoanAge() {
		return getStr("loan_age");
	}

}
