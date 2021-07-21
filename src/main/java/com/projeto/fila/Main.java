package com.projeto.fila;

public class Main {
    public static void main(String[] args) {

        Fila<String> minhaFila = new Fila();

        minhaFila.enqueue("primeiro elemento");
        minhaFila.enqueue("segundo elemento");
        minhaFila.enqueue("terceiro elemento");
        minhaFila.enqueue("quarto elemento");

        System.out.println(minhaFila);
        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila.dequeue());
        minhaFila.enqueue("ultimo");
        System.out.println(minhaFila);
        System.out.println(minhaFila.first());
    }
}
