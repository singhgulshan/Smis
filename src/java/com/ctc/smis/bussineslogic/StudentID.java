/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ctc.smis.bussineslogic;

import com.ctc.smis.dao.StudentIDGenerationDAO;
import com.ctc.smis.util.DBUtil;
import com.ctc.smis.vo.AdmissionDetailsVO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gulshan
 */
public class StudentID {
    
    public String generateStudentID(String admissionyear,String branch){
        StudentIDGenerationDAO ob = new StudentIDGenerationDAO();
        String studentid;
        String studentnumber = ob.studentNumber(branch);
            studentid = admissionyear+branch+studentnumber;
            return studentid;
        }
    }
    
