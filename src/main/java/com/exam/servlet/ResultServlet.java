package com.exam.servlet;

import java.io.*;
import java.sql.*;
import com.exam.db.DBConnection;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class ResultServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        int score = 0;

        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM questions");

            while(rs.next()) {
                int id = rs.getInt("id");
                String correct = rs.getString("answer");
                String userAns = req.getParameter("q"+id);

                if(correct != null && correct.equals(userAns)) {
                    score++;
                }
            }

            out.println("<html><head>");
            out.println("<link rel='stylesheet' href='css/style.css'>");
            out.println("</head><body>");

            out.println("<div class='container'>");
            out.println("<h2>Your Score: " + score + "</h2>");
            out.println("<a href='index.jsp'><button>Back</button></a>");
            out.println("</div>");

            out.println("</body></html>");

            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}