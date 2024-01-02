<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Banque Service Interface</title>
    <!-- Include Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <style>
        body {
            background-color: #f8f9fa;
        }
        .container {
            max-width: 600px;
            margin-top: 50px;
        }
        .card {
            border: none;
            border-radius: 15px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
            background-color: #ffffff;
        }
        .card-header {
            border-bottom: none;
            text-align: center;
            background-color: #007bff;
            color: #ffffff;
            border-top-left-radius: 15px;
            border-top-right-radius: 15px;
            padding: 20px;
        }
        .card-body {
            padding: 40px;
        }
        .form-group {
            margin-bottom: 20px;
        }
        label {
            color: #007bff;
            font-weight: bold;
        }
        .btn-primary {
            background-color: #007bff;
            border-color: #007bff;
            border-radius: 8px;
            padding: 10px 20px;
        }
        .btn-primary:hover {
            background-color: #0056b3;
            border-color: #0056b3;
        }
        .logout-link {
            color: black;
            text-decoration: none;
            font-weight: bold;
            float: right;
        }
        .logout-link:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="#">Banque Service</a>
    <a href="login" class="logout-link">Logout</a>
</nav>

<div class="container mt-4">
    <div class="card">
        <div class="card-header">
            <h2 class="card-title mb-0">Banque Service Interface</h2>
        </div>
        <div class="card-body">
            <form action='banqueServlet' method='post'>
                <div class="form-group">
                    <label for='amount'>Amount:</label>
                    <input type='text' name='amount' class="form-control" required>
                </div>
                <div class="form-group">
                    <label for='operation'>Operation:</label>
                    <select name="operation" class="form-control">
                        <option value="conversion">Conversion</option>
                        <option value="retirer">Retirer</option>
                        <option value="verser">Verser</option>
                        <option value="getCurrentSolde">Get Current Solde</option>
                    </select>
                </div>
                <button type='submit' class="btn btn-primary btn-block">Submit</button>
            </form>
        </div>
    </div>
</div>

<!-- Include Bootstrap JS and jQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>