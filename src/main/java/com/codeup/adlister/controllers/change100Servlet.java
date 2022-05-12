package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/change100")
public class change100Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        long id = Long.parseLong(req.getParameter("change100"));
//        long id2 = Long.parseLong(req.getParameter("add10"));

//        Ad adPriceInCents = DaoFactory.getAdsDao().findAdById(id2);
//
//
        DaoFactory.getAdsDao().add100(100, id);

//        DaoFactory.getAdsDao().add100(adPriceInCents.getPriceInCents() + 10, id2);

        resp.sendRedirect("/ads");




    }
}
