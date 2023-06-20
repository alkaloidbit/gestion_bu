package gestion_bu.model;

public class Edition {
    private int id;

    private String name;

    public Edition() {}

    public Edition(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        String str =  "Id_Edition :" + this.getId() + "\n";
        str += "name: " + this.getName()+ "\n";

        return str;
    }
}
