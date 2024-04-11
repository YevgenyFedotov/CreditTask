package Scripts;

import Service.CreditService;
import model.Credit;
import model.CreditApp;

import javax.swing.text.Style;
import java.text.DecimalFormat;

public class AnnuityPayments {
    public static void getPaymentSchedule(CreditApp creditApp){
        DecimalFormat format = new DecimalFormat(".##");
        Credit credit = CreditService.getById(creditApp.getCreditId());
        double amount = creditApp.getAmount();
        double monthRate = credit.getRate() / 12 / 100;
        double monthPayment = (amount * monthRate)
                /(1 - Math.pow(1 + monthRate, -creditApp.getTemp()));
        System.out.println("Сумма кредита: " + creditApp.getAmount());
        System.out.println("Ставка: " + credit.getRate() + '%');
        System.out.println("Срок: " + creditApp.getTemp() + " месяцев");
        System.out.println("Месяц | Ежемесяцный платеж | Основной долг | Долг по проценнтам | Остаток основного долга");
        for (int i = 0 ; i < creditApp.getTemp() ; i++){
            double duty = amount * monthRate;
            double mainPayment = monthPayment - duty;
            amount = amount - mainPayment;
            if (amount < 0) amount = 0;
            System.out.println(i + 1 + " | " + format.format(monthPayment) + " | " + format.format(mainPayment)
                    + " | " + format.format(duty) + " | " + format.format(amount));
        }
    }
}
