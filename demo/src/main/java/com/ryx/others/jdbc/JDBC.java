package com.ryx.others.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author ryx
 * @ProjectName demo
 * @Description:
 * @date 2018/8/18 001817:06
 */
public class JDBC {

    public static Connection getConnection  () throws SQLException {
        Connection conn =null;
        try {
            //获取连接驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取连接
            conn = DriverManager.getConnection("111","111","11");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return  null;
    }

}
