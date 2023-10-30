package com.moviebs.dto;

import lombok.*;

@Data
public class MovieDTO
{
	//an integer represents the id for the movie
	@NonNull
	private int movieId;
	
	//a string represents the moviename
	@NonNull
	private String movieName;
	
	//a string represents the movie language
	@NonNull
	private String movieLanguage;
	
	//a string represents the movietype
	@NonNull
	private String movieType;
	
	//a string represents the moviegenre
	@NonNull
	private String movieGenre;
	
	////a string represents the location
	@NonNull
	private String location;
	
	//a string represents the movietime
	@NonNull
	private String movieTime;
	
	//an integer represents the seats which are available
	@NonNull
	private int seatAvailable;
	
	//a float represents the price
	@NonNull
	private float price;

}