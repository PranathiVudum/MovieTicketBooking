package com.moviebs.dto;

import lombok.*;
import java.util.*;



import com.moviebs.model.*;


@Data
public class BookingDTO 
{
	
	//represents a list of tickets
@NonNull
	private List<Ticket> ticket;
	
	//represents the email address of the customer
@NonNull
	private String customerEmail;
	
	//represents the name of the customer
@NonNull
	private String customerName;

	public String getCustomerEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Ticket> getTicket() {
		// TODO Auto-generated method stub
		return null;
	}

}