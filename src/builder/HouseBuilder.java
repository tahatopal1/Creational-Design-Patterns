package builder;

public class HouseBuilder {

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

    public static HouseBuilder startBuild(){
        return new HouseBuilder();
    }

    public House build(){
        House house = new House();
        house.setCity(city);
        house.setDistrict(district);
        house.setNeighborhood(neighborhood);
        house.setRoom(room);
        house.setBathroom(bathroom);
        house.setWc(wc);
        house.setBalcoon(balcoon);
        house.setStructureYear(structureYear);
        house.setDublex(isDublex);
        house.setFull(isFull);
        house.setHasParkingArea(hasParkingArea);
        house.setHasParkPen(hasParkPen);
        house.setHasAirConditioner(hasAirConditioner);
        house.setHasPool(hasPool);
        return house;
    }

    // Build alternatives
    public static HouseBuilder buildWithAddress(String city, String district, String neighborhood){
        HouseBuilder houseBuilder = new HouseBuilder();
        houseBuilder.city = city;
        houseBuilder.district = district;
        houseBuilder.neighborhood = neighborhood;
        return houseBuilder;
    }

    public String getCity() {
        return city;
    }

    public HouseBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public String getDistrict() {
        return district;
    }

    public HouseBuilder setDistrict(String district) {
        this.district = district;
        return this;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public HouseBuilder setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
        return this;
    }

    public int getRoom() {
        return room;
    }

    public HouseBuilder setRoom(int room) {
        this.room = room;
        return this;
    }

    public int getBathroom() {
        return bathroom;
    }

    public HouseBuilder setBathroom(int bathroom) {
        this.bathroom = bathroom;
        return this;
    }

    public int getWc() {
        return wc;
    }

    public HouseBuilder setWc(int wc) {
        this.wc = wc;
        return this;
    }

    public int getBalcoon() {
        return balcoon;
    }

    public HouseBuilder setBalcoon(int balcoon) {
        this.balcoon = balcoon;
        return this;
    }

    public int getStructureYear() {
        return structureYear;
    }

    public HouseBuilder setStructureYear(int structureYear) {
        this.structureYear = structureYear;
        return this;
    }

    public boolean isDublex() {
        return isDublex;
    }

    public HouseBuilder setDublex(boolean dublex) {
        isDublex = dublex;
        return this;
    }

    public boolean isFull() {
        return isFull;
    }

    public HouseBuilder setFull(boolean full) {
        isFull = full;
        return this;
    }

    public boolean isHasParkingArea() {
        return hasParkingArea;
    }

    public HouseBuilder setHasParkingArea(boolean hasParkingArea) {
        this.hasParkingArea = hasParkingArea;
        return this;
    }

    public boolean isHasParkPen() {
        return hasParkPen;
    }

    public HouseBuilder setHasParkPen(boolean hasParkPen) {
        this.hasParkPen = hasParkPen;
        return this;
    }

    public boolean isHasAirConditioner() {
        return hasAirConditioner;
    }

    public HouseBuilder setHasAirConditioner(boolean hasAirConditioner) {
        this.hasAirConditioner = hasAirConditioner;
        return this;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public HouseBuilder setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
        return this;
    }
}
