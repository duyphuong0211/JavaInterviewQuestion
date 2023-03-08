package serializable.test;

import java.io.Serializable;

public class TestSerializableObj implements Serializable {
    private int id;
    private String name;

    public TestSerializableObj(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
