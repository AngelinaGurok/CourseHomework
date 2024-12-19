package optional;

public class Soundcard {
    USB usb;

    Soundcard(){
        usb = null;
    }

    Soundcard(String version){
        usb = new USB(version);
    }

    public USB getUsb() {
        return usb;
    }
}
