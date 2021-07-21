package com.projeto.listacircular;

public class Main {

    public static void main(String[] args) {

        ListaCircular<String> minhaLista = new ListaCircular<>();

        minhaLista.add("C0");
        System.out.println(minhaLista);

        minhaLista.remove(0);
        System.out.println(minhaLista);

        minhaLista.add("C1");
        System.out.println(minhaLista);
        minhaLista.add("C2");
        minhaLista.add("C3");
        System.out.println(minhaLista);

        System.out.println(minhaLista.get(0));
        System.out.println(minhaLista.get(1));

    }
}
