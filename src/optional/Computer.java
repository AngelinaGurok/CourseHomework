package optional;

import java.util.Optional;

public class Computer {
    private Optional<Soundcard> s;
    public Optional<Soundcard> getSoundcard() {
        return s;
    }

    Computer(Soundcard sc){
        this.s = Optional.of(sc);
    }

    public void setSoundcard(Optional<Soundcard> s) {
        this.s = s;
    }
}
