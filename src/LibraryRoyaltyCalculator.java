public class LibraryRoyaltyCalculator {

    public static void main(String[] args) {

        Author author1 = new Author("Olga Ravn");

        author1.addTitle(new PrintedBook("Celestine", "SKØN", 140, 166));
        author1.addTitle(new AudioBook("Celestine", "SKØN", 140, 192));
        author1.addTitle(new PrintedBook("Rugbrød for dummies", "FAG", 105, 250));

        System.out.println(author1.getName() + " royalties: " + author1.calculateRoyalties() + " kr.");


        Author author2 = new Author("Bente Bent");

        author2.addTitle(new EBook("Grundlæggende programmering", "FAG", 97, 50, 205, 360000, false));
        author2.addTitle(new EAudioBook("ASMR 101", "SKØN", 90, 90, 503, 1200));

        System.out.println(author2.getName() + " royalties: " + author2.calculateRoyalties() + " kr.");



    }
}
