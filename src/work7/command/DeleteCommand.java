package work7.command;

import work7.GradesTable;

/**
 * Command for deleting a row from the grades table.
 */
public class DeleteCommand implements DBCommand {
    private final GradesTable gradesTable;
    private final int id;

    /**
     * Constructs a delete command for the given grades table and row ID.
     *
     * @param gradesTable the grades table.
     * @param id the ID of the row to delete.
     */
    public DeleteCommand(GradesTable gradesTable, int id) {
        this.gradesTable = gradesTable;
        this.id = id;
    }

    /**
     * Executes the delete command by removing the row with the specified ID.
     */
    @Override
    public void execute() {
        gradesTable.delete(id);
    }
}
