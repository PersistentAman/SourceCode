package com.questions;

import java.util.Comparator;

public class adressComparator implements Comparator<Patient> {
	public int compare(Patient p1, Patient p2)
	{
		return p1.getAdress().compareTo(p2.getAdress());
	}

}
