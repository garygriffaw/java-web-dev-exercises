package exercises.lsn6technology;

public abstract class AbstractEntity {
    private int id;
    private static int maxId = 0;

    public AbstractEntity() {
        maxId++;
        id = maxId;
    }

    public int getId() {
        return id;
    }
}
