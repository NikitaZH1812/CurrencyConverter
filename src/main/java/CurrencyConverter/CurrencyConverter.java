package CurrencyConverter;

public class CurrencyConverter {

    private double commission;
    private double exchange_rate;

    public CurrencyConverter (double commission, double exchange_rate){

        this.commission = commission;
        this.exchange_rate = exchange_rate;
    }

    private double convertUsdToUah(double usd_amount){
        return usd_amount * exchange_rate;
    }

    private double calculateCommission(double uah_amount){
        return uah_amount * commission;
    }

    public double calculateTotalAmount (double usd_amount){
        double uah_amount = convertUsdToUah(usd_amount);
        double commission_amount = calculateCommission(uah_amount);

        return uah_amount - commission_amount;
    }
}
