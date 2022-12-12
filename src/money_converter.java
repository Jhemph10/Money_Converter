import java.util.Scanner;

public class money_converter {

    public static double balance = 0.0;
    public static double depositAmount = 0.0;
    public static double withdrawalAmount = 0.0;
    public static double euro = 0.0;
    public static double poundEnglish = 0.0;
    public static double pesoMexican = 0.0;
    public static double pesoColumbian = 0.0;
    public static double rupeeIndian = 0.0;
    public static double yen = 0.0;
    public static double yuanChinese = 0.0;

    public static double getBalance() {
        return balance;
    }

    public static void setBalance(double balance) {
        money_converter.balance = balance;
    }

    public static double getDepositAmount() {
        return depositAmount;
    }

    public static void setDepositAmount(double depositAmount) {
        money_converter.depositAmount = depositAmount;
    }

    public static double getWithdrawalAmount() {
        return withdrawalAmount;
    }

    public static void setWithdrawalAmount(double withdrawalAmount) {
        money_converter.withdrawalAmount = withdrawalAmount;
    }

    public static double getEuro() {
        return euro;
    }

    public static void setEuro(double euro) {
        money_converter.euro = euro;
    }

    public static double getPoundEnglish() {
        return poundEnglish;
    }

    public static void setPoundEnglish(double poundEnglish) {
        money_converter.poundEnglish = poundEnglish;
    }

    public static double getPesoMexican() {
        return pesoMexican;
    }

    public static void setPesoMexican(double pesoMexican) {
        money_converter.pesoMexican = pesoMexican;
    }

    public static double getPesoColumbian() {
        return pesoColumbian;
    }

    public static void setPesoColumbian(double pesoColumbian) {
        money_converter.pesoColumbian = pesoColumbian;
    }

    public static double getRupeeIndian() {
        return rupeeIndian;
    }

    public static void setRupeeIndian(double rupeeIndian) {
        money_converter.rupeeIndian = rupeeIndian;
    }

    public static double getYen() {
        return yen;
    }

    public static void setYen(double yen) {
        money_converter.yen = yen;
    }

    public static double getYuanChinese() {
        return yuanChinese;
    }

    public static void setYuanChinese(double yuanChinese) {
        money_converter.yuanChinese = yuanChinese;
    }

    public static void depositMoneyInBank(){
        System.out.println("How much money would you like to deposit?: ");
        Scanner scanner = new Scanner(System.in);
        depositAmount = scanner.nextDouble();
        balance += depositAmount;
        System.out.println("You have deposit " +depositAmount +" to your account." + "\n" +
                "Balance is now: " +  balance);
    }

    public static void withdrawalMoneyFromBank(){
        System.out.println("How much money would you like to deposit?: ");
        Scanner scanner = new Scanner(System.in);
        withdrawalAmount = scanner.nextDouble();
        if(balance < withdrawalAmount) {
            System.out.println("You don't have enough funds.");
        } else {
            balance -= withdrawalAmount;
            System.out.println("You have withdrawal " +withdrawalAmount + " from your account." + "\n" +
                    "Balance is now: " + balance);
        }
    }

    public static void convertToEuro(){
        euro = balance * 0.949256;
        System.out.println("You current balance in euro's is: " + euro);
    }

    public static void convertToPound(){
        poundEnglish = balance * 0.816714;
        System.out.println("You current balance in british pound's is: " + poundEnglish);
    }

    public static void convertToMexicanPeso(){
        pesoMexican = balance * 19.782146;
        System.out.println("You current balance in mexican peso's is: " + pesoMexican);
    }

    public static void convertToColumbianPeso(){
        pesoColumbian = balance * 4809.664105;
        System.out.println("You current balance in columbian peso's is: " + pesoColumbian);
    }

    public static void convertToIndianRupee(){
        rupeeIndian = balance * 82.446878;
        System.out.println("You current balance in indian rupee's is: " + rupeeIndian);
    }

    public static void convertToYen(){
        yen = balance * 136.782862;
        System.out.println("You current balance in yen is: " + yen);
    }

    public static void convertToChineseYuan(){
        yuanChinese = balance * 6.957579;
        System.out.println("You current balance in chinese yuan is: " + yuanChinese);
    }

}
