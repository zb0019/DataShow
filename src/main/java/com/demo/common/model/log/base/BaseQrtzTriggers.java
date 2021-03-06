package com.demo.common.model.log.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseQrtzTriggers<M extends BaseQrtzTriggers<M>> extends Model<M> implements IBean {

	public M setSchedName(java.lang.String schedName) {
		set("SCHED_NAME", schedName);
		return (M)this;
	}
	
	public java.lang.String getSchedName() {
		return getStr("SCHED_NAME");
	}

	public M setTriggerName(java.lang.String triggerName) {
		set("TRIGGER_NAME", triggerName);
		return (M)this;
	}
	
	public java.lang.String getTriggerName() {
		return getStr("TRIGGER_NAME");
	}

	public M setTriggerGroup(java.lang.String triggerGroup) {
		set("TRIGGER_GROUP", triggerGroup);
		return (M)this;
	}
	
	public java.lang.String getTriggerGroup() {
		return getStr("TRIGGER_GROUP");
	}

	public M setJobName(java.lang.String jobName) {
		set("JOB_NAME", jobName);
		return (M)this;
	}
	
	public java.lang.String getJobName() {
		return getStr("JOB_NAME");
	}

	public M setJobGroup(java.lang.String jobGroup) {
		set("JOB_GROUP", jobGroup);
		return (M)this;
	}
	
	public java.lang.String getJobGroup() {
		return getStr("JOB_GROUP");
	}

	public M setDESCRIPTION(java.lang.String DESCRIPTION) {
		set("DESCRIPTION", DESCRIPTION);
		return (M)this;
	}
	
	public java.lang.String getDESCRIPTION() {
		return getStr("DESCRIPTION");
	}

	public M setNextFireTime(java.lang.Long nextFireTime) {
		set("NEXT_FIRE_TIME", nextFireTime);
		return (M)this;
	}
	
	public java.lang.Long getNextFireTime() {
		return getLong("NEXT_FIRE_TIME");
	}

	public M setPrevFireTime(java.lang.Long prevFireTime) {
		set("PREV_FIRE_TIME", prevFireTime);
		return (M)this;
	}
	
	public java.lang.Long getPrevFireTime() {
		return getLong("PREV_FIRE_TIME");
	}

	public M setPRIORITY(java.lang.Integer PRIORITY) {
		set("PRIORITY", PRIORITY);
		return (M)this;
	}
	
	public java.lang.Integer getPRIORITY() {
		return getInt("PRIORITY");
	}

	public M setTriggerState(java.lang.String triggerState) {
		set("TRIGGER_STATE", triggerState);
		return (M)this;
	}
	
	public java.lang.String getTriggerState() {
		return getStr("TRIGGER_STATE");
	}

	public M setTriggerType(java.lang.String triggerType) {
		set("TRIGGER_TYPE", triggerType);
		return (M)this;
	}
	
	public java.lang.String getTriggerType() {
		return getStr("TRIGGER_TYPE");
	}

	public M setStartTime(java.lang.Long startTime) {
		set("START_TIME", startTime);
		return (M)this;
	}
	
	public java.lang.Long getStartTime() {
		return getLong("START_TIME");
	}

	public M setEndTime(java.lang.Long endTime) {
		set("END_TIME", endTime);
		return (M)this;
	}
	
	public java.lang.Long getEndTime() {
		return getLong("END_TIME");
	}

	public M setCalendarName(java.lang.String calendarName) {
		set("CALENDAR_NAME", calendarName);
		return (M)this;
	}
	
	public java.lang.String getCalendarName() {
		return getStr("CALENDAR_NAME");
	}

	public M setMisfireInstr(java.lang.Integer misfireInstr) {
		set("MISFIRE_INSTR", misfireInstr);
		return (M)this;
	}
	
	public java.lang.Integer getMisfireInstr() {
		return getInt("MISFIRE_INSTR");
	}

	public M setJobData(byte[] jobData) {
		set("JOB_DATA", jobData);
		return (M)this;
	}
	
	public byte[] getJobData() {
		return get("JOB_DATA");
	}

}
