<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }
        header {
            text-align: center;
        }
        header .navbar {
            width: 100%;
            margin: 0 auto;
            background-color: blue;
            position: fixed;
            top: 0;
            left: 0;
            z-index: 1000;
        }
        .navbar-nav {
            margin-left: 0;
        }
        .navbar-nav .nav-item {
            margin-right: 10px;
        }
        .navbar-brand span {
            font-family: "Raleway", sans-serif;
            font-weight: 400;
            color: white;
            font-size: 1em;
        }
        .navbar-nav .nav-link {
            font-family: "Raleway", sans-serif;
            font-weight: 400;
            color: #d2cccc;
        }
        .user-select {
            color: #fff;
        }
        .user-select select {
            background-color: #007BFF;
            color: #fff;
            border: 1px solid #fff;
            padding: 5px;
            border-radius: 5px;
        }
        .user-select select:focus {
            outline: none;
            border-color: #0056b3;
        }
        @media (max-width: 767.98px) {
            header {
                text-align: left;
            }
            header .navbar-brand {
                font-size: 30px;
                padding: 0px;
                margin-left: 0px;
            }
            .navbar-nav {
                text-align: left;
                margin-left: 0;
            }
            .user-select {
                margin-left: 0;
            }
        }
    </style>
</head>
<body>
    <header>
        <nav class="navbar navbar-expand-lg">
            <div class="container-fluid">
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav">
                        <li class="nav-item"><a class="nav-link" th:href="@{/usuario/home}">home</a></li>
                        <li class="nav-item"><a class="nav-link" th:href="@{/misreservas}">mis reservas</a></li>
                        <li class="nav-item"><a class="nav-link" th:href="@{/vehiculos}">vehiculo</a></li>
                        <li class="nav-item"><a class="nav-link" th:href="@{/reservas}">reservas</a></li>
                        <li class="nav-item"><a class="nav-link" th:href="@{/estacionamientos}">estacionamiento</a></li>
                    </ul>
                    <div class="user-select ml-auto">
                        <select>
                            <option value="usuario1">usuario1</option>
                            <option value="usuario2">usuario2</option>
                            <option value="usuario3">usuario3</option>
                        </select>
                    </div>
                </div>
            </div>
        </nav>
    </header>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>