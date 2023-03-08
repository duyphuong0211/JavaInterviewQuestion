package serializable.test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationExample {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("TestSerializableObj.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            TestSerializableObj obj = (TestSerializableObj) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Deserialized data is: " + obj.getId() + ", " + obj.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
