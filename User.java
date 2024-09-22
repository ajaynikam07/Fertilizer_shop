package Mahesh_krushiseva_kendra;

import java.util.Scanner;
import java.util.logging.Handler;

public class User {
	
	Scanner sc = new Scanner(System.in);
    UserProductBill U=new UserProductBill();
	int fertilizer;
	int herbisites;
	int Incetisites;
	int Tonic;

	public void product() {

		System.out.println("Welcome Sir ");
		System.out.println("Here Our Products ");
		System.out.println("Fertilizers");
		System.out.println("Urea Rs.1500/-");

		System.out.println("All Incentisites Rs.500/-");
		System.out.println("All Herbisites Rs.800/-");
		System.out.println("All Tonics Rs.300/-");
		System.out.println("Thank You !!");

		getproduct();
		U.UserBill();

	}

	public void getproduct() {
		int q = 0;
		
		System.out.println("How much Product You want: ");
		q = sc.nextInt();
		
		do {
			System.out.println("Enter Your choice: ");
			System.out.println("F for Fertilizers\nI for Incentisites for \nH for Herbites \nT for Tonics");
			char v = sc.next().charAt(0);

			switch (v) {
			case 'F': {
				try {
					System.out.println("How many Fertizers bag You want : ");
					fertilizer = sc.nextInt();
					U.setFertilizerqu(fertilizer);
				} catch (NumberFormatException e) {
					System.out.println("enter only numbers!1");
				}

			}
				break;
			case 'I': {
				System.out.println("How many Incetisites You want ??");
				try {
					Incetisites=sc.nextInt();
					U.setIncetisitesqu(Incetisites);
				} catch (Exception e) {
					System.out.println("enter only numbers!1");
				}

			}
				break;
			case 'H': {
				System.out.println("How many herbisites  You want ??");
				try {
					herbisites=sc.nextInt();
					U.setHerbisitesqu(herbisites);
				} catch (Exception e) {
					System.out.println("enter only numbers!1");
				}

			}
				break;
			case 'T': {
				System.out.println("How many Tonic  You want ??");
				try {
					Tonic=sc.nextInt();
					U.setTonicqu(Tonic);
				} catch (Exception e) {
					System.out.println("enter only numbers!1");
				}

			}
				break;
			default:
				System.out.println("Enter valid Enput");
			}

		} while (0 != --q);
		
		 
	}
	
	
}
