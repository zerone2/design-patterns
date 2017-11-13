package abstractFactory;

import ironman.IronManSuit;

/**
 * Abstract Factory for creating Ironman suits.
 */
public interface SuitCreationFactory {
    String bodyType();

    String power();
}
