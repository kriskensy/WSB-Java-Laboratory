//Zad 6 - Stworzyć obiekt anonimowy oraz klasę anonimową na podstawie interfejsu.
package org.example;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle() {
            @Override
            public void drive() {
                System.out.println("Driving a car.");
            }
        };
        vehicle.drive();
    }
}