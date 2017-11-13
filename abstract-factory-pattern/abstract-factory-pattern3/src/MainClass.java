import abstractFactory.BusterSuitsFactory;
import abstractFactory.MarkSuitsFactory;
import abstractFactory.SuitCreationFactory;
import ironman.suitTypes.busterSuits.HulkBuster;
import ironman.suitTypes.markSuits.MarkEight;

/**
 * Class containing the main method.
 */
public class MainClass {
    private static SuitCreationFactory markSuits;
    private static SuitCreationFactory busterSuits;

    public static void main(String args[]) {
        markSuits = new MarkSuitsFactory();
        busterSuits = new BusterSuitsFactory();
        // Make custom suit.
        makeCustomSuit();
    }

    /**
     * Making custom suits.
     */
    private static void makeCustomSuit() {
        // Preparing a Hulk-Buster suit.
        HulkBuster hulkBuster = new HulkBuster(busterSuits);
        hulkBuster.prepareSuit();
        hulkBuster.buildSuit();
        System.out.println("");
        // Preparing a Mark Eight suit.
        MarkEight markEight = new MarkEight(markSuits);
        markEight.prepareSuit();
        markEight.buildSuit();
    }
}
