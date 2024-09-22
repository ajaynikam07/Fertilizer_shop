package Mahesh_krushiseva_kendra;

import java.util.Scanner;

public class MainClass {

	public static void Calling() {
		Scanner sc = new Scanner(System.in);
		Admin ad = new Admin(); // creating object of admin class
		User user = new User();

		System.out.println("Welcome to mahesh krushi seva kendra");
		System.out.println("Enter Your choice: ");
		System.out.println("1}Admin And 2} User");
		int n=0;
		try {
			
			  n = sc.nextInt();
		} catch (Exception e) {
			System.out.println("LAVDYA ");
			// TODO: handle exception
		}

		switch (n) {

		case 1: {
			try {
				System.out.println("Enter Your Admin id : ");
				String name = sc.next();
				System.out.println("Enter Your Admin Password: ");
				int password = sc.nextInt();
				ad.login(name, password);
			} catch (Exception e) {
				System.out.println("Wrong Input Entered!!");
			}

		}
			break;
		case 2: {
			user.product();

		}
			break;
		default:
			System.out.println("Please Enter valid Choice !!");
		}

	}

	public static void main(String[] args) {
		Calling();
	}
}
