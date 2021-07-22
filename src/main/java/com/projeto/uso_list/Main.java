package com.projeto.uso_list;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Fiat"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Volvo"));
        listaCarros.add(new Carro("Ford"));

        System.out.println(listaCarros.contains(new Carro("Ford")));
        System.out.println(listaCarros.get(2));
        System.out.println(listaCarros.indexOf(new Carro("Fiat")));
        System.out.println(listaCarros.remove(0));

        System.out.println(listaCarros);
    }
}
