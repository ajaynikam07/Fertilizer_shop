package Mahesh_krushiseva_kendra;

import java.util.Scanner;

public class UserProductBill {

	Scanner sc=new Scanner(System.in);
	private int fertilizerqu;
	private int herbisitesqu;
	private int Incetisitesqu;
	private int Tonicqu;

	private int setFertilizerprice=1500;
	private int setherbisiteprice=500;
	private int setIncetsitesprice=800;
	private int settonicprice=300;
	
	public int getFertilizerqu() {
		return fertilizerqu;
	}
	public void setFertilizerqu(int fertilizerqu) {
		this.fertilizerqu = fertilizerqu;
	}
	public int getHerbisitesqu() {
		return herbisitesqu;
	}
	public void setHerbisitesqu(int herbisitesqu) {
		this.herbisitesqu = herbisitesqu;
	}
	public int getIncetisitesqu() {
		return Incetisitesqu;
	}
	public void setIncetisitesqu(int incetisitesqu) {
		Incetisitesqu = incetisitesqu;
	}
	public int getTonicqu() {
		return Tonicqu;
	}
	public void setTonicqu(int tonicqu) {
		Tonicqu = tonicqu;
	}
	public int getSetFertilizerprice() {
		return setFertilizerprice;
	}
	public void setSetFertilizerprice(int setFertilizerprice) {
		this.setFertilizerprice = setFertilizerprice;
	}
	public int getSetherbisiteprice() {
		return setherbisiteprice;
	}
	public void setSetherbisiteprice(int setherbisiteprice) {
		this.setherbisiteprice = setherbisiteprice;
	}
	public int getSetIncetsitesprice() {
		return setIncetsitesprice;
	}
	public void setSetIncetsitesprice(int setIncetsitesprice) {
		this.setIncetsitesprice = setIncetsitesprice;
	}
	public int getSettonicprice() {
		return settonicprice;
	}
	public void setSettonicprice(int settonicprice) {
		this.settonicprice = settonicprice;
	}
	

	public void UserBill() {
		
		System.out.println("Enter Your Name: ");
		String name=sc.nextLine();
		double fettilizer=(getFertilizerqu()*getSetFertilizerprice());
		double herbisites=(getHerbisitesqu()*getSetherbisiteprice());
		double incetisites=(getIncetisitesqu()*getSetIncetsitesprice());
		double tonic=(getTonicqu()*getSettonicprice());
		//double total=(getFertilizerqu()*getSetFertilizerprice())+(getHerbisitesqu()*getSetherbisiteprice())+(getIncetisitesqu()*getSetIncetsitesprice()+(getIncetisitesqu()*getSetIncetsitesprice()));
		System.out.println("==============================");
		System.out.println("Customer Name: "+name);
		System.out.println("Fertilizers : "+(getFertilizerqu()*getSetFertilizerprice()));
		System.out.println("Herbisitesqu: "+getHerbisitesqu()*getSetherbisiteprice());
		System.out.println("Incetisites: "+getIncetisitesqu()*getSetIncetsitesprice());
		System.out.println("Tonics : "+getTonicqu()*getSettonicprice());
		System.out.println("Total Bill is : "+(fettilizer+herbisites+incetisites+tonic) );
		System.out.println("Thank You "+name+" Plese visit again !! ");
		
	}
	 
 

}
