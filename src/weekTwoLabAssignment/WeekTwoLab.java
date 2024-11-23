package weekTwoLabAssignment;

public class WeekTwoLab {

	public static void main(String[] args) {
		//
		// BOOLEANS and CONDITIONALS:
		//
		
		// 1. Variable Declaration:
		//		a. Create a variable named age and assign it a value of 14

		int age = 14;
		
		// 2. Print a Boolean Expression:
		//		a. Print the boolean expression age >= 16 to the console and note the results.
		//		a. Change the value of age to 18 and print again.

		System.out.println(age >= 16); //false when age = 14
		System.out.println(age >= 16); //true when age = 18
		
		// 3. Can you drive?
		//		a. Using a conditional, print one of the following:
		//				i. "You can drive" if age is greater than or equal to 16
		//				ii. "You cannot drive" otherwise
		//
		//		a. Change the value of age and rerun to see the result
	
		if(age >= 16) {
			System.out.println("You can drive!"); //you can drive when age >= 16
		} else { System.out.println("You can't drive...womp womp."); } //you can't drive when age < 16
		
		// 4. Update Solution to Question 3 as follows:
		//		a. Add a new variable called hasLicense before the conditional.
		//		b. Change the boolean expression in the conditional to additionally 
		//				include the need for hasLicense to be true.
		//		c. Try changing the values of age and hasLicense and note the different results.

		boolean hasLicense = true;
			if(age >= 16 && hasLicense == true) {
				System.out.println("You can drive!"); //you can drive when age >= 16 && hasLicense = true
			} else { System.out.println("Better stick to a horse and saddle..."); } //you can't drive if hasLicense = false && age < 16
		
		// 5. Milk?
		//		a. Create two new variables - costOfMilk and thirstLevel
		//		b. Create a new conditional that prints "Milk Please" if costOfMilk is less than 2.50 
		//				or if thirstLevel is greater than 6 and prints "No Thanks" otherwise.
		//		c. Change the values and note the different results.

		double costOfMilk = 2.15;
		int thirstLevel = 10;
			if(costOfMilk < 2.50 || thirstLevel > 6) { //if thirstLevel is > 6 or if the costOfMilk is < 2.50, you will get milk please.
				System.out.println("Milk Please");	 	//otherwise you'll be prompted with no thanks.
			} else { System.out.println("No Thanks"); } 
		
		// 6. Cookie Distribution: 
		//			Note:  You will evenly distribute all of the cookies to the children 
		//					and as the adult you get to keep the remaining cookies for yourself.
		//
		//		a. Create two variables called numberOfCookies and numberOfChildren.
		//		b. Initialize the two variables to integer values.
		//		b. Use a conditional to print the following based on the following conditions:
		//				i. If there are 0 cookies remaining, print "Sad Face"
		//				ii. If there are less than 2 cookies, print "Yes!"
		//				iii. If there are less than 5 cookies, print "Whoohoooo!"
		//				iv. If there are 5 or more cookies, print "Jackpot!"

		int numberOfCookies = 50;
		int numberOfChildren = 11;	
		int remainingCookies = numberOfCookies % numberOfChildren;	//in this ex. there are 6 remaining cookies
			if(remainingCookies == 0) {
				System.out.println(" :( ");
			} else if(remainingCookies < 2) {
				System.out.println("Yes!");
			} else if(remainingCookies < 5) {
				System.out.println("Whoohoooo!");
			} else if(remainingCookies >= 5) {
				System.out.println("Jackpot!");		//prints Jackpot!
			}
				
				
		// 7.  Loyalty Member Program:
		//		a. Create a variable called loyaltyMemberStatus and assign the value "SILVER"
		//		b. Create a variable called loyaltyMemberDiscount and assign the value 0.0
		//		c. Using a switch, set the value of loyaltyMemberDiscount based on 
		//				the following loyaltyMemberStatus scale: 
		//				i. "SILVER" is 0.10
		//				ii. "GOLD" is 0.15
		//				iii. "PLATINUM" is 0.25
		
		String loyaltyMemberStatus = "GOLD";
		double loyaltyMemberDiscount = 0.0;
			switch(loyaltyMemberStatus) {
			case "SILVER":
				loyaltyMemberDiscount = 0.0;
				break;
			case "GOLD":
				loyaltyMemberDiscount = 0.15;
				break;
			case "PLATINUM":
				loyaltyMemberDiscount = 0.25;
				break;
				
			} System.out.println(loyaltyMemberDiscount); //prints the assigned discount to correlating member status
		
		// 8. Using the Loyalty Member Program variables from Question 7, do the following:
		//		a. Create a variable called billTotal and assign a value
		//		b. Create a variable called adjustedTotal and assign it the billTotal minus 
		//				the loyaltyMemberDiscount percent of the billTotal
		//		c. If the adjustedBillTotal is greater than $500 upgrade the 
		//				loyaltyMemberStatus from SILVER to GOLD or from GOLD to PLATINUM

		double billTotal = 699.99;
		double adjustedTotal = billTotal - (billTotal * loyaltyMemberDiscount);
			if(adjustedTotal > 500) {
				if(loyaltyMemberStatus == "SILVER") {
					loyaltyMemberStatus = "GOLD";
				} else if(loyaltyMemberStatus == "GOLD") {
					loyaltyMemberStatus = "PLATINUM";
				}
			} System.out.println(loyaltyMemberStatus); //prints platinum
		
		// 9. Login -- username & password:
		//		a. Create two variables, username and password
		//		b. Create a conditional that prints one of the following:
		//				i. "login successful" if the username is "Tommy123" and the password is "12345"
		//				ii. "access denied" otherwise

		String username = "Tommy123";
		String password = "12345";
			if(username == "Tommy123" && password == "12345") {
				System.out.println("login successful");
			} else { System.out.println("access denied"); } //prints login successful
		
		//
		// LOOPS:
		//
		
		// 10. Write a for loop that prints each number from 0 to 9
		
			
			for(int i = 0; i < 10; i++) {
				System.out.println(i); //prints each number 0-9, ascending from 0
			}
		// 11. Write a for loop that prints each number from 10 to 0 backwards

		for(int a = 10; a >= 0; a--) {
			System.out.println(a); //prints each number 10-0, descending from 10
		}
		
		// 12. Write a for loop that prints every other number from 0 to 100

		for(int b = 0; b <= 100; b++) {
			if(b % 2 == 0) {
				System.out.println(b); //prints every other number starting from 0 to 100 ex. 0, 2, 4, 6, etc.
			}
		}
		
		// 13. Write a for loop that iterates from 0 to 100 and prints 
		//			"EVEN" if the number is even and "ODD" if it's odd

		for(int c = 0; c <= 100; c++) {
			if(c % 2 == 0) {
				System.out.println(c + " EVEN");
			} else { System.out.println(c + " ODD");} //prints every number from 0-100 with its correlating description ex. "1 odd, 2 even, etc."
		}
		
		// 14. Write a while loop that starts at 100 and iterates backwards by 1 until it reaches 0
		//			within the loop, divide each number by 3 and print the remainder to the console.
		
		int d = 100;
		while(d > 0) {
			System.out.println(d + " " + (d % 3));
			d--;
		}
		
	}

}
