import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/student","postgres","1442");

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("select * from student");
        while(rs.next()) {
            System.out.println("Rollnum is "+rs.getInt(1)+" Class Studing "+rs.getInt(2)+" Name : "+rs.getString(3));
        }

        rs.close();
        st.close();
        con.close();
    }
}
