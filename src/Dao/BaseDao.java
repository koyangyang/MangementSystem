package Dao;

import java.sql.*;

public class BaseDao {
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/market";
    private final String USERNAME = "root";
    private final String PASSWORD = "123456";

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    //1. 获取连接
    public Connection getConn() throws ClassNotFoundException, SQLException {
        //加载驱动
        Class.forName(DRIVER);
        //2.获取连接
        conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);

        return conn;
    }

    //2. 查询全部
    public ResultSet executeQuery(Connection conn, String sql, Object...param) throws SQLException{
        ps = conn.prepareStatement(sql);
        rs =  ps.executeQuery();

        return rs;

    }
    //3.根据id查询商品
    public ResultSet executeQuerygood(Connection conn, String sql, Object...param) throws SQLException{
        ps = conn.prepareStatement(sql);

        if(param != null){
            //对占位符进行赋值
            for(int i=0; i<param.length; i++){
                ps.setObject((i+1), param[i]);
            }
        }

        rs =  ps.executeQuery();

        return rs;

    }

    //增删改操作
    public int executeUpdate(Connection conn, String sql, Object...param) throws SQLException{
        ps = conn.prepareStatement(sql);

        if(param != null){
            //对占位符进行赋值
            for(int i=0; i<param.length; i++){
                ps.setObject((i+1), param[i]);
            }
        }

        int num =  ps.executeUpdate();

        closeAll(conn, ps, null);

        return num;

    }

    //4. 关闭资源
    public void closeAll(Connection conn,PreparedStatement ps, ResultSet rs ) throws SQLException {
        if (rs!=null){
            rs.close();
        }

        if(ps != null){
                ps.close();

        }

        if(conn != null){
                conn.close();
        }

    }

}
