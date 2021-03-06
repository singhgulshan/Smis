/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ctc.smis.controller;

import com.ctc.smis.dao.UpdateQualificationDetailsDAO;
import com.ctc.smis.vo.QualificationDetailsVO;
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
@WebServlet(name = "UpdateQualificationDetailController", urlPatterns = {"/UpdateQualificationDetailController"})
public class UpdateQualificationDetailController extends HttpServlet {

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
            
            QualificationDetailsVO qualificationvo = new QualificationDetailsVO();
            UpdateQualificationDetailsDAO qualificationdao = new UpdateQualificationDetailsDAO();
            HttpSession session = request.getSession();
            String studentid = (String) session.getAttribute("studentid");
            
            qualificationvo.setTenschool(request.getParameter("tscname"));
            qualificationvo.setTenboard(request.getParameter("tbrname"));
            qualificationvo.setTenyop(request.getParameter("tyop"));
            qualificationvo.setTenprgrade(request.getParameter("tpgname"));
            qualificationvo.setTwelveschool(request.getParameter("twscname"));
            qualificationvo.setTwelveboard(request.getParameter("twbrname"));
            qualificationvo.setTwelveyop(request.getParameter("twyop"));
            qualificationvo.setTwelvepergrade(request.getParameter("twpgname"));
            qualificationvo.setStudentid(studentid);
            boolean status = qualificationdao.saveDetails(qualificationvo);
            if(status){
                //response.sendRedirect("AdmissionDetails.jsp");
            }
            else{
                response.sendRedirect("UpdateQualificationDetails.jsp");
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
