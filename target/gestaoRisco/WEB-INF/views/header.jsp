<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="appPath" value="${pageContext.request.contextPath}"/>
<%
	String contextPath = request.getContextPath();
	
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href='<%=contextPath+"/css/bootstrap.min.css" %>' rel="stylesheet">
<link href='<%=contextPath+"/css/font-awesome.min.css" %>' rel="stylesheet">
<link href='<%=contextPath+"/css/cliente.css" %>' rel="stylesheet">
</head>
<body>
 <div class="navbar navbar-inverse navbar-fixed-left">
     <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span> 
      </button>
      <a class="navbar-brand" href="#">XXX Company</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li ><a href="<%=contextPath%>/home.action">Home</a></li>
        <li><a  href="<%=contextPath%>/cliente/clientes.action">Clientes</a></li>
      </ul>
    </div>
  </div>
  </div>
      <div class="">
        <a  class="btn btn-primary" href="<%=contextPath%>/cliente/clienteForm.action" style="margin-left:50%;">Adicionar Cliente</a>
        </div>
