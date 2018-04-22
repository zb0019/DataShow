package com.demo.common.model;

import java.util.List;

import com.demo.common.model.base.BaseRegion;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Region extends BaseRegion<Region> {
	public static final Region dao = new Region().dao();
	
	public List<Region> getAllProvice() {
	  String sqlPara = "SELECT * FROM region WHERE father_id=0";
	  return find(sqlPara);
	}
}