package com.plantflashcards.ui;

import java.util.ArrayList;
import java.util.List;

import com.plantflashcards.dto.IPlant;
import com.plantflashcards.dto.Plant;
import com.plantflashcards.dto.Tree;

public class Runner {

	public static void main(String[] args) {
		list();
	}

	private static void list() {
		// TODO Auto-generated method stub
		IPlant plant = new Plant();
		
		plant.setGenus("Cercis");
		plant.setSpecies("canadensis");
		plant.setCultivar("alba");
		
		IPlant pawpaw = new Tree();
		
		pawpaw.setGenus("Asimina");
		pawpaw.setSpecies("Triloba");
		pawpaw.setCultivar("Potomac");
		pawpaw.setHeight(6);
		
		// add to a Collection
		List<IPlant> allPlants = new ArrayList<>();
		
		allPlants.add(plant);
		allPlants.add(pawpaw);
		
		for(IPlant iPlant: allPlants) {
			System.out.println("Plant: " + iPlant.getScientificName());
		}
		
	}
}
