import java.util.Scanner;
import java.lang.Math;

class Main {
  public static double appleoffer(int apples){
	double applesdiscount = 0.0;
    int remainder = apples % 2;
	int quotient = apples/2;
	int totalapples = remainder + quotient;
	applesdiscount = totalapples * 0.60;
  return applesdiscount;
	}
  public static double orangeoffer(int oranges){
	double orangessdiscount = 0.0;
    int remainder = oranges % 3;
	int quotient = oranges/3;
	int totaloranges = remainder + quotient;
	orangessdiscount = totaloranges * 0.25;
  return orangessdiscount;
	}
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
	double price, cash, code, owed = 0.0, applediscount = 0.0,orangediscount = 0.0;
  double afterappleoffer = 0.0, afterorangeoffer = 0.0;
	double total = 0.0;
	int noofItems = 0, apples = 0, oranges = 0;

	System.out.print("Enter price or 0 to quit: ");
	price = input.nextDouble();
    
		while (price != 0)
		{
			//check only for the apples and oranges and add the values
			if(price == 0.60 || price == 0.25){
				if(price == 0.60){
					apples = apples + 1;
				}
				if(price == 0.25){
					oranges = oranges + 1;
				}
			   total = total + price;
			   noofItems = noofItems + 1;
			   //System.out.println("Number of Items:%d", noofItems);
			}
			else{
				System.out.println("Apple and Oranges cost is 0.60 and 0.25 respectively. Enter correct price\n");
			}
			System.out.printf("Enter price or 0 to quit: ");
			price = input.nextDouble();

		}  
	  	
    System.out.printf("Item Total:%.2f%n",total);
    System.out.print("Enter 1 for Apple offer and 2 for Orange offer or 0 to exit ");
		code = input.nextDouble();
    if(code == 1){
      if(apples >= 2){
        applediscount = appleoffer(apples);
        afterappleoffer = total - applediscount;
        System.out.println("Apples discount:"+ applediscount);
        System.out.printf("Total after Apple Discount:%.2f%n", afterappleoffer);
      }
    }
    if(code == 2){
      if(oranges >= 3){
        orangediscount = orangeoffer(oranges);
        afterorangeoffer = total - orangediscount;
        System.out.println("Oranges Discount:"+orangediscount);
        System.out.printf("Total after Orange Discount:%.2f%n", afterorangeoffer);
      }
    }
    System.out.printf("\nEnter the cash given:");
    cash = input.nextDouble();
    
		//amount owed
		if (cash > total){
			if(code == 1){
				owed = cash - afterappleoffer;
				
			}
			else if(code == 2){
				owed = cash - afterorangeoffer;
			}
			else{
			owed = cash - total;
			}
		}
		else if(cash == total || cash == afterappleoffer || cash == afterorangeoffer){
		  System.out.printf("Correct cash rendered\n");
		}
		else{
		  System.out.printf("Cash is insufficient\n");
		}
	System.out.printf("\nCash owed:%.2f%n", owed);
  }
}