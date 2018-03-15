package com.imooc.demo;

import com.imooc.achieve.*;
import com.imooc.ifs.IAct;

import java.util.Scanner;

public class Test {
    public void actMenu() {
        System.out.println(">>>>>>>>>>>>欢迎来到太阳马戏团<<<<<<<<<<<<");
        System.out.println(">>>>>>>>>>>>>>>请选择表演者<<<<<<<<<<<<<<");
        System.out.println(">>>>>>>>>>\t\t1、棕熊\t\t<<<<<<<<<<");
        System.out.println(">>>>>>>>>>\t\t2、狮子\t\t<<<<<<<<<<");
        System.out.println(">>>>>>>>>>\t\t3、猴子\t\t<<<<<<<<<<");
        System.out.println(">>>>>>>>>>\t\t4、鹦鹉\t\t<<<<<<<<<<");
        System.out.println(">>>>>>>>>>\t\t5、小丑\t\t<<<<<<<<<<");
    }

    /**
     * 方法用于判断用户输入类型是否为int型数据
     *
     * @return一个int类型的数据
     */
    public int judge() {
        int a = 2;
        Scanner aa = new Scanner(System.in);
        while (true) {

            try {
                a = aa.nextInt();
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("异常警告：请不要输入非int类型的数据！！！");
                aa.next();

            }
        }

        return a;
    }


    public static void main(String[] args) {
        Boolean boo = false;
        int a = 0;
        IAct iAct = null;
        Test test = new Test();

        while (true) {
            test.actMenu();
            while (true) {
                a = test.judge();
                if (a < 1 || a > 5) {
                    System.out.println("请重新输入(提示：1~5)");
                } else {
                    break;
                }
            }

            switch (a) {
                case 1:
                    iAct = new Bear("bill", 1);
                    System.out.println(iAct.act());
                    break;
                case 2:
                    iAct = new Lion("Lain", 2, "灰色", "公狮");
                    System.out.println(iAct.act());
                    break;
                case 3:
                    iAct = new Monkey("Tom", 1, "金丝猴");
                    System.out.println(iAct.act());
                    break;
                case 4:
                    iAct = new Parrot("Rose", 1, "牡丹鹦鹉");
                    System.out.println(iAct.act());
                    break;
                case 5:
                    iAct = new Clown("Kahle", 5);
                    System.out.println(iAct.act());
                    break;

            }
            System.out.println("***********\t\t是否继续观看（1/0）\t\t***********");
            while (true) {
                a = test.judge();
                if (a == 1 || a == 0) {
                    break;
                } else if (a != 0) {
                    System.out.println("请重新输入(提示：0/1)");
                }
            }
            if (a == 0) {
                System.out.println("***********\t\t欢迎下次光临\t\t***********");
                break;
            }

        }


    }
}
