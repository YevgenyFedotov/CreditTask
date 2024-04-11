package model;

import java.util.Date;

public class CreditApp {
    private int id;
    private double amount;
    private Date date_created;
    private String status;
    private int temp;
    private int clientId;
    private int creditId;

    public CreditApp() {
    }

    public CreditApp(int id, double amount, Date date_created, String status, int temp, int clientId, int creditId) {
        this.id = id;
        this.amount = amount;
        this.date_created = date_created;
        this.status = status;
        this.temp = temp;
        this.clientId = clientId;
        this.creditId = creditId;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getCreditId() {
        return creditId;
    }

    public void setCreditId(int creditId) {
        this.creditId = creditId;
    }

    @Override
    public String toString() {
        return "CreditApp{" +
                "id=" + id +
                ", amount=" + amount +
                ", date_created=" + date_created +
                ", status='" + status + '\'' +
                ", temp=" + temp +
                ", clientId=" + clientId +
                ", creditId=" + creditId +
                '}';
    }
}
