/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ctc.smis.dao;

import com.ctc.smis.util.DBUtil;
import com.ctc.smis.vo.PersonalDetailsVO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gulshan
 */
public class PersonalDetailsDAO {
    
    public Boolean saveDetails(PersonalDetailsVO detail){
        
        
        
       Boolean status = false;
       Connection con = null;
       try{
           
           DBUtil ob = new DBUtil();
          con = ob.getDBConnection();
          Statement stmt = con.createStatement();
          String query = "insert into personaldetails(studentid,studentname,fathername,mothername"
                  + ",dob,pline1,pline2,pcity,pdistrict,pstate,ppincode,tline1,"
                  + "tline2,tcity,tdistrict,tstate,tpincode,cnumber,pcnumber,"
                  + "acnumber,emailid,bgroup,gender,category,other,nationality,"
                  + "domicile,photo) values('"+detail.getStudentid()+"','"+detail.getStudentname()+"',"
                  + "'"+detail.getFathername()+"','"+detail.getMothername()+"',"
                  + "'"+detail.getDob()+"','"+detail.getPline1()+"',"
                  + "'"+detail.getPline2()+"','"+detail.getPcity()+"',"
                  + "'"+detail.getPdistrict()+"','"+detail.getPstate()+"',"
                  + "'"+detail.getPpincode()+"','"+detail.getTline1()+"',"
                  + "'"+detail.getTline2()+"','"+detail.getTcity()+"',"
                  + "'"+detail.getTdistrict()+"','"+detail.getTstate()+"',"
                  + "'"+detail.getTpincode()+"','"+detail.getCnumber()+"',"
                  + "'"+detail.getPcnumber()+"','"+detail.getAcnumber()+"',"
                  + "'"+detail.getEmail()+"','"+detail.getBgroup()+"',"
                  + "'"+detail.getGender()+"','"+detail.getCategory()+"',"
                  + "'"+detail.getOther()+"','"+detail.getNationality()+"',"
                  + "'"+detail.getDomicile()+"','"+detail.getPhoto()+"')";
          stmt.executeUpdate(query);
          status = true;  
       }
       catch(Exception e){
           
       e.printStackTrace();
       
       }
       finally{
        try{
            con.close();
        }
        catch(SQLException s){
            
        }
        
    }
       return status;
        
    }
    
}
