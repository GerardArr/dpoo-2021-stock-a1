package model.dao;

import model.entity.Company;

import java.util.List;

public interface CompanyDAO {
    /**
     * Method that saves a specific course, persisting it.
     *
     * @param company The new company to save.
     */
    void addCompany(Company company);

    /**
     * Method that reads the persisted information, returning all stored companies.
     *
     * @return A list containing all persisted companies.
     */
    List<Company> getAllCompanies();

    /**
     * Method that deletes a persisted action, by its code.
     *
     * @param code A string representation of the persisted actions's code.
     */
    void deleteCompany(String code);
}
