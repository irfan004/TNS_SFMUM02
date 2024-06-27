package com.irfan.assignment4;

public class Ticket {
	
	static int AvailableTickets =5;
	String PasngrName;
	int TktNo;
	String TickitTo;
	
	
	static{
		System.out.println("Available tickits is: "+ AvailableTickets);
		
		
	}
	
	public Ticket(String PasngrName,String TickitTo) {
		
		this.PasngrName=PasngrName;
		this.TickitTo=TickitTo;
		
		if(AvailableTickets>0) {
			
			TktNo=6-AvailableTickets;
			AvailableTickets--;
			System.out.println("Ticket Successfully booked for "+ PasngrName);
		}
		else{
			System.out.println("No Tickets");
			};
	
	
	}

	@Override
	public String toString() {
		return "Ticket [PasngrName=" + PasngrName + ", TktNo=" + TktNo + ", TickitTo=" + TickitTo + "]";
	}
	
	

}
