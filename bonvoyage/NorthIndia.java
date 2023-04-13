package BonVoyage;
import java.util.*;

public class NorthIndia extends Tourism{
	public int a=10;
	public NorthIndia()
	{
		super();
	}
	public NorthIndia(int persons)
	{
		super(persons);            // Usage of super
	}
	int Pilgrimage(int persons) {
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
			System.out.println("Sorry,these many seats are not available! :(");
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
	int NatureHoliday(int persons) {
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
			System.out.println("Sorry,these many seats are not available! :(");
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
	float flightcost_pilgrimage(int persons)
	{
		float a1;
		a1=20000*persons;
		System.out.println("Total flight cost is "+a1+"\nThank you for booking");
		return a1;
	}

	float flightcost_natureholiday(int persons)
	{
		float a2;
		a2=30000*persons;
		System.out.println("Total flight cost is "+a2+"\nThank you for booking");
		return a2;
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
	void details()       // Method overriding
	{
		super.details();
		System.out.println("North India's incredible wealth of spiritual centres, scenic mountainscapes, picturesque lakes, lush valleys,"
				+ " and remnants of ancient empires give us some of the best and"
				+ " most exciting holiday destinations in the country.");
	}
}
