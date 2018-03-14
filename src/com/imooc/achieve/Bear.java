package com.imooc.achieve;

import com.imooc.ifs.IAct;
import com.imooc.superclass.Animal;

public class Bear extends Animal implements IAct {
    /**
     * 无参构造方法
     */
    public Bear() {
    }

    /**
     * 全部参数的构造方法
     *
     * @param name
     * @param age
     */
    public Bear(String name, int age) {
        super(name, age);
    }

    /**
     * 重写接口的描述技能的方法
     */
    @Override
    public String skill() {
        String str = "技能：挽着花篮，打着雨伞，自立走秀";
        return str;

    }

    /**
     * 重写接口的描述表演的方法
     */
    @Override
    public String act() {
        String str = "表演者：" + this.getName() + '\n' + "年龄：" + this.getAge()
                + "岁" + '\n' + this.skill() + '\n' + this.love();
        return str;

    }

    /**
     * 重写父类的抽象方法
     */
    @Override
    public String love() {
        String str = "爱好：喜欢卖萌";
        return str;

    }
}
