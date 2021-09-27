package builder;

public class EstaterV2 {

    public static void main(String[] args) {
        House house =  HouseBuilder.startBuild()
                .setCity("Istanbul")
                .setDistrict("Ümraniye")
                .setNeighborhood("Tatlısu")
                .setStructureYear(2009)
                .setRoom(3)
                .setHasParkPen(true)
                .setHasParkingArea(true)
                .build();

        printHouse(house);

        house = HouseBuilder.buildWithAddress("İstanbul", "Üsküdar", "Kandilli")
                    .setDublex(true)
                    .setBalcoon(3)
                    .build();

        printHouse(house);

    }

    private static void printHouse(House house){
        System.out.println();
        System.out.println(house);
    }
}
