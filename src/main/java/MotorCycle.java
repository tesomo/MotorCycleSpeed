public class MotorCycle {
    String color;
    int gear;
    int speed;
    MotorCycle(){
        color = "blue"; speed= 5;
        System.out.println("the bike's speed is " + speed + " and it's color is " + color);
    }
void applyBrake(int decrement){
    speed--;
}

void speedUp(int increment){
        speed++;
}
 static class MountainMotorcycle extends MotorCycle{
        int seatHeight =7;
        int gear = 2;
        void MountainMotorcyle(){
            System.out.println("the mountain bike starts to become more efficient when the speed is " + speed + " " + " and when the gear is " + gear);
        }
       public void setHeight(int seatHeight){
            seatHeight =5;
           System.out.println("the seat height is " + seatHeight);

       }
}
 public static class Pilot extends MountainMotorcycle{
        String name="James";
        int age = 30;

}

    public static void main(String args[]){
        Pilot obj = new Pilot();
        obj.MountainMotorcyle();

    }


}
