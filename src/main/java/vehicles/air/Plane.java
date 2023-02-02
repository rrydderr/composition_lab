package vehicles.air;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Vehicle;


public class Plane extends Vehicle implements IAirVehicle, IMotorised {
    private IMotorised motor;
    private double altitude;
    private double airSpeed;

    public Plane(float weight, int maxSpeed, IProduct baseProduct, IMotorised motor, double altitude, double airSpeed) {
        super(weight, maxSpeed, baseProduct);
        this.motor = motor;
        this.altitude = altitude;
        this.airSpeed = airSpeed;
    }

    @Override
    public void startEngine() {
        System.out.println("Engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped");
    }

    @Override
    public int getHp() {
        return motor.getHp();
    }

    @Override
    public void setHp(int hp) {
        motor.setHp(hp);
    }

    @Override
    public int getFuel() {
        return motor.getFuel();
    }

    @Override
    public void setFuel(int fuel) {
        motor.setFuel(fuel);
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
