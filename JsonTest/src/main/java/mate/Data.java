package mate;

import java.util.List;

public class Data {

    private List<Flea> uglycat_flea;
    private String service_message;

    public List<Flea> getUglycat_flea() {
        return uglycat_flea;
    }

    public void setUglycat_flea(List<Flea> uglycat_flea) {
        this.uglycat_flea = uglycat_flea;
    }

    public String getService_message() {
        return service_message;
    }

    public void setService_message(String service_message) {
        this.service_message = service_message;
    }


    @Override
    public String toString() {
        return "Data{" +
                "uglycat_flea=" + uglycat_flea +
                ", service_message='" + service_message + '\'' +
                '}';
    }
}
