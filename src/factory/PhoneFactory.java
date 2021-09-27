package factory;

public class PhoneFactory {

    public static Phone getPhone(String model, String battery, int width, int height){

        Phone phone;

        if ("s8".equalsIgnoreCase(model))
            phone = new S8(model, battery, width, height);
        else if("Note8".equalsIgnoreCase(model))
            phone = new Note8(model, battery, width, height);
        else
            throw new RuntimeException("Not a valid model!");

        return phone;
    }

}
