package bikeproject;

public class Bike implements BikeParts {

    private String handleBars, frame, tyres, seatType;
    private int NumGears;
    private final String make;

    public Bike() {
        this.make = COMPANY_NAME;
    }

    public Bike(String handleBars, String frame, String tyres, String seatType, int numGears) {
        this.handleBars = handleBars;
        this.frame = frame;
        this.tyres = tyres;
        this.seatType = seatType;
        NumGears = numGears;
        this.make = COMPANY_NAME;
    }

    @Override
    public String getHandleBars() {
        return handleBars;
    }

    @Override
    public void setHandleBars(String newValue) {
        this.handleBars = newValue;
    }

    @Override
    public String getFrame() {
        return frame;
    }

    @Override
    public void setFrame(String newValue) {
        this.frame = newValue;
    }

    @Override
    public String getTyres() {
        return tyres;
    }

    @Override
    public void setTyres(String newValue) {
        this.tyres = newValue;
    }

    @Override
    public String getSeatType() {
        return seatType;
    }

    @Override
    public void setSeatType(String newValue) {
        this.seatType = newValue;
    }

    @Override
    public int getNumGears() {
        return NumGears;
    }

    @Override
    public void setNumGears(int newValue) {
        this.NumGears = newValue;
    }

    protected void printDescription() {
        System.out.println("\n" + this.make + "\n"
                + "This bike has " + this.handleBars + " handlebars on a "
                + this.frame + " frame with " + this.NumGears + " gears."
                + "\nIt has a " + this.seatType + " seat with " + this.tyres + " tyres.");
    }
}
