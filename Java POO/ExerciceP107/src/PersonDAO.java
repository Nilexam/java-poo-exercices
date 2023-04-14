import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonDAO {
    private Connection connection;

    public PersonDAO(Connection connection) {
        this.connection = connection;
    }

    public void create(Person person) throws SQLException {
        String sql = "INSERT INTO person (name, age) VALUES (?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, person.getName());
        statement.setInt(2, person.getAge());
        statement.executeUpdate();
    }

    public Person read(int id) throws SQLException {
        String sql = "SELECT * FROM person WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            return new Person(name, age);
        }
        return null;
    }

    public void update(Person person) throws SQLException {
        String sql = "UPDATE person SET name = ?, age = ? WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, person.getName());
        statement.setInt(2, person.getAge());
        statement.setInt(3, person.getId());
        statement.executeUpdate();
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM person WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        statement.executeUpdate();
    }
}
