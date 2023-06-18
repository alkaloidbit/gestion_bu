package gestion_bu.model;

public class Document {
    private int id;

    private String title;

    public Document(int id, String title, int pages_nbr, String year) {
        this.id = id;
        this.title = title;
        this.pages_nbr = pages_nbr;
        this.year = year;
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

    public void setPages_nbr(int pages_nbr) {
        this.pages_nbr = pages_nbr;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    private int pages_nbr;

    private String year;
}
