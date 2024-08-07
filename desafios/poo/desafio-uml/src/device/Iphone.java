package device;

import device.app.browser.BrowserInterface;
import device.app.phone.PhoneInterface;
import device.app.music.MusicInterface;

public class Iphone implements BrowserInterface, PhoneInterface, MusicInterface {
    @Override
    public void toShowPage(String url) {
        System.out.println("Accessing " + url);
    }

    @Override
    public void toAddNewTab() {
        System.out.println("Opening new tab");
    }

    @Override
    public void toUpdatePage() {
        System.out.println("Updating the page...");
    }

    @Override
    public void toCall(String numberPhone) {
        System.out.println("Call to " + numberPhone);
    }

    @Override
    public void toAnswerCall() {
        System.out.println("Answer call");
    }

    @Override
    public void toStartVoiceMail() {
        System.out.println("Starting voice mail");
    }

    @Override
    public void toPlay() {
        System.out.println("Playing music");
    }

    @Override
    public void toPause() {
        System.out.println("The music was paused");
    }

    @Override
    public void toSelectMusic(String music) {
        System.out.println("The music " + music + " was selected");
    }
}
