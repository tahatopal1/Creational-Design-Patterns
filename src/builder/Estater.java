package builder;

public class Estater {
    public static void main(String[] args) {
        House house1 = new House();
        house1.setCity("İstanbul");
        house1.setDistrict("Ataşehir");
        house1.setNeighborhood("Atatürk");
        house1.setRoom(3);
        house1.setStructureYear(2010);
        house1.setHasAirConditioner(true);

        House house2 = new House("İstanbul", "Ümraniye", "Tatlısu",
                2008, 2, 3, 2, 0,
                false, false, true,
                false, true, false);


        printHouse(house1);
        printHouse(house2);

    }

    private static void printHouse(House house){
        System.out.println();
        System.out.println(house);
    }

}
