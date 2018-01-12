package edu.pitt.is17.ZHS48.menumanager;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * Class MenuManager.
 *
 * @author Zhuocheng Shen
 * @created 11/18/2017
 */

public class MenuManager {
	
	/** The entrees. */
	private ArrayList<Entree> entrees=new ArrayList<Entree>();
	
	/** The sides. */
	private ArrayList<Side> sides=new ArrayList<Side>();
	
	/** The salads. */
	private ArrayList<Salad> salads=new ArrayList<Salad>();
	
	/** The desserts. */
	private ArrayList<Dessert> desserts=new ArrayList<Dessert>();
	
	/**
	 * Instantiates a new menu manager.
	 *
	 * @param dishesFile the dishes file
	 */
	public MenuManager(String dishesFile) {

		ArrayList<MenuItem> menuItems=FileManager.readItems(dishesFile);
		for(int i=0;i<menuItems.size();i++) {
			if(menuItems.get(i) instanceof Entree) {
				entrees.add((Entree) menuItems.get(i));
			}
			if(menuItems.get(i) instanceof Side) {
				sides.add((Side) menuItems.get(i));
			}
			if(menuItems.get(i) instanceof Salad) {
				salads.add((Salad) menuItems.get(i));
			}
			if(menuItems.get(i) instanceof Dessert) {
				desserts.add((Dessert) menuItems.get(i));
			}
		}
	}

	/**
	 * Gets the entrees.
	 *
	 * @return the entrees
	 */
	public ArrayList<Entree> getEntrees() {
		return entrees;
	}

	/**
	 * Sets the entrees.
	 *
	 * @param entrees the new entrees
	 */
	public void setEntrees(ArrayList<Entree> entrees) {
		this.entrees = entrees;
	}

	/**
	 * Gets the sides.
	 *
	 * @return the sides
	 */
	public ArrayList<Side> getSides() {
		return sides;
	}

	/**
	 * Sets the sides.
	 *
	 * @param sides the new sides
	 */
	public void setSides(ArrayList<Side> sides) {
		this.sides = sides;
	}

	/**
	 * Gets the salads.
	 *
	 * @return the salads
	 */
	public ArrayList<Salad> getSalads() {
		return salads;
	}

	/**
	 * Sets the salads.
	 *
	 * @param salads the new salads
	 */
	public void setSalads(ArrayList<Salad> salads) {
		this.salads = salads;
	}

	/**
	 * Gets the desserts.
	 *
	 * @return the desserts
	 */
	public ArrayList<Dessert> getDesserts() {
		return desserts;
	}

	/**
	 * Sets the desserts.
	 *
	 * @param desserts the new desserts
	 */
	public void setDesserts(ArrayList<Dessert> desserts) {
		this.desserts = desserts;
	}
	
	/**
	 * Method randomMenu.
	 *
	 * @param name the name
	 * @return the Menu
	 */
	public Menu randomMenu(String name) {

		Entree entree=entrees.get((int)(Math.random()*entrees.size()));
		Side side=sides.get((int)(Math.random()*sides.size()));
		Salad salad=salads.get((int)(Math.random()*salads.size()));
		Dessert dessert=desserts.get((int)(Math.random()*desserts.size()));

		return new Menu(name,entree,side,salad,dessert);	
	}
	
	/**
	 * Method minCaloriesMenu.
	 *
	 * @param name the name
	 * @return the Menu
	 */
	public Menu minCaloriesMenu(String name) {		
		int min=Integer.MAX_VALUE;
		int[] index=new int[4];
		for(int i=0;i<entrees.size();i++) {
			if(min>entrees.get(i).getCalories()) {
				min=entrees.get(i).getCalories();
				index[0]=i;
			}
		}
		min=Integer.MAX_VALUE;
		for(int i=0;i<sides.size();i++) {
			if(min>sides.get(i).getCalories()) {
				min=sides.get(i).getCalories();
				index[1]=i;
			}
		}
		min=Integer.MAX_VALUE;
		for(int i=0;i<salads.size();i++) {
			if(min>salads.get(i).getCalories()) {
				min=salads.get(i).getCalories();
				index[2]=i;
			}
		}
		min=Integer.MAX_VALUE;
		for(int i=0;i<desserts.size();i++) {
			if(min>desserts.get(i).getCalories()) {
				min=desserts.get(i).getCalories();
				index[3]=i;
			}
		}

		return new Menu(name,entrees.get(index[0]),
				sides.get(index[1]),
				salads.get(index[2]),
				desserts.get(index[3]));
	}
	
	/**
	 * Method maxCaloriesMenu.
	 *
	 * @param name the name
	 * @return the Menu
	 */
	public Menu maxCaloriesMenu(String name) {
		int max=Integer.MIN_VALUE;
		int[] index=new int[4];
		for(int i=0;i<entrees.size();i++) {
			if(max<entrees.get(i).getCalories()) {
				max=entrees.get(i).getCalories();
				index[0]=i;
			}
		}
		max=Integer.MIN_VALUE;
		for(int i=0;i<sides.size();i++) {
			if(max<sides.get(i).getCalories()) {
				max=sides.get(i).getCalories();
				index[1]=i;
			}
		}
		max=Integer.MIN_VALUE;
		for(int i=0;i<salads.size();i++) {
			if(max<salads.get(i).getCalories()) {
				max=salads.get(i).getCalories();
				index[2]=i;
			}
		}
		max=Integer.MIN_VALUE;
		for(int i=0;i<desserts.size();i++) {
			if(max<desserts.get(i).getCalories()) {
				max=desserts.get(i).getCalories();
				index[3]=i;
			}
		}

		return new Menu(name,entrees.get(index[0]),
				sides.get(index[1]),
				salads.get(index[2]),
				desserts.get(index[3]));
	}


}
