package com.company;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persoon p = new Persoon();
        System.out.println("Geef naam: ");
        p.setNaam(scanner.nextLine());

        System.out.println("Geef geboortejaar: ");
        int jaar = Integer.parseInt(scanner.nextLine());

        System.out.println("Geef geboortemaand: ");
        int maand = Integer.parseInt(scanner.nextLine());
        System.out.println("Geef geboortedag: ");
        int dag = Integer.parseInt(scanner.nextLine());
        p.setGeboorteDatum(dag, maand, jaar);


        System.out.printf("Dag %s, je bent %d jaar oud",p.getNaam(),p.getLeeftijd());



    }
}
