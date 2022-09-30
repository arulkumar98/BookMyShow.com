import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class UsersInfo {
    int theaterId;
    String email;
    String mobileNo;
    String showTime;
    Date date;

    public UsersInfo() {
    }

    public void start() throws ParseException {
        Scanner in = new Scanner(System.in);
        System.out.println("Select the Theater ID");
        this.theaterId = in.nextInt();
        System.out.println("Enter you're E-mail");
        this.email = in.next();

        for(String regex = "^(.+)@(.+)$"; !this.email.matches(regex); this.email = in.next()) {
            System.out.println("Please enter the valid e-mail address");
        }

        System.out.println("Enter the mobile number");
        this.mobileNo = in.next();

        for(String num = "^\\d{10}$"; !this.mobileNo.matches(num); this.mobileNo = in.next()) {
            System.out.println("Please enter the valid Mobile Number");
        }

        System.out.println("Enter the show time");
        this.showTime = in.next();
        System.out.println("Enter the date format in dd-mm-yyyy");
        String dateformat = in.next();
        SimpleDateFormat newDate = new SimpleDateFormat("dd-MM-yyyy");
        this.date = newDate.parse(dateformat);
    }

    public boolean isAvailable(ArrayList<Theaters> movie, ArrayList<UsersInfo> book) {
        int capacity = 0;
        int count = 0;
        Iterator var5 = movie.iterator();

        while(var5.hasNext()) {
            Theaters ticket = (Theaters)var5.next();
            if (ticket.getTheaterNumber() == this.theaterId) {
                capacity = ticket.getSeatCount();
            }

            Iterator var7 = book.iterator();

            while(var7.hasNext()) {
                UsersInfo use = (UsersInfo)var7.next();
                if (use.theaterId == this.theaterId && this.date.equals(this.date)) {
                    ++count;
                    ticket.seatCount -= count;
                }
            }
        }

        if (count > capacity) {
            return false;
        } else {
            return true;
        }
    }
}
