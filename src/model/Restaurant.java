package model;

class Restaurant {
    private CentraleReservation<Table, FormulaireRestaurant> centrale;

    public Restaurant(int capacite) {
        centrale = new CentraleReservation<>(new Table[capacite]);
    }

    public int ajouterTable(int nbChaises) {
        return centrale.ajouterEntite(new Table(nbChaises));
    }

    public int[] donnerPossibilites(FormulaireRestaurant f) {
        return centrale.donnerPossibilites(f);
    }

    public Reservation reserver(int numEntite, FormulaireRestaurant f) {
        return centrale.reserver(numEntite, f);
    }
}

