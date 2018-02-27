package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import com.example.model.*;

public class BeerSelect extends HttpServlet {
    public void doPost(HttpServletRequest requst,
                       HttpServletResponse response) throws IOException, ServletException{
//        response.setContentType("text/html");
//        PrintWriter out=response.getWriter();
//        out.println("Beer Selection Advice <br>");
//        out.println("<br>Got beer color "+c);
        String c=requst.getParameter("color");
        List suggest=BeerExpert.getBrands(c);

        requst.setAttribute("styles",suggest);

        RequestDispatcher view=
                requst.getRequestDispatcher("result.jsp");
        view.forward(requst,response);
    }

}
