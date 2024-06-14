package newpackage1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import newpackage.Client;
import newpackage.Ticket;

public class CinemaP2 {
    
    public static void main(String[] args) {
        
        //create data structure
        List<Ticket> ticketList = new ArrayList<Ticket>();
        
        //create tickets
        Ticket ticket1 = new Ticket (12, 2, 3, 1500, new Date(), new Date());
        Ticket ticket2 = new Ticket (13, 2, 4, 1500, new Date(), new Date());

        //create ticket using empty constructor and apply encapsulation
        Ticket ticket3 = new Ticket();
        ticket3.setNumber(20);
        ticket3.setRow(5);
        ticket3.setSeat(1);
        ticket3.setPrice(2300);
        ticket3.setPurchaseDate(new Date());
        ticket3.setValidityDate(new Date());
        
        //add elements to the list
        ticketList.add(ticket1);
        ticketList.add(ticket2);
        ticketList.add(ticket3);
        
        //sum of prices
        double sum = 0;
        
        for(Ticket tick : ticketList){
            sum = sum + tick.getPrice();
        }
        
        System.out.println("The sum of the prices is: $" + sum);
        
        //ask the user for the row
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row for which you want to see the tickets");
        int row = sc.nextInt();
        
        boolean flag = false;
    
        for(Ticket tick : ticketList){
            if (tick.getRow() == row) {
                System.out.println(tick.toString());
                flag = true;
            }
        }
        
        if (flag == false){
            System.out.println("No data found for the row in question");
        }
    
    //client test
    Client c1 = new Client();
    c1.setId(1);
    c1.setNombre("Camila");
    c1.setApellido("Martin");
    c1.setDni("0303456");
    c1.getTicketList().add(ticket1);
    
    Ticket ticket4= new Ticket (12, 4, 6, 2000, new Date(2024-6-14), new Date());
    c1.getTicketList().add(ticket4);
    }
}
