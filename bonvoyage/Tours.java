package BonVoyage;
import java.util.*;
class Total_cost implements Runnable{
	int no_of_persons;
    Thread t ;
	Total_cost(int n)
	{
		t= new Thread(this,"tour");
		no_of_persons=n;
		t.start();
	}
	public void run()
	{
		try {
		System.out.println("Your total accomodation charge is "+7000*no_of_persons);
		Thread.sleep(10);
		}
		catch(InterruptedException e)
		{
			System.out.println("Session interrupted");
		}
	}
}
class PersonException extends Exception{
	PersonException(String s)
	{
		super(s);
	}
}
interface Hotel
{
	void hoteltype();
	default void food()
	{
		System.out.println("Complimentary breakfast available");    // implementing interfaces with default method
	}
}

class Tourism implements Hotel
{
	int persons;
	int booking_fee;
	public Tourism()                   // Constructor overloading
	{
		booking_fee = 50;
		persons=1;
	}

	public Tourism(int persons)
	{
		this.persons=persons;      //Usage of this keyword
		booking_fee = 50;
	}

	public void hoteltype()
	{
		System.out.println("Accomodation options:\n1.AC rooms\n2.Non AC rooms");
	}
	void details()           // Method overriding
	{
		System.out.println("Travelling is an investment in yourself!!!!!");
	}
}

class SouthIndia extends Tourism{

