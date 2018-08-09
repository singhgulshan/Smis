/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ctc.smis.dao;

import com.ctc.smis.util.DBUtil;
import com.ctc.smis.vo.PersonalDetailsVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gulshan
 */
public class GetPersonalDetailsDAO {
    
      public PersonalDetailsVO getPersonalDetails (String studentid){
          
        PersonalDetailsVO detail = new PersonalDetailsVO();
          
        Connection con = null;
        
        try{
            DBUtil ob = new DBUtil();
            con = ob.getDBConnection();
            Statement stmt = con.createStatement();
            String querry = "select * from personaldetails where studentid='"+studentid+"';";
            ResultSet rs = stmt.executeQuery(querry);
            if(rs.next()){
            detail.setStudentname(rs.getString(2));
            detail.setFathername(rs.getString(3));
            detail.setMothername(rs.getString(4));
            detail.setDob(rs.getString(5));
            detail.setPline1(rs.getString(6));
            detail.setPline2(rs.getString(7));
            detail.setPcity(rs.getString(8));
            detail.setPdistrict(rs.getString(9));
            detail.setPstate(rs.getString(10));
            detail.setPpincode(rs.getString(11));
            detail.setTline1(rs.getString(12));
            detail.setTline2(rs.getString(13));
            detail.setTcity(rs.getString(14));
            detail.setTdistrict(rs.getString(15));
            detail.setTstate(rs.getString(16));
            detail.setTpincode(rs.getString(17));
            detail.setCnumber(rs.getString(18));
            detail.setPcnumber(rs.getString(19));
            detail.setAcnumber(rs.getString(20));
            detail.setEmail(rs.getString(21));
            detail.setBgroup(rs.getString(22));
            detail.setGender(rs.getString(23));
            detail.setCategory(rs.getString(24));
            detail.setOther(rs.getString(25));
            detail.setNationality(rs.getString(26));
            detail.setDomicile(rs.getString(27));
            detail.setPhoto(rs.getString(28));
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
