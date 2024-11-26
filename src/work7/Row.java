package work7;

/**
 * Represents a row in the grades table.
 */
public class Row {
    private final int id;
    private final String name;
    private final int grade;

    /**
     * Constructs a row with the given ID, name, and grade.
     *
     * @param id the row ID.
     * @param name the name associated with the row.
     * @param grade the grade associated with the row.
     */
    public Row(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    /**
     * Retrieves the ID of the row.
     *
     * @return the row ID.
     */
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Row{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
