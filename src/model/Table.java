package model;

class Table extends EntiteReservable<FormulaireRestaurant> {
    private int nbChaises;
    private CalendrierAnnuel calendrierDeuxiemeService;

    public Table(int nbChaises) {
        super();
        this.nbChaises = nbChaises;
        this.calendrierDeuxiemeService = new CalendrierAnnuel();
    }

    public boolean estLibre(FormulaireRestaurant f) {
        return (f.getNumService() == 1 ? calendrier : calendrierDeuxiemeService)
               .estLibre(f.getJour(), f.getMois());
    }

    public boolean compatible(FormulaireRestaurant f) {
        return nbChaises >= f.getNombrePersonnes() && estLibre(f);
    }

    public Reservation reserver(FormulaireRestaurant f) {
        if (!compatible(f)) return null;

        boolean ok = (f.getNumService() == 1 ? calendrier : calendrierDeuxiemeService)
                        .reserver(f.getJour(), f.getMois());
        if (!ok) return null;
        f.setNumEntite(numero);
        return new ReservationRestaurant(f.getJour(), f.getMois(), f.getNumService(), numero);
    }
}