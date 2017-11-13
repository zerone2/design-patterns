package ironman.suitTypes.markSuits;

import abstractFactory.SuitCreationFactory;
import ironman.IronManSuit;
import ironman.constants.SuitName;

/**
 * Custom Ironman suit.
 */
public class MarkEight extends IronManSuit {
    private SuitCreationFactory suitCreationFactory;

    public MarkEight(SuitCreationFactory suitCreationFactory) {
        this.suitCreationFactory = suitCreationFactory;
    }

    @Override
    public void prepareSuit() {
        name = SuitName.MARK_VIII;
        bodyType = suitCreationFactory.bodyType();
        power = suitCreationFactory.power();
    }
}
