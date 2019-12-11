
package app;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;

/**
 *
 * @author choco calon presiden RI #aamiin 
 * 
 */
public class koneksi {
    //method utk koneksi ke database
    public static  Connection MySQL(){
        try {
            MysqlDataSource ds = new MysqlDataSource();
            ds.setUser("kelasc");
            ds.setPassword("kelasc123");
            ds.setServerName("localhost");
            ds.setDatabaseName("pergudangan");
            ds.setServerTimezone("Asia/Jakarta");
            ds.setPortNumber(3306);
            Connection c = ds.getConnection();
            return c;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
    //TIDAK DIBUTUHKN KARENA UNTK MNGETES DOANG
//    public static void main(String[] args) {
//        try {
//            Connection cn = MySQL(); //karena masih satu kelas
//            System.out.println(cn.getCatalog());
//        } catch (Exception e) {
//        }
//    }
    
}
