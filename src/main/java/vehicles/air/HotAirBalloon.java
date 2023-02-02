package vehicles.air;

import products.IProduct;
import vehicles.Vehicle;

public class HotAirBalloon extends Vehicle implements IAirVehicle {
        private String colour;
    private double altitude;
    private double airSpeed;

    public HotAirBalloon(float weight, int maxSpeed, IProduct baseProduct, String colour, double altitude, double airSpeed) {
        super(weight, maxSpeed, baseProduct);
        this.colour = colour;
        this.altitude = altitude;
        this.airSpeed = airSpeed;
    }

    @Override
    public double getAltitude() {
        return this.altitude;
    }

    @Override
    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    @Override
    public double getAirSpeed() {
        return this.airSpeed;
    }

    @Override
    public void setAirSpeed(double airSpeed) {
        this.airSpeed = airSpeed;
    }
}
