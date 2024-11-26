package work7.command;

import work7.GradesTable;
import work7.Row;

/**
 * Command for inserting a row into the grades table.
 */
public class InsertCommand implements DBCommand {
    private final GradesTable gradesTable;
    private final Row row;

    /**
     * Constructs an insert command for the given grades table and row.
     *
     * @param gradesTable the grades table.
     * @param row the row to insert.
     */
    public InsertCommand(GradesTable gradesTable, Row row) {
        this.gradesTable = gradesTable;
        this.row = row;
    }

    /**
     * Executes the insert command by adding the row to the grades table.
     */
    @Override
    public void execute() {
        gradesTable.insert(row);
    }
}
