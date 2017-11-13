package ironman.suitTypes.markSuits;

import abstractFactory.SuitCreationFactory;
import ironman.IronManSuit;
import ironman.constants.SuitName;

/**
 * Custom Ironman suit.
 */
public class MarkThree extends IronManSuit {
    private SuitCreationFactory suitCreationFactory;

    public MarkThree(SuitCreationFactory suitCreationFactory) {
        this.suitCreationFactory = suitCreationFactory;
    }

    @Override
    public void prepareSuit() {
        name = SuitName.MARK_III;
        bodyType = suitCreationFactory.bodyType();
        power = suitCreationFactory.power();
    }
}
