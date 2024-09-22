package Mahesh_krushiseva_kendra;

import java.util.Scanner;

public class Admin {
 
	public void login(String name, int password) {
     Scanner sc=new Scanner(System.in);
     
		try {
			if (name.equalsIgnoreCase("vaibhav") && (password==123)) {
               System.out.println("Successfully Login Welcome Vaibhav Sir ");
               
               System.out.println("Enter Your choice vaibhav Sir : ");
               System.out.println("1} Checking stock in godoune : \n2} Set Products price");
               int n=sc.nextInt();
               switch (n) {
			case 1: {
				 System.out.println(new Products());
				 
			}
			break;
			case 2: {
				setProductprice();
				
			}
			break;
			default:
				 System.out.println("Enter valid choice");
			}
               
			} else {
				System.out.println("Plese enter valid input !!");
			}

		} catch (Exception e) {
			System.out.println("Something Wrong !!");
		}
		
		
	}
	
	public void setProductprice() {
		Scanner sc=new Scanner(System.in);
		User user=new User();
		UserProductBill U = new UserProductBill();
		System.out.println("Which product price you wnat to change: ");
		System.out.println("F for Fertilizers\nI for Incentisites for \nH for Herbites \nT for Tonics");
		char v = sc.next().charAt(0);
		
		switch (v) {
		case 'F': {
			try {
				System.out.println("Enter  Fertizers New price  : ");
				int fertilizer = sc.nextInt();
				U.setFertilizerqu(fertilizer);
				user.product();
			} catch (NumberFormatException e) {
				System.out.println("enter only numbers!1");
			}

		}
			break;
		case 'I': {
			try {
				System.out.println("Enter  Incetisites New Price??");
				int Incetisites=sc.nextInt();
				U.setSetIncetsitesprice(Incetisites);
				user.product();
			} catch (Exception e) {
				System.out.println("enter only numbers!1");
			}

		}
			break;
		case 'H': {
			System.out.println("Enter  herbisites  New Price  ??");
			try {
				int herbisites=sc.nextInt();
				U.setSetherbisiteprice(herbisites);
				user.product();
			} catch (Exception e) {
				System.out.println("enter only numbers!1");
			}

		}
			break;
		case 'T': {
			System.out.println(" Enter Tonic   new Price ??");
			try {
			int Tonic=sc.nextInt();
				U.setSettonicprice(Tonic);
				user.product();
			} catch (Exception e) {
				System.out.println("enter only numbers!1");
			}

		}
			break;
		default:
			System.out.println("Enter valid Enput");
		}

		
		
	}
	
	
	
}
