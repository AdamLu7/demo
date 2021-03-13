<%--
  Created by IntelliJ IDEA.
  User: Adam
  Date: 2021/1/28/028
  Time: 13:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="book" class="Model.BookBean" scope="request"/>
<html>
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

<body>
<div class="container">
    <div class="panel panel-primary">
        <!-- Default panel contents -->
        <div class="panel-heading">图书查询</div>
        <div class="panel-body">
            <p>根据传入的唯一的图书号返回图书信息</p>
        </div>

        <!-- Table -->
        <table class="table">
            <tr>
                <td>书号</td>
                <td>书名</td>
                <td>作者</td>
                <td>出版社</td>
                <td>数量</td>
            </tr>
            <tr>
                <td><jsp:getProperty name="book" property="isbn"/></td>
                <td><jsp:getProperty name="book" property="b_name"/></td>
                <td><jsp:getProperty name="book" property="author"/></td>
                <td><jsp:getProperty name="book" property="pub_name"/></td>
                <td><jsp:getProperty name="book" property="sum"/></td>
            </tr>
        </table>
    </div>
</div>
</body></html>

