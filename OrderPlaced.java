package pizza_order;

public class OrderPlaced implements Orders{
	int added=0;
	Pizza p=new Pizza();

	public int addCheese() {
		System.out.println("Extra cheese added:");
		added=added+p.getExtraCheese();
		return added;
	}

	public int addToppings() {
		System.out.println("Extra Topings added:");
		added=added+p.getExtraToppings();
		return added;
	}

	public void withdraw(int choice, double amt) {
		switch(choice) {
		case 1:{
			if(amt>=p.getPizza()) {
				double balance=amt-p.getPizza();
				System.out.println("Balance:"+balance);
				
			}
			else {
				System.out.println("INSUFFICIENT BALANCE TO PURCHASE");
			}
			break;
		}
		case 2:{
			if(amt>=p.getChickenPizza()) {
				double balance=amt-p.getChickenPizza();
				System.out.println("Balance:"+balance);
				
			}
			else {
				System.out.println("INSUFFICIENT BALANCE TO PURCHASE");
			}
			break;
		}
		case 3:{
			if(amt>=p.getOnionPizza()) {
				double balance=amt-p.getOnionPizza();
				System.out.println("Balance:"+balance);
				
			}
			else {
				System.out.println("INSUFFICIENT BALANCE TO PURCHASE");
			}
			break;
		}
		case 4:{
			if(amt>=p.getTandoorichickenPizza()) {
				double balance=amt-p.getTandoorichickenPizza();
				System.out.println("Balance:"+balance);
				
			}
			else {
				System.out.println("INSUFFICIENT BALANCE TO PURCHASE");
			}
			break;
		}
		case 5:{
			if(amt>=p.getDoublecheesePizza()) {
				double balance=amt-p.getDoublecheesePizza();
				System.out.println("Balance:"+balance);
				
			}
			else {
				System.out.println("INSUFFICIENT BALANCE TO PURCHASE");
			}
			break;
		}
		
		}
		
	}

}
