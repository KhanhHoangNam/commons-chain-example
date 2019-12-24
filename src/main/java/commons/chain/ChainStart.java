package commons.chain;

import org.apache.commons.chain.Catalog;
import org.apache.commons.chain.Command;

import static commons.chain.AtmConstants.ATM_WITHDRAWAL_CHAIN;

public class ChainStart {
    public static void main(String[] args) throws Exception {
        //Create context
        AtmRequestContext context = new AtmRequestContext();
        context.setAmountLeftToBeWithdrawn(1000);

        //Get the catalog
        Catalog catalog = new AtmCatalog();
        catalog.getCommand(ATM_WITHDRAWAL_CHAIN);

        //Execute the chain
        Command firstCommand = catalog.getCommand(ATM_WITHDRAWAL_CHAIN);
        firstCommand.execute(context);
    }
}
