package gestion_bu.model;


import java.sql.Connection;
import java.util.ArrayList;

public abstract  class DAO<T> {
    public Connection connect = ConnectionMariaDB.getInstance();

    public abstract T find(int id);

    public abstract ArrayList<T> findAll();

    public abstract T create(T obj);

    public abstract T update(T obj);

    public abstract void delete(T obj);
}
