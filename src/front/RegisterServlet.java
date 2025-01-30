package front;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String firstName = request.getParameter("first_name");
            String lastName = request.getParameter("last_name");
            String dob = request.getParameter("dob");
            String passport = request.getParameter("passport");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            String testType = request.getParameter("test_type");
            String testDate = request.getParameter("test_date");
            String testCity = request.getParameter("city");

            IELTSCandidate candidate = new IELTSCandidate(firstName, lastName, dob, passport, email, phone, testType, testDate, testCity);

            RegistrationDAO dao = new RegistrationDAOImpl();
            dao.saveRegistration(candidate);

            response.sendRedirect("registration_success.jsp");

        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("registration_error.jsp");
        }
    }
}

