package optional;

import java.util.Optional;

public class Soundcard {
    private Optional<USB> usb;


    Soundcard(USB usb){
       this.usb = Optional.of(usb);
    }
    Soundcard(){
        this.usb = Optional.of(new USB());
    }

    public Optional<USB> getUSB() {
        return usb;
    }

    @Override
    public String toString() {
        return usb.get().getVersion();
    }

    public void setUSB(Optional<USB> usb) {
        this.usb = usb;
    }
}
