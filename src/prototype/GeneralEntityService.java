package prototype;

public class GeneralEntityService {
    public DocumentType findDocumentTypeById(Long id){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        DocumentType documentType = new DocumentType();
        documentType.setId(id);

        String name;
        if (id.compareTo(1L) == 0)
            name = "Personal";
        else if(id.compareTo(2L) == 0)
            name = "Corporation";
        else
            name = "General";

        documentType.setName(name);
        return documentType;

    }

    public Category findCategoryById(Long id){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Category category = new Category();
        category.setId(id);

        String name;
        if (id.compareTo(1L) == 0)
            name = "Special";
        else if(id.compareTo(2L) == 0)
            name = "Job";
        else
            name = "General";

        category.setName(name);
        return category;

    }

    public Document findDocumentById(Long id){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Document document = new Document();
        document.setId(id);
        document.setDocumentType(findDocumentTypeById(id));
        document.setCategory(findCategoryById(id));

        String name;
        String data;

        if (id.compareTo(1L) == 0){
            name = "Mail";
            data = "Dear friend...";
        }else if(id.compareTo(2L) == 0){
            name = "Report";
            data = "This report has been prepared for director...";
        }else{
            name = "Trafic rules";
            data = "Please let the walkers pass as you're turning right";
        }

        document.setName(name);
        document.setData(data);
        return document;

    }
}
