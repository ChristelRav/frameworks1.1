package etu2064.framework.servlet;

import java.sql.*;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Vector;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class FontServlet extends HttpServlet {
    //HashMap<String,Mapping> hmp;
//GET    
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
          processRequest(req,res);
    }
//POST    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
           processRequest(request,response);
    }
/// PROCESS REQUEST    
    public void processRequest(HttpServletRequest req,HttpServletResponse res)throws IOException{
        res.setContentType("text/plain");  
        PrintWriter out=res.getWriter();
/// Display URL
            try {
            out.print("URL Tomcat = ");
            String projet = req.getRequestURL().toString();
            String host = req.getHeader("Host");

            String[] partieUrl = projet.split(host);
            String chemin = partieUrl[1].substring(1);
            out.print("/"+chemin);

            } catch (Exception e) {
                out.print(e.getMessage());
            }
    }
}