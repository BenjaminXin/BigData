package com.lagou.phase01.module02.homework.exercise03;

/**
 *  测试类
 */
public class SimCardTest {

    public static void main(String[] args) {

        // 1. 多态格式，创建抽象套餐类类型的引用，指向通话套餐和上网流量套餐
        CardPackage callPackage = new CallPackage(100, 100, 18);
        CardPackage dataPackage = new DataPackage(5000, 20);

        // 2. 手机卡类 参数
        String type = SimCardType.Micro_SIM_CARD.getType();
        String number = "12345678910";      // 卡号
        String user = "Benjamin";        // 用户名
        String pwd = "123456lalala";         // 密码
        double balance = 50;     // 账户余额
        int callTime = ((CallPackage) callPackage).getCallTime();       // 通话时长（分钟）
        double netData = ((DataPackage) dataPackage).getNetData();   // 上网流量

        // 3. 手机卡类, 实例化对象
        SimCard sc = new SimCard(type, number, user, pwd, balance, callTime, netData);

        // 4. 手机卡类 方法调用
        System.out.println("手机卡类方法，显示 卡号、用户名、当前余额");
        sc.info();

        // 5. 通话套餐类、上网流量套餐 方法调用
        System.out.println("----------");
        System.out.println("通话套餐类 和 上网套餐类，通话服务方法 以及 上网服务方法");
        ((CallPackage) callPackage).callService(callTime, sc);
        ((DataPackage) dataPackage).internetService(netData, sc);

        // 6. t
        System.out.println("----------");
        System.out.println("通话套餐类，显示所有套餐信息");
        callPackage.info();

        System.out.println("----------");
        System.out.println("上网流量套餐类，显示所有套餐信息");
        dataPackage.info();
    }
}
