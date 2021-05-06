package domain;

public class GeoInfo {
    private String type;
    private String coordinates;
    private PlaceInfo place;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public PlaceInfo getPlace() {
        return place;
    }

    public void setPlace(PlaceInfo place) {
        this.place = place;
    }
}
