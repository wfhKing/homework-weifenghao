package com.nf.servlet;

import com.google.gson.Gson;
import com.nf.dao.PhoneDao;
import com.nf.dao.PhoneInMemoryDao;
import com.nf.entity.Phone;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "PhoneByNameServlet",urlPatterns = {"/phone/PhoneByNameServlet"})
public class PhoneByNameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json;charset=utf-8");
        response.setCharacterEncoding("utf-8");

        String name = request.getParameter("name");
        PhoneDao dao = new PhoneInMemoryDao();
        List<Phone> phoneList = dao.getPhoneByName(name);

        PrintWriter writer = response.getWriter();

        Gson gson = new Gson();
        String result = gson.toJson(phoneList);
        writer.write(result);

        writer.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
