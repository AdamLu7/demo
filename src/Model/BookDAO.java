package Model;

import Utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDAO {
    public BookDAO() {
    }
    // 根据书号查询图书信息
    public BookBean searchBook(String isbn) throws SQLException {
        PreparedStatement pstmt = null;
        ResultSet rst = null;
        Connection conn = JDBCUtils.getConnection();
        BookBean book = new BookBean();
        try{
            pstmt = conn.prepareStatement("SELECT * FROM book WHERE isbn=?");
            pstmt.setString(1,isbn);
            rst = pstmt.executeQuery();
            if(rst.next()){
                book.setIsbn(rst.getString("isbn"));
                book.setB_name(rst.getString("b_name"));
                book.setAuthor(rst.getString("author"));
                book.setPub_name(rst.getString("pub_name"));
                book.setSum(rst.getInt("sum"));
                return book;
            }else{
                return null;
            }
        }catch(SQLException se){
            return null;
        }finally{
            JDBCUtils.close(rst,conn,pstmt);
        }
    }
    // 插入一本图书记录
    public boolean insertBook(BookBean book){
        PreparedStatement pstmt = null;
        try{
            Connection conn = JDBCUtils.getConnection();
            pstmt = conn.prepareStatement(
                    "INSERT INTO book VALUES(?,?,?,?,?)");
            pstmt.setString(1,book.getIsbn());
            pstmt.setString(2,book.getB_name());
            pstmt.setString(3,book.getAuthor());
            pstmt.setString(4,book.getPub_name());
            pstmt.setInt(5,book.getSum());
            pstmt.executeUpdate();
            pstmt.close();
            conn.close();
            return true;
        }catch(SQLException se){
            return false;
        }
    }
}

