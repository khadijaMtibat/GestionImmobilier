<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/5.2.0/css/bootstrap.min.css" />
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Propriete Edition</title>
</head>
<body>
<header>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Propriete Edition</a>
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
    <form action="updatePropriete" method="post">
        <div class="mb-3">
            <label hidden for="id_prop"><strong><span style="color: black;">Product Id :</span></strong></label>
            <input hidden type="text" id="id_prop" name="id_prop" value="${proprieteJsp.id_prop}" class="form-control">
        </div>
        <div class="row mb-3">
            <label for="adresse" class="col-sm-2 col-form-label"><strong><span style="color: black;">Adresse :</span></strong></label>
            <div class="col-sm-10">
                <input type="text" id="adresse" name="adresse" value="${proprieteJsp.adresse}" class="form-control">
            </div>
        </div>
        <div class="row mb-3">
            <label for="type" class="col-sm-2 col-form-label"><strong><span style="color: black;">Type :</span></strong></label>
            <div class="col-sm-10">
                <input type="text" id="type" name="type" value="${proprieteJsp.type}" class="form-control">
            </div>
        </div>
        <div class="row mb-3">
            <label for="superficie" class="col-sm-2 col-form-label"><strong><span style="color: black;">Superficie :</span></strong></label>
            <div class="col-sm-10">
                <input type="text" id="superficie" name="superficie" value="${proprieteJsp.superficie}" class="form-control">
            </div>
        </div>
        <div class="row mb-3">
            <label for="prix" class="col-sm-2 col-form-label"><strong><span style="color: black;">Prix :</span></strong></label>
            <div class="col-sm-10">
                <input type="text" id="prix" name="prix" value="${proprieteJsp.prix}" class="form-control">
            </div>
        </div>
        <div class="row mb-3">
            <label for="disponible" class="col-sm-2 col-form-label"><strong><span style="color: black;">Disponible :</span></strong></label>
            <div class="col-sm-10">
                <input type="text" id="disponible" name="disponible" value="${proprieteJsp.disponible}" class="form-control">
            </div>
        </div>
        <div class="row">
            <div class="col-sm-10 offset-sm-2">
                <input type="submit" value="Update" class="btn btn-primary">
            </div>
        </div>
    </form>
</main>
<footer>
    <a href="productsList">Products List</a>
</footer>
<script src="webjars/bootstrap/5.2.0/js/bootstrap.bundle.min.js"></script>
</body>
</html>
