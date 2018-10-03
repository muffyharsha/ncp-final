/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author harsha
 */
public class edit_bank extends HttpServlet {

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
       
        
         String id = request.getParameter("id");
         String bank_name = request.getParameter("bank_name");
         String branch_name = request.getParameter("branch_name");
         String sort_code = request.getParameter("sort_code");
         String account_number = request.getParameter("account_number");
         PrintWriter out = response.getWriter();  
         
         try{
         String DRIVER="oracle.jdbc.OracleDriver";  
         String CONNECTION_URL="jdbc:oracle:thin:@oraclexe.amritanet.edu:1521:xe"; 
         String USERNAME="u4cse15502";  
         String PASSWORD="oracle502";  
         Class.forName(DRIVER);  
	 Connection con=DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);  
         PreparedStatement ps = con.prepareStatement("UPDATE BANK_DETAILS SET BANK = ? , BRANCH = ? , ACCOUNT_NUMBER = ?, SORT_CODE = ? WHERE EMPLOYEE_ID = ?"); 
         ps.setString(1,bank_name);
         ps.setString(2,branch_name);
         ps.setString(3,account_number);    
         ps.setString(4,sort_code);   
         ps.setString(5,id); 
         ps.executeUpdate();
         
         out.write("success");
         
         }catch(Exception e){
            out.write(e.toString());
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
