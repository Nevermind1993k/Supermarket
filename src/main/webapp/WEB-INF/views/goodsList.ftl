<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>GoodsData</title>
</head>

<body class="container">
<#include "templates/header.ftl">
<div class="table-responsive">
    <caption>Goods list</caption>
    <table class="table table-striped">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Price</th>
            <th>Merchant</th>
            <th>Delete</th>
        </tr>
    <#list goods as good>
        <tr>
            <td><a href="/good/${good.id}">${good.id}</a></td>
            <td>${good.name}</td>
            <td>${good.price}</td>
            <td>${good.merchant}</td>
            <td><input type="submit" title="Delete" value="X"/></td>
        </tr>
    </#list>
    </table>
</div>
<#include "templates/createGoodsForm.ftl"/>
<a type="button" href="http://localhost:8080" class="button">Back</a>
</body>
</html>