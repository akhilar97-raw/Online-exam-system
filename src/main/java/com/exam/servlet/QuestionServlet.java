package com.exam.servlet;

import java.io.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.exam.db.DBConnection;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class QuestionServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String currentDate = new SimpleDateFormat("dd-MM-yyyy").format(new Date());

        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM questions");

            out.println("<div class='container'>");

            out.println("<div class='header'>");
            out.println("<h2>Online Examination</h2>");
            out.println("<p class='date'>Date: " + currentDate + "</p>");
            out.println("</div>");

            out.println("<form action='ResultServlet' method='post'>");
            int qNo = 1;

            while(rs.next()) {
                int id = rs.getInt("id");

                out.println("<div class='question-box'>");

                out.println("<p class='question'>Q" + qNo + ". " + rs.getString("question") + "</p>");

                out.println("<label><input type='radio' name='q"+id+"' value='"+rs.getString("option1")+"'> "+rs.getString("option1")+"</label><br>");
                out.println("<label><input type='radio' name='q"+id+"' value='"+rs.getString("option2")+"'> "+rs.getString("option2")+"</label><br>");
                out.println("<label><input type='radio' name='q"+id+"' value='"+rs.getString("option3")+"'> "+rs.getString("option3")+"</label><br>");
                out.println("<label><input type='radio' name='q"+id+"' value='"+rs.getString("option4")+"'> "+rs.getString("option4")+"</label>");

                out.println("</div>");

                qNo++;
            }

            out.println("<button type='submit'>Submit Exam</button>");
            out.println("</form>");

            out.println("</div>");
            out.println("</body>");
            out.println("</html>");

            rs.close();
            st.close();
            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}