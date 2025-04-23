package assignment;

public class AirConditional {
    private boolean isOn = true;
    private int temperature = 16;

    public boolean isOn(){
        return isOn;
    }

    public boolean isOff() {
        return isOn = false;
    }


    public int getTemperature() {
        return this.temperature = temperature;
    }

    public void set(int element) {
        this.temperature = element;
    }

    public int increase(int temperature) {
        int temp = temperature + getTemperature();
        if (temp > 30) {
            return 30;
        }else{
            set(temp);
            return temp;
        }
    }

    public int decrease(int element) {
        int temp = getTemperature() - element;
        if (temp < temperature){
            set(16);
            return temperature;
        }else{
            set(temp);
            return temp;
        }
    }
}