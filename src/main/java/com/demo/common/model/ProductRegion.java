package com.demo.common.model;

import java.util.List;

import com.demo.common.model.base.BaseProductRegion;
import com.jfinal.plugin.activerecord.Db;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class ProductRegion extends BaseProductRegion<ProductRegion> {
	public static final ProductRegion dao = new ProductRegion().dao();
	
	public void deleteByProductId(Long productId) {
	  Db.update("delete from product_region where product_id=?",new Object[]{productId});
	}
	
	public List<ProductRegion> getProductRegionByProductId(Object productId) {
	  return find("select * from product_region where product_id=?",new Object[]{productId});
	}
}