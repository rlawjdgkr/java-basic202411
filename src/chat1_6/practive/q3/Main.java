package chat1_6.practive.q3;

public class Main {
    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("글래디에이터2" , "G12");
        MovieTicket ticket2 = new MovieTicket("글래디에이터2" ,"H2");
        MovieTicket ticket3 = new MovieTicket("글래디에이터2","F23");

        ticket1.cancelBooking();
        ticket2.bookSeat();
        ticket2.bookSeat();

        ticket1.displayTicketInfo();
        ticket2.displayTicketInfo();
    }

}
