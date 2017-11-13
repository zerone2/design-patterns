package abstractFactory;

import ironman.constants.BodyType;
import ironman.constants.Power;

/**
 * Class for returning different types of Ironman Mark suits.
 */
public class MarkSuitsFactory implements SuitCreationFactory {

    @Override
    public String bodyType() {
        return BodyType.NORMAL_BODY;
    }

    @Override
    public String power() {
        return Power.MEDIUM_POWER;
    }
}
