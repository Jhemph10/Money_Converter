public class money_converter {

    public static double balance = 0.0;
    public static double depositAmount;
    public static double withdrawalAmount;
    public static double euro;
    public static double poundEnglish;
    public static double pesoMexican;
    public static double pesoColumbian;
    public static double rupeeIndian;
    public static double yen;
    public static double yuanChinese;

    public void depositMoney(double depositAmount){
        balance += depositAmount;
        System.out.println("You have deposit " +depositAmount +" to your account." + "\n" +
                "Balance is now: " +  balance);
    }

    public void withdrawal(double withdrawalAmount){
        if(balance < withdrawalAmount) {
            System.out.println("You don't have enough funds.");
        } else {
            balance -= withdrawalAmount;
            System.out.println("You have withdrawal " +withdrawalAmount + " from your account." + "\n" +
                    "Balance is now: " + balance);
        }
    }

    public void convertToEuro(){
        euro = balance * 0.949256;
        System.out.println("You current balance in euro's is: " + euro);
    }

    public void convertToPound(){
        poundEnglish = balance * 0.816714;
        System.out.println("You current balance in british pound's is: " + poundEnglish);
    }

    public void convertToMexicanPeso(){
        pesoMexican = balance * 19.782146;
        System.out.println("You current balance in mexican peso's is: " + pesoMexican);
    }

    public void convertToColumbianPeso(){
        pesoColumbian = balance * 4809.664105;
        System.out.println("You current balance in columbian peso's is: " + pesoColumbian);
    }

    public void convertToIndianRupee(){
        rupeeIndian = balance * 82.446878;
        System.out.println("You current balance in indian rupee's is: " + rupeeIndian);
    }

    public void convertToYen(){
        yen = balance * 136.782862;
        System.out.println("You current balance in yen is: " + yen);
    }

    public void convertToChineseYuan(){
        yuanChinese = balance * 6.957579;
        System.out.println("You current balance in chinese yuan is: " + yuanChinese);
    }

}
