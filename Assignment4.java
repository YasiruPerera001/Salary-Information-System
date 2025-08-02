import java.util.*;
class Assignment4{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("|			SALARY INFORMATION SYSTEM			 |");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println();
		
		System.out.println("[1] Calculate Income Tax");
		System.out.println("[2] Calculate Annual Bonus");
		System.out.println("[3] Calculate Loan amount"+'\n');

		System.out.print("Enter an option to continue > ");
		int option = input.nextInt();
		System.out.println();
		
		if(option==1){
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("|			  Calculate Income Tax			 	 |");
			System.out.println("--------------------------------------------------------------------------");
			System.out.println();
			
			System.out.print("Input Employee name   - ");
			String name = input.next();
			System.out.print("Input Employee salary - ");
			int salary = input.nextInt();
			System.out.println();
			
			double income_tax;
			double tax_rate1 = (41667*0.06);
			double tax_rate2 = (41667*0.12);
			double tax_rate3 = (41667*0.18);
			double tax_rate4 = (41667*0.24);
			double tax_rate5 = (41667*0.30);
			
			if(salary<=100000){
				income_tax = 0;
				System.out.println("You have to pay Income Tax per month: "+(int)income_tax);
			}
			else if(salary<=141667){
				income_tax = ((double)salary-100000)*0.06;
				System.out.println("You have to pay Income Tax per month: "+(int)income_tax);
			}
			else if(salary<=183333){
				income_tax = ((double)salary-141667)*0.12;
				income_tax+=tax_rate1;
				System.out.println("You have to pay Income Tax per month: "+(int)income_tax);
			}
			else if(salary<=225000){
				income_tax = ((double)salary-183333)*0.18;
				income_tax+=(tax_rate1+tax_rate2);
				System.out.println("You have to pay Income Tax per month: "+(int)income_tax);
			}
			else if(salary<=266667){
				income_tax = ((double)salary-225000)*0.24;
				income_tax+=(tax_rate1+tax_rate2+tax_rate3);
				System.out.println("You have to pay Income Tax per month: "+(int)income_tax);
			}
			else if(salary<=308333){
				income_tax = ((double)salary-266667)*0.30;
				income_tax+=(tax_rate1+tax_rate2+tax_rate3+tax_rate4);
				System.out.println("You have to pay Income Tax per month: "+(int)income_tax);
			}
			else{
				income_tax = ((double)salary-308333)*0.36;
				income_tax+=(tax_rate1+tax_rate2+tax_rate3+tax_rate4+tax_rate5);
				System.out.println("You have to pay Income Tax per month: "+(int)income_tax);
			}
		}
		else if(option==2){
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("|			  Calculate Annual Bonus		 	 |");
			System.out.println("--------------------------------------------------------------------------");
			System.out.println();
			
			System.out.print("Input Employee name   - ");
			String name = input.next();
			System.out.print("Input Employee salary - ");
			int salary = input.nextInt();
			System.out.println();
			
			String print1 = "Annual bonus	- ";
			double bonus1 = 5000;
			double newsalary = salary;
			
			if(salary<100000){
				System.out.printf("%s%.1f",print1,bonus1);
			}
			else if(salary<199999){
				newsalary*=0.10;
				System.out.printf("%s%.1f",print1,newsalary);
			}
			else if(salary<299999){
				newsalary*=0.15;
				System.out.printf("%s%.1f",print1,newsalary);
			}
			else if(salary<399999){
				newsalary*=0.20;
				System.out.printf("%s%.1f",print1,newsalary);
			}
			else{
				newsalary*=0.35;
				System.out.printf("%s%.1f",print1,newsalary);
			}
		}
		else if(option==3){
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("|			  Calculate Loan amount			 	 |");
			System.out.println("--------------------------------------------------------------------------");
			System.out.println();
			
			System.out.print("Input Employee name   - ");
			String name = input.next();
			System.out.print("Input Employee salary - ");
			int salary = input.nextInt();
			System.out.print("Input number of year  - ");
			int year= input.nextInt();
			System.out.println();
			
			double months = year*12;
			double r = 0.15;
			double base = 1+(r/12);
			
			if(salary<50000){
				System.out.println("You can not get a loan because your salary lessthan Rs.50 000...");
			}
			else if(salary>50000 && year<=5){
				double power = Math.pow(base,months);
				double Loan_amount = ((double)salary*0.60)*((1-(1/power))/(r/12));
				int newamount = (int)(Loan_amount/1000)*1000;
				System.out.println("You can get loan amount : "+newamount);
			}
			else{
				System.out.println("Sorry! maximum number of the year is 5");
			}
		}
	}
}

