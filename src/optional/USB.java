package optional;

public class USB {
    String version;

    USB(){
        version = "Unknown";
    }

    USB(String version){
        this.version = version;
    }

    public String getVersion() {
        return version;
    }
}
