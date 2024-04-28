public class User {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("-------------------------------------------------------------");
        System.out.println("ON/OFF: " + smartTv.onOff);
        System.out.println("Channel: " + smartTv.channel);
        System.out.println("Volume: " + smartTv.volume);
        System.out.println("-------------------------------------------------------------");

        smartTv.turnOn();

        System.out.println("-------------------------------------------------------------");
        System.out.println("ON/OFF: " + smartTv.onOff);
        System.out.println("Channel: " + smartTv.channel);
        System.out.println("Volume: " + smartTv.volume);
        System.out.println("-------------------------------------------------------------");

        smartTv.volumeDown();
        smartTv.volumeDown();

        System.out.println("-------------------------------------------------------------");
        System.out.println("ON/OFF: " + smartTv.onOff);
        System.out.println("Channel: " + smartTv.channel);
        System.out.println("Volume: " + smartTv.volume);
        System.out.println("-------------------------------------------------------------");

        smartTv.volumeUp();
        smartTv.volumeUp();
        smartTv.volumeUp();
        smartTv.volumeUp();
        smartTv.volumeUp();
        smartTv.changeChannel(10);

        System.out.println("-------------------------------------------------------------");
        System.out.println("ON/OFF: " + smartTv.onOff);
        System.out.println("Channel: " + smartTv.channel);
        System.out.println("Volume: " + smartTv.volume);
        System.out.println("-------------------------------------------------------------");

        smartTv.channelUp();
        smartTv.channelUp();

        System.out.println("-------------------------------------------------------------");
        System.out.println("ON/OFF: " + smartTv.onOff);
        System.out.println("Channel: " + smartTv.channel);
        System.out.println("Volume: " + smartTv.volume);
        System.out.println("-------------------------------------------------------------");

        smartTv.channelDown();
        smartTv.channelDown();
        smartTv.channelDown();
        smartTv.channelDown();

        System.out.println("-------------------------------------------------------------");
        System.out.println("ON/OFF: " + smartTv.onOff);
        System.out.println("Channel: " + smartTv.channel);
        System.out.println("Volume: " + smartTv.volume);
        System.out.println("-------------------------------------------------------------");

        smartTv.turnOff();

        System.out.println("-------------------------------------------------------------");
        System.out.println("ON/OFF: " + smartTv.onOff);
        System.out.println("Channel: " + smartTv.channel);
        System.out.println("Volume: " + smartTv.volume);
        System.out.println("-------------------------------------------------------------");
    }
}
