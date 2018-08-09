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
public class UpdateQualificationDetailsDAO {
    
    public Boolean saveDetails(QualificationDetailsVO detail){
  
       Boolean status = false;
       Connection con = null;
       try{
           
           DBUtil ob = new DBUtil();
           con = ob.getDBConnection();
           Statement stmt = con.createStatement();
           String query = "update qualificationdetails set tenschool='"
                   + ""+detail.getTenschool()+"',tenboard='"+detail.getTenboard()+"'"
                   + ",tenyop='"+detail.getTenyop()+"',tenpg='"+detail.getTenprgrade()+"'"
                   + ",twelveschool='"+detail.getTwelveschool()+"',"
                   + "twelveboard='"+detail.getTwelveboard()+"',twelveyop='"
                   + ""+detail.getTwelveyop()+"',twelvepg='"+detail.getTwelvepergrade()+"'"
                   + " where studentid='"+detail.getStudentid()+"';";
           stmt.executeUpdate(query);
           status = true;
           con.close();
       }
       catch(SQLException e){
           
       e.printStackTrace();
       
       }
        return status;
    }
}
