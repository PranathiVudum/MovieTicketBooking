package com.moviebs.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="movie_details")
public class Movie 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int movieId;
	
	//string representing the name of the movie
	@Column(name="movie_name", nullable = false, length = 20)
	private String movieName;
	
	//string representing the language of the movie
	@Column(name="language", nullable = false, length = 10)
	private String movieLanguage;
	
	//string representing the genre of the movie
	@Column(name="genre", nullable = false, length = 10)
	private String movieGenre;
	
	//string representing the movietype of the movie
	@Column(name="type", nullable = false, length = 10)
	private String movieType;
	
	//string representing the location of the movie
	@Column(name="location", nullable = false, length = 10)
	private String location;
	
	//string representing the timing of the movie
	@Column(name="timing", nullable = false,length = 10)
	private String movieTime;
	
	//integer representing the seat_available of the movie
	@Column(name="seat_available", nullable = false, length = 3)
	private int seatAvailable;
	
	//float representing the movie_price of the movie
	@Column(name="movie_price", nullable = false, length = 3)
	private float price;

	public int getSeatAvailable() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setSeatAvailable(int seatsAvailable) {
		// TODO Auto-generated method stub
		
	}

	public Object getMovieName() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setMovieName(Object movieName2) {
		// TODO Auto-generated method stub
		
	}

	public Object getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setLocation(Object location2) {
		// TODO Auto-generated method stub
		
	}

	public void setPrice(int price2) {
		// TODO Auto-generated method stub
		
	}

	public Object getMovieTime() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getMovieLanguage() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setMovieLanguage(Object movieLanguage2) {
		// TODO Auto-generated method stub
		
	}

	public void setMovieTime(Object movieTime2) {
		// TODO Auto-generated method stub
		
	}

	public Object getMovieType() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setMovieType(Object movieType2) {
		// TODO Auto-generated method stub
		
	}	

}