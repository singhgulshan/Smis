/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ctc.smis.dao;

import com.ctc.smis.util.DBUtil;
import com.ctc.smis.vo.QualificationDetailsVO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gulshan
 */
public class QualificationDetailsDAO {
    
    public Boolean saveDetails(QualificationDetailsVO detail){
        
        
        
       Boolean status = false;
       Connection con = null;
       try{
           DBUtil ob = new DBUtil();
           
          con = ob.getDBConnection();
          Statement stmt = con.createStatement();
          String query = "insert into qualificationdetails(studentid,tenschool,tenboard,"
                  + "tenyop,tenpg,twelveschool,twelveboard,twelveyop,twelvepg)"
                  + "values('"+detail.getStudentid()+"','"+detail.getTenschool()+"',"
                  + "'"+detail.getTenboard()+"','"+detail.getTenyop()+"',"
                  + "'"+detail.getTenprgrade()+"','"+detail.getTwelveschool()+"',"
                  + "'"+detail.getTwelveboard()+"','"+detail.getTwelveyop()+"',"
                  + "'"+detail.getTwelvepergrade()+"')";
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
    
