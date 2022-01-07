<!DOCTYPE html>
<html lang="en">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/style.css">

    <title>intro</title>
<body>


<main class="main">
    <div style="text-align: center;">

    <div class="beginning">
        <h2>
            Вход
        </h2>
        <br>
        <form action="/login" method="post">
            <p>Имя:  </p>

            <input type="text" name="username">
            <br>
            <br>
            <p>Пароль:  </p>

            <input type="text" name="password">
            <br>
            <br>
            <p>Роль :</p>
            <select name="role" >
                <option  value="1"> Администратор </option>

                <option value="2"> Учитель </option>

                <option value="3"> Студент </option>

            </select>
            <br>
            <br>
            <br>
            <input type="submit" value=" войти" class="other">
        </form>


    </div>
    </div>


</main>


</body>
<footer>
    <div style="position: fixed; right: 20px; bottom: 0px;">
    <h3> Тестовые аккаунты: "admin/password" , "student/password"</h3>
    <br>
    <h3> Аккаутн "admin" поддерживает обе роли </h3>
    </div>
</footer>
</html>