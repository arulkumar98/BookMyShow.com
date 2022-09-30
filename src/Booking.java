import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Booking {
    public Booking() {
    }
    public void booking() throws ParseException {
        ArrayList<Theaters> movie = new ArrayList();
        movie.add(new Theaters(1, "PSS MULTIPLEX - Tenkasi", "Ponniyin Selvan (U/A) - Part One - Tamil", "11A.M  2P.M  6P.M 10P.M", "4K HDR", "Dolby Atoms", 150));
        movie.add(new Theaters(2, "SRI PADMAM CINEMAS Tenkasi", "Naane Varuvean (U/A)", "11A.M  2P.M", "4K", "DOLBY 7.1", 100));
        ArrayList<UsersInfo> book = new ArrayList();
        Iterator var3 = movie.iterator();

        while(var3.hasNext()) {
            Theaters t = (Theaters)var3.next();
            t.displyInfo();
        }

        int userInput = 1;
        Scanner in = new Scanner(System.in);

        while(true) {
            do {
                if (userInput != 1) {
                    return;
                }

                System.out.println("Enter 1 to booking or 0 to exit");
                userInput = in.nextInt();
            } while(userInput != 1);

            Iterator var5 = movie.iterator();

            while(var5.hasNext()) {
                Theaters t = (Theaters)var5.next();
                t.displyInfo();
            }

            UsersInfo allow = new UsersInfo();
            if (allow.isAvailable(movie, book)) {
                allow.start();
                System.out.println("Enjoy the powerful Dolby Atoms");
            } else {
                System.out.println("Sorry the Show is Houseful");
            }
        }
    }
}
