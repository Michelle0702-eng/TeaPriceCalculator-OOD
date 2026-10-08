
public class TeaPriceCalculator {

    public static void main(String[] args) {

        // 创建六种不同的奶茶对象
        Tea smallRed = new SmallRedTea();
        Tea mediumRed = new MediumRedTea();
        Tea largeRed = new LargeRedTea();

        Tea smallGreen = new SmallGreenTea();
        Tea mediumGreen = new MediumGreenTea();
        Tea largeGreen = new LargeGreenTea();

        // 通过父类引用调用子类的价格计算方法
        System.out.println("小杯红茶：" + smallRed.calculatePrice());
        System.out.println("中杯红茶：" + mediumRed.calculatePrice());
        System.out.println("大杯红茶：" + largeRed.calculatePrice());

        System.out.println("小杯绿茶：" + smallGreen.calculatePrice());
        System.out.println("中杯绿茶：" + mediumGreen.calculatePrice());
        System.out.println("大杯绿茶：" + largeGreen.calculatePrice());
    }
}

// 抽象父类：定义所有奶茶共同的计算价格行为
abstract class Tea {

    public abstract double calculatePrice();
}

// 小杯红茶
class SmallRedTea extends Tea {

    @Override
    public double calculatePrice() {
        return 5.0 * 1.0;
    }
}

// 中杯红茶
class MediumRedTea extends Tea {

    @Override
    public double calculatePrice() {
        return 5.0 * 1.5;
    }
}

// 大杯红茶
class LargeRedTea extends Tea {

    @Override
    public double calculatePrice() {
        return 5.0 * 2.0;
    }
}

// 小杯绿茶
class SmallGreenTea extends Tea {

    @Override
    public double calculatePrice() {
        return 6.0 * 1.0;
    }
}

// 中杯绿茶
class MediumGreenTea extends Tea {

    @Override
    public double calculatePrice() {
        return 6.0 * 1.5;
    }
}

// 大杯绿茶
class LargeGreenTea extends Tea {

    @Override
    public double calculatePrice() {
        return 6.0 * 2.0;
    }
}
