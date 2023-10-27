class TicketResource {

    long availableTickets;

    public TicketResource(long availableTickets) {
        this.availableTickets = availableTickets;
    }

    public long getAvailableTickets() {
        return availableTickets;
    }

    public synchronized void book(String user, long askedTickets) {

        if(askedTickets > availableTickets) {
            System.out.println("Transaction failed for " + user + ", because of available tickets are less than the tickets asked for.\n");
            return;
        }

        System.out.println(user + " trying to withdraw " + askedTickets + " tickets.");

        availableTickets -= askedTickets;

        System.out.println("Transaction successful for " + user + " for " + askedTickets + " tickets." + "\nTickets Available after booking: " + availableTickets + "\n");
    }

}

class PassengerBooker extends Thread {
    
    TicketResource r;
    String user;
    long askedTickets;

    public PassengerBooker(TicketResource r, String user, long askedTickets) {
        this.r = r;
        this.user = user;
        this.askedTickets = askedTickets;
    }

    public void run() {
        r.book(user, askedTickets);
    }

}

public class MT3 {
    public static void main(String[] args) {
        
        TicketResource r = new TicketResource(30);

        PassengerBooker p1 = new PassengerBooker(r, "Shreyas", 12);
        PassengerBooker p2 = new PassengerBooker(r, "Rudra", 11);
        PassengerBooker p3 = new PassengerBooker(r, "Tirth", 10);

        p1.start();
        p2.start();
        p3.start();

        try {
            p1.join();
            p2.join();
            p3.join();
        }

        catch (Exception e) {
            System.out.println(e);
        }

        finally {
            System.out.println("Tickets Available After Booking All: " + r.getAvailableTickets() + "\n");
        }
    }
}