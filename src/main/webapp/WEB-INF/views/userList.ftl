<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>UserData</title>
</head>

<body class="container">
<#include "templates/header.ftl">
<div class="table-responsive">
    <caption>User list</caption>
    <table class="table table-striped">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Age</th>
        </tr>
    <#list users as user>
        <tr>
            <td><a href="/user/${user.id}">${user.id}</a></td>
            <td>${user.name}</td>
            <td>${user.email}</td>
            <td>${user.age}</td>
        </tr>
    </#list>
    </table>
</div>
<#include "templates/createUserForm.ftl"/>
<a type="button" href="http://localhost:8080" class="button">Back</a>
</body>
</html>