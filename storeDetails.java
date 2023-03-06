import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class storeDetails {

    public void storeData(String name, int age, Double gpa, String email, int qualification) {

        try {
            String url = "jdbc:mysql://localhost:3306/studentdb";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "root");
            Statement st = con.createStatement();
            int i = st.executeUpdate("INSERT INTO student (name, age, gpa, email, qualification) VALUES ('" + name
                    + "','" + age + "','" + gpa + "','" + email + "','" + qualification + "')");
            // int i = st.executeUpdate("insert into student values('" +name + "','" + age +
            // "','" + gpa + "','" + email + "','" + qualification + "')");
            // int id = st.execute('select id from student where name');
            if (i > 0)
                System.out.println("successfully stored");
            else {
                System.out.println("failed");
            }
        } catch (Exception e) {
            System.out.println("Couldn't store data");
            System.out.println(e);
        }

    }
}
