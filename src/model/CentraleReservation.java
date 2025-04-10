package model;

class CentraleReservation<T extends EntiteReservable<F>, F extends Formulaire> {
    private T[] entites;
    private int nbEntites;

    public CentraleReservation(T[] entites) {
        this.entites = entites;
        this.nbEntites = 0;
    }

    public int ajouterEntite(T entite) {
        entite.setNumero(nbEntites + 1);
        entites[nbEntites++] = entite;
        return entite.getNumero();
    }

    public int[] donnerPossibilites(F formulaire) {
        int[] res = new int[nbEntites];
        for (int i = 0; i < nbEntites; i++) {
            if (entites[i].compatible(formulaire)) res[i] = entites[i].getNumero();
            else res[i] = 0;
        }
        return res;
    }

    public Reservation reserver(int numEntite, F formulaire) {
        T entite = entites[numEntite - 1];
        formulaire.setNumEntite(numEntite);
        return entite.reserver(formulaire);
    }
}
