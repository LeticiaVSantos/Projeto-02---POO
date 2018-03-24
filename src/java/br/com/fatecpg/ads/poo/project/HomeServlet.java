package br.com.fatecpg.ads.poo.project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Leticia
 */
@WebServlet(urlPatterns = {"/home.php"})
public class HomeServlet extends HttpServlet {

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
            out.println("<link rel=\"shortcut icon\" href=\"Imagens/favicon (1).ico\" />");
            out.println("<title> JurosWeb </title>");    
            out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">");
            out.println("</head>");
            out.println("<body>");  
            
            out.println("<nav class=\"navbar sticky-top navbar-dark bg-dark\">\n" +
            "<a class=\"navbar-brand\" href=\"home.php\">\n" +         
            "<img src=\"Imagens/cifrao.png\" width=\"30\" height=\"30\" class=\"d-inline-block align-top\" alt=\"\">\n" +
            "JurosWeb\n" + 
             
                    
            "</a>\n" +
                    
     
                    
            "<span class='navbar-text'>"+
            "JurosWeb, a solução."+
            "</span>"+
            "</nav>");
            
            out.println("<br>");
            out.println("<div class=\"jumbotron jumbotron-fluid\">\n" +
            "<div class=\"container\">\n" +
            "<h1 class=\"display-4\">JurosWeb</h1>\n" +
            "    <p class=\"lead\">This is a modified jumbotron that occupies the entire horizontal space of its parent.</p>\n" +
            "  </div>\n" +
            "</div>");
           
            out.println("");
            out.println("<br>");
            out.println("<div class=\"alert alert-success\" role=\"alert\">\n" +
            "  <center> Conheça nossos desenvolvedores!</center>\n" +
            "</div>");
            
            out.println("<div class=\"card-deck\">\n" +
            "  <div class=\"card\">\n" +
            "    <img class=\"card-img-top\" src=\"Imagens/OpenCamera_1.png\" alt=\"Allan Patrick\" width=\"170px\" height=\"380px\">\n" +
            "    <div class=\"card-body\">\n" +
            "      <center><h5 class=\"card-title\">Allan Patrick</h5></center>\n" +
            "      <center><p class=\"card-text\"> Estutande de Análise e Desenvolvimento de Sistemas.</p></center>\n" +
            "      <center><p class=\"card-text\"> Conheça também seus projetos no GitHub.</p></center><br>\n" +        
            "      <center><a href=\"https://github.com/allanpatrick1\" <button class=\"btn btn-primary\" type=\"submit\">GitHub</button></a></center>"+       
            "    </div>\n" +
            "  </div>\n" +
                    
            "  <div class=\"card\">\n" +
            "    <img class=\"card-img-top\" src=\"Imagens/OpenCamera_1.png\" alt=\"Andrey Antunes\" width=\"170px\" height=\"380px\">\n" +
            "    <div class=\"card-body\">\n" +
            "      <center><h5 class=\"card-title\">Andrey Antunes</h5></center>\n" +
            "      <center><p class=\"card-text\">Estutande de Análise e Desenvolvimento de Sistemas.</p></center>\n" +
            "      <center><p class=\"card-text\"> Conheça também seus projetos no GitHub.</p></center><br>\n" +        
            "       <center><a href=\"https://github.com/AndreyAntunes\" <button class=\"btn btn-primary\" type=\"submit\">GitHub</button></a></center>"+
            "    </div>\n" +
            "  </div>\n" +
                    
            "  <div class=\"card\">\n" +
            "    <img class=\"card-img-top\" src=\"Imagens/OpenCamera_1.png\" alt=\"Leticia Santos\" width=\"170px\" height=\"380px\">\n" +
            "    <div class=\"card-body\">\n" +
            "      <center><h5 class=\"card-title\">Leticia Santos</h5></center>\n" +
            "      <center><p class=\"card-text\">Estutande de Análise e Desenvolvimento de Sistemas.</p></center>\n" +
            "      <center><p class=\"card-text\"> Conheça também seus projetos no GitHub.</p></center><br>\n" +
            "       <center><a href=\"https://github.com/LeticiaVSantos\" <button class=\"btn btn-primary\" type=\"submit\">GitHub</button></a></center>"+        
            "    </div>\n" +
            "  </div>\n" +
            "</div>");
       
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
