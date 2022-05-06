package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/ads/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO: show the registration form
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/profile");
            return;
        }

        request.getRequestDispatcher("/WEB-INF/ads/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    String username = request.getParameter("username"); // for now we'll hardcode the user id
    String email = request.getParameter("email");
    String password = request.getParameter("password");
//    boolean alreadyExists = false;

//
//    try {
//        if (DaoFactory.getUsersDao().findByUsername(username).getUsername() == null) {
//            alreadyExists = true;
//        }
//    } catch (Exception e) {
//        System.out.println("you suck" + e);
//    } finally {
//        if (username.length() > 4 && email.contains("@") && email.contains(".") && email.length() > 7 && password.length() > 8 && alreadyExists) {
//            User user = new User(username, email, password);
//            DaoFactory.getUsersDao().insert(user);
//            User currentUser = DaoFactory.getUsersDao().findByUsername(user.getUsername());
//            request.getSession().setAttribute("user", currentUser);
//            response.sendRedirect("/profile");
//        } else {
//            response.sendRedirect("/ads/register");
//        }
//
//    }


        if (DaoFactory.getUsersDao().findByUsername(username) == null) {

            if (username.length() > 4 && email.contains("@") && email.contains(".") && email.length() > 7 && password.length() > 8) {
                User user = new User(username, email, password);
                DaoFactory.getUsersDao().insert(user);

                        User currentUser = DaoFactory.getUsersDao().findByUsername(user.getUsername());
                        request.getSession().setAttribute("user", currentUser);

                response.sendRedirect("/profile");
            } else {
                response.sendRedirect("/ads/register");
            }
        } else {
            response.sendRedirect("/ads/register");
        }






    }
        // TODO: ensure the submitted information is valid
        // TODO: create a new user based off of the submitted information
        // TODO: if a user was successfully created, send them to their profile
    }


