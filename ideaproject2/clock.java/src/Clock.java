public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
        setHour(hour);
        setMinutes(minute);
        setSecond(second);
        validateTime();
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
           System.out.print("Hour must be between 0 and 23");
        }
    }

    public int getMinutes() {
        return minute;
    }

    public void setMinutes(int minute) {
        if(minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            System.out.print("Minutes must be between 0 and 59");
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second >= 0 && second < 60) {
            this.second = second;
        } else {
            System.out.print("Seconds must be between 0 and 59");
        }
    }

    private void validateTime() {
        if (hour > 23 || minute > 59 || second > 59) {
            System.out.print("Invalid time.");
        }
    }

}
