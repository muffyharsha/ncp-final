/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
/**
 *
 * @author harsha
 */
public class login extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        
        
        String a = request.getParameter("id");
        String b = request.getParameter("password");
        PrintWriter out = response.getWriter();  
        
        try{
         String DRIVER="oracle.jdbc.OracleDriver";  
         String CONNECTION_URL="jdbc:oracle:thin:@oraclexe.amritanet.edu:1521:xe"; 
         String USERNAME="u4cse15502";  
         String PASSWORD="oracle502";  
         Class.forName(DRIVER);  
	Connection con=DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);  
        PreparedStatement ps=con.prepareStatement("select passwd from users where emp_id = ?"); 
        ps.setString(1,a);
        ps.executeUpdate();
        ResultSet rs =  ps.getResultSet();
        rs.next();
        String password = rs.getString("passwd");
        
        if (password.equals(b)){
        out.write("success");
        }else{
        out.write("incorrect credentials");
        }
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
