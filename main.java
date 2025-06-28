public class main {
    public static void main(String[] args) {
        HeroManager manager = new HeroManager();
        manager.addHero(new Hero("Spider-Man", 85, Affiliation.AVENGERS));
        manager.addHero(new Hero("Batman", 78, Affiliation.JUSTICE_LEAGUE));
        manager.addHero(new Hero("Wolverine", 90, Affiliation.X_MEN));
        manager.addHero(new Hero("Wonder Woman", 95, Affiliation.JUSTICE_LEAGUE));
        System.out.println("Original List:");
        manager.displayHeroes();        
        manager.bubbleSortByPower();
        System.out.println("\nHeroes sorted by power (Bubble Sort):");
        manager.displayHeroes();
        manager = new HeroManager();
        manager.addHero(new Hero("Spider-Man", 85, Affiliation.AVENGERS));
        manager.addHero(new Hero("Batman", 78, Affiliation.JUSTICE_LEAGUE));
        manager.addHero(new Hero("Wolverine", 90, Affiliation.X_MEN));
        manager.addHero(new Hero("Wonder Woman", 95, Affiliation.JUSTICE_LEAGUE));
        manager.insertionSortByPower();
        System.out.println("\nHeroes sorted by power (Insertion Sort):");
        manager.displayHeroes();
        manager.removeHero("Batman");
        System.out.println("\nAfter removing Batman:");
        manager.displayHeroes();
        manager.addHero(new Hero("Iron Man", 88, Affiliation.AVENGERS));
        System.out.println("\nAfter adding Iron Man:");
        manager.displayHeroes();
        System.out.println("\nHeroes in 2D Array Format:");
        manager.displayAs2DArray();
    }
}
