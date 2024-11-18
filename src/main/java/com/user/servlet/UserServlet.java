package com.user.servlet;

import com.user.dao.UserDAO;
import com.user.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user")
public class UserServlet extends HttpServlet {

    private UserDAO userDAO;

    @Override
    public void init() {
        userDAO = new UserDAO();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get data from the form
        String description = request.getParameter("description");
        double amount = Double.parseDouble(request.getParameter("amount"));
        String type = request.getParameter("type");

        // Create a User object (representing the transaction)
        User user = new User(description, amount, type);

        // Insert transaction data into the database
        boolean isInserted = userDAO.insertTransaction(user);

        if (isInserted) {
            // Redirect or forward to a success page
            response.sendRedirect("success.jsp");
        } else {
            // Redirect or forward to an error page
            response.sendRedirect("error.jsp");
        }
    }
}
