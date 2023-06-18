<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="app.DataAccess" %>
<%@ page import="app.Book" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>Book List | Crud_App</title>
    <link rel="stylesheet" href="css/list.css">
</head>
<body>
    <header>
        <h2>Book Management System</h2>
        <div class="links">
            <h4>
                <a href="form">Add New Book</a>&nbsp;&nbsp;&nbsp;
                <a href="list">List All Book</a>
            </h4>
        </div>
        <hr>
    </header>
    <section>
        <table>
            <caption>
                <h4>List of All Available Books</h4>
            </caption>
            <tr>
                <th>Id</th>
                <th>Title</th>
                <th>Author</th>
                <th>Qty</th>
                <th>Price</th>
                <th>Ebook</th>
                <th>Action</th>
            </tr>
            <%
            List<Book> ans = (List<Book>) request.getAttribute("bookList");
            int idx = 0;
            while(idx < ans.size()) {
            %>
            <tr>
                <td><%= ans.get(idx).getId()%></td>
                <td><%= ans.get(idx).getTitle()%></td>
                <td><%= ans.get(idx).getAuthor()%></td>
                <td><%= ans.get(idx).getQty()%></td>
                <td><%= ans.get(idx).getPrice()%></td>
                <td><%= ans.get(idx).isEBookAvail()%></td>
                <td class="action-btn">
                    <a href="/edit?id=<%=ans.get(idx).getId()%>">Edit</a>
                    &nbsp&nbsp&nbsp;&nbsp;
                    <a href="/delete?id=<%=ans.get(idx).getId()%>">Delete</a>
                </td>
            </tr>
            <% ++idx; } %>
        </table>
    </section>
</body>
</html>
