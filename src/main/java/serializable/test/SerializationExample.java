package serializable.test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {
    public static void main(String[] args) {
        try {
            TestSerializableObj obj = new TestSerializableObj(1, "John");
            FileOutputStream fileOut = new FileOutputStream("TestSerializableObj.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in TestSerializableObj.ser");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
