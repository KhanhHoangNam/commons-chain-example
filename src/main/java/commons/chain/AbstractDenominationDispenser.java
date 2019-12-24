package commons.chain;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

public abstract class AbstractDenominationDispenser implements Command {
    @Override
    public boolean execute(Context context) throws Exception {
        int amountLeftToBeWithDrawn = (int) context.get(AtmConstants.AMOUNT_LEFT_TO_BE_WITHDRAWN);
        if (amountLeftToBeWithDrawn >= getDominationValue()) {
            context.put(getDominationString(), amountLeftToBeWithDrawn / getDominationValue());
            context.put(AtmConstants.AMOUNT_LEFT_TO_BE_WITHDRAWN, amountLeftToBeWithDrawn % getDominationValue());
        }
        return false;
    }

    protected abstract String getDominationString();

    protected abstract int getDominationValue();
}
