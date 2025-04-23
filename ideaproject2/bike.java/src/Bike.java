public class Bike {
    private boolean isOn = true;
    private int speed = 0;
    private int gear = 1;


    public boolean isOn() {
        return isOn;
    }
    public boolean isOff() {
        return isOn = false;
    }
    public int getSpeed() {
        return speed;
    }



    public int getGear() {
        return this.gear = gear;
    }


    public void accelerate() {
        if (isOn) {
            speed += 1;
            updateGear();
        }
    }
    public void decelerate() {
       if (isOn) {
           speed -= 1;
           updateGear();
       }
    }

    public void updateGear(){
        if (speed < 0){
            System.out.println("Gear off");
            isOn = false;
        }
        if (speed <= 20 ) {
            gear = 1;
        }else if(speed <= 30) {
            gear = 2;
        }else if(speed <= 40) {
            gear = 3;
        }else if(speed >= 41) {
            gear = 4;
        }

    }


}