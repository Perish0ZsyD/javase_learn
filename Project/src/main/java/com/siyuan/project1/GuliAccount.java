package com.siyuan.project1;

/**
 * app
 *
 * @author Siyuan
 * @Date 2024/10/18 13:42
 */
public class GuliAccount {

    public static void main(String[] args) {
        boolean isFlag = true;
        String details = "收支\t账户金额\t收支金额\t说    明\n";
        int balance = 10000; // 基础工资

        while (isFlag) {
            System.out.println("——————————谷粒记账软件——————————");
            System.out.println("      1、收支明细");
            System.out.println("      2、登记收入");
            System.out.println("      3、登记支出");
            System.out.println("      4、退  出");
            System.out.print("      请选择（1-4）: ");


            char selection = Utility.readMenuSelection(); // 获取用户输入
            switch (selection) {
                case '1':
                    System.out.println("——————————当前收支明细记录——————————");
                    System.out.println(details);
                    System.out.println("—————————————————————————————————");
                    break;
                case '2':
                    System.out.println("登记收入");
                    System.out.println("本次收入金额：");
                    int amount1 = Utility.readNumber();
                    System.out.println("本次收入说明：");
                    String desc1 = Utility.readString();

                    balance = balance + amount1;
                    details +=  "收入\t" + balance + "\t" +
                            amount1 + "\t" + desc1 + "\n";
                    System.out.println("————————————登记完成————————————");
                    break;
                case '3':
                    System.out.println("本次支出金额：");
                    int amount2 = Utility.readNumber();
                    if ((balance - amount2) < 0) {
                        System.out.println("没米了都，花你吗呢");

                    }
                    System.out.println("本次支出说明：");
                    String desc2 = Utility.readString();

                    balance -= amount2;
                    details += "支出\t" + balance + "\t" +
                            amount2 + "\t" + desc2 + "\n";
                    System.out.println("————————————登记完成————————————");
                    break;
                case '4':
                    System.out.println("\n确认是否退出(Y/N): ");
                    char isExit = Utility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false; // 退出while循环
                    }
                    break;
            }
        }
    }
}
