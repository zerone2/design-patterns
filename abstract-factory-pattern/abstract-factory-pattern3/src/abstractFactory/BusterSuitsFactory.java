package abstractFactory;

import ironman.constants.BodyType;
import ironman.constants.Power;

/**
 * Class for returning different types of Ironman Buster suits.
 */
public class BusterSuitsFactory implements SuitCreationFactory {

    @Override
    public String bodyType() {
        return BodyType.HUGE_BODY;
    }

    @Override
    public String power() {
        return Power.HIGH_POWER;
    }
}
