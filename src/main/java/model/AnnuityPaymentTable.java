package model;

import java.util.List;

public class AnnuityPaymentTable {
    private final List<AnnuityPaymentString> table;
    private final double AMOUNT;
    private final double RATE;
    private final double TEMP;

    public AnnuityPaymentTable(List<AnnuityPaymentString> table, double AMOUNT, double RATE, double TEMP) {
        this.table = table;
        this.AMOUNT = AMOUNT;
        this.RATE = RATE;
        this.TEMP = TEMP;
    }

    @Override
    public String toString() {
        String table = "Сумма кредита: " + AMOUNT +
        "\nСтавка: " + RATE + '%' +
        "\nСрок: " + TEMP + " месяцев" +
        "\nМесяц | Ежемесяцный платеж | Основной долг | Долг по проценнтам | Остаток основного долга\n";
        for(AnnuityPaymentString string: this.table){
            table = table.concat(string.toString().concat("\n"));
        }
        return table;
    }
}
