package com.demo.common.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.demo.common.model.base.BaseFinance;
import com.jfinal.plugin.activerecord.Page;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Finance extends BaseFinance<Finance> {
	public static final Finance dao = new Finance().dao();
	
	 public Page<Finance> getAllFinance(int current, int pageSize, Map<String, String> map) {
		    List<Object> paramList = new ArrayList<Object>();
		    StringBuilder condition = new StringBuilder();
		    String name = map.get("finance_name");

		    String from = "FROM  finance a where 1=1 ";
		    condition.append(from);

		    if (!StringUtils.isBlank(name)) {
		      condition.append(" and a.finance_name like ?");
		      paramList.add("%" + name + "%");
		    }

		    Page<Finance> page =
		        paginate(current, pageSize, "SELECT * ", condition.toString(),
		            paramList.toArray(new Object[] {}));

		    if (page != null && page.getList() != null) {
		      if (current > 1 && page.getList().isEmpty()) {
		        page = getAllFinance(current - 1, pageSize, map);
		      }
		    }
		    return page;
		  }
	 
	 public List<Finance> getFinanceList() {
		 return find("select * from finance");
	 }
}
