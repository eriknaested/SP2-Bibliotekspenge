public class EBook extends NetTitle{

    private int characters;
    private boolean illustrated;

    public EBook(String title, String literatureType, int availability, int reach, int use, int characters, boolean illustrated) {
        super(title, literatureType, availability, reach, use);
        this.characters = characters;
        this.illustrated = illustrated;
    }

    private double calculatePages() {
        if (illustrated) {                              //+ 10% hvis bogen er illustreret
            return (characters / 1800 + 20) * 1.1;
        }
        return characters / 1800 + 20;
    }

    @Override
    protected double calculatePoints() {
        return calculatePages() * convertLiteratureType() * getPseudoCopies();
    }
}
