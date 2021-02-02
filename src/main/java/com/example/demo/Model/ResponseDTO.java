package com.example.demo.Model;

import java.io.Serializable;
import java.util.List;

public class ResponseDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	List<Object> result;

	public List<Object> getResult() {
		return result;
	}

	public void setResult(List<Object> result) {
		this.result = result;
	}

	public ResponseDTO() {
		super();
	}

}
