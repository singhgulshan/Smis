/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ctc.smis.controller;

import com.ctc.smis.bussineslogic.StudentID;
import com.ctc.smis.dao.AdmissionDetailsDAO;
import com.ctc.smis.vo.AdmissionDetailsVO;
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
@WebServlet(name = "AdmissionDetailController", urlPatterns = {"/AdmissionDetailController"})
public class AdmissionDetailController extends HttpServlet {

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
        
        //BusinessLogic bl = new BL();
       // String id = bl.getStudentId(int admissionYear, String branchName);
        
        
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            AdmissionDetailsVO admissiondetailsvo = new AdmissionDetailsVO();
            AdmissionDetailsDAO admissiondetailsdao = new AdmissionDetailsDAO();
            StudentID studentid = new StudentID();
            String id;
            String documentid = "";
            
            admissiondetailsvo.setYearofadmission(request.getParameter("admissionyear"));
            admissiondetailsvo.setAdmissionthrough(request.getParameter("admissionthrough"));
            admissiondetailsvo.setBranch(request.getParameter("branch"));
            id = studentid.generateStudentID(admissiondetailsvo.getYearofadmission(),admissiondetailsvo.getBranch());
            admissiondetailsvo.setStudentid(id);
            admissiondetailsvo.setAcademicgap(request.getParameter("gap"));
            admissiondetailsvo.setMigration(request.getParameter("migration"));
            admissiondetailsvo.setResult10(request.getParameter("10result"));
            admissiondetailsvo.setResult12(request.getParameter("12result"));
            admissiondetailsvo.setDomicile(request.getParameter("domicile"));
            admissiondetailsvo.setCaste(request.getParameter("caste"));
            admissiondetailsvo.setPetscore(request.getParameter("petscore"));
            if(admissiondetailsvo.getMigration() != null){
                documentid = admissiondetailsvo.getMigration()+",";    
            }
            if(admissiondetailsvo.getResult10() != null){
                documentid = documentid+admissiondetailsvo.getResult10()+",";
            }
            if(admissiondetailsvo.getResult12() != null){
                documentid = documentid+admissiondetailsvo.getResult12()+",";
            }
            if(admissiondetailsvo.getDomicile() != null){
                documentid = documentid+admissiondetailsvo.getDomicile()+",";
            }
            if(admissiondetailsvo.getCaste() != null){
                documentid = documentid+admissiondetailsvo.getCaste()+",";             
            }
            if(admissiondetailsvo.getPetscore() != null){
                documentid = documentid+admissiondetailsvo.getPetscore()+",";
            }
            admissiondetailsvo.setDocumentid(documentid);
            
            boolean status = admissiondetailsdao.saveDetails(admissiondetailsvo);
            HttpSession session = request.getSession();
            session.setAttribute("studentid", admissiondetailsvo.getStudentid());
            
            if(status){
                response.sendRedirect("PersonalDetails.jsp");
            }
            else{
                response.sendRedirect("AdmissionDetails.jsp");
                
            }
            
           
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
