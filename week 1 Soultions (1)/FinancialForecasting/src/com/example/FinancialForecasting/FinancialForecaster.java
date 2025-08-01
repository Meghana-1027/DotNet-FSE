package com.example.FinancialForecasting;


public class FinancialForecaster {


 public static double futureValue(double presentValue, double rate, int years) {
     if (years == 0)
         return presentValue;
     return (1 + rate) * futureValue(presentValue, rate, years - 1);
 }

 public static void main(String[] args) {
     double pv = 10000;        
     double rate = 0.08;       
     int years = 5;            

     double fv = futureValue(pv, rate, years);
     System.out.printf("Future value after %d years: ₹%.2f\n", years, fv);
 }
}
