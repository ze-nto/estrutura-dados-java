package com.projeto.atribuicaoporreferencia;

public class Main {
    public static void main(String[] args) {

        int a = 1;
        int b = a;

        System.out.println("Int a:" + a);
        System.out.println("Int b:" + b);
        a = 2;
        System.out.println("Int b:" + b);

        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;

        System.out.println("ObjA:" + objA);
        System.out.println("ObjB:" + objB);
        objA.setNum(2);
        System.out.println("ObjB:" + objB);

    }
}
