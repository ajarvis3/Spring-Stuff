package com.example.consume;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// Ignores anything unknown to this class
@JsonIgnoreProperties(ignoreUnknown = true)
public class Cats {

	private Status status;
	private String text;

	// public Quote() {
	// }

	// Getters and Setters

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Cats{" +
            "text=" + text +
        "}";
	}
}