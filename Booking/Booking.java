import java.util.*;

class Booking
{
	int age;
	String name,first_name,last_name;
	long mob;
	float ticket_amt=0;
	String ch,Address,ticketClassType,seat_type,meal_type;
	boolean temp=true,valid=false,flag;
	int arrival,option;
	static int a11101=50,a11102=50,a11103=50,a11104=50,a11105=50,a11106=50, a11107=50, a11108=50, a11109=50, a11110=50, a11111=50, a11112=50;
    int[] passengerCustomerIDs = new int[100];  //Assuming a maximum of 100 passengers
    int passengerCount = 0;   //Track the number of passengers
	Scanner sc=new Scanner(System.in);
	static
	{
		System.out.println("======================================================");
		System.out.println("********WELCOME TO THE AIRLINE BOOKING WEBSITE********");
		System.out.println("======================================================");
	}
		static int customer_id=4560;  //initialisation of customer id for a particular flight
	void search_flight()
	{
		customer_id++;
		System.out.println("Please choose the departure Airport(from):");
		System.out.println("Enter 1 for Mumbai");
		System.out.println("Enter 2 for Delhi");
		System.out.println("Enter 3 for Ahmedabad");
		flag=true;
		while(flag)
		{
			int departure=sc.nextInt();
			switch(departure)
			{
				case 1:
				System.out.println("Please choose the arrival Airport(to):");
				System.out.println("Enter 1 for Ahmedabad");
				System.out.println("Enter 2 for Delhi");
				flag=false;
				temp=true;
				while(temp)
				{
					arrival=sc.nextInt();
					switch(arrival)
					{
						case 1:
						System.out.println("The available flight(s) are:");
						System.out.println("Flight no.A11101 \nAirline:Indigo \nTakeoff time:-3:00PM \nLanding time:-4:30PM \nFrequency:Everyday \nTicket amount=3000");
						System.out.println();						
						System.out.println("Flight no.A11102 \nAirline:Indigo \nTakeoff time:-3:00PM \nLanding time:-4:30PM \nFrequency:Monday, Wednesday, Friday  \nTicket amount=3000");
						temp=false;
						sc.nextLine();
						while(true)
						{
							System.out.println("Enter the flight id you want to book");
							ch=sc.nextLine();
							
							if(ch.equalsIgnoreCase("A11101"))
							{							
								if(a11101>0)
								{
									ticket_amt=3000;
								}
								else
								{
									System.out.println("the flight is full..check another flight");
									ch=sc.nextLine();
								}
								a11101--;
								break;
							}
							else if(ch.equalsIgnoreCase("A11102"))
							{								
								if(a11102>0)
								{
									ticket_amt=3000;
								}
								else
								{
									System.out.println("the flight is full..");
								}
								a11102--;
								break;
							}
							else
							{
								System.out.println("pl. enter valid flight id");
							}
						}
						break;
						case 2:
						System.out.println("The available flight(s) are:");
						System.out.println("Flight no.A11103 \nAirline:Indigo \nTakeoff time:-3:00PM \nLanding time:-4:30PM \nFrequency:Monday,Wednesday & Friday\nTicket amount=3100");
						System.out.println();
						System.out.println("Flight no.A11104 \nAirline:Indigo \nTakeoff time:-3:00PM \nLanding time:-4:30PM \nFrequency:Tuesday & Thursday\nTicket amount=3750");
						temp=false;
						sc.nextLine();
						while(true)
						{
							System.out.println("Enter the flight id you want to book");
							ch=sc.nextLine();
							if(ch.equalsIgnoreCase("A11103"))
							{								
								if(a11103>0)
								{
									ticket_amt=3100;
								}
								else
								{
									System.out.println("the flight is full..check another flight");
									ch=sc.nextLine();
								}
								a11103--;
								break;
							}
							else if(ch.equalsIgnoreCase("A11104"))
							{							
								if(a11104>0)
								{
									ticket_amt=3750;
								}
								else
								{
									System.out.println("the flight is full..");
								}
								a11104--;
								break;
							}
							else
							{
								System.out.println("pl. enter valid flight id");
							}
						}
						break;
						default :
							System.out.println("Enter valid input.");
							sc.nextLine();
					}
				}
				break;
				case 2:
				System.out.println("Please choose the arrival Airport(to):");
				System.out.println("Enter 1 for Ahmedabad");
				System.out.println("Enter 2 for Mumbai");
				flag=false;
				temp=true;
				while(temp)
				{
					arrival=sc.nextInt();
					switch(arrival)
					{
						case 1:
						System.out.println("The available flight(s) are:");
						System.out.println("Flight no.A11105 \nAirline:Indigo \nTakeoff time:-3:00PM \nLanding time:-4:30PM \nFrequency:Monday, Wednesday, Thursday & Sunday\nTicket amount=4000");
						System.out.println();						
						System.out.println("Flight no.A11106 \nAirline:Indigo \nTakeoff time:-3:00PM \nLanding time:-4:30PM \nFrequency:Everyday\nTicket amount=4200");
						temp=false;
						sc.nextLine();
						while(true)
						{
							System.out.println("Enter the flight id you want to book");
							ch=sc.nextLine();
							
							if(ch.equalsIgnoreCase("A11105"))
							{								
								if(a11105>0)
								{
									ticket_amt=4000;
								}
								else
								{
									System.out.println("the flight is full..check another flight");
									ch=sc.nextLine();
								}
								a11105--;
								break;
							}
							else if(ch.equalsIgnoreCase("A11106"))
							{							
								if(a11106>0)
								{
									ticket_amt=4200;
								}
								else
								{
									System.out.println("the flight is full..");
								}
								a11106--;
								break;
							}
							else
							{
								System.out.println("pl. enter valid flight id");
							}
						}
						break;
						case 2:
						System.out.println("The available flight(s) are:");
						System.out.println("Flight no.A11107 \nAirline:Indigo \nTakeoff time:-3:00PM \nLanding time:-4:30PM \nFrequency:Everyday\nTicket amount=4300");
						System.out.println();
						System.out.println("Flight no.A11108 \nAirline:Indigo \nTakeoff time:-3:00PM \nLanding time:-4:30PM \nFrequency:Wednesday,Friday & Saturday\nTicket amount=4760");
						temp=false;
						sc.nextLine();
						while(true)
						{
							System.out.println("Enter the flight id you want to book");
							ch=sc.nextLine();
							if(ch.equalsIgnoreCase("A11107"))
							{							
								if(a11107>0)
								{
									ticket_amt=4300;
								}
								else
								{
									System.out.println("the flight is full..check another flight");
									ch=sc.nextLine();
								}
								a11107--;
								break;
							}
							else if(ch.equalsIgnoreCase("A11108"))
							{							
								if(a11108>0)
								{
									ticket_amt=4760;
								}
								else
								{
									System.out.println("the flight is full..");							
								}
								a11108--;
								break;
							}
							else
							{
								System.out.println("pl. enter valid flight id");
							}
						}
						break;
						default :
							System.out.println("Enter valid input.");							
					}
				}
				break;
				case 3:
				System.out.println("Please choose the arrival Airport(to):");
				System.out.println("Enter 1 for Mumbai");
				System.out.println("Enter 2 for Delhi");
				flag=false;
				temp=true;
				while(temp)
				{
					arrival=sc.nextInt();
					switch(arrival)
					{
						case 1:
						System.out.println("The available flight(s) are:");
						System.out.println("Flight no.A11109 \nAirline:Indigo \nTakeoff time:-3:00PM \nLanding time:-4:30PM \nFrequency:Tuesday, Thursday, Saturday & Sunday\nTicket amount=3000");
						System.out.println();				
						System.out.println("Flight no.A11110 \nAirline:Indigo \nTakeoff time:-3:00PM \nLanding time:-4:30PM \nFrequency:Monday, Wednesday & Sunday\nTicket amount=3700");
						temp=false;
						sc.nextLine();
						while(true)
						{
							System.out.println("Enter the flight id you want to book");
							ch=sc.nextLine();
							
							if(ch.equalsIgnoreCase("A11109"))
							{								
								if(a11109>0)
								{
									ticket_amt=3000;
								}
								else
								{
									System.out.println("the flight is full..check another flight");
									ch=sc.nextLine();
								}
								a11109--;
								break;
							}
							else if(ch.equalsIgnoreCase("A11110"))
							{								
								if(a11110>0)
								{
									ticket_amt=3700;
								}
								else
								{
									System.out.println("the flight is full..");					
								}
								a11110--;
								break;
							}
							else
							{
								System.out.println("pl. enter valid flight id");
							}
						}
						break;
						case 2:
						System.out.println("The available flight(s) are:");
						System.out.println("Flight no.A11111 \nAirline:Indigo \nTakeoff time:-3:00PM \nLanding time:-4:30PM \nFrequency:Everyday\nTicket amount=4975");
						System.out.println();
						System.out.println("Flight no.A11112 \nAirline:Indigo \nTakeoff time:-3:00PM \nLanding time:-4:30PM \nFrequency:Friday, Saturday & Sunday\nTicket amount=3950");
						temp=false;
						sc.nextLine();
						while(true)
						{
							System.out.println("Enter the flight id you want to book");
							ch=sc.nextLine();
							if(ch.equalsIgnoreCase("A11111"))
							{								
								if(a11111>0)
								{
									ticket_amt=4975;
								}
								else
								{
									System.out.println("the flight is full..check another flight");
									ch=sc.nextLine();
								}
								a11111--;
								break;
							}
							else if(ch.equalsIgnoreCase("A11112"))
							{																
								if(a11112>0)
								{
									ticket_amt=3950;
								}
								else
								{
									System.out.println("the flight is full..");			
								}
								a11112--;
								break;
							}
							else
							{
								System.out.println("pl. enter valid flight id");
							}
						}
						break;
						default :				
							System.out.println("Enter valid input.");
					}
				}
				break;
				default :
				System.out.println("Enter valid input.");
			}
		}
		this.seat_prefrence();
		this.ticket_class_prefrence();
		this.meal_prefrence();
		this.passenger_details();
		this.payment();
	}
	void seat_prefrence()
	{
		System.out.println("Enter 1 for Window seat");
		System.out.println("Enter 2 for Middle seat");
		System.out.println("Enter 3 for Aisle seat");
		temp=true;
		while(temp)
		{
			int seat=sc.nextInt();
			if(seat==1 || seat==2 || seat==3)
			{
				switch(seat)
				{
					case 1:
					seat_type="Window";
					System.out.println("You have chosen the " +seat_type+" seat.");
					break;
					case 2:
					seat_type="Middle";
					System.out.println("You have chosen the " +seat_type+" seat.");
					break;
					case 3:
					seat_type="Aisle";
					System.out.println("You have chosen the " +seat_type+" seat.");
					break;
				}			
				temp=false;
			}
			else
			{
				System.out.println("Enter a valid choice");
			}
		}
	}
	void ticket_class_prefrence()
	{
		System.out.println("Enter 1 for Economy class");
		System.out.println("Enter 2 for Business class");
		System.out.println("Enter 3 for First class");
		temp=true;
		while(temp)
		{
			int ticket_class=sc.nextInt();
			if(ticket_class==1 || ticket_class==2 || ticket_class==3)
			{
				switch(ticket_class)
				{
					case 1:
					ticketClassType="Economy class";
					ticket_amt=ticket_amt+200;
					System.out.println("You have chosen the " +ticketClassType);
					break;
					case 2:
					ticketClassType="Business class";
					ticket_amt=ticket_amt+500;
					System.out.println("You have chosen the " +ticketClassType);
					break;
					case 3:
					ticketClassType="First class";
					ticket_amt=ticket_amt+700;
					System.out.println("You have chosen the " +ticketClassType);
					break;
				}			
				temp=false;
			}
			else
			{
				System.out.println("Enter a valid choice");
			}
		}
		System.out.println("Ticket amount="+ticket_amt);
	}
	void meal_prefrence()
	{
		System.out.println("Enter 1 for Vegetarian meal");
		System.out.println("Enter 2 for Non-Vegitarian meal");
		System.out.println("Enter 3 for Vegan meal");
		temp=true;
		while(temp)
		{
			int meal=sc.nextInt();
			if(meal==1 || meal==2 || meal==3)
			{
				switch(meal)
				{
					case 1:
					meal_type="Vegetarian meal";
					System.out.println("You have chosen the " +meal_type);
					break;
					case 2:
					meal_type="Non-Vegitarian meal";
					System.out.println("You have chosen the " +meal_type);
					break;
					case 3:
					meal_type="Vegan meal";
					System.out.println("You have chosen the " +meal_type);
					break;
				}				
				temp=false;
			}
			else
			{
				System.out.println("Enter a valid choice");
			}
		}
	}
	void passenger_details()
	{
        passengerCustomerIDs[passengerCount] = customer_id;
        passengerCount++;
			sc.nextLine();
			System.out.println("Enter the first name of passenger :");
			first_name=sc.nextLine();
			System.out.println("Enter the last name of passenger :");
			last_name=sc.nextLine();
			name=first_name+" "+last_name;
			System.out.println("Enter mobile number of passenger:");
			temp=true;
			while(temp)
			{
				mob=sc.nextLong();
				String s1=mob+"";
				if(s1.length()!=10)
				{
					System.out.println("invalid mobile no.");
					System.out.println("please enter correct 10-digit mobile no.");
				}
				else
				{
					temp=false;
				}
			}
			System.out.println("Enter the age of passenger:");
			temp=true;
			while(temp)
			{
				age=sc.nextInt();
				if(age>0 && age<100)   //age restriction
				{
					temp=false;
					continue;
				}
				else
				{
					System.out.println("Enter valid age.");
				}
			}
				if(age>=60)  //senior citizen discount
				{
					System.out.println("You are eligible for senior citizen discount.\nYow will get a discount of 6% on base flight ticket.");
					ticket_amt=ticket_amt-((6/100.0f)*ticket_amt);
				}
			sc.nextLine();
			System.out.println("Enter your current Address:");
			Address=sc.nextLine();
			System.out.println("Does the passenger have any frequent flyer miles?");
			boolean temp2=true;
			while(temp2)
			{
				System.out.println("Enter 'y' or'Y' for Yes OR Enter 'n' or 'N' for No:");
				char freq=sc.next().charAt(0);
				if(freq=='n' || freq=='N')
				{
					System.out.println("Sorry you cannot get any frequency mile discount.");
					temp2=false;
				}
				else if(freq=='y' || freq=='Y')
				{
					System.out.println("Enter the value of your frequency miles:");		
					int miles=sc.nextInt();
					if(miles<1000)
					{
						System.out.println("You need to collect more travel frequency mile in order to get discount.");
					}
					else if(miles>=1000&& miles<=5000)
					{
						System.out.println("You will get a discount of 5% on ticket amount.");
						ticket_amt=ticket_amt-((5/100.0f)*ticket_amt);
						
					}
					else if (miles>5000 && miles<7000)
					{
						System.out.println("You will get a discount of 10% on ticket amount.");
						ticket_amt=ticket_amt-((10/100.0f)*ticket_amt);
					}
					else if (miles>7000)
					{
						System.out.println("You will get a discount of 15% on ticket amount.");
						ticket_amt=ticket_amt-((15/100.0f)*ticket_amt);
					}
					temp2=false;
				}
				else
				{
					System.out.println("Please enter a valid input.");
				}
			}
	}
	void payment()
	{
		System.out.println("You have chosen the following flight for booking.");
		System.out.println("please verify the details.");
		this.display();
		System.out.println("Do you want to proceed for payment?");
		System.out.println("Enter 'y' or 'Y' to proceed furthur");
		char choice=sc.next().charAt(0);
		if(choice=='Y'||choice=='y')
		{
			System.out.println("Enter the payment mode:");
			System.out.println("Enter 1 for net banking \nEnter 2 for UPI payment"); 
			System.out.println("Enter your choice");
			temp=true;
			while(temp)
			{
				int choice1=sc.nextInt();
				switch(choice1)
				{
					case 1:
					temp=false;
					System.out.println("Enter your account no.");
					long acc_no = validateAccountNumber(); // Call the method to validate account number
					System.out.println("Enter your bank password");
					int password1 = validatePassword(); // Call the method to validate password number
					System.out.println("Your airline ticket is booked!!");
					System.out.println("Thank you for making a payment of rupees " + ticket_amt);
					System.out.println("Your e-ticket for the flight has been sent to your authorised mobile number that is:"+mob);
					break;
					
					case 2:
					temp=false;
					System.out.println("Enter your UPI account no.");
					acc_no = validateAccountNumber(); // Call the method to validate account number
					System.out.println("Enter your bank password");
					password1 = validatePassword(); // Call the method to validate password number
					System.out.println("Your airline ticket is booked!!");
					System.out.println("Thank you for making a payment of rupees " + ticket_amt);
					System.out.println("Your e-ticket for the flight has been sent to your authorised mobile number that is:"+mob);
					break;
				
				default:
				System.out.println("Invalid choice");
				}
			}
		}
		else
			{
				System.out.println("----------Oops...Something went wrong...----------");
			}	
	}	
	long validateAccountNumber()
	{
		long acc_no;
		valid = false;
		do {
			acc_no = sc.nextLong();
			String s1 = acc_no+"";
			if (s1.length() == 5)  // Validate account number length
			{
				valid = true;
			} else 
			{
				System.out.println("Invalid account number length.\nPlease enter a 5-digit account number.");
			}
		} while (!valid);
		return acc_no;
	}
	int validatePassword()
	{
		int password1;
		valid = false;
		do {
			password1 = sc.nextInt();
			String s2 = password1+"";
			if (s2.length() == 4)  // Validate password length
			{
				valid = true;
			} else 
			{
				System.out.println("Invalid password length.\nPlease enter a 4-digit password.");
			}
		} while (!valid);
		return password1;
	}
	void display()
	{
		System.out.println("***********PASSENGER DETAILS***********");
		System.out.println("------------------------------------------");
		System.out.println("passenger name:"+name);
		System.out.println("passenger mobile no.:"+mob);		
		System.out.println("passenger age:"+age);		
		System.out.println("Flight no:"+ch.toUpperCase());
		System.out.println("Seat type:"+seat_type);
		System.out.println("Ticket class type:"+ticketClassType);
		System.out.println("meal type:"+meal_type);
		System.out.println("passenger customer id for this flight:"+customer_id);
		System.out.println("Total ticket fare:Rupees"+ticket_amt);
		System.out.println("passenger address:"+Address);
		System.out.println("------------------------------------------");
	}
	void cancellation()
	{
		System.out.println("Enter passenger id number for the flight:");
		int customer_id_1=sc.nextInt();
		boolean found = false;
        for (int i = 0; i < passengerCount; i++) 
		{
            if (customer_id_1 == passengerCustomerIDs[i]) 
			{
                System.out.println("Ticket canceled successfully for customer: " + customer_id_1);
				System.out.println("You will get refund for your bookin after applicable cancellation charges are incured.");
				System.out.println("You will get refunded 75% of your total amount");
				System.out.println("Rupees "+((75/100.0)*ticket_amt)+" will be refunded to your account.");
                found = true;
                break;
			}
        }
        if (!found) 
		{
            System.out.println("No such customer ID found");
            System.out.println("You cannot cancel your ticket.");
        }			
	}
	void displayAvailableSeats() 
	{
		System.out.println("The available no.of seats in the available flights are as follows:");
		System.out.println("A11101 available no.of seats="+a11101);
		System.out.println("A11102 available no.of seats="+a11102);
		System.out.println("A11103 available no.of seats="+a11103);
		System.out.println("A11104 available no.of seats="+a11104);
		System.out.println("A11105 available no.of seats="+a11105);
		System.out.println("A11106 available no.of seats="+a11106);
		System.out.println("A11107 available no.of seats="+a11107);
		System.out.println("A11108 available no.of seats="+a11108);
		System.out.println("A11109 available no.of seats="+a11109);
		System.out.println("A11110 available no.of seats="+a11110);
		System.out.println("A11111 available no.of seats="+a11111);
		System.out.println("A11112 available no.of seats="+a11112);
	}
}
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Booking b= new Booking();
		int choice2;
		do
		{
		System.out.println("Enter 1 to Book a ticket.");
		System.out.println("Enter 2 to Cancel a ticket.");
		System.out.println("Enter 3 to Display available no. of seats.");
		System.out.println("Enter 4 to Exit.");
		choice2=sc.nextInt();
		switch(choice2)
			{
				case 1:
				System.out.println("Are you an existing user?");
				System.out.println("Enter 'y' or'Y' for Yes OR Enter 'n' or 'N' for No:");
				char user=sc.next().charAt(0);
				
				if(user =='n' || user =='N')
				{
					System.out.println("You first need to login and create an account.");
					System.out.println("Please Enter the following details..");
					sc.nextLine();
					System.out.println("Enter your full name:");
					String name=sc.nextLine();
					System.out.println("Create password:");		
					boolean temp1=true;
					while(temp1)
					{
						String password=sc.nextLine();
						int c_count=0;
						int d_count=0;
						for(int i=0;i<password.length();i++)
						{
							if((password.charAt(i)>='A' && password.charAt(i)<='Z')||(password.charAt(i)>='a' && password.charAt(i)<='z'))
							{
								c_count++;
							}
							else if(password.charAt(i)>='0'&& password.charAt(i)<='9')
							{
								d_count++;
							}
						}
						if(c_count==2 && d_count==4)
						{
							temp1=false;
						}
						else
						{
							System.out.println("no. of characters="+c_count+"\nno.of digits="+d_count);
							System.out.println("There must be 2 characters and 4 digits only");
							System.out.println("Enter valid password");
						}
					}
					System.out.println("Enter your mobile number:");
					temp1=true;
					while(temp1)
					{
						long mobile=sc.nextLong();
						String s1=mobile+"";
						if(s1.length()!=10)   //mobile number verification
						{
							System.out.println("invalid mobile no.");
							System.out.println("please enter correct 10-digit mobile no.");
						}
						else
						{
							temp1=false;
						}
					}
					System.out.println("Your customer id for the airline booking website is:"+b.customer_id);
					b.search_flight();	//call the search method
				}
				else if(user =='y' || user =='Y')
				{
					b.search_flight();	//call the search method
				}
				else
				{
					System.out.println("Please enter a valid input.");
				}
				break;
				case 2:
				b.cancellation();  //call the cancellation method
				break;
				case 3:
				b.displayAvailableSeats();  //call the displayAvailableSeats method
				case 4:
				System.out.println("You chose to exit");
				break;
				default :
				System.out.println("Enter correct choice");
				break;
			}
		}while(choice2!=4);
	}
}
