package model;

abstract class EntiteReservable<T extends Formulaire> {
    protected CalendrierAnnuel calendrier;
    protected int numero;

    protected EntiteReservable() {
        calendrier = new CalendrierAnnuel();
    }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public abstract boolean estLibre(T formulaire);
    public abstract boolean compatible(T formulaire);
    public abstract Reservation reserver(T formulaire);
}