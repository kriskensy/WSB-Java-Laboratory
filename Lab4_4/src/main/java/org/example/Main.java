//Zad 4 - Przetestuj działanie modyfikatorów dostępności dla pól metod i konstruktorów.
package org.example;

public class Main {
    public static void main(String[] args) {

        //dostep publiczny -> dostepnosc wszedzie
        PublicExample publicExample = new PublicExample();
        System.out.println(publicExample.publicString);
        publicExample.publicMethod();
        System.out.println();

        //dostep chroniony -> dostepnosc dzieki temu, ze jest w tym samym pakiecie co main
        ProtectedExample protectedExample = new ProtectedExample();
        System.out.println(protectedExample.protectedString);
        protectedExample.protectedMethod();

        //dostep prywatny -> dostepnosc tylko swojej klasie
//        PrivateExample privateExample = new PrivateExample; //brak dostepu konstruktora - nie da sie utworzyc obiektu
//        System.out.println(privateExample.privateString); //brak dostepu do pola klasy
//        privateExample.privateMethod(); //brak dostepu do metody - nie da sie jej wywolac na obiekcie
    }
}