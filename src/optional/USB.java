package optional;

public class USB {
    String version;

    USB(){
        version = null;
    }

    USB(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
