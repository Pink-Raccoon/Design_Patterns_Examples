package Java.Singleton;

import java.sql.*;

/**
 * Assumption: you have created a table userdata that has three fields uid,
 * uname and upassword in mysql database.
 * Database name is ashwinirajput, username is root, password is ashwini.
 */
public class JDBCSingleton {
    private static JDBCSingleton jdbcSingleton;

    private JDBCSingleton(){}

    public static JDBCSingleton getInstance(){
        if(jdbcSingleton == null){
            jdbcSingleton = new JDBCSingleton();
        }return jdbcSingleton;
    }

    private static Connection getConnection()throws ClassNotFoundException, SQLException{
        Connection conn = null;
        Class.forName("org.sqlite.JDBC");

        conn= DriverManager.getConnection("jdbc:sqlite:ashwanirajput",
                "root", "ashwani");
        return conn;
    }
    public int insert(String name, String pass) throws SQLException {
        Connection c = null;

        PreparedStatement ps = null;

        int recordCounter = 0;

        try {
            c = this.getConnection();
            ps = c.prepareStatement("insert into userdata(uname,upassword)values(?,?)");
            ps.setString(1, name);
            ps.setString(2, pass);
            recordCounter = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (c != null) {
                c.close();
            }

        }
        return recordCounter;
    }

    public void view (String name) throws SQLException{
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            conn=this.getConnection();
            ps=conn.prepareStatement("select * from userdata where uname=?");
            ps.setString(1, name);
            rs=ps.executeQuery();

            while(rs.next()){
                System.out.println("Name= "+rs.getString(2)+"\t"+"Password= "
                        +rs.getString(3));

            }


        }catch (Exception e) {
            System.out.println(e);
        }finally{
            if(rs!=null){
                rs.close();
            }if (ps!=null){
                ps.close();
            }if(conn!=null){
                conn.close();
            }
        }
    }

    public int delete(int userid) throws SQLException{
        Connection c=null;
        PreparedStatement ps=null;
        int recordCounter=0;
        try {
            c=this.getConnection();
            ps=c.prepareStatement(" delete from userdata where uid='"+userid+"' ");
            recordCounter=ps.executeUpdate();
        } catch (Exception e) { e.printStackTrace(); }
        finally{
            if (ps!=null){
                ps.close();
            }if(c!=null){
                c.close();
            }
        }
        return recordCounter;
    }

    public int update(String name, String password) throws SQLException  {
        Connection c=null;
        PreparedStatement ps=null;

        int recordCounter=0;
        try {
            c=this.getConnection();
            ps=c.prepareStatement(" update userdata set upassword=? where uname='"+name+"' ");
            ps.setString(1, password);
            recordCounter=ps.executeUpdate();
        } catch (Exception e) {  e.printStackTrace(); } finally{

            if (ps!=null){
                ps.close();
            }if(c!=null){
                c.close();
            }
        }
        return recordCounter;
    }
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        JDBCSingleton jdbcSingleton = new JDBCSingleton();
        jdbcSingleton.getConnection();
    }


}


