package front;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistrationDAOImpl implements RegistrationDAO {

    @Override
    public void saveRegistration(IELTSCandidate candidate) throws Exception {
        String sql = "INSERT INTO registrations (first_name, last_name, dob, passport, email, phone, test_type, test_date, test_city) "
                + "VALUES ()";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, candidate.getFirstName());
            stmt.setString(2, candidate.getLastName());
            stmt.setString(3, candidate.getDob());
            stmt.setString(4, candidate.getPassport());
            stmt.setString(5, candidate.getEmail());
            stmt.setString(6, candidate.getPhone());
            stmt.setString(7, candidate.getTestType());
            stmt.setString(8, candidate.getTestDate());
            stmt.setString(9, candidate.getTestCity());

            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new Exception("Error saving registration: " + e.getMessage(), e);
        }
    }
}

