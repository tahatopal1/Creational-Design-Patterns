package factory;

public class PhoneBranch {
    public static void main(String[] args) {
        Phone s8 = PhoneFactory.getPhone("s8", "2600mAh", 4, 7);
        Phone note8 = PhoneFactory.getPhone("note8", "3000mAh", 5, 8);

        System.out.println("Attributes for s8: ");
        System.out.println(s8);

        System.out.println("Attributes for note8: ");
        System.out.println(note8);

    }
}
