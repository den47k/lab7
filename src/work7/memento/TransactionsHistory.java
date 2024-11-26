package work7.memento;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Manages the history of transactions using mementos.
 */
public class TransactionsHistory {
    private final Stack<TransactionMemento> transactionsHistoryStack = new Stack<>();

    /**
     * Saves the current state of a transaction to the history stack.
     *
     * @param transactionMemento the transaction memento to save.
     */
    public void save(TransactionMemento transactionMemento) {
        transactionsHistoryStack.push(transactionMemento);
        System.out.println("Current stack state:");
        for (TransactionMemento memento : transactionsHistoryStack) {
            System.out.println(memento.toString());
        }
    }

    /**
     * Retrieves the last saved transaction state.
     *
     * @return the last saved transaction memento, or an empty memento if no valid state exists.
     */
    public TransactionMemento getLastSavedTransaction() {
        if (transactionsHistoryStack.size() < 2) {
            return createEmptyTransactionMemento();
        } else {
            transactionsHistoryStack.pop();
            return transactionsHistoryStack.peek();
        }
    }

    /**
     * Creates an empty transaction memento.
     *
     * @return an empty transaction memento.
     */
    private TransactionMemento createEmptyTransactionMemento() {
        return new TransactionMemento(new ArrayList<>());
    }
}
