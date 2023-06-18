package gestion_bu.model;

public class Author {

    private int id;

    private String first_name;
    private String last_name;

    public Author() {}

    public Author(int id, String first_name, String last_name) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String toString(){
        String str =     "NOM : " + this.getLast_name() + "\n";
        str +=             "PRENOM : " + this.getFirst_name() + "\n";
        str +=            "\n.....................................\n";

        return str;
    }

}
