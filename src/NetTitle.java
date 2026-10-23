public abstract class NetTitle extends Title {

    private int availability;
    private int reach;
    private int use;

    public NetTitle(String title, String literatureType, int availability, int reach, int use) {
        super(title, literatureType);
        this.availability = availability;       //Antal kommunter, der har bogen til udlån
        this.reach = reach;                     //Antal kommuner, der har udlånt bogen
        this.use = use;                         //Antal udlån
    }

    protected double getPseudoCopies() {
        return (availability * 0.5 + reach * 5) + use;
    }

    private int getUse() {
        return use;
    }
}
