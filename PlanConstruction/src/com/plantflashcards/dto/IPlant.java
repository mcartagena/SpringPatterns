package com.plantflashcards.dto;


/**
 * Describe a Plant
 * @author Marcelo cartagena
 *
 */
public interface IPlant {
	
	/**
	 * Return the latin name of the plan
	 * @return
	 */
	public String getScientificName();

	void setCommonName(String commonName);

	void setCultivar(String cultivar);

	void setSpecies(String species);

	void setGenus(String genus);

	void setHeight(int height); 

}
