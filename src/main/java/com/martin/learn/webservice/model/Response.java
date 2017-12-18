package com.martin.learn.webservice.model;


/**
 * webservice响应
 * @author Administrator
 *
 */
public abstract class Response {

	private ResultInfo resultInfo;

	public ResultInfo getResultInfo() {
		return resultInfo;
	}

	public void setResultInfo(ResultInfo resultInfo) {
		this.resultInfo = resultInfo;
	}
}
