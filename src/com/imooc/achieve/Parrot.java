package com.imooc.achieve;

import com.imooc.ifs.IAct;
import com.imooc.superclass.Animal;

public class Parrot extends Animal implements IAct {
    private String type;

    /**
     * 无参构造方法
     */
    public Parrot() {
    }

    /**
     * 部分参数的构造方法
     *
     * @param type
     */
    public Parrot(String type) {
        this.setType(type);
    }

    /**
     * 全部参数的构造方法
     *
     * @param name
     * @param age
     * @param type
     */
    public Parrot(String name, int age, String type) {
        super(name, age);
        this.setType(type);
    }

    /**
     * 重写接口的描述技能的方法
     */
    @Override
    public String skill() {
        String str = "技能：擅长模仿";
        return str;

    }

    /**
     * 重写接口的描述表演的方法
     */
    @Override
    public String act() {
        String str = "表演者：" + this.getName() + '\n' + "年龄：" + this.getAge()
                + "岁" + '\n' + "品种：" + this.getType() + '\n' + this.skill() + '\n' + this.love();
        return str;

    }

    /**
     * 重写父类的抽象方法
     */
    @Override
    public String love() {
        String str = "爱好：喜欢吃坚果和松子";
        return str;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
