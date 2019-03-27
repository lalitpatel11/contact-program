import java.util.Scanner;
class Contact
{
	public static void main(String[]args)
	{
		int choice;
		int index=0;
		String name[]=new String[100];
		long mob_no[]=new long[100];

		Scanner s=new Scanner(System.in);
		do
		{	System.out.println("\n***********MENU***********");
			System.out.println("1.Add contact");
 			System.out.println("2.Display contact");
			System.out.println("3.Update contact");
			System.out.println("4.Delete contact");
			System.out.println("5.Exit");
			System.out.print("Enter your choice:-");
			choice=s.nextInt();
			switch(choice)
			{
				case 1:
				String n;
				System.out.print("Enter name:-");
				n=s.next();
				long m=0;
				System.out.print("Enter Mobile number:-");
				m=s.nextLong();
				String temp=String.valueOf(m);
				int flag1=0;
				if(temp.startsWith("6") ||temp.startsWith("7") ||temp.startsWith("8") ||temp.startsWith("9"))
				{
					if(String.valueOf(m).length()<10)
					{
						System.out.print("wrong mobile number \n mmobile number must be atleast 10 digit");
					}
					else
					{
						for(int i=0;i<name.length;i++)
						{
							if(n.equals(name[i]))
							{
								System.out.println("\nContact Name Already Present\n");
								break;
							}
							else
							{
								if(String.valueOf(m).equals(String.valueOf(mob_no[i])))
								{
									System.out.println("\nContact Number Already Present\n");
									break;
									
								}
								else
								{
									
									mob_no[index]=m;
									name[index]=n;
									index++;
									System.out.println("\nContact Added....!");
									break;

								}
							}
						}
					}
									
						
					
				}
				else
				{
				
					System.out.print("invalid mobile number \n mobile must be starts with 6,7,8,9");
					
				}
				 	break;

				case 2:
					String you;
					int flag=0;
					System.out.print("Enter your name:-");
					you=s.next();
				for(int i=0;i<index;i++)
					{
						if(name[i].contains(you))
						{
							
								System.out.print(name[i]+":" +mob_no[i]+"\n");
								flag=1;
								
						}
					}
						if(flag==0)
						{
							System.out.println("ContAct not Present");
						}
				
		
							break;
						
				case 3:
					String s1;
					int l=0;
					System.out.print("Enter your name:-");
					s1=s.next();
				for(int i=0;i<name.length;i++)
					{
						if(s1.equals(name[i]))
						{
							System.out.print(name[i]+":" +mob_no[i]);
							l=1;
							int d;
							System.out.print("\nwhat you want to edit\n 1.Name\n 2.Mobile Number\nEnter your choice:-");
							d=s.nextInt();
							if(d==1)
							{
								System.out.println("\nEnter The New name:");
								String n1=s.next();
								name[i]=n1;
								System.out.println("\n your new name updated\n"+n1);							
							}
							else if(d==2)
							{
								System.out.println("\nEnter The New Mobile No.:");
								long m1=s.nextLong();
								String temp2=String.valueOf(m1);
								if(temp2.startsWith("6") ||temp2.startsWith("7") ||temp2.startsWith("8") ||temp2.startsWith("9"))
								{
									if(String.valueOf(m1).length()<10)
									{
										System.out.print("wrong mobile number \n mmobile number must be atleast 10 digit");
									}
									else
									{
										mob_no[i]=m1;
										System.out.println("Your Mobile Number updated\n"+m1);
										
									}
								}
								else
								{
									System.out.print("invalid mobile number \n mobile must be starts with 6,7,8,9");
								}

							}
							else
							{
								System.out.println("\nWrong Choice");
							}
							break;
							
						}
						
					}
					if(l==0)
					{
						System.out.println("ContAct not Present");
					}
					break;

				case 4:
					String del;
					int rem=0;
					System.out.print("Enter your name:-");
					del=s.next();
				for(int i=0;i<name.length;i++)
					{
						if(del.equals(name[i]))
						{
							System.out.print("\nDo you Really want to Delete (Y/N):");
							String decision=s.next();
							System.out.println("\nDecision:"+decision);
							if(decision.equalsIgnoreCase("Y"))
							{

								name[i]="deleted";
								mob_no[i]=1;
								System.out.println("\nYour mobile number successfully deleted\n");
								rem=1;
								break;
							}
							else if(decision.equalsIgnoreCase("N"))
							{
								System.out.println("\nDeletion Cancelled by the User\n");
								rem=1;
								break;
							}
							else
							{
								System.out.println("\nWrong Input\n");
								rem=1;
								break;
							}
							
						}
						
					}
					if(rem==0)
					{
						System.out.println("ContAct not Present");
					}
					break;
		
				case 5:
					break;

				default:
					System.out.print("!!! wrong choice !!!");
			}
		}while(choice!=5);

	}
}			