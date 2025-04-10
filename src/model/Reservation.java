package model;

abstract class Reservation {
    protected int jour, mois;

    public Reservation(int jour, int mois) {
        this.jour = jour;
        this.mois = mois;
    }

    public abstract String toString();
}
