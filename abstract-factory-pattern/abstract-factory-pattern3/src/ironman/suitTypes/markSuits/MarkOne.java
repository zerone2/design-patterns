package ironman.suitTypes.markSuits;

import abstractFactory.SuitCreationFactory;
import ironman.IronManSuit;
import ironman.constants.SuitName;

/**
 * Custom Ironman suit.
 */
public class MarkOne extends IronManSuit {
    private SuitCreationFactory suitCreationFactory;

    public MarkOne(SuitCreationFactory suitCreationFactory) {
        this.suitCreationFactory = suitCreationFactory;
    }

    @Override
    public void prepareSuit() {
        name = SuitName.MARK_I;
        bodyType = suitCreationFactory.bodyType();
        power = suitCreationFactory.power();
    }
}
