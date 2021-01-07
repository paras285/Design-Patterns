package com.design.patterns.behaviroual.observer.DTO;

public class UserDetailsDTO {

	private String fullName;
	private int age;
	private String strength;
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStrength() {
		return strength;
	}

	public void setStrength(String strength) {
		this.strength = strength;
	}

	@Override
	public String toString() {
		return "UserDetailsDTO [fullName=" + fullName + ", age=" + age + ", strength=" + strength + "]";
	}
	
	
}
