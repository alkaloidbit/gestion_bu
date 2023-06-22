package gestion_bu;

import gestion_bu.model.Document;
import gestion_bu.model.DAOModel.DocumentDAO;

public class testDocumentDAO {
    public void testCrud() {
        DocumentDAO docDAO = new DocumentDAO();
        Document document = docDAO.find(4);

        System.out.println(document);
    }

}
