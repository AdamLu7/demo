package Controller;

import Model.BookBean;
import Model.BookDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

//@WebServlet("BookQueryServlet")
public class BookQueryServlet extends HttpServlet{
    public void doPost(HttpServletRequest request,HttpServletResponse response)
            throws ServletException,IOException{
        response.setCharacterEncoding("UTF-8");    //设置响应的字符集格式为UTF-8
        response.setContentType("text/html");  //设置响应正文的MIME类型
        String isbn = request.getParameter("isbn");
        BookDAO bookdao = null;
        try {
            bookdao = new BookDAO();
        } catch (Exception e) {
            e.printStackTrace();
        }
        BookBean book = null;
        try {
            book = bookdao.searchBook(isbn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(book!=null){
            request.setAttribute("book", book);
            RequestDispatcher view = request.getRequestDispatcher("/display.jsp");
            view.forward(request, response);
        }else{
            RequestDispatcher view = request.getRequestDispatcher("/errorPage.jsp");
            view.forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}

