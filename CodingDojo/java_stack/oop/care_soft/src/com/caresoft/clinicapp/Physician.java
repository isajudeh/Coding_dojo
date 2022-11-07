package com.caresoft.clinicapp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Physician extends User implements HIPAACompliantUser {
//... imports class definition...
    
    public Physician(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	// Inside class:    
    private ArrayList<String> patientNotes;
	private Scanner s;
	
    // TO DO: Constructor that takes an ID
    // TO DO: Implement HIPAACompliantUser!
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", User.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}

	@Override
	public boolean assignPin(int pin) {
		s = new Scanner(System. in);
		int n = s. nextInt();
		int length = String. valueOf(n). length();
		if(length == 4) {
			return true;
		}
		return false;
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		if ( confirmedAuthID == id) {
			return true;
		}
		return false;
	}
	
    // TO DO: Setters & Getters

}
