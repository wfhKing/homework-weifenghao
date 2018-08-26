package com.nf.servlet;

import com.nf.dao.PhoneDao;
import com.nf.dao.PhoneInMemoryDao;
import com.nf.entity.Phone;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PhoneAddServlet",urlPatterns = {"/phone/PhoneAddServlet"})
public class PhoneAddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String memory = request.getParameter("memory");
        String press = request.getParameter("press");
        String cpu = request.getParameter("cpu");

        PhoneDao dao = new PhoneInMemoryDao();
        Phone phone = dao.add(new Phone(id, name, price, memory, press, cpu));

        request.getRequestDispatcher("/phone/PhoneListServlet").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/jsp/phone_add.jsp").forward(request,response);
    }
}
