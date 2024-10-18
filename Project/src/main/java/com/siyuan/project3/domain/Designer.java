package com.siyuan.project3.domain;

/**
 * @author Siyuan
 * @Date 2024/10/18 16:29
 */
public class Designer extends Programmer{
    private double bonus; // 奖金

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getDetailsForTeam() {
        return getMemberDetails() + "\t设计师\t" + getStatus() + "\t" + bonus + "\t\t\t" + getEquipment().getDescription();
    }
    @Override
    public String toString() {
        return getDetails() + "\t设计师\t" + getStatus() + "\t" + getBonus() + "\t\t\t" + getEquipment().getDescription();
    }
}
