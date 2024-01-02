<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Banque Service Result</title>
    <!-- Include Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <% if (request.getAttribute("message") != null) { %>
        <script>
            alert('<%= request.getAttribute("message") %>');
            window.location.href = '/Front_SOAP/banqueServlet';
        </script>
    <% } else { %>
        <script>
            alert('Operation effectuée avec succès');
        </script>
    <% } %>

    <nav class="navbar navbar-dark bg-primary">
        <a class="navbar-brand" href="#">Banque Service</a>
        <div class="navbar-nav">
            <a class="nav-item nav-link" href="${pageContext.request.contextPath}/banqueServlet">Back</a>
        </div>
    </nav>

    <div class="container mt-4">
        <div class="card">
            <div class="card-header bg-primary text-white">
                <h2 class="card-title">Result</h2>
            </div>
            <div class="card-body">
                <p class="card-text">Result: ${result}</p>
            </div>
        </div>
    </div>

    <!-- Include Bootstrap JS and jQuery -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>