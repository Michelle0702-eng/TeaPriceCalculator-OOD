
public class TeaPriceCalculator {

    public static void main(String[] args) {

        // 创建杯型对象
        Size small = new SmallSize();
        Size medium = new MediumSize();
        Size large = new LargeSize();

        // 创建不同茶类和杯型的组合
        Tea smallRedTea = new RedTea(small);
        Tea mediumRedTea = new RedTea(medium);
        Tea largeRedTea = new RedTea(large);

        Tea smallGreenTea = new GreenTea(small);
        Tea mediumGreenTea = new GreenTea(medium);
        Tea largeGreenTea = new GreenTea(large);

        // 输出价格
        System.out.println("小杯红茶：" + smallRedTea.calculatePrice());
        System.out.println("中杯红茶：" + mediumRedTea.calculatePrice());
        System.out.println("大杯红茶：" + largeRedTea.calculatePrice());

        System.out.println("小杯绿茶：" + smallGreenTea.calculatePrice());
        System.out.println("中杯绿茶：" + mediumGreenTea.calculatePrice());
        System.out.println("大杯绿茶：" + largeGreenTea.calculatePrice());
    }
}

// 抽象父类：Tea
abstract class Tea {

    // 持有杯型接口对象
    protected Size size;

    // 通过构造方法注入杯型
    public Tea(Size size) {
        this.size = size;
    }

    // 抽象价格计算方法
    public abstract double calculatePrice();
}

// 红茶类
class RedTea extends Tea {

    private static final double BASE_PRICE = 5.0;

    public RedTea(Size size) {
        super(size);
    }

    @Override
    public double calculatePrice() {
        return BASE_PRICE * size.getCoefficient();
    }
}

// 绿茶类
class GreenTea extends Tea {

    private static final double BASE_PRICE = 6.0;

    public GreenTea(Size size) {
        super(size);
    }

    @Override
    public double calculatePrice() {
        return BASE_PRICE * size.getCoefficient();
    }
}

// 杯型接口
interface Size {

    double getCoefficient();
}

// 小杯
class SmallSize implements Size {

    @Override
    public double getCoefficient() {
        return 1.0;
    }
}

// 中杯
class MediumSize implements Size {

    @Override
    public double getCoefficient() {
        return 1.5;
    }
}

// 大杯
class LargeSize implements Size {

    @Override
    public double getCoefficient() {
        return 2.0;
    }
}
