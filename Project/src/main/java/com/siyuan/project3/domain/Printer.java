package com.siyuan.project3.domain;

/**
 * @author Siyuan
 * @Date 2024/10/18 16:28
 */
public class Printer implements Equipment{
    private String name; // 机器的型号
    private String type; // 价格

    public Printer() {
        super();
    }

    public Printer(String name, String type) {
        super();
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String model) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getDescription() {
        return name + "(" + type + ")";
    }
}
