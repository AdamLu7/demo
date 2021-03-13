<%--
  Created by IntelliJ IDEA.
  User: Adam
  Date: 2021/1/28/028
  Time: 13:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html><head> <title>Book Query</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
    <div class="panel panel-primary">
        <div class="panel-heading">图书查询</div>
        <div class="panel-body">
            <p>根据输入的图书号查找图书</p>
        </div>
        <form action="bookquery.do" method = "post">
            <div class="form-group">
                <label>图书号</label>
                <input type="text" class="form-control" name="isbn" placeholder="图书号">
            </div>
            <div class="form-group">
                <input type="submit" value="提交">
            </div>
        </form>
    </div>
</div>
</body>
</html>

