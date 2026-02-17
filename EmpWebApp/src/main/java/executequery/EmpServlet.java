@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String deptno = request.getParameter("deptno");

        if (deptno == null || deptno.isEmpty()) {
            out.println("<p>Please provide a valid department number.</p>");
            return;
        }

        try {
            int deptId = Integer.parseInt(deptno);

            Class.forName("oracle.jdbc.driver.OracleDriver");
            try (Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:orcl", "c##aswini", "2004");
                 PreparedStatement ps = con.prepareStatement(
                         "SELECT empno, ename FROM emp WHERE deptno = ?")) {

                ps.setInt(1, deptId);
                try (ResultSet rs = ps.executeQuery()) {

                    out.println("<html><body>");
                    out.println("<h2>Employees in Dept " + deptId + "</h2>");
                    out.println("<table border='1'><tr><th>Emp No</th><th>Name</th></tr>");

                    boolean hasData = false;
                    while (rs.next()) {
                        hasData = true;
                        out.println("<tr><td>" + rs.getInt("empno") + "</td><td>" + rs.getString("ename") + "</td></tr>");
                    }

                    if (!hasData) {
                        out.println("<tr><td colspan='2'>No employees found</td></tr>");
                    }

                    out.println("</table>");
                    out.println("</body></html>");
                }
            }
        } catch (NumberFormatException e) {
            out.println("<p>Invalid department number format.</p>");
        } catch (Exception e) {
            out.println("<p>Internal error occurred. Please try again later.</p>");
            e.printStackTrace(); // Log for debugging
        }
    }
}
