/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fatecpg.ads.poo.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andrey Antunes
 */
@WebServlet(name = "juros-simples.php", urlPatterns = {"/juros-simples.php"})
public class jurosSimples extends HttpServlet {

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
            out.println("<link href='https://fonts.googleapis.com/css?family=Raleway' rel='stylesheet'>");
             /*Favicon*/
            out.println("<link rel=\"shortcut icon\" href=\"Imagens/favicon (1).ico\" />");
            out.println("<title> JurosWeb </title>");  
            /*css - Bootstrap*/
            out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">");
            out.println("<title>Juros Simples</title>");            
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
            
            out.println("<center><h1 style=\"text-shadow: 1px 0px 0px #122b68, -1px 0px 0px #122b68, 0px 1px 0px #122b68, 0px -1px 0px #122b68;font-family: tahoma;color: white;position: relative;width: 35%;top: 10% !important;\">Cálculo de juros simples</h1></center>"+
            "<hr/ style=\"background-color: #b8c1c1;\">" +
            
            "<center><form style=\"text-shadow: 1px 0px 0px #122b68, -1px 0px 0px #122b68, 0px 1px 0px #122b68, 0px -1px 0px #122b68;font-family: tahoma;color: white;position: relative; width: 20%;\">" +
            "<div class='row'>" +
            "<div class='col'>" +
            "Aplicação (R$):<input type='text' style=\"width: 200px;\" class='form-control' placeholder='Ex: 1000' name='aplicacao'/><br>" +
            "</div>" + 
                    
            "<div class='col'>" +
            "Período (meses):<input type='text' style=\"width: 200px;\" class='form-control' placeholder='Ex: 3' name='periodo'/><br>" +
            "</div>" +   

            "<div class='col'>" +
            "Taxa (%):<input type='text' style=\"width: 200px;\" class='form-control' placeholder='Ex: 2' name='taxa'/><br>" +
            "</div>" +         
            
                    
            "<input class=\"btn btn-primary\" type=\"submit\" style=\"width: 200px;position:relative;left:17%;background-color: lightseagreen;border-color: lightseagreen;color:black;\" value='Calcular'/>" +
            "</div>" +
            "</div>" +
                    
           
                    
            "</form></center>");
                
                    
            
            
            try{
                //variáveis.
                int periodo=Integer.parseInt(request.getParameter("periodo"));
                double aplicacao=Double.parseDouble(request.getParameter("aplicacao")), taxa=Double.parseDouble(request.getParameter("taxa")), montante;
                DecimalFormat df = new DecimalFormat("###,##0.00");
                //se os valores aplicados forem maior do que 0 o sistema aceita.
                if(aplicacao>0 && taxa>0 && periodo>0){
                   montante=(aplicacao*(taxa*periodo));
                   out.println("<br>");
                   out.println("<center style=\"text-shadow: 1px 0px 0px #122b68, -1px 0px 0px #122b68, 0px 1px 0px #122b68, 0px -1px 0px #122b68;font-family: tahoma;color: white;position: relative;left: 2%;width:96%\">O montante é de: R$ " +montante+ ".</center>");
                   out.println("<hr/ style=\"background-color: #b8c1c1;\">");
                }
                
                //se os valores aplicados forem menor do que 0 o sistema aponta o erro.
                else{
                    out.println("<br>");
                    out.println("<center style=\"text-shadow: 1px 0px 0px #122b68, -1px 0px 0px #122b68, 0px 1px 0px #122b68, 0px -1px 0px #122b68;font-family: tahoma;color: white;position: relative;left: 2%;width: 96%;\">Envio não concluído. Preencha os campos com valores positivos.</center>");
                    out.println("<hr/ style=\"background-color: #b8c1c1;\">");
                }
            }
            //aviso para digitar apenas números.
            catch(NumberFormatException nfe){
                out.println("<br>");
                out.println("<center style=\"text-shadow: 1px 0px 0px #122b68, -1px 0px 0px #122b68, 0px 1px 0px #122b68, 0px -1px 0px #122b68;font-family: tahoma;color: white;position: relative;left: 2%;width: 96%;\">Lembre-se: Preencha os campos com valores válidos.</center>");
                out.println("<hr/ style=\"background-color: #b8c1c1;\">");
            }
            
            out.println("<a href='home.php'class=\"btn btn-primary btn-lg active\" role=\"button\" style=\"position: relative;top: 0%;left: 2%;background-color: lightseagreen;border-color: lightseagreen;color:black;\" aria-pressed=\"true\">Voltar</a>");
            out.println("<a href='juros-composto.php' class=\"btn btn-secondary btn-lg active\" role=\"button\" aria-pressed=\"true\"style=\"left: 3%;position: relative;background-color: lightseagreen;border-color: lightseagreen;color:black;\">Juros Composto</a><br>");
            out.println("<br>");
            
            
            /*out.println("<div class=\"container\" style=\"background-color:white;\">" +
  "<h2 style=\"font-family:tahoma; font-size:3rem;\ position: relative;left: 2%">Cálculo de juros simples</h2>" +
  "<div class=\"panel panel-default\">" +
    "<div class=\"panel-body\">Preencha todos os campos disponíveis para saber o montante de sua aplicação.</div>" +
  "</div>" +
"</div>");*/
          
            /*css - Footer*/
            out.println("<style>\n" +
            ".footer {\n" +
            "    position: relative;\n" +
            "    left: 0;\n" +
            "    bottom: 0;\n" +
            "    width: 100%;\n" +
            "    height:19%;\n " +        
            "    background-color:#82868E;\n" +
            "    font-family: 'Raleway', sans-serif;" +      
            "    color: black;\n" +
            "    text-align: center;\n" +
            "}\n" +
            "</style>\n" +
            "\n" +
            "<div class=\"footer\"style=\"background-color: ;\">\n" +
                    "<br>" +
                    "<h5>Footer Content</h5>" +
                "<p>Here you can use rows and columns here to organize your footer content.</p>" +
                "  <p>© 2018 Copyright:</p>\n" +
                "Projeto Servlests"+    
            "</div>");
            /*fim css - Footer*/
            
             /*Java Script - Bootstrap*/
            out.println("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
            out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
            out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>");
            
            out.println("</body>");
            out.println("</html>");
            
            /*Minhas anotações:
            - Refresh na página após o envio de formulário.
            - Deixar mais completo e apresentável.
            */
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
