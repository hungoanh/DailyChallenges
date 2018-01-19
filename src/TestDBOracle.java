/*
import java.sql.*;
import oracle.jdbc.driver.OracleDriver;

public class TestDBOracle
{

    public static void main(String[] args)
            throws ClassNotFoundException, SQLException
    {
        Class.forName("oracle.jdbc.driver.OracleDriver");

        String url = "jdbc:oracle:thin:@PDR_DATABASE.ci.neoninternal.org:1521:P_PDR";
        Connection conn =
                DriverManager.getConnection(url,"hle","hle");
        System.out.println ("Got connection!");
        conn.setAutoCommit(false);
        Statement stmt = conn.createStatement();
        ResultSet rset =
                stmt.executeQuery("select BANNER from SYS.V_$VERSION");
        while (rset.next())
        {
            System.out.println (rset.getString(1));
        }
        stmt.close();

        System.out.println ("Success!");

    }
}
*/