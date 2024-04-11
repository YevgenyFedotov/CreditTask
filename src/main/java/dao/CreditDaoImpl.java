package dao;

import model.Credit;

import java.sql.*;

public class CreditDaoImpl implements CreditDao, ConnectToDatabase {

    @Override
    public Credit getById(int id) {
        Credit credit = new Credit();
        String query = "select * from credit_task.credit_product where id = " + id;
        Connection connection = ConnectToDatabase.getConnection();
        try (Statement statement = connection.createStatement()){
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                credit.setId(resultSet.getInt("id"));
                credit.setName(resultSet.getString("name"));
                credit.setRate(resultSet.getDouble("rate"));
            }
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return credit;
    }
}
