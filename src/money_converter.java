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
    public static double yuan;

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
        euro = balance * 0.949256;
        System.out.println("You current balance in euro's is: " + euro);
    }

    public void convertToMexicanPeso(){
        euro = balance * 0.949256;
        System.out.println("You current balance in euro's is: " + euro);
    }

    public void convertToColumbianPeso(){
        euro = balance * 0.949256;
        System.out.println("You current balance in euro's is: " + euro);
    }

    public void convertToIndianRupee(){
        euro = balance * 0.949256;
        System.out.println("You current balance in euro's is: " + euro);
    }

    public void convertToYen(){
        euro = balance * 0.949256;
        System.out.println("You current balance in euro's is: " + euro);
    }

    public void convertToChineseYuan(){
        euro = balance * 0.949256;
        System.out.println("You current balance in euro's is: " + euro);
    }

}
