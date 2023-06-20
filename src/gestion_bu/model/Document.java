package gestion_bu.model;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private int id;

    private String title;

    private int pages_nbr;

    private ArrayList<Author> authors;

    private int id_edition = 0;

    private int id_genre = 0;

    private String year;

    public Document() {}
    public Document(int id, String title, int id_edition, int id_genre, int pages_nbr, String year, ArrayList<Author> authors) {
        this.id = id;
        this.title = title;
        this.id_edition = id_edition;
        this.id_genre = id_genre;
        this.pages_nbr = pages_nbr;
        this.year = year;
        this.authors = authors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages_nbr() {
        return pages_nbr;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

    public void setPages_nbr(int pages_nbr) {
        this.pages_nbr = pages_nbr;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String toString() {
        String str =       "Id_Document :" + this.getId() + "\n";
        str +=             "Title : " + this.getTitle() + "\n";
        str +=             "pages_nbr : " + this.getPages_nbr() + "\n";
        str +=             "year " + this.getYear() + "\n";

        str += "Authors: ";
        ArrayList<Author> al = this.getAuthors();
            for (int i = 0; i < al.size(); i++) {
                System.out.println(al.get(i));
            }


        str +=            "\n.....................................\n";

        return str;
    }

}