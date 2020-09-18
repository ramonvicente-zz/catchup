
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello Sqlite!
 * 
 * Apenas para verificar conexão com sqlite.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	// Substituir - C:\\IFPE\\Disciplinas\\Projeto DSC\\eclipse-jee-2019-09-R-win32-x86_64\\eclipse\\
    	// pelo caminho do seu projeto onde o banco ficará armazenado.
    	String url = "jdbc:sqlite:../../teste.db";

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}