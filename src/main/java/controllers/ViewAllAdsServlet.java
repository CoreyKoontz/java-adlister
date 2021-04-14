package controllers;

import dao.DaoFactory;
import models.Ad;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ads")
public class ViewAllAdsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        dao.Ads adsDao = DaoFactory.getAdsDao();
        List<models.Ad> ads = adsDao.all();

        req.setAttribute("ads", ads);
        req.getRequestDispatcher("/WEB-INF/ads/index.jsp").forward(req, resp);

    }
}
