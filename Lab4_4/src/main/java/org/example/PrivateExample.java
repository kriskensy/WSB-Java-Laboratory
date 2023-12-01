package org.example;

public class PrivateExample {
    private String privateString = "Private field";

    private PrivateExample() {
    }

    private void privateMethod() {
        System.out.println("Private method");
    }
}