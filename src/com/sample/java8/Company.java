package com.sample.java8;

import java.util.List;

public class Company {

	List<String> names;

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	@Override
	public String toString() {
		return "Company [names=" + names + "]";
	}
}
