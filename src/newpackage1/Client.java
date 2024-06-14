package newpackage1;

import java.util.List;
import newpackage.Ticket;

public class Client {
    private int id;
    private String dni;
    private String nombre;
    private String apellido;
    private List <Ticket> ticketList;

    public Client() {
    }

    public Client(int id, String dni, String nombre, String apellido, List<Ticket> ticketList) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ticketList = ticketList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Ticket> getTicketList() {
        return ticketList;
    }

    public void setTicketList(List<Ticket> ticketList) {
        this.ticketList = ticketList;
    }

    
    
}

