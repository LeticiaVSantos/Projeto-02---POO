/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.ads.poo.project;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(name = "juros-composto.php", urlPatterns = {"/juros-composto.php"})
public class jurosComposto extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            /*Tag meta Responsiva*/
            out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
            /*Google fonts - footer*/
            out.println("<link href=\"https://fonts.googleapis.com/css?family=PT+Sans\" rel=\"stylesheet\">");
             /*Favicon*/
            out.println("<link rel=\"shortcut icon\" href=\"Imagens/favicon (1).ico\" />");
            out.println("<title> JurosWeb </title>");
             /*css - Bootstrap*/
            out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">");
            out.println("<title>Servlet jurosComposto</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet jurosComposto at " + request.getContextPath() + "</h1>");
            
            /*css - Footer*/
            out.println("<style>\n" +
            ".footer {\n" +
            "    position: fixed;\n" +
            "    left: 0;\n" +
            "    bottom: 0;\n" +
            "    width: 100%;\n" +
            "    height:25%;\n " +        
            "    background-color:#82868E;\n" +
            "    font-family: 'PT Sans', sans-serif;"+        
            "    color: black;\n" +
            "    text-align: center;\n" +
            "}\n" +
            "</style>\n" +
            "\n" +
                   
                    
            "<div class=\"footer\">\n" +
                    "<br>" +
                    "<h5>Footer Content</h5>" +
                "<p>Here you can use rows and columns here to organize your footer content.</p>" +
                "  <p>© 2018 Copyright:</p>\n" +
                "<link href=\"https://github.com/LeticiaVSantos/Projeto-02---POO/\" rel=\"stylesheet\"> GitHub.com"+    
            "</div>");
            /*fim css - Footer*/
            
            /*Java Script - Bootstrap*/
            out.println("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
            out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
            out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>");
            
            out.println("</body>");
            out.println("</html>");
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
