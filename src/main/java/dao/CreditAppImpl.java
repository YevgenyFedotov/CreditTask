package dao;

import model.CreditApp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreditAppImpl implements CreditAppDao, ConnectToDatabase {
    @Override
    public CreditApp getById(int id) {
        CreditApp creditApp = new CreditApp();
        String query = "select * from credit_task.application where id = " + id;
        Connection connection = ConnectToDatabase.getConnection();
        try (Statement statement = connection.createStatement()){
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                creditApp.setId(resultSet.getInt("id"));
                creditApp.setAmount(resultSet.getDouble("amount"));
                creditApp.setStatus(resultSet.getString("status"));
                creditApp.setTemp(resultSet.getInt("temp"));
                creditApp.setDate_created(resultSet.getDate("date_created"));
                creditApp.setCreditId(resultSet.getInt("credit_id"));
                creditApp.setClientId(resultSet.getInt("client_id"));
            }
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return creditApp;
    }
}
