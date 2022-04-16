/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.las;

/**
 *
 * 
 * @author azri
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class formdao {
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
        PreparedStatement ps=con.prepareStatement("select * from employeeform where id=?");  
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

public static List<Employeeprofile> getProfile(){  
    List<Employeeprofile> list=new ArrayList<Employeeprofile>();  
      
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from employeeprofile");  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            Employeeprofile u=new Employeeprofile();  
           u.setId(rs.getInt("id"));
            u.setEmpId(rs.getString("empId"));  
            u.setName(rs.getString("name"));  
            u.setPassword(rs.getString("password"));  
            u.setPhonenum(rs.getString("phonenum"));  
            u.setEmail(rs.getString("email"));  
            u.setDepartment(rs.getString("department"));
            u.setStatus(rs.getString("status"));
            
            list.add(u);  
        }  
    }catch(Exception e){System.out.println(e);}  
    return list;  
}  

public static Employeeprofile getProfileById(int id){  
    Employeeprofile u=null;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from employeeprofile where id=?");  
        ps.setInt(1,id);  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            u=new Employeeprofile();  
           u.setId(rs.getInt("id"));
            u.setEmpId(rs.getString("empId"));  
            u.setName(rs.getString("name"));  
            u.setPassword(rs.getString("password"));  
            u.setPhonenum(rs.getString("phonenum"));  
            u.setEmail(rs.getString("email"));  
            u.setDepartment(rs.getString("department")); 
            u.setStatus(rs.getString("status"));
        }  
    }catch(Exception e){System.out.println(e);}  
    return u;  
}  

public static int updateProfile(Employeeprofile u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"update employeeprofile set empId=?, name=?,password=?,phonenum=?,email=?,department=?,status=? where id=?");  
        ps.setString(1,u.getEmpId()); 
        ps.setString(2,u.getName());   
        ps.setString(3,u.getPassword());  
        ps.setString(4,u.getPhonenum());  
        ps.setString(5,u.getEmail());  
        ps.setString(6,u.getDepartment()); 
        ps.setString(7,u.getStatus()); 
        ps.setInt(8,u.getId());  
        
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  

public static int saveEmployee(Employeeprofile u){  
    int status=0;  
    try{  
        Connection con=getConnection();  
        PreparedStatement ps=con.prepareStatement(  
"insert into employeeprofile(empId,name,password,phonenum,email,department,status) values(?,?,?,?,?,?,?)");  
        ps.setString(1,u.getEmpId());
        ps.setString(2,u.getName());  
        ps.setString(3,u.getPassword());  
        ps.setString(4,u.getPhonenum());  
        ps.setString(5,u.getEmail()); 
        ps.setString(6,u.getDepartment());
        ps.setString(7,u.getStatus());
        
       
        status=ps.executeUpdate();  
    }catch(Exception e){System.out.println(e);}  
    return status;  
}  

}
