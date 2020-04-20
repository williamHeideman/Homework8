package homework5;

public class Services extends Account {

    private int numberOfHours;
    private double ratePerHour;

    public Services(int id, int numberOfHours, double ratePerHour) {
        super(id);
        this.numberOfHours = numberOfHours;
        this.ratePerHour = ratePerHour;
    	}

    public Services(int id) {
        super(id);
        numberOfHours = 0;
        ratePerHour = 0;
    	}

    public double getRatePerHour() {
        return ratePerHour;
    	}

    public int getNumberOfHours() {
        return numberOfHours;
    	}

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    	}

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    	}

    public double calculateSales() {
        return getNumberOfHours() * getRatePerHour();
    	}

    public String toString() {
        return super.toString()+"\nHourlyRate: $"+getRatePerHour()+"\nHours worked: "+
                getNumberOfHours()+"\nTotal Income: $"+calculateSales()+"\n";
    	}
}