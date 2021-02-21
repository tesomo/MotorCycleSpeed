 public class MotorCycle {
    String color;
    int gear;
    int speed;
    String pilot;
    MotorCycle(){
        color = "blue"; speed= 5;
        System.out.println("the bike's speed is " + speed + " and it's color is " + color);
    }

    void assignPilot() {
        String pilot = "Paulo";
        System.out.println(" the pilot assigned to this motorcycle is " + pilot);
    }

public void applyBrake(){
    speed--;
}

void speedUp(int increment){
        speed++;
}
static class regularMotorcycle extends MotorCycle{
        String pilot = "John";


    }
}
class MountainMotorcycle extends MotorCycle {
    int seatHeight = 7;
    int gear = 2;
    String pilot = "Peter";

    void MountainMotorcycle() {
        System.out.println("the mountain bike starts to become more efficient when the speed is " + speed + " " + " and when the gear is " + gear + ". The pilot assigned to this bike is " + pilot);
    applyBrake();
    super.applyBrake();

    }


    public void setHeight(int seatHeight) {
        seatHeight = 5;
        System.out.println("the seat height is " + seatHeight);

    }
}

class Pilot extends MountainMotorcycle {
     String name = "John";
    int age = 30;

    @Override
    public void setHeight(int seatHeight) {
        super.setHeight(seatHeight);
    }

    public static void main(String args[]) {
        Pilot obj = new Pilot();
        obj.MountainMotorcycle();



    }
}
