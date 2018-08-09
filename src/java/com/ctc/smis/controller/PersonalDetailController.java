/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ctc.smis.controller;

import com.ctc.smis.dao.PersonalDetailsDAO;
import com.ctc.smis.vo.PersonalDetailsVO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Gulshan
 */
@WebServlet(name = "PersonalDetail", urlPatterns = {"/PersonalDetail"})
public class PersonalDetailController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            PersonalDetailsDAO personaldao = new PersonalDetailsDAO();
            PersonalDetailsVO personalvo = new PersonalDetailsVO();
            HttpSession session = request.getSession();
            String studentid = (String) session.getAttribute("studentid");
       
            personalvo.setStudentname(request.getParameter("fullname"));
            personalvo.setFathername(request.getParameter("fname"));
            personalvo.setMothername(request.getParameter("mname"));
            personalvo.setDob(request.getParameter("dob"));
            personalvo.setPline1(request.getParameter("pl1"));
            personalvo.setPline2(request.getParameter("pl2"));
            personalvo.setPcity(request.getParameter("pcname"));
            personalvo.setPdistrict(request.getParameter("pdname"));
            personalvo.setPstate(request.getParameter("pstate"));
            personalvo.setPpincode(request.getParameter("ppcode"));
            personalvo.setTline1(request.getParameter("tl1"));
            personalvo.setTline2(request.getParameter("tl2"));
            personalvo.setTcity(request.getParameter("tcname"));
            personalvo.setTdistrict(request.getParameter("tdname"));
            personalvo.setTstate(request.getParameter("tstate"));
            personalvo.setTpincode(request.getParameter("tpcode"));
            personalvo.setCnumber(request.getParameter("cnumber"));
            personalvo.setPcnumber(request.getParameter("pcnumber"));
            personalvo.setAcnumber(request.getParameter("acnumber"));
            personalvo.setEmail(request.getParameter("emid"));
            personalvo.setBgroup(request.getParameter("bgroup"));
            personalvo.setGender(request.getParameter("sex"));
            personalvo.setCategory(request.getParameter("category"));
            personalvo.setOther(request.getParameter("oname"));
            personalvo.setNationality(request.getParameter("nationality"));
            personalvo.setDomicile(request.getParameter("domicile"));
            personalvo.setPhoto(request.getParameter("photo"));
            personalvo.setStudentid(studentid);
            boolean status = personaldao.saveDetails(personalvo);            
                     
            if(status){
                response.sendRedirect("QualificationDetails.jsp");
            }else{
                response.sendRedirect("PersonalDetails.jsp");
           
            }
            
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
        
    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
