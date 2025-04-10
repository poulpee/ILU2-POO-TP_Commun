package model;

class FormulaireRestaurant extends Formulaire {
    private int nbPersonnes, numService;

    public FormulaireRestaurant(int jour, int mois, int nbPersonnes, int numService) {
        super(jour, mois);
        this.nbPersonnes = nbPersonnes;
        this.numService = numService;
    }

    public int getNumService() { 
    	return numService; 
    }
    
    public int getNombrePersonnes() {
        return nbPersonnes;
    }
}
