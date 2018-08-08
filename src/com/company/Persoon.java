package com.company;

import java.time.LocalDate;

public class Persoon {
    private String naam;
    private LocalDate geboorteDatum;

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public LocalDate getGeboorteDatum() {
        return geboorteDatum;
    }

    public void setGeboorteDatum(LocalDate geboorteDatum) {
        this.geboorteDatum = geboorteDatum;
    }

    public void setGeboorteDatum(int dag, int maand, int jaar) {
        this.geboorteDatum = LocalDate.of(jaar, maand, dag);
    }

    public int getLeeftijd() {
        LocalDate vandaag = LocalDate.now();
        int leeftijd = vandaag.getYear() - geboorteDatum.getYear();
        LocalDate verjaardag = geboorteDatum.plusYears(leeftijd);
        if (verjaardag.compareTo(vandaag) > 0) {
            leeftijd--;
        }
        return leeftijd;
    }
}

