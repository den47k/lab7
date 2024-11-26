package work7.memento;

import work7.Row;

import java.util.List;

/**
 * Represents a snapshot of the grades table's state.
 */
public class TransactionMemento {
    private final List<Row> state;

    /**
     * Constructs a memento with the given state.
     *
     * @param state the state of the grades table.
     */
    public TransactionMemento(List<Row> state) {
        this.state = state;
    }

    /**
     * Retrieves the stored state.
     *
     * @return the state of the grades table.
     */
    public List<Row> getState() {
        return state;
    }

    @Override
    public String toString() {
        return "TransactionMemento{" +
                "state=" + state +
                '}';
    }
}
