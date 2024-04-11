package Scripts;

import Service.CreditService;
import model.AnnuityPaymentString;
import model.AnnuityPaymentTable;
import model.Credit;
import model.CreditApp;

import java.util.ArrayList;
import java.util.List;

public class AnnuityPayments {
    public static AnnuityPaymentTable getPaymentSchedule(CreditApp creditApp){
        Credit credit = CreditService.getById(creditApp.getCreditId());
        List<AnnuityPaymentString> annuityTable = new ArrayList<>();
        double amount = creditApp.getAmount();
        double monthRate = credit.getRate() / 12 / 100;
        double monthPayment = (amount * monthRate)
                /(1 - Math.pow(1 + monthRate, -creditApp.getTemp()));
        for (int i = 0 ; i < creditApp.getTemp() ; i++){
            double duty = amount * monthRate;
            double mainPayment = monthPayment - duty;
            amount = amount - mainPayment;
            if (amount < 0) amount = 0;
            AnnuityPaymentString paymentString = new AnnuityPaymentString();
            paymentString.setMonth(i + 1);
            paymentString.setMonthPayment(monthPayment);
            paymentString.setMainPayment(mainPayment);
            paymentString.setDuty(duty);
            paymentString.setAmount(amount);
            annuityTable.add(paymentString);
        }
        return new AnnuityPaymentTable(annuityTable, creditApp.getAmount(), credit.getRate(), creditApp.getTemp());
    }
}
