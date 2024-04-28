public class SmartTv {
    boolean onOff = false;
    int channel = 1;
    int volume = 25;

    public void turnOn() {
        onOff = true;
    }

    public void turnOff() {
        onOff = false;
    }

    public void channelUp() {
        channel++;
        System.out.println("Channel up to " + channel);
    }

    public void channelDown() {
        channel--;
        System.out.println("Channel down to " + channel);
    }

    public void changeChannel(int newChannel) {
        channel = newChannel;
    }

    public void volumeUp() {
        volume++;
        System.out.println("Volume up to " + volume);
    }

    public void volumeDown() {
        volume--;
        System.out.println("Volume down to " + volume);
    }
}
