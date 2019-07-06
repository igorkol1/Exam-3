package pl.coderslab.web;

import pl.coderslab.dao.SmurfDao;
import pl.coderslab.domain.Smurf;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Exe2_smurfs", urlPatterns = "/smurfs")
public class Exe2_smurfs extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SmurfDao smurfDao = new SmurfDao();
        List<Smurf> smurfs = smurfDao.getList();
        request.setAttribute("smurfs", smurfs);
        getServletContext()
                .getRequestDispatcher("/jspFiles/smurfsList.jsp")
                .forward(request, response);
    }
}
