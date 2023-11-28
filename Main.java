import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/student","postgres","1442");

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("select name,rollnum from student where classstd = 9");
        rs.next();
        System.out.println(rs.getString(1)+" "+rs.getInt(2));

        rs.close();
        st.close();
        con.close();
    }
}
