package ru.epam.nnov;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("1.");
        System.out.println("2..");
        System.out.println("3...");
        int i = 1;
        System.out.println(i++);
        System.out.println(i++);
        System.out.println(i);
        int a = 1;
        int b = 2;
        int c = a + b;
        System.out.println("sum = " + c);
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        String hello = "Hello";
        String world = "world";
        System.out.println(hello + " " + world + "!");
    }
}
