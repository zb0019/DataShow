package com.demo.common.model.log;

import com.demo.common.model.log.base.BaseSrcCollectMachine;
import com.jfinal.plugin.activerecord.Db;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class SrcCollectMachine extends BaseSrcCollectMachine<SrcCollectMachine> {
	public static final SrcCollectMachine dao = new SrcCollectMachine() ;
	
	public void deleteByCollectId(Object collectId) {
		Db.update("delete from src_collect_machine where collect_id=?", new Object[]{collectId});
	}
	public SrcCollectMachine getByCollectId(Object collectId) {
		return findFirst("select * from src_collect_machine where collect_id=?", new Object[]{collectId});
	}
}
