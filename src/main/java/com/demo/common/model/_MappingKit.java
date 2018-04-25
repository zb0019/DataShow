package com.demo.common.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {
	
	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("label", "id", Label.class);
		arp.addMapping("pre_order", "id", PreOrder.class);
		arp.addMapping("product", "id", Product.class);
		arp.addMapping("product_label", "id", ProductLabel.class);
		arp.addMapping("product_region", "id", ProductRegion.class);
		arp.addMapping("product_rule", "id", ProductRule.class);
		arp.addMapping("region", "region_id", Region.class);
		arp.addMapping("sys_dict", "id", SysDict.class);
	}
}

