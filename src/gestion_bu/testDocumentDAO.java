package gestion_bu;

import org.w3c.dom.DocumentFragment;

import gestion_bu.model.Document;
import gestion_bu.model.Edition;
import gestion_bu.model.Genre;
import gestion_bu.model.DAOModel.DocumentDAO;
import gestion_bu.model.DAOModel.EditionDAO;

public class testDocumentDAO {
    public void testCrud() {

        DocumentDAO ddao = new DocumentDAO();
        Document doc = ddao.find(2);

        System.out.println(doc);



        DocumentDAO ddao2 = new DocumentDAO();
        ddao2.delete(doc);
    }
}