	SouthIndia()
	{
		super();
	}
	SouthIndia(int persons)
	{
		super(persons);
	}
	int SouthIndiatrip(int persons) {
		int availability[] = new int[30];
		int seat = -1;
		int i,j;
		boolean k=true;
		int count=0;
		for(i=0;i<30;i++)
		{
			if(availability[i]==1)
			{
				count++;
			}
		}
		int remaining=30-count;
		if(persons>remaining)
		{
			k=false;
			System.out.println("Sorry,seats are full:(");
		}
		else
		{
		for(j=0;j<persons;j++)
		{
			for(i=0;i<30;i++)
			{
				if(availability[i]==0)
				{
					seat=i;
					availability[i]=1;
					break;
				}

			}

		}
		}
		if(k==true)
		{

			return 1;
		}
		else {
			return 2;
		}

	}
	int SouthIndiaCultureTrip(int persons) {
		int availability[] = new int[30];
		int seat = -1;
		int i,j;
		boolean k=true;
		int count=0;
		for(i=0;i<30;i++)
		{
			if(availability[i]==1)
			{
				count++;
			}
		}
		int remaining=30-count;
		if(persons>remaining)
		{
			k=false;
			System.out.println("Sorry,seats are full:(");
		}
		else
		{
		for(j=0;j<persons;j++)
		{
			for(i=0;i<30;i++)
			{
				if(availability[i]==0)
				{
					seat=i;
					availability[i]=1;
					break;
				}

			}

		}
		}
		if(k==true)
		{

			return 1;
		}
		else {
			return 2;
		}

	}
	float flightcost_southindia(int persons)
		{
			float a3;
			a3=15000*persons;
			System.out.println("Total flight cost is "+a3+"\nThank you for booking");
			return a3;
		}
		float flightcost_southindiaculture(int persons)
		{
			float a4;
			a4=18000*persons;
			System.out.println("Total flight cost is "+a4+"\nThank you for booking");
			return a4;
		}
		public void hoteltype()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Accomodation options: \n1.Non AC rooms\n2.AC rooms");
			System.out.println("Enter correct choice   -    Default choice will be Non AC room");
			int a = sc.nextInt();
			if(a==1)
			{
				System.out.println("Non AC room has been booked");
			}
			else if(a==2)
			{
				System.out.println("AC room has been booked");
			}
			else {
				System.out.println("Non AC room has been booked");
			}


		}
		void details()
		{
			super.details();
			System.out.println("South India is a mystic and magnificent destination that combines bright colours, fascinating cultures, and beautiful landscapes.");
		}
	}

	public class Tours {

	public static void main(String[] args) {

		int no_of_persons;
		boolean custno=true,p=true,q=true;
		int j=1;
		int i;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("-------   Bon Voyage tours   -------");
			System.out.println("Please enter your name");
			String name1 = sc.nextLine();                    // Reading console input using scanner class
			//sc.nextLine();
				System.out.println("Hello, "+name1);
		    System.out.println("Enter the number of seats to be booked");
		    no_of_persons = sc.nextInt();

	        if(no_of_persons==1)
	        {
	        	Tourism customer = new Tourism();            // Object declaration
	        }
	        else if(no_of_persons>1){
	        	Tourism customer = new Tourism(no_of_persons);     // Passing integer to constructor
	        }

	        if(no_of_persons>0)
	        {
	        	System.out.println("Enter the details of passenger");
	        	for(i=1;i<=no_of_persons;i++)
	        	{
	        		System.out.println("Enter the name of passenger "+i);
	        		String name = sc.nextLine();
	        		sc.next();
	        		System.out.println("Enter the age of the passenger");
	        		int age = sc.nextInt();
	        		System.out.println("Enter the gender of the passenger");
	        		System.out.println("Male --- M\nFemale --- F\nOther --- O");
	        		String  gender = sc.nextLine();
					sc.next();

	        	}
	        	System.out.println("Types of packages we have for you :");
	        	System.out.println("     ------------ North India ----------");
	        	System.out.println("Pilgrimage :                Nature holidays : ");
	        	System.out.println("      a.Kedarnath                         a.Ladakh");
	        	System.out.println("      b.Ayodhya                           b.Shimla");
	        	System.out.println("      c.Haridwar                          c.Manali");
	        	System.out.println("      d.Kaashi                            d.Kashmir");
	        	System.out.println("      e.Varanasi                          e.Nainital");
	        	System.out.println("     ");
	        	System.out.println("     ------------ South India -----------");
	        	System.out.println("South India-Nature holidays :               South Indian Cultural Tour");
	        	System.out.println("      a.Ooty                      					a.Hampi");
	        	System.out.println("      b.Coorg 						               		b.Badami");
	        	System.out.println("      c.Munnar                              c.Kanyakumari");
	        	System.out.println("      d.Pondicherry                      		d.Rameshwaram");
	        	System.out.println("      e.Aleppy                            	e.Kumbakonam");

	        	System.out.println("Select package");
	        	System.out.println("1.North India");
	        	System.out.println("2.South India");


	        	do {
	        		int packages = sc.nextInt();
	        		switch(packages)
		        	{
		        	case 1:System.out.println("North India tour is selected");
		        	       NorthIndia tourni = new NorthIndia(no_of_persons);
		        	       tourni.details();
		        	       System.out.println("We have two packages in North India tour");
		        	       System.out.println("1.Pilgrimage\n2.Nature holidays");
		        	       System.out.println("Enter the package");
		        	       do {
		        	    	   int type = sc.nextInt();
		        	    	   switch(type)
		        	    	   {
		        	    	   case 1:System.out.println("Pilgrimage is selected");
		        	    	          int a=tourni.Pilgrimage(no_of_persons);
		        	    	          if(a==1)
		        	    	          {
		        	    	        	  tourni.hoteltype();
		        	    	        	  float a1=tourni.flightcost_pilgrimage(no_of_persons);
		        	    	        	//  new Total_cost(a1,no_of_persons);
		        	    	          }
		        	    	          q=false;
		        	    	          break;

		        	    	   case 2:System.out.println("Nature holiday package is selected");
		        	    	          int b=tourni.NatureHoliday(no_of_persons);
		        	    	          if(b==1)
		        	    	          {
		        	    	        	  tourni.hoteltype();
		        	    	        	  float a1=tourni.flightcost_natureholiday(no_of_persons);
		        	    	        	//  new Total_cost(a1,no_of_persons);
		        	    	          }
		        	    	          q=false;
		        	    	          break;

		        	    	   default:System.out.println("Enter the valid choice");
		        	    	           q=true;
		        	    	           break;

		        	    	   }
		        	       }while(q==true);
		        	       p=false;
		        	       break;

		        	case 2:System.out.println("South India Tour is selected");
		        	   SouthIndia toursi = new SouthIndia(no_of_persons);
		        	   toursi.details();
	        	       System.out.println("We have two packages in South India tour");
	        	       System.out.println("1.South India-Nature holidays tour\n2.South Indian Cultural Tour");
	        	       System.out.println("Enter the package");
	        	       do {
	        	    	   int type = sc.nextInt();
	        	    	   switch(type)
	        	    	   {
	        	    	   case 1:System.out.println("South India-Nature holidays tour is selected");
	        	    	          int c=toursi.SouthIndiatrip(no_of_persons);
	        	    	          if(c==1)
	        	    	          {
	        	    	        	  toursi.hoteltype();
	        	    	        	  float a1=toursi.flightcost_southindia(no_of_persons);
	        	    	        //	  new Total_cost(a1,no_of_persons);
	        	    	          }
	        	    	          q=false;
	        	    	          break;

	        	    	   case 2:System.out.println("South Indian Cultural Tour is selected");
	        	    	          int d=toursi.SouthIndiaCultureTrip(no_of_persons);
	        	    	          if(d==1)
	        	    	          {
	        	    	        	  toursi.hoteltype();
	        	    	        	  float a1=toursi.flightcost_southindiaculture(no_of_persons);
	        	    	      //  	  new Total_cost(a1,no_of_persons);
	        	    	          }
	        	    	          q=false;
	        	    	          break;

	        	    	   default:System.out.println("Enter the valid choice");
	        	    	           q=true;
	        	    	           break;

	        	    	   }
	        	       }while(q==true);
		        	       p=false;
		        	       break;

		        	default:System.out.println("Enter valid choice");
		        		    p=true;
		        		    break;
		        	}

	        	}while(p==true);

	        	new Total_cost(no_of_persons);

	        }
	        if(no_of_persons==0) {                                                              // Exception Handling
		    	 try
		    	  {
		    		  throw new PersonException("no_of_persons");
		    	  }

		          catch(PersonException a)
		         {
				      System.out.println("Please enter the number of seats!!");
				 }

	        }
			System.out.println("Do we have next customer?\nPress 1 for Yes any other number for No");
		    int cust=sc.nextInt();
		    if(cust!=1)
		    {
			   custno=false;

		    }
		    else
		    {
			   custno=true;
		    }
		    j++;
		}while(custno==true);

	}

}
