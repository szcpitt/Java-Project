package edu.pitt.is17.ZHS48.menumanager;

// TODO: Auto-generated Javadoc
/**
 * Class MenuItem.
 *
 * @author Zhuocheng Shen
 * @created 11/18/2017
 */

public class MenuItem {
	
	/** The name. */
	private String name;
	
	/** The description. */
	private String description;
	
	/** The calories. */
	private int calories;
	
	/** The price. */
	private double price;

	/**
	 * Instantiates a new menu item.
	 */
	public MenuItem() {}
	
	/**
	 * Instantiates a new menu item.
	 *
	 * @param name the name
	 * @param desc the desc
	 * @param cal the cal
	 * @param price the price
	 */
	public MenuItem(String name, String desc, int cal, double price) {
		setName(name);
		setDescription(desc);
		setCalories(cal);
		setPrice(price);
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the calories.
	 *
	 * @return the calories
	 */
	public int getCalories() {
		return this.calories;
	}

	/**
	 * Sets the calories.
	 *
	 * @param calories the new calories
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Sets the price.
	 *
	 * @param price the new price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.name;
	}
}
