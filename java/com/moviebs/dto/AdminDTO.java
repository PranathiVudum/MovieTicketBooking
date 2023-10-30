package com.moviebs.dto;



import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class AdminDTO {
@NonNull
	private int id;
@NonNull
	private String userName;
@NonNull
	private String password;
@NonNull
	private String role;
}