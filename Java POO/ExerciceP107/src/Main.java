import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Singleton singleton1 = Singleton.getInstance();
        System.out.println("Adresse mémoire de singleton1 : " + System.identityHashCode(singleton1));

        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Adresse mémoire de singleton2 : " + System.identityHashCode(singleton2));

        Singleton singleton3 = Singleton.getInstance();
        System.out.println("Adresse mémoire de singleton3 : " + System.identityHashCode(singleton3));

        Connection connection = DatabaseConnection.getConnection();
        PersonDAO personDAO = new PersonDAO(connection);

        Person person1 = new Person( "Alice", 30);
        personDAO.create(person1);

        Person person2 = personDAO.read(1);
        person2.setAge(31);
        personDAO.update(person2);

        personDAO.delete(1);

        connection.close();
    }
}