<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Propriete Creation</title>
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/5.2.0/css/bootstrap.min.css">
    <style>
        /* Couleurs personnalisées */
        .navbar-custom {
            background-color: #f8f9fa;
        }

        .form-label {
            font-weight: bold;
        }
    </style>
</head>
<body>
<header>
    <nav class="navbar navbar-expand-lg navbar-light bg-light navbar-custom">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Propriete Creation</a>
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
    <form action="savePropriete" method="post">
        <div class="row mb-3">
            <label for="adresse" class="col-sm-2 col-form-label form-label">Adresse :</label>
            <div class="col-sm-10">
                <input type="text" id="adresse" name="adresse" class="form-control">
            </div>
        </div>
        <div class="row mb-3">
            <label for="type" class="col-sm-2 col-form-label form-label">Type :</label>
            <div class="col-sm-10">
                <input type="text" id="type" name="type" class="form-control">
            </div>
        </div>
        <div class="row mb-3">
            <label for="superficie" class="col-sm-2 col-form-label form-label">Superficie :</label>
            <div class="col-sm-10">
                <input type="text" id="superficie" name="superficie" class="form-control">
            </div>
        </div>
        <div class="row mb-3">
            <label for="prix" class="col-sm-2 col-form-label form-label">Prix :</label>
            <div class="col-sm-10">
                <input type="double" id="prix" name="prix" class="form-control">
            </div>
        </div>
        <div class="row mb-3">
            <label for="disponible" class="col-sm-2 col-form-label form-label">Disponible :</label>
            <div class="col-sm-10">
                <input type="text" id="disponible" name="disponible" class="form-control">
            </div>
        </div>
        <div class="row">
            <div class="col-sm-10 offset-sm-2">
                <input type="submit" value="Save" class="btn btn-primary">
            </div>
        </div>
    </form>
</main>
<script src="webjars/bootstrap/5.2.0/js/bootstrap.bundle.min.js"></script>
</body>
</html>
