/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 800977
 */
public class ArithmeticCalculatorServlet extends HttpServlet {
    
    String firstNum;
    String secondNum;

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
        request.setAttribute("message", "---");
        firstNum = request.getParameter("firstNum");
        secondNum = request.getParameter("secondNum");
        System.out.println(firstNum);
        System.out.println(secondNum);
        int result = 0;
        int firstInt = 0;
        int secondInt = 0;
        if (firstNum != null && secondNum != null) {
            if (firstNum.equals("") || secondNum.equals("")) {
                request.setAttribute("message", "invalid");
            }
            else{
                try{
                    firstInt = Integer.parseInt(firstNum);
                    secondInt = Integer.parseInt(secondNum);
                }
                catch(Exception e) {
                    request.setAttribute("message", "invalid");
                }
                if (request.getParameter("add") != null) {
                    result = firstInt + secondInt;
                    request.setAttribute("message", result);
                }
                else if (request.getParameter("sub") != null) {
                    result = firstInt - secondInt;
                    request.setAttribute("message", result);
                }
                else if (request.getParameter("mul") != null) {
                    result = firstInt * secondInt;
                    request.setAttribute("message", result);
                }
                else if (request.getParameter("div") != null) {
                    result = firstInt / secondInt;
                    request.setAttribute("message", result);
                }
            }
        }
        request.setAttribute("firstNum", firstNum);
        request.setAttribute("secondNum", secondNum);
        getServletContext().getRequestDispatcher("/arithmeticcalculator.jsp").forward(request, response);
        
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
