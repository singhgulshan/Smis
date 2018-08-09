/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ctc.smis.dao;

import com.ctc.smis.util.DBUtil;
import com.ctc.smis.vo.AdmissionDetailsVO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gulshan
 */
public class AdmissionDetailsDAO {
    
    public Boolean saveDetails(AdmissionDetailsVO detail){
        
        
        
       Boolean status = false;
       Connection con = null;
       try{
           DBUtil ob = new DBUtil();
           
          con = ob.getDBConnection();
          Statement stmt = con.createStatement();
          String query = "insert into admissiondetails(studentid,yearofadmission,"
                  + "admissionthrough,branch,academicgap,documentid) values"
                  + "('"+detail.getStudentid()+"','"+detail.getYearofadmission()+"'"
                  + ",'"+detail.getAdmissionthrough()+"','"+detail.getBranch()+"'"
                  + ",'"+detail.getAcademicgap()+"','"+detail.getDocumentid()+"')";
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
