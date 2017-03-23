/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javabeans.Projecte;
import javabeans.Tasca;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alcampo
 */
@WebServlet(name = "controlador", urlPatterns = {"/controlador"})
public class controlador extends HttpServlet {
    
    
    private static ArrayList<Projecte> projectes = new ArrayList<Projecte>();

   

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
        
        String vista = "errorpage.jsp";
        
        if (null != request.getParameter("save")){
             String nom = request.getParameter("nom");
             int codi = 0;
             if(!this.projectes.isEmpty()){
             codi = this.projectes.size();
             }
             
             Projecte pr = new Projecte(codi, nom);
             request.setAttribute("projecte",pr);
             vista = "tasques.jsp";
       }
        else if(null != request.getParameter("tascasave")){
            
            
             String nom = request.getParameter("nomT");
             String descripcio = request.getParameter("descT");
             Integer Ndies = Integer.parseInt(request.getParameter("nT"));
             
             Tasca t = new Tasca(nom, descripcio, Ndies, false);
             request.setAttribute("tasca",t);
             
             String prNom = request.getParameter("prNom");
             Integer prCodi = Integer.parseInt(request.getParameter("prCodi"));
                
             Projecte pr = new Projecte(prCodi, prNom);
             
             pr.setNewTasca(t);
             this.projectes.add(pr.getCodi(),pr);
             //request.setAttribute("projecte",pr);
             request.setAttribute("projectes",this.projectes);
             vista = "index.jsp";
                       
        }
        else if(null != request.getParameter("tascanova")){
            
            
             String nom = request.getParameter("nomT");
             String descripcio = request.getParameter("descT");
             Integer Ndies = Integer.parseInt(request.getParameter("nT"));
             
             Tasca t = new Tasca(nom, descripcio, Ndies, false);
             request.setAttribute("tasca",t);
             
             
             Integer prCodi = Integer.parseInt(request.getParameter("prCodi"));
                
             Projecte pr = this.projectes.get(prCodi);
             
             pr.setNewTasca(t);
             this.projectes.remove(pr.getCodi());
             this.projectes.add(pr.getCodi(),pr);
            // request.setAttribute("projecte",pr);
             request.setAttribute("projectes",projectes);
             vista = "index.jsp";
                                               
        }
             else if (null != request.getParameter("tornar")){
             
             request.setAttribute("projectes",this.projectes);
             vista = "index.jsp";
       }
        
        else if (null != request.getParameter("detall")){
             
             Integer codi = Integer.parseInt(request.getParameter("prCodi"));
             
             Projecte pr = this.projectes.get(codi);
             request.setAttribute("projecte",pr);
             vista = "projecteDetall.jsp";
       }
        else if (null != request.getParameter("mod")){
             
             Integer codi = Integer.parseInt(request.getParameter("prCodi"));
             String nom = request.getParameter("nom");
             String descripcio = request.getParameter("desc");
             Projecte pr = this.projectes.get(codi);
             
             Tasca t = pr.getTasques().get(0);
             t.setDescripcio(descripcio);
             t.setNom(nom);
             pr.EliminarTasques();
             pr.setNewTasca(t);
             request.setAttribute("projecte",pr);
             vista = "projecteDetall.jsp";
       }
        if (null != request.getParameter("novatasca")){
             
            Integer prCodi = Integer.parseInt(request.getParameter("prCodi"));
                
             Projecte pr = this.projectes.get(prCodi);
             request.setAttribute("projecte",pr);
             request.setAttribute("prvell",true);
             vista = "tasques.jsp";
       }
        
        if (null != request.getParameter("eliminar")){
             
            Integer prCodi = Integer.parseInt(request.getParameter("prCodi"));
                
             this.projectes.remove(prCodi);
             vista = "index.jsp";
       }
        
        RequestDispatcher rd = request.getRequestDispatcher(vista);
        rd.forward(request,response);
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
       doGet(request,response);
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
