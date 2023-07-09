package naga;
import java.util.*;

public class CarDealer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cac=0;
		System.out.println("Select any one car model from below");
		System.out.println("1.Polo Trendline 2.Polo Highline 3.Virtus Trendline 4.Virtus Highline 5.Taigun Trendline 6.Taigun Highline 7.Taigun Topline");
		Scanner sc =new Scanner(System.in);
		int option=sc.nextInt();
		switch(option) 
		{
		case 1:
			cac=870000;
			break;
		case 2:
			cac=1009000;
			break;
		case 3:
			cac=1105000;
			break;
		case 4:
			cac=1308000;
			break;
		case 5:
			cac=1489000;
			break;
		case 6:
			cac=1542000;
			break;
		case 7:
			cac=1771000;
			break;
		
		}
		int RTO=113990;
		int TCS_charges=11000;
		System.out.println("Do you need Insurance");
		String insu=sc.next();
		System.out.println("Do you need Additional Accessories: ");
		String add_acc=sc.next();
		int insurance=47300;
		int accessories=15000;
		
		if(insu=="yes")
		{
			if(add_acc=="yes")
			{
				System.out.println("Dealer Discount: ");
				int discount=sc.nextInt();
				System.out.println("Total Cost: "+(cac+RTO+TCS_charges+insurance+accessories-(discount/100)*cac));
			}
			else 
			{
				accessories=0;
				System.out.println("Dealer Discount: ");
				int discount=sc.nextInt();
				System.out.println("Total Cost: "+(cac+RTO+TCS_charges+insurance+accessories-(discount/100)*cac));
			}
		}
		else
		{
			if(add_acc=="yes")
			{
				insurance=0;
				System.out.print("Dealer Discount: ");
				int discount=sc.nextInt();
				System.out.println("Total Cost: "+(cac+RTO+TCS_charges+insurance+accessories-((discount/100)*cac)));
			}
			else 
			{
				accessories=0;
				insurance=0;
				int discount=0;
				System.out.println("Total Cost: "+(cac+RTO+TCS_charges+insurance+accessories-(discount/100)*cac));
			}
		}
		sc.close();
	}

}
