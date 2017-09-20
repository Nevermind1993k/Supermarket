<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>GoodsData</title>
</head>
<body class="container">
<#include "templates/header.ftl">
<div class="table-responsive">
    <caption>Goods info</caption>
    <table class="table table-striped">
        <tr>
            <td>Id</td>
            <td>${good.id}</a></td>
        </tr>
        <tr>
            <td>Name</td>
            <td>${good.name}</td>
        </tr>
        <tr>
            <td>Price</td>
            <td>${good.price}</td>
        </tr>
        <tr>
            <td>Merchant</td>
            <td>${good.merchant}</td>
        </tr>
    </table>
</div>
<a type="button" href="/goods" class="button">Back</a>
</body>
</html>