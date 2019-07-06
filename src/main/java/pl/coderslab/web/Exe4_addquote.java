package pl.coderslab.web;

import pl.coderslab.domain.Quote;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Exe4_addquote", urlPatterns = "/addquote")
public class Exe4_addquote extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String author = request.getParameter("author");
        String quote = request.getParameter("quote");
        if (author != null && quote != null) {
            List<Quote> quoteList = new ArrayList<>();
            Quote newQuote = new Quote(author, quote);
            HttpSession httpSession = request.getSession();
            if (httpSession.getAttribute("quoteList") == null) {
                quoteList.add(newQuote);
                httpSession.setAttribute("quoteList", quoteList);
            } else {
                quoteList = (List<Quote>) httpSession.getAttribute("quoteList");
                quoteList.add(newQuote);
                httpSession.setAttribute("quoteList", quoteList);
            }
            response.sendRedirect("allquotes");
        } else {
            response.setStatus(400);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/jspFiles/addQuote.jsp").forward(request, response);
    }
}

