package main;

import viewers.Model;

/**
 * Abstract Viewer Class 
 * @author 	Michael
 */
public abstract class Viewer {
	//Variables needed to interact with jfreechart
	//CONSTRUCTOR
	/**
	 * Constructor for the Viewer Class
	 * @param model	the model of the data to be displayed
	 */
	public Viewer(Model model){
		this.update(model);
	}
	
	//INSTANCE METHODS
	/**
	 * Updates the viewer
	 * @param model	the new model of the data to be displayed
	 */
	public void update(Model updatedModel) {}
}
