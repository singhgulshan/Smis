/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ctc.smis.dao;

import com.ctc.smis.util.DBUtil;
import com.ctc.smis.vo.QualificationDetailsVO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gulshan
 */
public class GetQualificationDetailsDAO {
    
    public QualificationDetailsVO getQualificationDetails (String studentid){
        
       QualificationDetailsVO detail = new QualificationDetailsVO();
       Connection con = null;
       
       try{
           DBUtil ob = new DBUtil();
            con = ob.getDBConnection();
            Statement stmt = con.createStatement();
            String querry = "select * from qualificationdetails where studentid='"+studentid+"';";
            ResultSet rs = stmt.executeQuery(querry);
            if(rs.next()){
                detail.setTenschool(rs.getString(2));
                detail.setTenboard(rs.getString(3));
                detail.setTenyop(rs.getString(4));
                detail.setTenprgrade(rs.getString(5));
                detail.setTwelveschool(rs.getString(6));
                detail.setTwelveboard(rs.getString(7));
                detail.setTwelveyop(rs.getString(8));
                detail.setTwelvepergrade(rs.getString(9));
            }
            else{
                detail = null;
            }
           
       }
       catch(SQLException e){
           e.printStackTrace();
       }
     return detail;   
    }
    
}
