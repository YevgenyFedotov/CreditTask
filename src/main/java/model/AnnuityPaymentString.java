package model;

import java.text.DecimalFormat;

public class AnnuityPaymentString {
    private int month;
    private double monthPayment;
    private double mainPayment;
    private double duty;
    private double amount;

    public AnnuityPaymentString() {
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public double getMonthPayment() {
        return monthPayment;
    }

    public void setMonthPayment(double monthPayment) {
        this.monthPayment = monthPayment;
    }

    public double getMainPayment() {
        return mainPayment;
    }

    public void setMainPayment(double mainPayment) {
        this.mainPayment = mainPayment;
    }

    public double getDuty() {
        return duty;
    }

    public void setDuty(double duty) {
        this.duty = duty;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat(".##");
        return month + " | " + format.format(monthPayment) + " | " + format.format(mainPayment)
                + " | " + format.format(duty) + " | " + format.format(amount);
    }
}
