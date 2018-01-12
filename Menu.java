package edu.pitt.is17.ZHS48.menumanager;
// TODO: Auto-generated Javadoc

/**
 * Class Menu.
 *
 * @author Zhuocheng Shen
 * @created 11/03/2017
 */
public class Menu {

	/** The name. */
	private String name;
	
	/** The entree. */
	private Entree entree;
	
	/** The salad. */
	private Salad salad;
	
	/** The side. */
	private Side side;
	
	/** The dessert. */
	private Dessert dessert;
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	//get and set
	public String getName() {
		return name;
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
	 * Gets the entree.
	 *
	 * @return the entree
	 */
	public Entree getEntree() {
		return entree;
	}
	
	/**
	 * Sets the entree.
	 *
	 * @param entree the new entree
	 */
	public void setEntree(Entree entree) {
		this.entree = entree;
	}
	
	/**
	 * Gets the salad.
	 *
	 * @return the salad
	 */
	public Salad getSalad() {
		return salad;
	}
	
	/**
	 * Sets the salad.
	 *
	 * @param salad the new salad
	 */
	public void setSalad(Salad salad) {
		this.salad = salad;
	}
	
	/**
	 * Gets the side.
	 *
	 * @return the side
	 */
	public Side getSide() {
		return side;
	}
	
	/**
	 * Sets the side.
	 *
	 * @param side the new side
	 */
	public void setSide(Side side) {
		this.side = side;
	}
	
	/**
	 * Gets the dessert.
	 *
	 * @return the dessert
	 */
	public Dessert getDessert() {
		return dessert;
	}
	
	/**
	 * Sets the dessert.
	 *
	 * @param dessert the new dessert
	 */
	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}
	
	/**
	 * Instantiates a new menu.
	 *
	 * @param name the name
	 */
	//Menu constructor
	public Menu(String name) {
		this.name=name;
		this.entree=null;
		this.side=null;
		this.dessert=null;
	}
	
	/**
	 * Instantiates a new menu.
	 *
	 * @param name the name
	 * @param entree the entree
	 * @param side the side
	 */
	public Menu(String name, Entree entree, Side side) {
		this.name=name;
		this.entree=entree;
		this.side=side;
		this.dessert=null;
	}
	
	/**
	 * Instantiates a new menu.
	 *
	 * @param name the name
	 * @param entree the entree
	 * @param side the side
	 * @param salad the salad
	 * @param dessert the dessert
	 */
	public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {
		this.name=name;
		this.entree=entree;
		this.side=side;
		this.salad=salad;
		this.dessert=dessert;
	}
	
	/**
	 * Method totalCalories.
	 *
	 * @return the int
	 */
	public int totalCalories() {
		int sum=0;
		if(!(entree==null)){
			sum+=entree.getCalories();
		}
		if(!(side==null)) {
			sum+=side.getCalories();
		}
		if(!(salad==null)) {
			sum+=salad.getCalories();
		}
		if(!(dessert==null)) {
			sum+=dessert.getCalories();
		}
		return sum;
	}

	/**
	 * Total price.
	 *
	 * @return the int
	 */
	public int totalPrice() {
		int sum=0;
		if(!(entree==null)){
			sum+=entree.getPrice();
		}
		if(!(side==null)) {
			sum+=side.getPrice();
		}
		if(!(salad==null)) {
			sum+=salad.getPrice();
		}
		if(!(dessert==null)) {
			sum+=dessert.getPrice();
		}
		return sum;
	}
	
	/**
	 * Method description.
	 *
	 * @return the String
	 */
	public String description() {	

		return name+"\n"+"Entree:"+entree.getName()+"\n"+entree.getDescription()+"\n"+"Calories:"+entree.getCalories()+"\n"+"Price:"+entree.getPrice()+"\n"+
				"Side:"+side.getName()+"\n"+side.getDescription()+"\n"+"Calories:"+side.getCalories()+"\n"+"Price:"+side.getPrice()+"\n"+
				"Side:"+salad.getName()+"\n"+salad.getDescription()+"\n"+"Calories:"+salad.getCalories()+"\n"+"Price:"+salad.getPrice()+"\n"+
				"Dessert:"+dessert.getName()+"\n"+dessert.getDescription()+"\n"+"Calories:"+dessert.getCalories()+"\n"+"Price:"+dessert.getPrice()+"\n";		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return name;
	}

}
