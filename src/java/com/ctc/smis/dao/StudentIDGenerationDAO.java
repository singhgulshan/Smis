/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ctc.smis.dao;

import com.ctc.smis.util.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gulshan
 */
public class StudentIDGenerationDAO {
    
    public String studentNumber(String branch){
        
        Connection con = null;
        String studentnumber="";
        try{
        DBUtil ob = new DBUtil();
        con = ob.getDBConnection();
        Statement stmt = con.createStatement();
        PreparedStatement ps = con.prepareStatement("select * from studentid where branchid=?");
        ps.setString(1,branch);
        ResultSet rs = ps.executeQuery();
          rs.next();
           studentnumber = rs.getString(2);
           studentnumber = String.valueOf(Integer.parseInt(studentnumber) + 1);
           stmt.executeUpdate("update studentid set idvalue='"+studentnumber+"' where branchid='"+branch+"';");
           studentnumber = rs.getString(2);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
     return studentnumber;   
    }
}
