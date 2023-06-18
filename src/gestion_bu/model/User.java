package gestion_bu.model;

public class User {

    private int id;

    private int is_admin;

    private String first_name;

    private String last_name;

    private String email;

    private String passwd;
    public User(int id, int is_admin, String first_name, String last_name, String email, String passwd) {
        this.id = id;
        this.is_admin = is_admin;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.passwd = passwd;
    }

    public User () {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(int is_admin) {
        this.is_admin = is_admin;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String toString() {

        String str =       "Id_User :" + this.getId() + "\n";
        str +=             "NOM : " + this.getLast_name() + "\n";
        str +=             "PRENOM : " + this.getFirst_name() + "\n";
        str +=             "email : " + this.getEmail() + "\n";
        str +=             "isAdmin: " + this.getIs_admin() + "\n";
        str +=            "\n.....................................\n";

        return str;
    }
}

