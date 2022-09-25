package com.coche;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{

    List<Coche> todosCoches;

    @Override
    public void save(Coche coche) {
        System.out.println("save");
    }

    @Override
    public List<Coche> findAll() {
        System.out.println("findAll");
        return todosCoches;
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }
}
