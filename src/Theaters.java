public class Theaters {
    int theaterNumber;
    String theaterName;
    String nowShowing;
    String available;
    String techScreen;
    String techSound;
    int seatCount;

    public Theaters(int theaterNumber, String theaterName, String nowShowing, String available, String techScreen, String techSound, int seatCount) {
        this.theaterNumber = theaterNumber;
        this.theaterName = theaterName;
        this.nowShowing = nowShowing;
        this.available = available;
        this.techScreen = techScreen;
        this.techSound = techSound;
        this.seatCount = seatCount;
    }

    public int getTheaterNumber() {
        return this.theaterNumber;
    }

    public void setTheaterNumber(int theaterNumber) {
        this.theaterNumber = theaterNumber;
    }

    public String getTheaterName() {
        return this.theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public String getNowShowing() {
        return this.nowShowing;
    }

    public void setNowShowing(String nowShowing) {
        this.nowShowing = nowShowing;
    }

    public String getAvailable() {
        return this.available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public String getTechScreen() {
        return this.techScreen;
    }

    public void setTechScreen(String techScreen) {
        this.techScreen = techScreen;
    }

    public String getTechSound() {
        return this.techSound;
    }

    public void setTechSound(String techSound) {
        this.techSound = techSound;
    }

    public int getSeatCount() {
        return this.seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public void displyInfo() {
        System.out.println("___________________________________________________________");
        System.out.println("Theaters ID: " + this.theaterNumber + " " + this.theaterName);
        System.out.println(" Now Showing " + this.nowShowing);
        System.out.println("Shows Time " + this.available);
        System.out.println(this.techScreen + " with " + this.techSound + "Available seat " + this.seatCount);
    }
}
