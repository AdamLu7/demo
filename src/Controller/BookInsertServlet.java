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
import java.sql.SQLException;

public class BookInsertServlet extends HttpServlet{
    public void doPost(HttpServletRequest request,HttpServletResponse response)
            throws ServletException,IOException{

        request.setCharacterEncoding("utf-8");
        String message = null;
        BookBean book = new BookBean(
                request.getParameter("isbn"),request.getParameter("b_name"),
                request.getParameter("author"),request.getParameter("pub_name"),
                Integer.parseInt(request.getParameter("sum"))
        );
        BookDAO bookdao = null;
        try {
            bookdao = new BookDAO();
        } catch (Exception e) {
            e.printStackTrace();
        }
        boolean success = bookdao.insertBook(book);
        if(success){
            message = "成功插入一条记录！";
        }else{
            message = "插入记录错误！";
        }
        request.setAttribute("result",message);
        RequestDispatcher view = request.getRequestDispatcher("/bookInsert.jsp");
        view.forward(request, response);
    }
}

