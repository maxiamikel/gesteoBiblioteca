package com.damapi.gestao_biblioteca.controllers.exceptions;

public class CommonExceptions {
	
	private Long timestamp;
	private int status;
	private String error;
	//private Long status;
	
	public CommonExceptions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CommonExceptions(Long timestamp, int status, String error) {
		
		this.timestamp = timestamp;
		this.error = error;
		this.status = status;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
	

}
