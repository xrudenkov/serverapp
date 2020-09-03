package back.classesServlet;

import back.db.InitialDB;
import back.tables.Users;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;


@WebServlet("/app")
public class AppServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        try {
            ResultSet resultSet = Users.read();
            req.setAttribute("resultSet", resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        getServletContext().getRequestDispatcher("/app.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        HttpSession session = req.getSession();

        try {
            String name = req.getParameter("name");
            String surname = req.getParameter("surname");
            int age = Integer.parseInt(req.getParameter("age"));
            int growth = Integer.parseInt(req.getParameter("growth"));

            if (name.isEmpty() || surname.isEmpty() || age<=0 || growth<=0) {
                resp.sendRedirect("app.jsp");
            } else {
                Users.update(name,surname,age,growth);
                session.setAttribute("message", "hidden");
                resp.sendRedirect("/app");
            }
        } catch (NumberFormatException exc) {
            session.setAttribute("message", "text");
            resp.sendRedirect("/app");
        }
    }

    @Override
    public void doPut(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("UTF-8");
        try {

            String id = req.getParameter("id");
            String name = req.getParameter("nik");
            String value = req.getParameter("value");
            System.out.println(id);
            System.out.println(name);
            System.out.println(value);
            resp.sendRedirect("/app");
        } catch (NumberFormatException exc) {exc.printStackTrace();}
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        try {
            int id = Integer.parseInt(req.getParameter("id"));
            Users.delete(id);
            resp.sendRedirect("/app");
        } catch (NumberFormatException exc) {exc.printStackTrace();}
    }
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        String method = req.getMethod();
        String METHOD_DELETE = req.getParameter("DELETE");
        String METHOD_PUT = req.getParameter("PUT");
        if (METHOD_DELETE!=null && METHOD_DELETE.equals("DELETE"))
            method = METHOD_DELETE;
        if (METHOD_PUT!=null && METHOD_PUT.equals("PUT"))
            method = METHOD_PUT;

        if (method.equals("GET"))
            doGet(req, resp);
        else if (method.equals("POST"))
            doPost(req, resp);
        else if (method.equals("PUT"))
            doPut(req, resp);
        else if (method.equals("DELETE"))
            doDelete(req, resp);
        else
        {
            // Servlet doesn't currently support
            // other types of request.
            String errMsg = "Method Not Supported";
            resp.sendError(
                    HttpServletResponse.SC_NOT_IMPLEMENTED, errMsg);
        }
    }
}