<%--
  Created by IntelliJ IDEA.
  User: alejandro
  Date: 4/27/22
  Time: 1:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Pizza Order</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://kit.fontawesome.com/c4e3a293bc.js" crossorigin="anonymous"></script>
</head>


<body>
<!--NAVBAR-->
<nav class="navbar navbar-expand-lg navbar-light bg-light container-fluid border-top ">
    <!--    <div class="container-fluid">-->
    <a class="navbar-brand" href="#"></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav me-4 mb-2 mb-lg-0">
            <li class="nav-item">
                <a class="nav-link active " aria-current="page" href="#">Order Online</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Menu</a>
            </li>
            <li>
                <form class="d-flex">
                    <input class="form-control me-2" type="search" placeholder="Zip code" aria-label="Search">
                    <button class="btn btn-outline-secondary text-nowrap" type="submit">Search stores near you!
                    </button>
                </form>
            </li>
        </ul>
        <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
            <li class="nav-item text-nowrap">
                <a class="nav-link text-secondary" id="sign-up" href="#"><i class="fas fa-user"></i> Sign up</a>
            </li>
        </ul>
    </div>
    <!--    </div>-->
</nav>

<!--CONTAINER FOR PIZZA IMG-->
<div class="container-fluid px-0">
<%--    <div class="container px-0 py-5 my-4 bg-light text-center" style="background-image: url('images/pizza.png')">--%>
        <h1 class="display-3 bg-light opacity-75 text-center">Welcome to Pizza World!</h1>
    </div>
    <h3 class="mx-4">Build your own pizza!</h3>


    <!--CARDS-->
<form method="POST">
    <div class="card mx-4">
        <div class="card-body mx-0 bg-primary text-white">
            Choose size, crust, and toppings
        </div>
        <div class="card mx-3 my-3">
            <div class="card-header py-3">
                Size
            </div>
            <ul class="list-group list-group-flush">
<%--                <li class="list-group-item py-3">Garlic seasoned crust with a rich, buttery taste.--%>
<%--                </li>--%>
                <li class="list-group-item py-3">
                    <input class="form-check-input" type="radio" name="pizza-size" id="small" value="Small" checked>
                    <label class="form-check-label" for="small">Small (10")</label>
                </li>

                <li class="list-group-item py-3">
                    <input class="form-check-input" type="radio" name="pizza-size" id="medium"
                           value="Medium"
                           checked>
                    <label class="form-check-label" for="medium">Medium (12")</label>
                </li>

                <li class="list-group-item py-3">
                    <input class="form-check-input" type="radio" name="pizza-size" id="large"
                           value="Large"
                           checked>
                    <label class="form-check-label" for="large">Medium (14")</label>
                </li>
            </ul>
        </div>



        <div class="card mx-3 my-3">
            <div class="card-header py-3">
                Crust
            </div>
            <ul class="list-group list-group-flush">
<%--                <li class="list-group-item py-3">Thin enough for optimum crispy to crunchy ration.--%>
<%--                </li>--%>
                <li class="list-group-item py-3">
                    <input class="form-check-input" type="radio" name="pizza-crust" id="hand-tossed"
                           value="Hand Tossed" checked>
                    <label class="form-check-label" for="hand-tossed">Hand Tossed</label>
                </li>
                <li class="list-group-item py-3">
                    <input class="form-check-input" type="radio" name="pizza-crust" id="crispy-thin"
                           value="Crispy Thin"
                           checked>
                    <label class="form-check-label" for="crispy-thin">Crispy</label>
                </li>
            </ul>
        </div>



        <div class="card mx-3 my-3">
            <div class="card-header py-3">
                Sauces
            </div>
            <ul class="list-group list-group-flush">
                <%--                <li class="list-group-item py-3">Thin enough for optimum crispy to crunchy ration.--%>
                <%--                </li>--%>
                <li class="list-group-item py-3">
                    <input class="form-check-input" type="radio" name="pizza-sauce" id="tomato"
                           value="Robust Inspired Tomato Sauce" checked>
                    <label class="form-check-label" for="tomato">Robust Inspired Tomato Sauce</label>
                </li>
                <li class="list-group-item py-3">
                    <input class="form-check-input" type="radio" name="pizza-sauce" id="garlic"
                           value="Garlic Parmesan Sauce"
                           checked>
                    <label class="form-check-label" for="garlic">Garlic Parmesan Sauce</label>
                </li>
            </ul>
        </div>




        <div class="card mx-3 my-3">
            <div class="card-header py-3">
                Toppings
            </div>
            <ul class="list-group list-group-flush">
                <%--                <li class="list-group-item py-3">Thin enough for optimum crispy to crunchy ration.--%>
                <%--                </li>--%>
                <li class="list-group-item py-3">
                    <input class="form-check-input" type="checkbox" name="pizza-toppings" id="provolone"
                           value="Shredded Provolone Sauce" checked>
                    <label class="form-check-label" for="provolone">Shredded Provolone Sauce</label>
                </li>
                <li class="list-group-item py-3">
                    <input class="form-check-input" type="checkbox" name="pizza-toppings" id="ham"
                           value="Ham"
                           checked>
                    <label class="form-check-label" for="ham">Ham</label>
                </li>

                <li class="list-group-item py-3">
                    <input class="form-check-input" type="checkbox" name="pizza-toppings" id="pepperoni"
                           value="Pepperoni"
                           checked>
                    <label class="form-check-label" for="pepperoni">Pepperoni</label>
                </li>

            </ul>
        </div>



        <div class="card mx-3 my-3">
            <div class="card-header py-3 bg-primary text-white">
                Delivery Address
            </div>
            <div class="input-group">
                <textarea name="address" class="form-control" aria-label="With textarea"></textarea>
            </div>
        </div>





        <div class="card-body mx-0 py-3 bg-light text-black text-end">
            <button type="submit" class="btn btn-primary">
                Submit Pizza
            </button>
        </div>
    </div>
</div>
</form>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>
