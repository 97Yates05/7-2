package com.imooc.achieve;

import com.imooc.ifs.IAct;
import com.imooc.superclass.Animal;

public class Lion extends Animal implements IAct {
    private String color;
    private String sex;

    /**
     * 无参构造方法
     */
    public Lion() {
    }

    /**
     * 部分参数的构造方法
     *
     * @param color
     * @param sex
     */
    public Lion(String color, String sex) {
        this.setColor(color);
        this.setSex(sex);
    }

    /**
     * 全部参数的构造方法
     *
     * @param name
     * @param age
     * @param color
     * @param sex
     */
    public Lion(String name, int age, String color, String sex) {
        super(name, age);
        this.setColor(color);
        this.setSex(sex);
    }

    /**
     * 重写接口的描述技能的方法
     */
    @Override
    public String skill() {
        String str = "技能：擅长钻火圈";
        return str;

    }

    /**
     * 重写接口的描述表演的方法
     */
    @Override
    public String act() {
        String str = "表演者：" + this.getName() + '\n' + "年龄：" + this.getAge()
                + "岁" + '\n' + "性别：" + this.getSex() + '\n' + "毛色：" + this.getColor()
                + '\n' + this.skill() + '\n' + this.love();
        return str;

    }

    /**
     * 重写父类的抽象方法
     */
    @Override
    public String love() {
        String str = "爱好：喜欢吃各种肉类";
        return str;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
