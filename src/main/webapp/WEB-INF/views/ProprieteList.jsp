<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Proprietes List</title>
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/5.2.0/css/bootstrap.min.css">
    <style>
        /* Couleurs personnalisées */
        .navbar-custom {
            background-color: #f8f9fa;
        }

        .table-custom th {
            background-color: #343a40;
            color: #ffffff;
        }

        .btn-delete {
            background-color: #dc3545;
            color: #ffffff;
        }

        .btn-edit {
            background-color: #007bff;
            color: #ffffff;
        }

        .btn-create {
            background-color: #28a745;
            color: #ffffff;
        }

        footer {
            background-color: #f8f9fa;
            padding: 20px 0;
        }
    </style>
</head>
<body>
<header>
    <nav class="navbar navbar-expand-lg navbar-light bg-light navbar-custom">
        <div class="container">
            <a class="navbar-brand" href="#">Proprietes List</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                    aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="#">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Features</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Pricing</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled">Disabled</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</header>
<main class="container mt-5">
    <div class="row">
        <div class="col">
            <table class="table table-custom">
                <thead>
                <tr>
                    <th>Adresse</th>
                    <th>Type</th>
                    <th>Superficie</th>
                    <th>Prix</th>
                    <th>Disponible</th>
                    <th>Action</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${proprieteJsp.content}" var="propriete">
                    <tr>
                        <td>${propriete.adresse}</td>
                        <td>${propriete.type}</td>
                        <td>${propriete.superficie}</td>
                        <td>${propriete.prix}</td>
                        <td>${propriete.disponible}</td>
                        <td>
                            <a onClick="return confirm('Are you sure you want to delete this item?')"
                               class="btn btn-delete btn-sm" href="deletePropriete?id=${propriete.id_prop}">Delete</a>
                            <a class="btn btn-edit btn-sm" href="showProduct?id=${propriete.id_prop}">Edit</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>


        </div>
    </div>
</main>
<footer class="mt-5 text-center">
    <a href="createPropriete" class="btn btn-create">Propriete Creation</a>
</footer>

<script src="webjars/bootstrap/5.2.0/js/bootstrap.bundle.min.js"></script>
</body>
</html>
