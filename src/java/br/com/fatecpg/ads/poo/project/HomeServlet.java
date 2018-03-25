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
            out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
            out.println("<link href='https://fonts.googleapis.com/css?family=Raleway' rel='stylesheet'>");
            out.println("<link rel=\"shortcut icon\" href=\"Imagens/favicon (1).ico\" />");
            out.println("<title> JurosWeb </title>");    
            out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">");
            out.println("</head>");
            out.println("<body style=\"background-color: black;\">");  
            
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
            
            out.println("<div class=\"jumbotron jumbotron-fluid\" style=\"background-color: lightseagreen;\">\n" +
            "<div class=\"container\">\n" +
            "<h1 class=\"display-4\">JurosWeb</h1>\n" +
            "<p class=\"lead\">Uma maneira simples e eficiente para o cálculo de juros simples e composto.</p>\n" +
            "</div>\n" +
            "</div>");
            
 
            out.println("<div class='row' style=\"width: 80%;position: relative;left: 7%;\">" + 
            "<div class='col-sm-6'>" +
            "<div class=\"card border-primary mb-3\" style=\"max-width: 30rem;\"\n >" +
            "<div class='card-body' style=\"background-color: lightsteelblue;border-color: black;\">" +
            "<center><h5 class='card-title'>Juros Simples</h5></center>" +
            "<hr>"+            
            "<center><p class='card-text'>É muito utilizado do dia a dia quando emprestamos dinheiro a outra pessoa, por exemplo." +
            " Uma espécie de \"te empresto, mas quero que me pague a mais por isso\".</p></center>" + 
            "<br>" +       
            "<center><a href='juros-simples.php' class='btn btn-primary'>Calcular</a></center>" +
            "</div>" +
            "</div>" +
            "</div>" +
                    
            "<div class='col-sm-6' style=\"position: relative;left: 13%;\">" +
            "<div class=\"card border-secondary mb-3\" style=\"max-width: 30rem;\" \n >" +
            "<div class='card-body' style=\"background-color: lightsteelblue;border-color: black;\">" +
            "<center><h5 class='card-title'>Juros Composto</h5></center>" +
            "<hr>"+            
            "<center><p class='card-text'>São utilizados pelo sistema financeiro, pois oferece uma rentabilidade melhor." +
            " A taxa de juros é sempre aplicada ao somatório do capital no final do mês. </p></center>"+ 
            "<br>" +        
            " <center><a href='juros-composto.php' class='btn btn-primary'>Calcular</a></center>" +
            " </div>" +
            "</div>" +
            "</div>" +
            "</div>");
            
            
            out.println("<br>");
            
            out.println("<div class=\"alert alert-success\" role=\"alert\" style=\"background-color: lightblue;border-color: black;\">\n" +
            "  <center> Conheça nossos desenvolvedores!</center>\n" +
            "</div>");
            out.println("<br>");  
                 
            
            out.println("<div class=\"card-deck\" style=\"width: 100%;position: relative;left: 1%;\">\n" +
            "  <div class=\"card border-primary mb-3\" style=\"background-color: #ced5e5;\">\n" +
            "<br>" + 
            "    <center><img class=\"rounded-circle\" class=\"card-img-top\" src=\"Imagens/Allan.jpg\" alt=\"Allan Patrick\" style=\"width:50%;position: relative;bottom: -5%;\"></center>\n" +
            "    <div class=\"card-body\" style=\"background-color: #ced5e5;\">\n" +
            "      <center><h5 class=\"card-title\">Allan Patrick</h5></center>\n" +
            "      <center><p class=\"card-text\"> Estutande de Análise e Desenvolvimento de Sistemas Fatec - Praia Grande.</p></center>\n" +
            "      <center><p class=\"card-text\"> Conheça também seus projetos no GitHub.</p></center><br>\n" +        
            "      <center><a href=\"https://github.com/allanpatrick1\" <button class=\"btn btn-primary\">GitHub</button></a></center>"+       
            "    </div>\n" +
            "  </div>\n" +
                    
            "  <div class=\"card border-primary mb-3\" style=\"background-color: #ced5e5;\">\n" +
            "<br>" +         
            "    <center><img class=\"rounded-circle\" class=\"card-img-top\" src=\"Imagens/Andrey.jpg\" alt=\"Andrey Antunes\"  style=\"width:50%;position: relative;bottom: -5%;\"></center>\n" +
            "    <div class=\"card-body\" style=\"background-color: #ced5e5;\">\n" +
            "      <center><h5 class=\"card-title\">Andrey Antunes</h5></center>\n" +
            "      <center><p class=\"card-text\">Estutande de Análise e Desenvolvimento de Sistemas Fatec - Praia Grande.</p></center>\n" +
            "      <center><p class=\"card-text\"> Conheça também seus projetos no GitHub.</p></center><br>\n" +        
            "       <center><a href=\"https://github.com/AndreyAntunes\" <button class='btn btn-primary'>GitHub</button></a></center>"+
            "    </div>\n" +
            "  </div>\n" +
             
                  
            "  <div class=\"card border-primary mb-3\" style=\"background-color: #ced5e5;\">\n" +
            "<br>" +                    
            "    <center><img  class=\"rounded-circle\" class=\"card-img-top\" src=\"Imagens/Leticia (2).jpg\" alt=\"Leticia Santos\" style=\"width:50%;position: relative;bottom: -5%;\"></center>\n" +
            "    <div class=\"card-body\" style=\"background-color: #ced5e5;\">\n" +
            "      <center><h5 class=\"card-title\">Leticia Santos</h5></center>\n" +
            "      <center><p class=\"card-text\">Estutande de Análise e Desenvolvimento de Sistemas Fatec - Praia Grande.</p></center>\n" +
            "      <center><p class=\"card-text\"> Conheça também seus projetos no GitHub.</p></center><br>\n" +
            "       <center><a href=\"https://github.com/LeticiaVSantos\" <button class=\"btn btn-primary\" >GitHub</button></a></center>"+        
            "    </div>\n" +
            "  </div>\n" +
            "</div>");
            
            out.println("<hr>");
            
            out.println("<style>\n" +
            ".footer {\n" +
            "    position: relative;\n" +
            "    left: 0;\n" +
            "    bottom: 0;\n" +
            "    width: 100%;\n" +
            "    height:60%;\n " +        
            "    background-color:#82868E;\n" +
            "    font-family: 'Raleway', sans-serif;" +        
            "    color: black;\n" +
            "    text-align: center;\n" +
            "}\n" +
            "</style>\n" +
            "\n" +
                   
                    
            "<div class=\"footer\">\n" +
            "<br>" +
            "<h5>Footer Content</h5>" +
            "<p>Here you can use rows and columns here to organize your footer content.</p>" +
            "<p>© 2018 Copyright:</p>\n" +
            "Projeto Servlets"+    
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
