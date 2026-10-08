
public class TeaPriceCalculator {

    public static void main(String[] args) {

        // 创建六种不同的茶类组合实例
        Tea smallRed = new SmallRedTea();
        Tea mediumRed = new MediumRedTea();
        Tea largeRed = new LargeRedTea();

        Tea smallGreen = new SmallGreenTea();
        Tea mediumGreen = new MediumGreenTea();
        Tea largeGreen = new LargeGreenTea();

        // 调用父类统一的价格计算方法
        System.out.println("小杯红茶：" + smallRed.getPrice());
        System.out.println("中杯红茶：" + mediumRed.getPrice());
        System.out.println("大杯红茶：" + largeRed.getPrice());

        System.out.println("小杯绿茶：" + smallGreen.getPrice());
        System.out.println("中杯绿茶：" + mediumGreen.getPrice());
        System.out.println("大杯绿茶：" + largeGreen.getPrice());
    }
}

// 第一层：茶的通用父类
class Tea {

    // 基础价格
    protected double basePrice;

    // 杯型价格系数
    protected double sizeCoefficient;

    // 统一的价格计算方法
    public double getPrice() {
        return basePrice * sizeCoefficient;
    }
}

// 第二层：红茶
class RedTea extends Tea {

    public RedTea() {
        this.basePrice = 5.0;
    }
}

// 第二层：绿茶
class GreenTea extends Tea {

    public GreenTea() {
        this.basePrice = 6.0;
    }
}

// 第三层：小杯红茶
class SmallRedTea extends RedTea {

    public SmallRedTea() {
        this.sizeCoefficient = 1.0;
    }
}

// 第三层：中杯红茶
class MediumRedTea extends RedTea {

    public MediumRedTea() {
        this.sizeCoefficient = 1.5;
    }
}

// 第三层：大杯红茶
class LargeRedTea extends RedTea {

    public LargeRedTea() {
        this.sizeCoefficient = 2.0;
    }
}

// 第三层：小杯绿茶
class SmallGreenTea extends GreenTea {

    public SmallGreenTea() {
        this.sizeCoefficient = 1.0;
    }
}

// 第三层：中杯绿茶
class MediumGreenTea extends GreenTea {

    public MediumGreenTea() {
        this.sizeCoefficient = 1.5;
    }
}

// 第三层：大杯绿茶
class LargeGreenTea extends GreenTea {

    public LargeGreenTea() {
        this.sizeCoefficient = 2.0;
    }
}
