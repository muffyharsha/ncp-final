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
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;

/**
 *
 * @author harsha
 */
public class personal_details extends HttpServlet {

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
        PrintWriter out = response.getWriter();  
        try{
             String DRIVER="oracle.jdbc.OracleDriver";  
         String CONNECTION_URL="jdbc:oracle:thin:@oraclexe.amritanet.edu:1521:xe"; 
         String USERNAME="u4cse15502";  
         String PASSWORD="oracle502";  
         Class.forName(DRIVER);  
	Connection con=DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);  
        PreparedStatement ps=con.prepareStatement("select * from personal_details where employee_id = ?"); 
        ps.setString(1,id);
        ps.executeUpdate();
        ResultSet rs =  ps.getResultSet();
        rs.next();
        
        String employee_name = rs.getString("employee_id");
        String dob = rs.getString("dob");
        String blood_group = rs.getString("blood_group");
        String address = rs.getString("address");
        String mobile_number = rs.getString("mobile_number");
        String emergency_number = rs.getString("emergency_number");
        String pan_number = rs.getString("pan_number");
        
        JSONObject json = new JSONObject();
        json.put("employee_name", employee_name);
        json.put("dob", dob);
        json.put("blood_group", blood_group);
        json.put("address",address);
        json.put("mobile_number", mobile_number);
        json.put("emergency_number",emergency_number);
        json.put("pan_number", pan_number);
         
        out.write(json.toString());
        
        }catch (Exception e){
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
