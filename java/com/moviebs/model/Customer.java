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
@Table(name="customer_details")
public class Customer 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
 	
	//indicates that the value cannot be null
	@Column(name="Name", nullable = false, length = 20)
    private String name;
    
	//indicates that the value cannot be null
	@Column(name ="email",nullable = false, length = 20)
    private String email;
 	
	//Parameterized Constructor
    public Customer(String name, String email)
    {
        this.name = name;
        this.email = email;
    }

	public void setId(Integer customerIdFromDb) {
		// TODO Auto-generated method stub
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}
}