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
@WebServlet(name = "juros-simples", urlPatterns = {"/juros-simples"})
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
            out.println("<title>Juros Simples</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Juros Simples</h1>");
            out.println("<h4><a href='index.html'>Voltar</a></h4>");
            out.println("<h2>Cálculo de juros simples</h2>");
            out.println("<hr/>");
            out.println("<form>");
            out.println("Aplicação: <input type='text' name='aplicacao'/>");
            out.println("Taxa: <input type='text' name='taxa'/>");
            out.println("Período: <input type='text' name='periodo'/>");
            out.println("<input type= 'submit' value='Calcular'/>");
            out.println("</form>");
            out.println("<br>");
            try{
                //variáveis.
                int periodo=Integer.parseInt(request.getParameter("periodo"));
                double aplicacao=Double.parseDouble(request.getParameter("aplicacao")), taxa=Double.parseDouble(request.getParameter("taxa")), montante;
                //se os valores aplicados forem maior do que 0 o sistema aceita.
                if(aplicacao>0 && taxa>0 && periodo>0){
                   montante=(aplicacao*(taxa*periodo));
                   out.println("O montante é de: " +montante+ ".");
                   out.println("<hr/>");
                }
                //se os valores aplicados forem menor do que 0 o sistema aponta o erro.
                else{
                    out.println("Ação não concluída. Insira apenas dados válidos.");
                    out.println("<hr/>");
                }
            }
            //ainda arrumarei alguns detalhes no filtro para o seu melhor funcionamento.
            catch(NumberFormatException nfe){
                out.println("Ação não concluída. Insira apenas números!");
                out.println("<hr/>");
            }
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
