package com.questions;

import java.util.Comparator;

public class amountComparator implements Comparator<Patient> {
	
	public int compare(Patient p1, Patient p2)
	{
	return p1.getAmount()-p2.getAmount();
	}
	

}
