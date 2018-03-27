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
 * @author Allan P. Cabral
 */

@WebServlet(name = "juros-composto.php", urlPatterns = {"/juros-composto.php"})
public class jurosComposto extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
            
            try (PrintWriter out = response.getWriter()) {
                // Inicialização do HTML
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                
                // Tag Responsiva
                out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
                
                // Carregando Google Fonts*/
               out.println("<link href='https://fonts.googleapis.com/css?family=Raleway' rel='stylesheet'>");
                
                // Carregando FavIcon
                out.println("<link rel=\'shortcut icon\' href=\'Imagens/favicon (1).ico\' />");
                out.println("<title> JurosWeb </title>");
                
                // Carregando o Css/Bootstrap
                out.println("<link rel=\'stylesheet\' "
                            + "href=\'https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\'\n "
                            + "integrity=\'sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\'\n "
                            + "crossorigin=\'anonymous\'>");      
                out.println("</head>");
                
                // Inicio do Body / Navbar
                out.println("<body style=\'background-color: black;\'>");
                out.println("<nav class=\'navbar sticky-top navbar-dark bg-dark\'>\n " 
                            + "<a class=\'navbar-brand\' href=\'home.php\'>\n "
                            + "<img src=\'Imagens/cifrao.png\' width=\'30\' height=\'30\' "
                            + "class=\'d-inline-block align-top\' alt=\'\'> JurosWeb </a>\n " 
                            + "<span class='navbar-text'>JurosWeb, a solução.</span> "
                            + "</nav>");
                
                // Descrição da pagina
                out.println("<center>\n"
                            + "<h1 style=\'text-shadow: 1px 0px 0px #122b68, -1px 0px 0px #122b68, "
                            + "0px 1px 0px #122b68, 0px -1px 0px #122b68;font-family: tahoma;color: white; "
                            + "position: relative;width: 35%;top: 10% !important;\'> "
                            + "Cálculo de Juros Composto</h1>\n "
                            + "<hr/ style=\'background-color: #b8c1c1;\'>\n "
                            + "</center>");
                
                // Formulario
                out.println("<center>\n"
                            + "<form style=\'text-shadow: 1px 0px 0px #122b68, -1px 0px 0px #122b68, "
                            + "0px 1px 0px #122b68, 0px -1px 0px #122b68;font-family: tahoma;color: white; "
                            + "position: relative; width: 20%;\'>\n " 
                            + "<div class='row'>\n "
                            
                            // Entrada de aplicação
                            + "<div class='col'> " 
                            + "Aplicação (R$):\n "
                            + "<input type='text' style=\'width: 200px;\' class='form-control' "
                            + "placeholder='Ex: 100' name='valor'/>\n<br></div>\n "
                            
                            // Entrada de periodo
                            + "<div class='col'> "
                            + "Período (Em Meses):\n "
                            + "<input type='text' style=\'width: 200px;\' class='form-control' "
                            + "placeholder='Ex: 6' name='meses'/>\n<br></div>\n "
                            
                            // Entrada de Taxa
                            + "<div class='col'> "
                            + "Taxa de Juros (%):\n "
                            + "<input type='text' style=\"width: 200px;\" class='form-control' "
                            + "placeholder='Ex: 10' name='juros'/>\n<br></div>\n " 
                            
                            // Botão Submit 
                            + "<input class=\'btn btn-primary\' type=\'submit\' "
                            + "style=\'width: 200px;position:relative;left:17%;background-color: lightseagreen; "
                            + "border-color: lightseagreen;color:black;\' "
                            + "value='Calcular'/></div>\n "
                            
                            + "</div>\n</form>\n</center>\n");
            
            // Configuração do Botão Submit
            try{
                // Formato das casas decimais
                DecimalFormat df = new DecimalFormat("0.##");
                int meses = Integer.parseInt(request.getParameter("meses"));
                double valor = Double.parseDouble(request.getParameter("valor")); 
                double juros = Double.parseDouble(request.getParameter("juros")); 
                double taxa;
                                               
                  
                // Regra para impedir campo vazio / TRUE
                if(valor>0 && juros>0 && meses>0){
                    for (int i=0; i<meses; i++) {
                        taxa = valor * (juros/100);
                        valor = valor + taxa;
                    }
                    // Limitando as casas decimais da variavel Valor
                    String total = df.format(valor);
                    out.println("<br>");
                    out.println("<center style=\"text-shadow: 1px 0px 0px #122b68, -1px 0px 0px #122b68, "
                                + "0px 1px 0px #122b68, 0px -1px 0px #122b68;font-family: tahoma; "
                                + "color: white;position: relative;left: 2%;width:96%\"> "
                                + "O montante é de: R$ " + total + "</center>");
                    out.println("<hr/ style=\"background-color: #b8c1c1;\">");
                }
                
                // Regra / FALSE
                else{
                    out.println("<br>");
                    out.println("<center style=\"text-shadow: 1px 0px 0px #122b68, -1px 0px 0px #122b68, "
                                + "0px 1px 0px #122b68, 0px -1px 0px #122b68;font-family: tahoma; "
                                + "color: white;position: relative;left: 2%;width: 96%;\"> "
                                + "Envio não concluído. Preencha os campos com valores positivos.</center>");
                    out.println("<hr/ style=\"background-color: #b8c1c1;\">");
                }
            }
            
                // Regra de exceção
                catch(NumberFormatException nfe){
                    out.println("<br>");
                    out.println("<center style=\"text-shadow: 1px 0px 0px #122b68, -1px 0px 0px #122b68, "
                                + "0px 1px 0px #122b68, 0px -1px 0px #122b68;font-family: tahoma;"
                                + "color: white;position: relative;left: 2%;width: 96%;\">"
                                + "Lembre-se: Preencha os campos com numeros válidos.</center>");
                    out.println("<hr/ style=\"background-color: #b8c1c1;\">");
                }
                
                // Botão de Home/JSimples
                out.println("<a href='home.php'class=\"btn btn-primary btn-lg active\" "
                            + "role=\"button\" style=\"position: relative;top: 0%;left: 2%;background-color: lightseagreen;"
                            + "border-color: lightseagreen;color:black;\" aria-pressed=\"true\">Voltar</a>");
                out.println("<a href='juros-simples.php' class=\"btn btn-secondary btn-lg active\" "
                            + "role=\"button\" aria-pressed=\"true\"style=\"left: 3%;position: relative;background-color: lightseagreen;"
                            + "border-color: lightseagreen;color:black;\">Juros Simples</a>");
                out.println("<br><br>");
                
            
                /* Config css/footer */
                out.println("<style>\n"
                            + ".footer {\n position: relative;\n left: 0;\n " 
                            + "bottom: 0;\n width: 100%; height:13%;\n "
                            + "background-color:#82868E;\n font-family: 'Raleway', sans-serif;"
                            + "color: black;\n text-align: center;\n "
                            + "}\n </style>\n"
                            
                            + "<div class=\"footer\">\n"
                            + "<br><h5>JurosWeb - A Solução.</h5>\n"
                            +  "<p>Possui alguma sugestão? Entre em contato pelo nosso email: <a href=\"mailto:example@example.com\">suporte@jurosweb.com.br</a></p>"
                            + "<p>© 2018 Copyright.</p>\n"
                            + "</div>");
                                    
                /* Java Script - Bootstrap */
                out.println("<script src=\'https://code.jquery.com/jquery-3.2.1.slim.min.js\' integrity=\'sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\' crossorigin=\'anonymous\'></script>");
                out.println("<script src=\'https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\' integrity=\'sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\' crossorigin=\'anonymous\'></script>");
                out.println("<script src=\'https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\' integrity=\'sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\' crossorigin=\'anonymous\'></script>");
            
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
