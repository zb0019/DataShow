package com.demo.common.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.demo.common.model.base.BaseProductRule;
import com.jfinal.plugin.activerecord.Page;

/**
 * Generated by cwt
 */
@SuppressWarnings("serial")
public class ProductRule extends BaseProductRule<ProductRule> {
	public static final ProductRule dao = new ProductRule().dao();
	
	 public Page<ProductRule> getAllProductRule(int current, int pageSize, Map<String, String> map) {
       List<Object> paramList = new ArrayList<Object>();
       StringBuilder condition = new StringBuilder();
       String name = map.get("product_name");

       String from = "FROM  product_rule a where 1=1 ";
       condition.append(from);

       if (!StringUtils.isBlank(name)) {
         condition.append(" and a.product_name like ?");
         paramList.add("%" + name + "%");
       }

       Page<ProductRule> page = paginate(current, pageSize, "SELECT * ", condition.toString(), paramList.toArray(new Object[] {}));

       if (page != null && page.getList() != null) {
         if (current > 1 && page.getList().isEmpty()) {
           page = getAllProductRule(current - 1, pageSize, map);
         }
       }
       return page;
     }
    
	 public List<ProductRule> getProductRuleBy(Map<String, String> map) {
	    List<Object> paramList = new ArrayList<Object>();
	    StringBuilder condition = new StringBuilder();
	    String from = "select * FROM  product_rule a where 1=1 ";

	    return find(from + condition.toString(), paramList.toArray(new Object[] {}));
	  }
}
