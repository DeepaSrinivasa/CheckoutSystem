import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double price, cash, owed = 0.0;
	double total = 0.0;
	int noofItems = 0;

	System.out.printf("Enter price or 0 to quit: ");
	price = input.nextDouble();
    
	while (price != 0)
	{
			//check only for the apples and oranges and add the values
		if(price == 0.60 || price == 0.25){
			total = total + price;
			noofItems = noofItems + 1;
		}
		else{
			System.out.println("Apple and Oranges cost is 0.60 and 0.25 respectively. Enter correct price\n");
		}
		System.out.printf("Enter price or 0 to quit: ");
		price = input.nextDouble();

	}  
    System.out.printf("Total:%.2f%n",total);
   
	System.out.printf("\nEnter the cash given:");
    cash = input.nextDouble();
    
	//amount owed
	if (cash > total){
		owed = cash - total;
	}
	else if(cash == total){
		System.out.printf("Correct cash rendered\n");
	}
	else{
		System.out.printf("Cash is insufficient\n");
	}
	System.out.printf("\nCash owed:%.2f%n", owed);
	}
}