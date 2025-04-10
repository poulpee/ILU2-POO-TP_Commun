package model;

public class CalendrierAnnuel {

    private Mois[] calendrier;

    public CalendrierAnnuel() {
        calendrier = new Mois[] {
            new Mois("Janvier", 31),
            new Mois("Février", 28),
            new Mois("Mars", 31),
            new Mois("Avril", 30),
            new Mois("Mai", 31),
            new Mois("Juin", 30),
            new Mois("Juillet", 31),
            new Mois("Août", 31),
            new Mois("Septembre", 30),
            new Mois("Octobre", 31),
            new Mois("Novembre", 30),
            new Mois("Décembre", 31)
        };
    }

    public boolean estLibre(int jour, int mois) {
        return calendrier[mois - 1].estLibre(jour);
    }

    public boolean reserver(int jour, int mois) {
        if (calendrier[mois - 1].estLibre(jour)) {
            calendrier[mois - 1].reserver(jour);
            return true;
        }
        return false;
    }

    private class Mois {
        private String nom;
        private boolean[] jours;

        public Mois(String nom, int nbJours) {
            this.nom = nom;
            this.jours = new boolean[nbJours];
        }

        public boolean estLibre(int jour) {
            return !jours[jour - 1];
        }

        public void reserver(int jour) {
            if (!estLibre(jour)) {
                throw new IllegalStateException("Jour déjà réservé");
            }
            jours[jour - 1] = true;
        }
    }
} 
