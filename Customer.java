package pizza_order;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		Pizza p=new Pizza();
		int added=0;
		OrderPlaced o=new OrderPlaced();
		boolean b=true;
		Scanner op=new Scanner(System.in);
		System.out.println("WELCOME TO PIZZA HUT:");
		System.out.println("WOULD YOU LIKE TO SEE THE MENU:");
		String ans=op.next();
		if(ans.equalsIgnoreCase("yes")) {
			System.out.println("AVILABLE PIZZA'S TODAY IN THE MENU");
			System.out.println(p);
			do {
				System.out.println("WOULD YOU LIKE TO PURCHASE\nENTER THE NUMBER(1,2,3,4,5)");
				int num=op.nextInt();
				System.out.println("WOULD YOU LIKE TO PURCHASE");
				String reply=op.next();
				if(reply.equalsIgnoreCase("yes")) {
					System.out.println("WOULD YOU LIKE TO ADD EXTRA CHEESE(Rs.50/-");
					String ans1=op.next();
					if(ans1.equalsIgnoreCase("yes")) {
						added=o.addCheese();
					}
					System.out.println("WOULD YOU LIKE TO ADD EXTRA TOPPINGS");
					String ans2=op.next();
					if(ans2.equalsIgnoreCase("yes")) {
						added=o.addToppings();
					}
					System.out.println("ENTER THE AMOUNT AVILABLE");
					double amt=op.nextDouble();
					amt=amt-added;
					o.withdraw(num, amt);
					b=false;
					System.out.println("THANK YOU VISIT US AGAIN");
				}
			}while(b);
		}
		else {
			System.out.println("WOULD YOU LIKE TO SEE THE MENU AGAIN");
			String as=op.next();
			if(as.equalsIgnoreCase("yes")) {
				System.out.println(p);
			}
			else {
				System.out.println("THANK YOU");
				b=false;
			}
	
		}

	}

}
