package com.nf.servlet;

import com.nf.dao.PhoneDao;
import com.nf.dao.PhoneInMemoryDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PhoneDeleteServlet",urlPatterns = {"/phone/PhoneDeleteServlet"})
public class PhoneDeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] ids = request.getParameterValues("ckb");
        PhoneDao dao = new PhoneInMemoryDao();
        for (String id : ids) {
            dao.delete(Integer.parseInt(id));
        }
        response.sendRedirect("/phone/PhoneListServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        PhoneDao dao = new PhoneInMemoryDao();
        dao.delete(id);
        response.sendRedirect("/phone/PhoneListServlet");
    }
}
