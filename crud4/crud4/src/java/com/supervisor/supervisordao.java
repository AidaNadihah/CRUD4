/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supervisor;

/**
 *
 * @author USER
 */


import com.las.Employeeprofile;
import com.las.form;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class supervisordao {
     public static Connection getConnection(){  
    Connection con=null;  
    try{  
        Class.forName("com.mysql.jdbc.Driver");  
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/las","root","admin");  
    }catch(Exception e){System.out.println(e);}  
    return con;  
}  
    public static int save(form u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
      "insert into employeeform(name,empId,fromdate,todate,leavetype,des,status) values(?,?,?,?,?,?,?)");  
        
        ps.setString(1,u.getName());  
        ps.setString(2,u.getEmpId());  
        ps.setString(3,u.getFromdate());  
        ps.setString(4,u.getTodate());  
        ps.setString(5,u.getLeavetype()); 
        ps.setString(6,u.getDes());
        ps.setString(7,u.getStatus());
       
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
    
    public static int update(form u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
        "update employeeform set name=?,empId=?,fromdate=?,todate=?,leavetype=?,des=?,status=? where id=?");  
        ps.setString(1,u.getName());  
        ps.setString(2,u.getEmpId());  
        ps.setString(3,u.getFromdate());  
        ps.setString(4,u.getTodate());  
        ps.setString(5,u.getLeavetype());  
        ps.setString(6,u.getDes());
        ps.setString(7,u.getStatus()); 
        ps.setInt(8,u.getId());  
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int delete(form u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("delete from employeeform where id=?");  
        ps.setInt(1,u.getId());  
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
  
    return status;  
}  
public static List<form> getAllRecords(){  
    List<form> list=new ArrayList<form>();  
      
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from employeeform");  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            form u=new form();  
            u.setId(rs.getInt("id"));  
            u.setName(rs.getString("name"));  
            u.setEmpId(rs.getString("empId"));  
            u.setFromdate(rs.getString("fromdate"));  
            u.setTodate(rs.getString("todate"));  
            u.setLeavetype(rs.getString("leavetype"));
            u.setDes(rs.getString("des"));
            u.setStatus(rs.getString("status"));
            list.add(u);  
        }  
    }catch(Exception e){System.out.println(e);}  
    return list;  
}  
public static form getRecordById(int id){  
    form u=null;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from supervisorprofile where id=?");  
        ps.setInt(1,id);  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            u=new form();  
            u.setId(rs.getInt("id"));  
            u.setName(rs.getString("name"));  
            u.setEmpId(rs.getString("empId"));  
            u.setFromdate(rs.getString("fromdate"));  
            u.setTodate(rs.getString("todate"));  
            u.setLeavetype(rs.getString("leavetype"));
            u.setDes(rs.getString("des"));
            u.setStatus(rs.getString("status")); 
        }  
    }catch(Exception e){System.out.println(e);}  
    return u;  
}  

public static List<superprofile> getProfile(){  
    List<superprofile> list=new ArrayList<superprofile>();  
      
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from supervisorprofile");  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            superprofile u=new superprofile();  
           u.setId(rs.getInt("id"));
            u.setSpId(rs.getString("spId"));  
            u.setName(rs.getString("name"));  
            u.setPassword(rs.getString("password"));  
            u.setPhonenum(rs.getString("phonenum"));  
            u.setEmail(rs.getString("email"));  
            u.setStatus(rs.getString("status"));
            list.add(u);  
        }  
    }catch(Exception e){System.out.println(e);}  
    return list;  
}  

public static superprofile getProfileById(int id){  
    superprofile u=null;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from supervisorprofile where id=?");  
        ps.setInt(1,id);  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
           u =new superprofile();  
           u.setId(rs.getInt("id"));
            u.setSpId(rs.getString("spId"));  
            u.setName(rs.getString("name"));  
            u.setPassword(rs.getString("password"));  
            u.setPhonenum(rs.getString("phonenum"));  
            u.setEmail(rs.getString("email"));  
            u.setStatus(rs.getString("status"));
        }  
    }catch(Exception e){System.out.println(e);}  
    return u;  
}  

public static int updateProfile(superprofile u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
        "update supervisorprofile set spId=?, name=?,password=?,phonenum=?,email=?,status=? where id=?");  
        ps.setString(1,u.getSpId()); 
        ps.setString(2,u.getName());   
        ps.setString(3,u.getPassword());  
        ps.setString(4,u.getPhonenum());  
        ps.setString(5,u.getEmail());  
        ps.setString(6,u.getStatus());
        ps.setInt(7,u.getId());  
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
public static int saveSupervisor(superprofile u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"insert into supervisorprofile(spId,name,password,phonenum,email,status) values(?,?,?,?,?,?)");  
        ps.setString(1,u.getSpId());
        ps.setString(2,u.getName());  
        ps.setString(3,u.getPassword());  
        ps.setString(4,u.getPhonenum());  
        ps.setString(5,u.getEmail()); 
        ps.setString(6,u.getStatus());
        
       
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  
}

    

