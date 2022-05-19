package BusinessDiscountRate;

public class DiscountRate {
    static double serviceDiscountPremium = 0.2;
    static double serviceDiscountGold = 0.15;
    static double serviceDiscountSilver = 0.1;
    static double productDiscountPremium = 0.1;
    static double productDiscountGold = 0.1;
    static double productDiscountSilver = 0.1;

    public static  double getServiceDiscountRate(String memberType){
        if(memberType==null){
            return  0;
        }

        switch (memberType){
            case "PREMIUM":
                    return serviceDiscountPremium;
            case "GOLD":
                return serviceDiscountGold;
            case "SILVER":
                return serviceDiscountSilver;
            default: return 0;
        }
    }
    public static  double getProductDiscountRate(String memberType){
        switch (memberType){
            case "PREMIUM":
                return productDiscountPremium;
            case "GOLD":
                return productDiscountGold;
            case "SILVER":
                return productDiscountSilver;
            default: return 0;
        }
    }
}
