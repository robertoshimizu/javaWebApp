package com.example.DockerJavaWebApp.model;

import java.util.ArrayList;
import java.util.List;

public class MockDataBase {

    private static List<Consultant> lista = new ArrayList<>();

    static {
        Consultant consultant = new Consultant();
        consultant.setName("Meryl Hawking");
        Consultant consultant2 = new Consultant();
        consultant2.setName("Jennifer Lawrence");
        MockDataBase.lista.add(consultant);
        MockDataBase.lista.add(consultant2);
    }

    public void adiciona(Consultant consultant) {
        MockDataBase.lista.add(consultant);
    }

    public List<Consultant> getConsultants() {
        return MockDataBase.lista;
    }
}
