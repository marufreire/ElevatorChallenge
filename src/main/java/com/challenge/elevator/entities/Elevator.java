package com.challenge.elevator.entities;

public class Elevator {

	
	private Integer currentPosition=0;
	private final Integer maxPosition=50;
	private final Integer minPosition=-1;
	private Double maxWeight;
	private Double currentWeight;
	private Boolean alarm;
	private Boolean validateKeycard;
	
	

	public Elevator() {
		
	}

	public Integer getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(Integer currentPosition) {
		this.currentPosition = currentPosition;
	}
	
	public void setMaxWeight(Double maxWeight) {
		this.maxWeight = maxWeight;
	}

	public Double getCurrentWeight() {
		return currentWeight;
	}

	public void setCurrentWeight(Double currentWeight) {
		this.currentWeight = currentWeight;
	}

	public Boolean getAlarm() {
		return alarm;
	}

	public void setAlarm(Boolean alarm) {
		this.alarm = alarm;
	}
	

	public void setValidateKeycard(Boolean validateKeycard) {
		this.validateKeycard = validateKeycard;
	}

	public Integer getMaxPosition() {
		return maxPosition;
	}

	public Integer getMinPosition() {
		return minPosition;
	}

	public Double getMaxWeight() {
		return maxWeight;
	}
	
	public Boolean getValidateKeycard() {
		return validateKeycard;
	}

	@Override
	public String toString() {
		return "PublicElevator [currentPosition=" + currentPosition + ", maxPosition=" + maxPosition + ", minPosition="
				+ minPosition + ", maxWeight=" + maxWeight + ", currentWeight=" + currentWeight + ", alarm=" + alarm
				+ ", validateKeycard=" + validateKeycard + ", getCurrentPosition()=" + getCurrentPosition()
				+ ", getCurrentWeight()=" + getCurrentWeight() + ", getAlarm()=" + getAlarm() + ", getMaxPosition()="
				+ getMaxPosition() + ", getMinPosition()=" + getMinPosition() + ", getMaxWeight()=" + getMaxWeight()
				+ ", getValidateKeycard()=" + getValidateKeycard() + "]";
	}
	
	
	
}
