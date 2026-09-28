package bikeproject;

public interface BikeParts {
    String COMPANY_NAME = "Oracle Cycles";

    String getHandleBars();
    void setHandleBars(String newValue);

    String getFrame();
    void setFrame(String newValue);

    String getTyres();
    void setTyres(String newValue);

    String getSeatType();
    void setSeatType(String newValue);

    int getNumGears();
    void setNumGears(int newValue);
}
