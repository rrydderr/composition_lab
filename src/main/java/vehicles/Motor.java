package vehicles;

public class Motor implements IMotorised {

    //properties
    private int hp;
    private int fuel;

    public Motor(int hp, int fuel) {
        this.hp = hp;
        this.fuel = fuel;
    }


    @Override
    public void startEngine() {
        System.out.println("Engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped.");
    }

    @Override
    public int getHp() {
        return this.hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public int getFuel() {
        return this.fuel;
    }

    @Override
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
