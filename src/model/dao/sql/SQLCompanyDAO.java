package model.dao.sql;

import model.dao.CompanyDAO;
import model.entity.Company;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class SQLCompanyDAO implements CompanyDAO {

    @Override
    public void addCompany(Company company) {
        String query = "INSERT INTO Student(id, login, full_name, birth_date) VALUES ('" +
                company.getCompany_id () + "', '" +
                company.getName() + "', '" +
                company.getCategory() + "', '" +
                company.getInitial_value() +
                "');";

        SQLConnector.getInstance().insertQuery(query);
    }

    @Override
    public List<Company> getAllCompanies() {
        List<Company> companies = new LinkedList<>();
        String query = "SELECT id, login, full_name, birth_date FROM Student;";
        ResultSet result = SQLConnector.getInstance().selectQuery(query);

        try {
            while (result.next()) {
                int userId = result.getInt("id");
                String name = result.getString("login");
                String email = result.getString("full_name");
                String password = result.getString("birth_date");

                companies.add(new Company(userId, name, email, 0, 0));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return companies;
    }


    @Override
    public void deleteCompany (String code) {
        String query = "DELETE FROM Company WHERE code = '" + code + "';";
        SQLConnector.getInstance().deleteQuery(query);
    }
}