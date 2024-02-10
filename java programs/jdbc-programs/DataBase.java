import java.sql.*;
public class DataBase{
    public static void main(String[] args) throws Exception{
        try{
            Class.forName("org.sqlite.JDBC");

            Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.bd");

            Statement stmt=con.createStatement();

            ResultSet rs=stmt.executeQuery("select * from dept");

            int dno;
            String dname;
            while(rs.next()){
                dno=rs.getInt("deptno");
                dname=rs.getString("dname");

                System.out.println(dno+"\t"+dname) ;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
