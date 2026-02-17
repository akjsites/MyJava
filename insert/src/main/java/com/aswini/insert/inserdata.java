package com.aswini.insert;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/inserdata")
public class inserdata extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Replace with your DB info
    String jdbcURL = "jdbc:oracle:thin:@localhost:1521:orcl";
    String jdbcUsername = "c##aswini";
    String jdbcPassword = "2004";

    public inserdata() {
        super();
    }

    // Show HTML form
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Insert into Table AAA</h2>");
        out.println("<form method='post' action='inserdata'>");
        out.println("ID: <input type='text' name='id'><br>");
        out.println("Name: <input type='text' name='name'><br>");
        out.println("<input type='submit' value='Insert'>");
        out.println("</form>");
        out.println("</body></html>");
    }

    // Handle form submission
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String idStr = request.getParameter("id");
        String name = request.getParameter("name");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int id = Integer.parseInt(idStr);

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);

            String sql = "INSERT INTO AAA (id, name) VALUES (?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, name);

            int rows = ps.executeUpdate();

            out.println("<html><body>");
            if (rows > 0) {
                out.println("<h3>Record inserted into AAA successfully!</h3>");
            } else {
                out.println("<h3>Failed to insert record.</h3>");
            }
            out.println("</body></html>");

            ps.close();
            conn.close();
        } catch (NumberFormatException nfe) {
            out.println("<html><body><h3>Error: ID must be a number.</h3></body></html>");
        } catch (Exception e) {
            e.printStackTrace(out);
        }
    }
}
