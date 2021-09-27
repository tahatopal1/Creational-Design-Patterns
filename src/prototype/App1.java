package prototype;

public class App1 {
    public static void main(String[] args) {
        GeneralEntityService generalEntityService = new GeneralEntityService();

        long timeCounter = System.currentTimeMillis();
        Document document1 = generalEntityService.findDocumentById(1L);
        System.out.println("Time passed(s): " + ((System.currentTimeMillis() - timeCounter) / 1000));
        System.out.println(document1);

        timeCounter = System.currentTimeMillis();
        Document document2 = generalEntityService.findDocumentById(2L);
        System.out.println("Time passed(s): " + ((System.currentTimeMillis() - timeCounter) / 1000));
        System.out.println(document2);

        Document document3 = null;
        timeCounter = System.currentTimeMillis();
        try {
            document3 = document1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("Time passed(s): " + ((System.currentTimeMillis() - timeCounter) / 1000));
        System.out.println(document3);

        // Deep clone for 'DocumentType'
        System.out.println("Are the 'DocumentType' objects same? " + (document1.getDocumentType() == document3.getDocumentType()));

        // Shallow clone for 'Category'
        System.out.println("Are the 'Documents' objects same? " + (document1.getCategory() == document3.getCategory()));

    }
}
