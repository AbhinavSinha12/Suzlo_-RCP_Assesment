package com.suzlon.assesment.model;

public class Turbine {

	
	private String model;
	private String ratedPower;
	private String cutInWindSpeed;
	private String ratedWindSpeed;
	private String cutOutWindSpeed;
	
	public Turbine() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Turbine(String model, String ratedPower, String cutInWindSpeed, String ratedWindSpeed,
			String cutOutWindSpeed) {
		super();
		this.model = model;
		this.ratedPower = ratedPower;
		this.cutInWindSpeed = cutInWindSpeed;
		this.ratedWindSpeed = ratedWindSpeed;
		this.cutOutWindSpeed = cutOutWindSpeed;
	}


	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getRatedPower() {
		return ratedPower;
	}
	public void setRatedPower(String ratedPower) {
		this.ratedPower = ratedPower;
	}
	public String getCutInWindSpeed() {
		return cutInWindSpeed;
	}
	public void setCutInWindSpeed(String cutInWindSpeed) {
		this.cutInWindSpeed = cutInWindSpeed;
	}
	public String getRatedWindSpeed() {
		return ratedWindSpeed;
	}
	public void setRatedWindSpeed(String ratedWindSpeed) {
		this.ratedWindSpeed = ratedWindSpeed;
	}
	public String getCutOutWindSpeed() {
		return cutOutWindSpeed;
	}
	public void setCutOutWindSpeed(String cutOutWindSpeed) {
		this.cutOutWindSpeed = cutOutWindSpeed;
	}
	
	
	
}
