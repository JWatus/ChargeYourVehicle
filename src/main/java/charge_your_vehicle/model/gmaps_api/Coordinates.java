package charge_your_vehicle.model.gmaps_api;

public final class Coordinates {

    private double longitude;
    private double latitude;

    public Coordinates(double latitude, double longitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Coordinates() {
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setLongtitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
