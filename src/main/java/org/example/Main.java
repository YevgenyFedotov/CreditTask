package org.example;

import Scripts.AnnuityPayments;
import Service.CreditAppService;
import Service.CreditService;
import model.Credit;
import model.CreditApp;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditApp creditApp = CreditAppService.getById(2);
        System.out.println(AnnuityPayments.getPaymentSchedule(creditApp));
    }
}