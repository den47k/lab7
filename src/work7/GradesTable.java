package work7;

import work7.memento.TransactionMemento;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a table for managing grades.
 */
public class GradesTable {
    private List<Row> rows = new ArrayList<>();

    /**
     * Inserts a row into the grades table.
     *
     * @param row the row to insert.
     */
    public void insert(Row row) {
        rows.add(row);
        System.out.println("Inserted: " + row);
    }

    /**
     * Deletes a row with the specified ID from the grades table.
     *
     * @param id the ID of the row to delete.
     */
    public void delete(int id) {
        for (Row row : rows) {
            if (row.getId() == id) {
                System.out.println("Deleted row: " + row);
                rows.remove(row);
                return;
            }
        }
        System.out.println("Row with id " + id + " not found.");
    }

    /**
     * Selects a row with the specified ID from the grades table.
     *
     * @param id the ID of the row to select.
     */
    public void select(int id) {
        for (Row row : rows) {
            if (row.getId() == id) {
                System.out.println("Selected row: " + row);
                return;
            }
        }
        System.out.println("Row with id " + id + " not found.");
    }

    /**
     * Saves the current state of the grades table.
     *
     * @return a transaction memento containing the current state.
     */
    public TransactionMemento save() {
        return new TransactionMemento(new ArrayList<>(rows));
    }

    /**
     * Restores the grades table to a previous state.
     *
     * @param memento the memento containing the previous state.
     */
    public void restore(TransactionMemento memento) {
        rows = memento.getState();
        System.out.println("State restored: " + rows);
    }
}
