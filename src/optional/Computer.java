package optional;

public class Computer {
    Soundcard s;

    Computer(){
        s = new Soundcard();
    }

    Computer(String version){
        s = new Soundcard(version);
    }

    public Soundcard getSoundcard() {
        return s;
    }
}
