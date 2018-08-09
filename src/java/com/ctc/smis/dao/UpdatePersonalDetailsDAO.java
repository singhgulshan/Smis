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
public class UpdatePersonalDetailsDAO {
    
    public Boolean saveDetails(PersonalDetailsVO detail){
  
       Boolean status = false;
       Connection con = null;
       try{
           
           DBUtil ob = new DBUtil();
           con = ob.getDBConnection();
           Statement stmt = con.createStatement();
          String query = "update personaldetails set "
                  + "studentname='"+detail.getStudentname()+"',fathername="
                  + "'"+detail.getFathername()+"',mothername="
                  + "'"+detail.getMothername()+"',dob='"+detail.getDob()+"',"
                  + "pline1='"+detail.getPline1()+"',pline2='"+detail.getPline2()+"'"
                  + ",pcity='"+detail.getPcity()+"',pdistrict='"+detail.getPdistrict()+"'"
                  + ",pstate='"+detail.getPstate()+"',ppincode='"+detail.getPpincode()+"'"
                  + ",tline1='"+detail.getTline1()+"',tline2='"+detail.getTline2()+"',"
                  + "tcity='"+detail.getTcity()+"',tdistrict='"+detail.getTdistrict()+"'"
                  + ",tstate='"+detail.getTstate()+"',tpincode='"+detail.getTpincode()+"'"
                  + ",cnumber='"+detail.getCnumber()+"',pcnumber='"+detail.getPcnumber()+"'"
                  + ",acnumber='"+detail.getAcnumber()+"',emailid='"+detail.getEmail()+"'"
                  + ",bgroup='"+detail.getBgroup()+"',gender='"+detail.getGender()+"'"
                  + ",category='"+detail.getCategory()+"',other='"+detail.getOther()+"'"
                  + ",nationality='"+detail.getNationality()+"',domicile='"+detail.getDomicile()+"'"
                  + ",photo='"+detail.getPhoto()+"' where studentid='"+detail.getStudentid()+"';";
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
