package models;

public class Trip {

    private String local;
    private String dataTripIda;
    private String dataTripVolta;
    private double valueTrip;

    public Trip() {

    }

    public Trip(String local, String dataTripIda, String dataTripVolta, double valueTrip) {
        this.local = local;
        this.dataTripIda = dataTripIda;
        this.dataTripVolta = dataTripVolta;
        this.valueTrip = valueTrip;
    }

    public String getLocal() {
        return local;
    }

    public String getDataTripIda() {
        return dataTripIda;
    }

    public String getDataTripVolta() {
        return dataTripVolta;
    }

    public double getValueTrip() {
        return valueTrip;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setDataTripIda(String dataTripIda) {
        this.dataTripIda = dataTripIda;
    }

    public void setDataTripVolta(String dataTripVolta) {
        this.dataTripVolta = dataTripVolta;
    }

    public void setValueTrip(double valueTrip) {
        this.valueTrip = valueTrip;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "local='" + local + '\'' +
                ", dataTripIda='" + dataTripIda + '\'' +
                ", dataTripVolta='" + dataTripVolta + '\'' +
                ", valueTrip=" + valueTrip +
                '}';
    }
}
