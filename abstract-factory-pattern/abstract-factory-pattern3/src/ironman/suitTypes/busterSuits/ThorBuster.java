package ironman.suitTypes.busterSuits;

import abstractFactory.SuitCreationFactory;
import ironman.IronManSuit;
import ironman.constants.SuitName;

/**
 * Custom Ironman suit.
 */
public class ThorBuster extends IronManSuit {
    private SuitCreationFactory suitCreationFactory;

    public ThorBuster(SuitCreationFactory suitCreationFactory) {
        this.suitCreationFactory = suitCreationFactory;
    }

    @Override
    public void prepareSuit() {
        name = SuitName.THOR_BUSTER;
        bodyType = suitCreationFactory.bodyType();
        power = suitCreationFactory.power();
    }
}
