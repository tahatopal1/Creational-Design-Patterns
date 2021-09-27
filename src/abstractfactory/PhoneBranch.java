package abstractfactory;

public class PhoneBranch {
    public static void main(String[] args) {

        S8Factory s8Factory = new S8Factory();
        Phone s8 = s8Factory.getPhone("s8", "2600mAh", 4, 7);

        Note8Factory note8Factory = new Note8Factory();
        Phone note8 = note8Factory.getPhone("Note8", "3000mAh", 5, 8);

        System.out.println(s8);
        System.out.println(note8);

    }
}
