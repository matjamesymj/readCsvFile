package uk.co.allwebwork;

public class Bike extends Vehicle {
    private String BikeSpecificParam;

    public Bike(String reg, String make) {
        super(reg, make);
    }

    public Bike(String reg, String make, String bikeSpecificParam ) {
        super(reg, make);
        this.setBikeSpecificParam(bikeSpecificParam);
    }

    public Bike() {
    }


    public String getBikeSpecificParam() {
        return BikeSpecificParam;
    }

    public void setBikeSpecificParam(String bikeSpecificParam) {
        BikeSpecificParam = bikeSpecificParam;
    }
}
