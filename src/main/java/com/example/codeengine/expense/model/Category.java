package com.example.codeengine.expense.model;

import lombok.*;
import javax.persistence.*;

import com.sun.istack.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="category")
public class Category {
	
	@Id
	@Column(name = "id")
	private Long id;
	
	@NotNull
	@Column(name = "name")
	// Travel, Grocery,...
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	 

}
