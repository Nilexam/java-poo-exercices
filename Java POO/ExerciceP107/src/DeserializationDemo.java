import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filename = "person.ser";
        FileInputStream fileInputStream = new FileInputStream(filename);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person person = (Person) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
