package ironman.suitTypes.busterSuits;

import abstractFactory.SuitCreationFactory;
import ironman.IronManSuit;
import ironman.constants.SuitName;

/**
 * Custom Ironman suit.
 */
public class HulkBuster extends IronManSuit {
    private SuitCreationFactory suitCreationFactory;

    public HulkBuster(SuitCreationFactory suitCreationFactory) {
        this.suitCreationFactory = suitCreationFactory;
    }

    @Override
    public void prepareSuit() {
        name = SuitName.HULK_BUSTER;
        bodyType = suitCreationFactory.bodyType();
        power = suitCreationFactory.power();
    }
}
