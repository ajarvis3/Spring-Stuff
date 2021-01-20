package com.example.consume;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// Ignores anything unknown to this class
@JsonIgnoreProperties(ignoreUnknown = true)
public class Status {

	private boolean verified;
    private int sentCount;
    private String feedback;

    public boolean getVerified() {
        return this.verified;
    }

    public int getSentCount() {
        return this.sentCount;
    }

    public String getFeedback() {
        return this.feedback;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public void setSentCount(int sentCount) {
        this.sentCount = sentCount;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

	@Override
	public String toString() {
		return "Status{" +
			"verified='" + verified + '\'' +
            ", sentCount=" + sentCount + 
            ", feedback=" + feedback + 
			'}';
	}
}