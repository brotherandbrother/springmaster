package example.dao;

import example.bean.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao extends Dao {
/**
 *查询数据
 *whereClause where子句，例如userid=?and name=?
 *whereArgs where子句中各个?对应的值，例如new String[]{"1","yhg"}
 *return User的List集合
 */
public List<User> query(String whereClause,String[] whereArgs){
    List<User> users=null;
    User user=null;
    Connection conn=null;
    PreparedStatement pstmt=null;
    ResultSet rs=null;
    String sql=null;
    try {
        sql = getSqlString("user_t", whereClause, whereArgs);
        conn = getConnection();
        pstmt = conn.prepareStatement(sql);
        rs = pstmt.executeQuery();
        users = new ArrayList<User>();
        while (rs.next()) {
            user = new User();
            user.setUserid(rs.getInt("userid"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setAge(rs.getInt("age"));
            users.add(user);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }



    close(rs, pstmt, conn);
    return users;

}
}
