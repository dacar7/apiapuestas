package io.swagger.configuration;

import io.swagger.model.Cotejo;

import java.util.ArrayList;
import java.util.List;

public class Utiles {

    public List<Cotejo> listaCotejos(){

        List<Cotejo> lst = new ArrayList<>();
        Cotejo c1 = new Cotejo("1", "t123", "Colombia", "Inglaterra", "partido");
        Cotejo c2 = new Cotejo("2", "t123", "Belgica", "Brasil","partido");
        Cotejo c3 = new Cotejo("3", "t123", "Suecia", "Inglaterra","partido");
        Cotejo c4 = new Cotejo("4", "t123", "Croacia", "Rusia","partido");

        lst.add(c1);
        lst.add(c2);
        lst.add(c3);
        lst.add(c4);

        return  lst;
    }
}
