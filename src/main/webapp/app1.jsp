<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
   .submit-button{
    align-items: center;
    justify-content: flex-start;
    flex-wrap: wrap;
    font-family: sans-serif;
    display: block;
    font-size: 18px;
    pointer-events: none;
    left: 30px;
    top: 10px;
    padding: 6px 50px;
    text-align: center;
    background: linear-gradient(to bottom, #3f7add 0%,#71acf7 100%);
    color: #fff;
    border-top: 1px solid #b4b5b9;
    border-bottom: 1px solid #b4b5b9;
    border-right: 1px solid #b4b5b9;
    }
    /* form starting stylings ------------------------------- */
    .group {
      position: relative;
      margin-bottom: 30px;
    }

    .input {
      font-size: 16px;
      padding: 10px;
      display: block;
      width: 200px;
      border: none;
      border-bottom: 1px solid #ccc;
    }
    .input-button{
    background: linear-gradient(to bottom, #3f7add 0%,#71acf7 100%);
    }
    .input:focus {
      outline: none;
    }
    /* LABEL ======================================= */
    label {
      color: #999;
      font-size: 18px;
      position: absolute;
      pointer-events: none;
      left: 10px;
      top: 10px;
      transition: 0.2s ease all;
      -moz-transition: 0.2s ease all;
      -webkit-transition: 0.2s ease all;
    }

    /* active state */
    .input:focus ~ label, input:valid ~ label {
      top: -15px;
      font-size: 14px;
      color: #5264AE;
    }

    /* BOTTOM BARS ================================= */
    .bar {
      position: relative;
      display: block;
      width: 200px;
    }
    .bar:before, .bar:after {
      content: "";
      height: 2px;
      width: 0;
      bottom: 0;
      position: absolute;
      background: #5264AE;
      transition: 0.2s ease all;
      -moz-transition: 0.2s ease all;
      -webkit-transition: 0.2s ease all;
    }
    .bar:before {
      left: 50%;
    }
    .bar:after {
      right: 50%;
    }

    /* active state */
    input:focus ~ .bar:before,
    input:focus ~ .bar:after {
      width: 50%;
    }

   table {
   font-family: "Lucida Sans Unicode", "Lucida Grande", Sans-Serif;
   font-size: 13px;
   text-align: left;
   border-collapse: collapse;
   border-radius: 20px;
   box-shadow: 0 0 0 10px #F2906B;
   color: #452F21;
   }
   th {
   padding: 10px 8px;
   background: white;
   }
   table th:first-child {
   border-top-left-radius: 20px;
   }
   table th:last-child {
   border-top-right-radius: 20px;
   }
   td {
   width: 30px;
   border-top: 10px solid #F2906B;
   padding: 8px;
   background: white;
   }
   table td:first-child {
   border-bottom-left-radius: 20px;
   }
   table td:last-child {
   border-bottom-right-radius: 20px;
   }
   caption {
   padding: 10px
   }
  </style>
<title>JSP</title>
</head>
<body>
    <h1>APP</h1>
    <form action=app method="post" accept-charset="utf-8">
      <span style="font-weight:bold">Введите данные пользователя:</span><br><br>
      <div>
         <div class="group">
            <input class="input" type="text" name="name" autocomplete="off" required>
            <span class="bar"></span>
            <label>Имя</label>
         </div>
         <div class="group">
            <input class="input" type="text" name="surname" autocomplete="off" required>
            <span class="bar"></span>
            <label>Фамилия</label>
         </div>
         <div class="group">
            <input class="input" type="text" name="age" autocomplete="off" required>
            <span class="bar"></span>
            <label>Возраст</label>
         </div>
         <div class="group">
            <input class="input" type="text" name="growth" autocomplete="off" required>
            <span class="bar"></span>
            <label>Рост</label>
         </div>
         <div class="group">
            <input class="input input-button" type="submit" value="Добавить пользователя">
         </div>

          <% String message = (String) session.getAttribute("message");
             if (message == "text") { %>
                <input type="text" value="Некорректные данные!!!">
             <% } else { %> <input type="hidden" value="Некорректные данные!!!">
             <% } %>
      </div>
    </form>
    <br>
    <br>

    <table>
    <caption>Пользователи</caption>
      <tr>
        <th>№</th>
        <th>Имя</th>
        <th>Фамилия</th>
        <th>Возраст</th>
        <th>Рост</th>
        <th></th>
      </tr>
      <% ResultSet resultSet = (ResultSet) request.getAttribute("resultSet");
           while (resultSet.next()){
               String id = resultSet.getString("id");
               String name = resultSet.getString("name");
               String surname = resultSet.getString("surname");
               String age = resultSet.getString("age");
               String growth = resultSet.getString("growth");
            %>
            <tr>
                  <td> <%= id %> </td>
                  <td onclick="handle(this)" id="<%= id %>" name="name"><%= name %> </td>
                  <td onclick="handle(this)" id="<%= id %>" name="surname"> <%= surname %> </td>
                  <td onclick="handle(this)" id="<%= id %>" name="age"> <%= age %> </td>
                  <td onclick="handle(this)" id="<%= id %>" name="growth"> <%= growth %> </td>
                  <td>
                      <form action=app method="post" accept-charset="utf-8">
                            <input type="hidden" name="id" value="<%= id %>">
                            <input type="hidden" name="DELETE" value="DELETE">
                            <input type="image" src="https://img.icons8.com/ios/500/000000/delete-sign.png" alt="Submit" width="25" height="20">
                      </form>
                  </td>
                  <td>
                     <form id="form" action=app method="post" accept-charset="utf-8">
                            <input type="hidden" id="id" name="id" value="">
                            <input type="hidden" id="value" name="value" value="">
                            <input type="hidden" name="PUT" value="PUT">
                            <input type="image" src="https://img.icons8.com/ios/500/000000/delete-sign.png" alt="Submit" width="25" height="20">
                     </form>
                  </td>

            </tr>
        <% } %>
    </table>

</body>
</html>

<script>
    function handle(object){
         var inp = document.createElement("input");
         inp.type = "text";
         inp.size = 10;
         inp.value = object.innerText;

         object.innerText = "";
         object.appendChild(inp);

         var _event = object.onclick;
         object.onclick = null;

         inp.onkeydown = function(e){
             if(e.keyCode === 13){
                   object.innerText = inp.value;
                   object.onclick = _event;
                   document.getElementById("id").value = inp.id;
                   document.getElementById("value").value = inp.value;
                   document.getElementById("form").submit();
                   object.removeChild(inp);
             }
         object.number = "23123";
         object.id = "134";
         };
    }
</script>

