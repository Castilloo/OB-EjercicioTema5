package com.coche;

public class Main {

    static CocheCRUD cocheCrud = new CocheCRUDImpl();
    public static void main(String[] args) {
        cocheCrud.findAll();
        cocheCrud.save(new Coche());
        cocheCrud.delete();
    }
}
