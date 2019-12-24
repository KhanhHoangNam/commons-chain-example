package commons.chain;

import static commons.chain.AtmConstants.NO_OF_FIFTIES_DISPENSED;

public class FiftyDenominationDispenser extends AbstractDenominationDispenser {
    @Override
    protected String getDominationString() {
        return NO_OF_FIFTIES_DISPENSED;
    }

    @Override
    protected int getDominationValue() {
        return 50;
    }
}
