<%--
  Created by IntelliJ IDEA.
  User: Adam
  Date: 2021/1/28/028
  Time: 13:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html><head> <title>Book Insert</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

</head>
<body>

<div class="container">
    <h3>请输入图书信息：</h3>
    <div class="alert alert-success" role="alert"><% if(request.getAttribute("result")!=null)
        out.print(request.getAttribute("result"));
    %></div>

    <div class="panel panel-primary">
        <div class="panel-heading">图书插入</div>
        <div class="panel-body">
            <p>根据输入的图书信息插入图书</p>
        </div>
        <form action = "bookinsert.do" method = "post">
            <table class="table">
                <tr><td>书号</td> <td><input type="text" name="isbn" ></td></tr>
                <tr><td>书名</td><td><input type="text" name="b_name"></td></tr>
                <tr><td>作者</td><td><input type="text" name="author" ></td></tr>
                <tr><td>出版社</td><td><input type="text" name="pub_name" ></td></tr>
                <tr><td>数量</td><td><input type="text" name="sum" ></td></tr>
                <tr><td><input type="submit" value="确定" ></td>
                    <td><input type="reset" value="重置" ></td>
                </tr>
            </table>
        </form>
    </div>
</div>
</body></html>

