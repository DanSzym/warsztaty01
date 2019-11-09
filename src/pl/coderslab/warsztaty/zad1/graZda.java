package pl.coderslab.warsztaty.zad1;


import java.util.Random;
import java.util.Scanner;

public class graZda {

    public static void main(String[] args) {

       // Random random = new Random();
            System.out.println("Zadanie 1");

            Random random = new Random();

                int wylosowanaLiczba = random.nextInt(100)+1;

                System.out.println("Wylosowałem liczbę zgadnij jaką");

                boolean win = false;
                while(!win){

                System.out.println("Podaj liczbę");

                int liczba = wczytajLiczbe();
                if(liczba < wylosowanaLiczba){
                    System.out.println("Podana liczba jest za mała");
                }else if(liczba > wylosowanaLiczba) {
                    System.out.println("Podana liczba jest za duża");
                }else {
                    System.out.println("Zgadłeś");

                }
                }
            }

    public static int wczytajliczbe(){
        System.out.println("Podaj liczbę");

    Scanner scaner = new Scanner(System.in);
    while(!scanner.nextInt()){
        System.out.println("Musisz podać liczbę");
        scanner.next();
    }

        return scaner.nextInt();
    }
}

