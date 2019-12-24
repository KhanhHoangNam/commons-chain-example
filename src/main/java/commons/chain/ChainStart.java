package commons.chain;

import org.apache.commons.chain.Catalog;
import org.apache.commons.chain.Command;

import static commons.chain.AtmConstants.ATM_WITHDRAWAL_CHAIN;

public class ChainStart {
    public static void main(String[] args) throws Exception {
        //Create context
        AtmRequestContext context = new AtmRequestContext();
        context.setAmountLeftToBeWithdrawn(1000);
        context.setTotalAmountToBeWithdrawn(10000);
        context.setNoOfHundredsDispensed(10);

        //Get the catalog
        Catalog catalog = new AtmCatalog();


        //Execute the chain
        Command chain = catalog.getCommand(ATM_WITHDRAWAL_CHAIN);
        chain.execute(context);
    }
}
