package com.plantflashcards.dto;

public class Tree extends Plant {
	
	private String fallColor;

	public String getFallColor() {
		return fallColor;
	}

	public void setFallColor(String fallColor) {
		this.fallColor = fallColor;
	}
	
	@Override
	public String getScientificName() {
		// TODO Auto-generated method stub
		return "This tree is: " + super.getScientificName();
	}
}
