package com.imooc.achieve;

import com.imooc.ifs.IAct;

public class Clown implements IAct {
    private String name;
    private int years;

    /**
     * 无参构造方法
     */
    public Clown() {
    }

    /**
     * 全部参数的构造方法
     *
     * @param name
     * @param years
     */
    public Clown(String name, int years) {
        this.setName(name);
        this.setYears(years);
    }

    public String dress() {
        String str = "着装：身穿五彩服装，头上戴着彩色的帽子，脸上画着夸张的彩妆";
        return str;
    }

    /**
     * 重写接口的描述技能的方法
     */
    @Override
    public String skill() {
        String str = "技能：脚踩高跷，进行杂技魔术表演";
        return str;

    }

    /**
     * 重写接口的描述表演的方法
     */
    @Override
    public String act() {
        String str = "表演者：" + this.getName() + '\n' + "艺龄：" + this.getYears()
                + "年" + '\n' + this.dress() + '\n' + this.skill() + '\n';
        return str;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
}
