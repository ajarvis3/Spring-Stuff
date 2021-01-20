package com.example.consume;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// Ignores anything unknown to this class
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

	private String type;
	private Value value;

	// public Quote() {
	// }

	// Getters and Setters

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Quote{" +
			"type='" + type + '\'' +
			", value=" + value +
			'}';
	}
}