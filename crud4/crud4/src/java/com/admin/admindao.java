/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class admindao {
    
    public static Connection getConnection(){  
    Connection con=null;  
    try{  
        Class.forName("com.mysql.jdbc.Driver");  
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/las","root","admin");  
    }catch(Exception e){System.out.println(e);}  
    return con;  
}  
    
    
   public static List<admin> getProfile(){  
    List<admin> list=new ArrayList<admin>();  
      
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from admin");  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            admin u=new admin();  
           u.setId(rs.getInt("id"));
            u.setAdId(rs.getString("adId"));  
            u.setName(rs.getString("name"));  
            u.setPassword(rs.getString("password"));  
            u.setPhonenum(rs.getString("phonenum"));  
            u.setEmail(rs.getString("email"));  
            
            
            list.add(u);  
        }  
    }catch(Exception e){System.out.println(e);}  
    return list;  
}  

public static admin getProfileById(int id){  
    admin u=null;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from admin where id=?");  
        ps.setInt(1,id);  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            u=new admin();  
            u.setId(rs.getInt("id"));
            u.setAdId(rs.getString("adId"));   
            u.setName(rs.getString("name"));  
            u.setPassword(rs.getString("password"));  
            u.setPhonenum(rs.getString("phonenum"));  
            u.setEmail(rs.getString("email"));  
            
        }  
    }catch(Exception e){System.out.println(e);}  
    return u;  
}  

public static int updateProfile(admin u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"update admin set adId=?, name=?,password=?,phonenum=?,email=? where id=?");  
        ps.setString(1,u.getAdId()); 
        ps.setString(2,u.getName());   
        ps.setString(3,u.getPassword());  
        ps.setString(4,u.getPhonenum());  
        ps.setString(5,u.getEmail());  
 
        ps.setInt(6,u.getId());  
        
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
}

