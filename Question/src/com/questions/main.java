package com.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class main {
	
	public static void main(String[] args)
	{
		Patient p1=new Patient("allu","Corona",34,new Adress("Khoa gali", 330102));
		Patient p4=new Patient("lallu","mota",27,new Adress("Bhao gali",3301060));
		Patient p3=new Patient("jaggu","rona",64,new Adress("Lhoa gali",330101));
		
		List<Patient> list=Arrays.asList(p1,p4,p3);
		
		list.stream().filter(x->x.getDisease()=="Corona").forEach(x->System.out.println(x));
		list.stream().filter(x->x.getAmount()<30).forEach(x->System.out.println(x));
		Double a =list.stream().collect(Collectors.averagingDouble((Patient::getAmount)));
		
		System.out.println(a);
		
		System.out.println("Unsorted list: "+list);
		//Collections.sort(list,new amountComparator());
		// System.out.println("Sorted list by amount: "+ list);
		
		Collections.sort(list,new adressComparator());
		
		System.out.println("Sorted list by address: "+ list);
		
		
		
		
	}
}
