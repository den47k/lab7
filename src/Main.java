import work7.*;

import work7.memento.*;
import work7.command.*;

/**
 * Entry point for the application demonstrating the Command and Memento patterns.
 */
public class Main {
    /**
     * Main method to execute the application.
     *
     * @param args the command-line arguments.
     */
    public static void main(String[] args) {
        // Initialize the GradesTable and Transaction History
        GradesTable gradesTable = new GradesTable();
        TransactionsHistory history = new TransactionsHistory();

        // Insert Rows using Commands
        Row row1 = new Row(1, "John", 95);
        Row row2 = new Row(2, "Jane", 75);

        DBCommand insertCommand1 = new InsertCommand(gradesTable, row1);
        DBCommand insertCommand2 = new InsertCommand(gradesTable, row2);


        System.out.println("Inserting first row");
        DBCommandControl commandControl = new DBCommandControl(insertCommand1);
        commandControl.commit(); // Insert John
        history.save(gradesTable.save()); // Save state after inserting John


        System.out.println("\nInserting second row");
        commandControl.setCommand(insertCommand2);
        commandControl.commit(); // Insert Jane
        history.save(gradesTable.save()); // Save state after inserting Jane



        System.out.println("\nSelecting rows");
        // Select a Row by ID
        DBCommand selectCommand1 = new SelectCommand(gradesTable, 1);
        DBCommand selectCommand2 = new SelectCommand(gradesTable, 3);

        commandControl.setCommand(selectCommand1);
        commandControl.commit(); // Select John

        commandControl.setCommand(selectCommand2);
        commandControl.commit(); // Attempt to select non-existent row


        // Delete a Row using Command
        System.out.println("\nDeleting first row");
        DBCommand deleteCommand = new DeleteCommand(gradesTable, 1);
        commandControl.setCommand(deleteCommand);
        commandControl.commit(); // Delete John
        history.save(gradesTable.save()); // Save state after deleting John


        System.out.println("\nRestoring states of db");
        // Restore to a previous state
        gradesTable.restore(history.getLastSavedTransaction());
        gradesTable.restore(history.getLastSavedTransaction());
        gradesTable.restore(history.getLastSavedTransaction());
    }
}