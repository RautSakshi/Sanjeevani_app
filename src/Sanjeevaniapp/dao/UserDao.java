/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sanjeevaniapp.dao;

import Sanjeevaniapp.dbutil.DBConnection;
import Sanjeevaniapp.pojo.User;
import Sanjeevaniapp.pojo.UserPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author saksh
 */
public class UserDao {
         public static String validateUser(User user) throws SQLException{
         Connection conn=DBConnection.getConnection();
         PreparedStatement ps=conn.prepareStatement("Select user_name from users where login_id=? and password=? and user_type=?");
         ps.setString(1, user.getLoginId());
         ps.setString(2,user.getPassword());
         ps.setString(3, user.getUserType());
         ResultSet rs=ps.executeQuery();
         String name=null;
         if(rs.next()){
             name=rs.getString("user_name");
         }
         return name;
   }
         
           public static void updateName(String currName,String newName)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Update users set user_name=? where user_name=?");
     ps.setString(1, newName);
     ps.setString(2, currName);
     ps.executeUpdate();

}

  public static boolean addUser(UserPojo user)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("Insert into users values(?,?,?,?)");
     ps.setString(1,user.getLoginId());
     ps.setString(2,user.getUserName());
     ps.setString(3,user.getPassword());
     ps.setString(4, user.getUserType().toUpperCase());
     return ps.executeUpdate()==1;

}
 public static void deleteUserByName(String name)throws SQLException{
     Connection conn=DBConnection.getConnection();
     PreparedStatement ps=conn.prepareStatement("delete from users where user_name=?");
     ps.setString(1, name);
     ps.executeUpdate();
}
   public static boolean updateUser(UserPojo user, String oldName) throws SQLException {
        Connection conn = DBConnection.getConnection();
        System.out.println(oldName);
        PreparedStatement ps = conn.prepareStatement("Update users set user_name=?,login_id=?,password=?,user_type=? where user_name=?");
        ps.setString(1, user.getUserName());
        ps.setString(2, user.getLoginId());
        ps.setString(3, user.getPassword());
        ps.setString(4, user.getUserType());
        ps.setString(5, oldName);
        return ps.executeUpdate() == 1;
    }
    public static UserPojo getReceptionistsDetailsFromUsers(String userName) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Select login_id,password from users where user_name=?");
        ps.setString(1, userName);
        ResultSet rs = ps.executeQuery();
        UserPojo user = new UserPojo();
        if (rs.next()) {
//            System.out.println(rs.getString("login_id"));
//            System.out.println(rs.getString("password"));
            user.setLoginId(rs.getString("login_id"));
            user.setPassword(rs.getString("password"));
        }

        return user;
    }
}



    

