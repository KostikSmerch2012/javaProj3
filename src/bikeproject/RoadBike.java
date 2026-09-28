package bikeproject;

public class RoadBike extends Bike implements RoadParts {

    private int tyreWidth, postHeight;

    public RoadBike() {
        this("drop", "racing", "tread less", "razor", 19, 20, 22);
    }

    public RoadBike(int postHeight) {
        this("drop", "racing", "tread less", "razor", 19, 20, postHeight);
    }

    public RoadBike(String handleBars, String frame, String tyres, String seatType, int numGears,
                    int tyreWidth, int postHeight) {
        super(handleBars, frame, tyres, seatType, numGears);
        this.tyreWidth = tyreWidth;
        this.postHeight = postHeight;
    }

    @Override
    public String getTyreWidth() {
        return String.valueOf(tyreWidth);
    }

    @Override
    public void setTyreWidth(String newValue) {
        this.tyreWidth = Integer.parseInt(newValue);
    }

    @Override
    public String getPostHeight() {
        return String.valueOf(postHeight);
    }

    @Override
    public void setPostHeight(String newValue) {
        this.postHeight = Integer.parseInt(newValue);
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("This Roadbike bike has " + this.tyreWidth
                + "mm tyres and a post height of " + this.postHeight + ".");
    }
}
