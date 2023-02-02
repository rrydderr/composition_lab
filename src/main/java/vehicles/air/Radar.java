package vehicles.air;

public class Radar implements IAirVehicle{
    private double altitude;
    private double airSpeed;

    public Radar(double altitude, double airSpeed) {
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
