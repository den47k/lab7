package work7.command;

import work7.GradesTable;

/**
 * Command for selecting a row from the grades table.
 */
public class SelectCommand implements DBCommand {
    private final GradesTable gradesTable;
    private final int id;

    /**
     * Constructs a select command for the given grades table and row ID.
     *
     * @param gradesTable the grades table.
     * @param id the ID of the row to select.
     */
    public SelectCommand(GradesTable gradesTable, int id) {
        this.gradesTable = gradesTable;
        this.id = id;
    }

    /**
     * Executes the select command by retrieving the row with the specified ID.
     */
    @Override
    public void execute() {
        gradesTable.select(id);
    }
}
