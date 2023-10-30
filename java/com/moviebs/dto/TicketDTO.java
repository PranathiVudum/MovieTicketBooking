package com.moviebs.dto;

import lombok.*;


@Data
public class TicketDTO 
{
	
	//floating-point variable that represents the ticket amount
	@NonNull
	private float amount;
	
	//an integer variable that represents the invoice number associated with the ticket
	@NonNull
	private int invoiceNumber;
	
	//a string variable that represents the date of the ticket.
	@NonNull
	private String date;
	
	// an integer variable that represents the booking ID associated with the ticket
	@NonNull
	private int bookingId;
	
	// a string variable that stores any additional notes or comments related to the ticket
	@NonNull
	private String notes;

	public void setAmount(float amount2) {
		// TODO Auto-generated method stub
		
	}

	public void setDate(String currentDateTime) {
		// TODO Auto-generated method stub
		
	}

	public void setInvoiceNumber(int nextInt) {
		// TODO Auto-generated method stub
		
	}

	public void setBookingId(Object id) {
		// TODO Auto-generated method stub
		
	}

	public void setNotes(String string) {
		// TODO Auto-generated method stub
		
	}
	

}