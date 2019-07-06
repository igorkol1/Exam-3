package pl.coderslab.web;

import pl.coderslab.domain.Quote;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.Queue;
import java.util.Random;

@WebServlet(name = "Exe4_randomquote", urlPatterns = "/randomquote")
public class Exe4_randomquote extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession httpSession = request.getSession();
        Writer writer = response.getWriter();
        if (httpSession.getAttribute("quoteList") != null) {
            List<Quote> quoteList = (List<Quote>) httpSession.getAttribute("quoteList");
            int max = quoteList.size();
            Random random = new Random();
            writer.write(quoteList.get(random.nextInt(max)).getAuthor());
            writer.write(quoteList.get(random.nextInt(max)).getContent());
        } else {
            writer.write("There were no quotes");
        }
    }
}
