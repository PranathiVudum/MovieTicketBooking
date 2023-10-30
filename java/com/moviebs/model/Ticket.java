package com.moviebs.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="booked_ticket")
public class Ticket
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ticketId;
	
	//integer representing the id of the movie
	@Column(name="movie_id")
	private int movieId;
	
	//string representing the name of the movie
	@Column(name="movie_name")
	private String movieName;
	
	//integer representing the booked_seats of the movie
	@Column(name="booked_seats")
	private int seats;
	
	//float representing the total_amount of the movie
	@Column(name="total_amount")
	private float totalAmount;

	// parameterized constructor  	
	public Ticket(int movieId, int seats) 
	{
		super();
		this.movieId = movieId;
		this.seats = seats;
	}
	
	//parameterized constructor
	public Ticket(int movieId, String movieName, int seats, float totalAmount) 
	{
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.seats = seats;
		this.totalAmount = totalAmount;
	}

	public int getSeats() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getMovieId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setTotalAmount(float singleTicketAmount) {
		// TODO Auto-generated method stub
		
	}

	public void setMovieName(Object movieName2) {
		// TODO Auto-generated method stub
		
	}

	public void setSeats(int seatAvailable) {
		// TODO Auto-generated method stub
		
	}

}