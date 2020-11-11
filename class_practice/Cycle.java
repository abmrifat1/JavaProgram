//inheritance
package class_practice;

public class Cycle {
    public int gear;
    public int speed;

    public Cycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void speedUp(int increment) {
        this.speed += increment;
    }

    public String showSpeed() {
        return("gear:" + gear+ ", speed:" + speed);
    }
}

class Bicycle extends Cycle {
    public int door;

    public Bicycle (int gear, int speed, int door) {
        super(gear, speed);
        this.door = door;
    }

    public void setDoor (int value) {
        this.door = value;
    }

    @Override
    public String showSpeed() {
        return (super.showSpeed()+ ", Bicycle door is:" + door);
    }
}

class Test {
    public static void main(String[] args) {
        Bicycle bc = new Bicycle(5, 80, 2);
        System.out.println(bc.showSpeed());
    }
}
