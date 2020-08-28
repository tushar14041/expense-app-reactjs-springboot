package com.example.codeengine.expense.model;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data  // for generating getters and setters
@Table(name="expense")
public class Expense {

	@Id
	private Long id;
	
		private String description;

		private Instant expensedate;
		
		private String location;

	@ManyToOne
	private Category category;
	
	@JsonIgnore
	@ManyToOne
	private User user;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Instant getExpensedate() {
		return expensedate;
	}


	public void setExpensedate(Instant expensedate) {
		this.expensedate = expensedate;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
}
