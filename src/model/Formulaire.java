package model;

abstract class Formulaire {
    protected int jour, mois, numEntite;

    protected Formulaire(int jour, int mois) {
        this.jour = jour;
        this.mois = mois;
    }

    public int getJour() { return jour; }
    public int getMois() { return mois; }
    public int getNumEntite() { return numEntite; }
    public void setNumEntite(int numEntite) { this.numEntite = numEntite; }
    
    public int getIdentificationEntite() {
        return numEntite;
    }
    
    public void setIdentificationEntite(int numEntite) {
        setNumEntite(numEntite);
    }
}
