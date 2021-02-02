package com.example.demo.Model;

import java.io.Serializable;

public class RequestDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	Integer num;

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public RequestDTO() {
		super();
	}

}
