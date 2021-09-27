package builder;

public class House {

    private String city;
    private String district;
    private String neighborhood;

    private int room;
    private int bathroom;
    private int wc;
    private int balcoon;
    private int structureYear;

    private boolean isDublex;
    private boolean isFull;
    private boolean hasParkingArea;
    private boolean hasParkPen;
    private boolean hasAirConditioner;
    private boolean hasPool;

    public House() { }

    public House(String city, String district, String neighborhood, int room, int bathroom, int wc, int balcoon, int structureYear, boolean isDublex, boolean isFull, boolean hasParkingArea, boolean hasParkPen, boolean hasAirConditioner, boolean hasPool) {
        this.city = city;
        this.district = district;
        this.neighborhood = neighborhood;
        this.room = room;
        this.bathroom = bathroom;
        this.wc = wc;
        this.balcoon = balcoon;
        this.structureYear = structureYear;
        this.isDublex = isDublex;
        this.isFull = isFull;
        this.hasParkingArea = hasParkingArea;
        this.hasParkPen = hasParkPen;
        this.hasAirConditioner = hasAirConditioner;
        this.hasPool = hasPool;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getBathroom() {
        return bathroom;
    }

    public void setBathroom(int bathroom) {
        this.bathroom = bathroom;
    }

    public int getWc() {
        return wc;
    }

    public void setWc(int wc) {
        this.wc = wc;
    }

    public int getBalcoon() {
        return balcoon;
    }

    public void setBalcoon(int balcoon) {
        this.balcoon = balcoon;
    }

    public int getStructureYear() {
        return structureYear;
    }

    public void setStructureYear(int structureYear) {
        this.structureYear = structureYear;
    }

    public boolean isDublex() {
        return isDublex;
    }

    public void setDublex(boolean dublex) {
        isDublex = dublex;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public boolean isHasParkingArea() {
        return hasParkingArea;
    }

    public void setHasParkingArea(boolean hasParkingArea) {
        this.hasParkingArea = hasParkingArea;
    }

    public boolean isHasParkPen() {
        return hasParkPen;
    }

    public void setHasParkPen(boolean hasParkPen) {
        this.hasParkPen = hasParkPen;
    }

    public boolean isHasAirConditioner() {
        return hasAirConditioner;
    }

    public void setHasAirConditioner(boolean hasAirConditioner) {
        this.hasAirConditioner = hasAirConditioner;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    @Override
    public String toString() {
        return "House{" +
                "city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", neighborhood='" + neighborhood + '\'' +
                ", room=" + room +
                ", bathroom=" + bathroom +
                ", wc=" + wc +
                ", balcoon=" + balcoon +
                ", structureYear=" + structureYear +
                ", isDublex=" + isDublex +
                ", isFull=" + isFull +
                ", hasParkingArea=" + hasParkingArea +
                ", hasParkPen=" + hasParkPen +
                ", hasAirConditioner=" + hasAirConditioner +
                ", hasPool=" + hasPool +
                '}';
    }
}
