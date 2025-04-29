package pizza_order;

public class Pizza {
	private double pizza;
	private double chickenPizza;
	private double onionPizza;
	private double tandoorichickenPizza;
	private double doublecheesePizza;
	private int extraCheese;
	private int extraToppings;
	public double getPizza() {
		return pizza;
	}
	public void setPizza(double pizza) {
		this.pizza = pizza;
	}
	public double getChickenPizza() {
		return chickenPizza;
	}
	public void setChickenPizza(double chickenPizza) {
		this.chickenPizza = chickenPizza;
	}
	public double getOnionPizza() {
		return onionPizza;
	}
	public void setOnionPizza(double onionPizza) {
		this.onionPizza = onionPizza;
	}
	public double getTandoorichickenPizza() {
		return tandoorichickenPizza;
	}
	public void setTandoorichickenPizza(double tandoorichickenPizza) {
		this.tandoorichickenPizza = tandoorichickenPizza;
	}
	public double getDoublecheesePizza() {
		return doublecheesePizza;
	}
	public void setDoublecheesePizza(double doublecheesePizza) {
		this.doublecheesePizza = doublecheesePizza;
	}
	public int getExtraCheese() {
		return extraCheese;
	}
	public void setExtraCheese(int extraCheese) {
		this.extraCheese = extraCheese;
	}
	public int getExtraToppings() {
		return extraToppings;
	}
	public void setExtraToppings(int extraToppings) {
		this.extraToppings = extraToppings;
	}
	public Pizza() {
		super();
		this.pizza = 150;
		this.chickenPizza = 200;
		this.onionPizza = 180;
		this.tandoorichickenPizza = 230;
		this.doublecheesePizza = 190;
		this.extraCheese = 50;
		this.extraToppings = 50;
	}
	public String toString() {
		return "1.Pizza [pizza=" + pizza + "\n2. chickenPizza=" + chickenPizza + "\n3.onionPizza=" + onionPizza
				+ "\n4.tandoorichickenPizza=" + tandoorichickenPizza + "\n5.doublecheesePizza=" + doublecheesePizza;
	}
	
      
}
