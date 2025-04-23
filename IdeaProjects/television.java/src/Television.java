public class Television {
    private boolean isOn;
    private int volumeLevel = 2;
    private int channel = 4;
    private boolean isMuted = false;


    public boolean turnOn() {
        return true;
    }


    public boolean turnOff() {
        return false;
    }


    public void increaseVolume() {
        if (isOn) {
            volumeLevel += 1;
        }
    }


    public void decreaseVolume() {
        if (isOn) {
            volumeLevel -= 1;
        }
    }


    public void channelUp() {
        if (isOn) {
            channel += 1;
        }
    }


    public void channelDown() {
        if (isOn) {
            channel -= 1;
        }
    }


    public void setChannel(int channel) {
        if (isOn) {
            this.channel = channel;
        }
    }


    public void mute() {
        if (isOn) {
            isMuted = true;
            volumeLevel = 0;
        }
    }


    public void unmute() {
        if (isOn) {
            isMuted = false;
            volumeLevel = 2;
        }
    }
}
