
public class TeaPriceCalculator {

    public static void main(String[] args) {

        Tea smallRed = new Tea("红茶", "小杯");
        Tea mediumRed = new Tea("红茶", "中杯");
        Tea largeRed = new Tea("红茶", "大杯");

        Tea smallGreen = new Tea("绿茶", "小杯");
        Tea mediumGreen = new Tea("绿茶", "中杯");
        Tea largeGreen = new Tea("绿茶", "大杯");

        System.out.println("小杯红茶：" + smallRed.calculatePrice());
        System.out.println("中杯红茶：" + mediumRed.calculatePrice());
        System.out.println("大杯红茶：" + largeRed.calculatePrice());

        System.out.println("小杯绿茶：" + smallGreen.calculatePrice());
        System.out.println("中杯绿茶：" + mediumGreen.calculatePrice());
        System.out.println("大杯绿茶：" + largeGreen.calculatePrice());
    }
}

class Tea {

    private String type;
    private String size;

    public Tea(String type, String size) {
        this.type = type;
        this.size = size;
    }

    public double calculatePrice() {

        // 根据茶的种类确定基础价格
        double basePrice = "红茶".equals(type) ? 5.0 : 6.0;

        // 根据杯型确定价格系数
        double sizeCoefficient;

        switch (size) {
            case "小杯":
                sizeCoefficient = 1.0;
                break;

            case "中杯":
                sizeCoefficient = 1.5;
                break;

            case "大杯":
                sizeCoefficient = 2.0;
                break;

            default:
                sizeCoefficient = 0.0;
        }

        return basePrice * sizeCoefficient;
    }
}
