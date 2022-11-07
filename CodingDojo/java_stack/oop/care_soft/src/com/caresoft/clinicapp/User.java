package com.caresoft.clinicapp;


public class User {
    protected static Integer id;
    protected int pin;
    
    // Implement a constructor that takes an ID
	public User(Integer id) {
		super();
		User.id = id;
	}
	// TO DO: Getters and setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		User.id = id;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
}
