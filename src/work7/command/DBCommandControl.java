package work7.command;

/**
 * Controller for managing and executing database commands.
 */
public class DBCommandControl {
    private DBCommand dbCommand;

    /**
     * Constructs a command control with the given database command.
     *
     * @param dbCommand the database command to execute.
     */
    public DBCommandControl(DBCommand dbCommand) {
        this.dbCommand = dbCommand;
    }

    /**
     * Sets the current database command.
     *
     * @param dbCommand the new database command.
     */
    public void setCommand(DBCommand dbCommand) {
        this.dbCommand = dbCommand;
    }

    /**
     * Executes the current database command.
     */
    public void commit() {
        dbCommand.execute();
    }
}
