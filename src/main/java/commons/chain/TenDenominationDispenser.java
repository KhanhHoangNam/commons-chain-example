package commons.chain;

import static commons.chain.AtmConstants.NO_OF_TENS_DISPENSED;

public class TenDenominationDispenser extends AbstractDenominationDispenser {
    @Override
    protected String getDominationString() {
        return NO_OF_TENS_DISPENSED;
    }

    @Override
    protected int getDominationValue() {
        return 10;
    }
}
