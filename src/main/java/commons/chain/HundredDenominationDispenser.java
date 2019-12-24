package commons.chain;

import static commons.chain.AtmConstants.NO_OF_HUNDREDS_DISPENSED;

public class HundredDenominationDispenser extends AbstractDenominationDispenser {
    @Override
    protected String getDominationString() {
        return NO_OF_HUNDREDS_DISPENSED;
    }

    @Override
    protected int getDominationValue() {
        return 100;
    }
}
