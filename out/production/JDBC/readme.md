# JDBC consist 7 steps <br>

# step 1 = import java.sql.* package <br>

# step 2 = download driver of which ever database u r using and load it; example <br>
# Class.forName("org.postgresql.Driver");

# step 3 = create a Connection to the databese <br>
# Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/student","postgres","1442");

# step 4 = create a statement
# Statement st = con.createStatement();

# step 5 = execute a query
# ResultSet rs = st.executeQuery("select name,rollnum from student where classstd = 9");

# step 6 = Process result
# rs.next();
# System.out.println(rs.getString(1)+" "+rs.getInt(2));

# step 7 = close Connection
# rs.close(); st.close(); con.close();


