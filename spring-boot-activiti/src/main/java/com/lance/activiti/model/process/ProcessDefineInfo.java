package com.lance.activiti.model.process;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

/**
 * 定义流程
 * @author Administrator
 */
@Data
public class ProcessDefineInfo implements Serializable{
	private static final long serialVersionUID = -6159834621213504983L;
	/**发布成功*/
	public static final int DEPLOY = 2;
	/**未发布*/
	public static final int UNDEPLOY = 1;
	
	/**ID*/
	private int id;
	
	/**流程名称*/
	private String processName;
	
	/**流程Key*/
	private String processKey;
	
	/**流程File, leave.bpmn20.xml*/
	private String processFile;
	
	/**流程状态*/
	private int processStatus;
	
	/**发布流程ID*/
	private String deploymentId;
	
	/**创建时间*/
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProcessName() {
		return processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public String getProcessKey() {
		return processKey;
	}

	public void setProcessKey(String processKey) {
		this.processKey = processKey;
	}

	public String getProcessFile() {
		return processFile;
	}

	public void setProcessFile(String processFile) {
		this.processFile = processFile;
	}

	public int getProcessStatus() {
		return processStatus;
	}

	public void setProcessStatus(int processStatus) {
		this.processStatus = processStatus;
	}

	public String getDeploymentId() {
		return deploymentId;
	}

	public void setDeploymentId(String deploymentId) {
		this.deploymentId = deploymentId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public static int getDeploy() {
		return DEPLOY;
	}

	public static int getUndeploy() {
		return UNDEPLOY;
	}
	
	
}