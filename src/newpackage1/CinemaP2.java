package newpackage1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import newpackage.Ticket;

public class CinemaP2 {
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        
        List<Ticket> ticketList = new ArrayList<Ticket>();
        
        Ticket ticket1 = new Ticket (12, 2, 3, 1500, new Date(), new Date());
        Ticket ticket2 = new Ticket (13, 2, 4, 1500, new Date(), new Date());

        Ticket ticket3 = new Ticket();
        ticket3.setNumber(20);
        ticket3.setRow(5);
        ticket3.setSeat(1);
        ticket3.setPrice(2300);
        ticket3.setPurchaseDate(new Date());
        ticket3.setValidityDate(new Date());
        
        
        
        
        
    }
    
}
