<%@page language="java" pageEncoding="utf-8" contentType="text/html;utf-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    pageContext.getRequest().getRequestDispatcher("/prision/query").forward(request,response);
%>
