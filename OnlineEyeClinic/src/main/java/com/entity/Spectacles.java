package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Spectacles {
	@Id
	@GeneratedValue
	private int spectaclesId;
	private String spectaclesModel;
	private String spectaclesDescription;
	private double spectaclesCost;
	public int getSpectaclesId() {
		return spectaclesId;
	}
	public void setSpectaclesId(int spectaclesId) {
		this.spectaclesId = spectaclesId;
	}
	public String getSpectaclesModel() {
		return spectaclesModel;
	}
	public void setSpectaclesModel(String spectaclesModel) {
		this.spectaclesModel = spectaclesModel;
	}
	public String getSpectaclesDescription() {
		return spectaclesDescription;
	}
	public void setSpectaclesDescription(String spectaclesDescription) {
		this.spectaclesDescription = spectaclesDescription;
	}
	public double getSpectaclesCost() {
		return spectaclesCost;
	}
	public void setSpectaclesCost(double spectaclesCost) {
		this.spectaclesCost = spectaclesCost;
	}
	@Override
	public String toString() {
		return "Spectacles [spectaclesId=" + spectaclesId + ", spectaclesModel=" + spectaclesModel
				+ ", spectaclesDescription=" + spectaclesDescription + ", spectaclesCost=" + spectaclesCost + "]";
	}
	
}
