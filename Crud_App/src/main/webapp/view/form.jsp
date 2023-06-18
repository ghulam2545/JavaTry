<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Book | Crud_App</title>
    <link rel="stylesheet" href="css/form.css">
</head>
<body>
    <header>
        <h2>Book Management System</h2>
        <div class="links">
            <h4>
                <a href="add">Add New Book</a>&nbsp;&nbsp;&nbsp;
                <a href="list">List All Book</a>
            </h4>
        </div>
        <hr>
    </header>
    <section>
        <form action="add" method="post">
            <table>
                <caption>
                    <h4>Add New Book</h4>
                </caption>
                <tr>
                    <th>Title</th>
                    <td>
                        <input type="text" size="60" name="title" required>
                    </td>
                </tr>
                <tr>
                    <th>Author</th>
                    <td>
                        <input type="text" size="60" name="author" required>
                    </td>
                </tr>
                <tr>
                    <th>Quantity</th>
                    <td>
                        <input type="text" size="60" name="qty" required>
                    </td>
                </tr>
                <tr>
                    <th>Price</th>
                    <td>
                        <input type="text" size="60" name="price" required>
                    </td>
                </tr>
                <tr>
                    <th>Ebook</th>
                    <td>
                        <select name="choice">
                            <option value="yes">Yes</option>
                            <option value="no">No</option>
                        </select>
                    </td>
                </tr>
            </table>
            <div class="submit-btn">
                <input type="submit">
            </div>
        </form>
    </section>
</body>
</html>
