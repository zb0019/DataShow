package com.demo.common.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.demo.common.model.base.BaseProduct;
import com.jfinal.plugin.activerecord.Page;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Product extends BaseProduct<Product> {
	public static final Product dao = new Product().dao();
	
	 public Page<Product> getAllProduct(int current, int pageSize, Map<String, String> map) {
	    List<Object> paramList = new ArrayList<Object>();
	    StringBuilder condition = new StringBuilder();
	    String name = map.get("product_name");

	    String from = "FROM  product a where 1=1 ";
	    condition.append(from);

	    if (!StringUtils.isBlank(name)) {
	      condition.append(" and a.product_name like ?");
	      paramList.add("%" + name + "%");
	    }

	    Page<Product> page = paginate(current, pageSize, "SELECT * ", condition.toString(), paramList.toArray(new Object[] {}));

	    if (page != null && page.getList() != null) {
	      if (current > 1 && page.getList().isEmpty()) {
	        page = getAllProduct(current - 1, pageSize, map);
	      }
	    }
	    return page;
	  }
	 
	 public List<Product> getProductBy( Map<String, String> map) {
	   List<Object> paramList = new ArrayList<Object>();
       StringBuilder condition = new StringBuilder();
       String from = "select * FROM  product a where 1=1 ";
       
	   return find(from+condition.toString(), paramList.toArray(new Object[] {}));
	 }
}
