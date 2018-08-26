package com.nf.servlet;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "PhoneUpdateServlet",urlPatterns = {"/phone/PhoneUpdateServlet"})
public class PhoneUpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String memory = request.getParameter("memory");
        String press = request.getParameter("press");
        String cpu = request.getParameter("cpu");

        PhoneDao dao = new PhoneInMemoryDao();
        dao.update(new Phone(id,name,price,memory,press,cpu));
        //request.getRequestDispatcher("/phone/PhoneListServlet").forward(request,response);
        response.sendRedirect("/phone/PhoneListServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("application/json;charset=utf-8");

        int id = Integer.parseInt(request.getParameter("id"));
        PhoneDao dao = new PhoneInMemoryDao();
        Phone phone=dao.getPhoneById(id);
        List<Phone> list=new ArrayList<>();
        list.add(phone);

        PrintWriter writer=response.getWriter();
        Gson gson=new Gson();
        String result=gson.toJson(list);
        writer.write(result);
        writer.close();
    }
}
