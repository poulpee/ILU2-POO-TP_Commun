package model;

class ReservationRestaurant extends Reservation {
    private int numTable, numService;

    public ReservationRestaurant(int jour, int mois, int numService, int numTable) {
        super(jour, mois);
        this.numTable = numTable;
        this.numService = numService;
    }

    public String toString() {
        return "Le " + jour + "/" + mois + " : table n°" + numTable +
               " pour le " + (numService == 1 ? "premier" : "deuxième") + " service.";
    }
    
    public int getIdentificationEntite() {
        return numTable;
    }
}
