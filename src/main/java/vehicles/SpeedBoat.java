package vehicles;

import products.IProduct;

public class SpeedBoat extends Vehicle implements IWaterVehicle, IMotorised {

    private String hullType;
    private IMotorised motor;

    public SpeedBoat(float weight, int maxSpeed, IProduct baseProduct, String hullType, IMotorised motor) {
        super(weight, maxSpeed, baseProduct);
        this.hullType = hullType;
        this.motor = motor;
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
        // motor.getHp insinuates compositional relationship
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
    public String getHullType() {
        return hullType;
    }

    @Override
    public void setHullType(String type) {
        this.hullType = hullType;
    }
}
