package com.siyuan.project1;

import java.util.Scanner;

/**
 * tools
 *
 * @author Siyuan
 * @Date 2024/10/18 13:41
 */
public class Utility {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static char readMenuSelection() {
        char c;
        for (;;) { // 循环读取用户输入
            String str = readKeyBoard(1);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4') {
                System.out.print("选择错误，请重新输入：");
            } else break;
        }
        return c;
    }

    /*
    * 用于收入和支出金额的输入，要求不超过4位长度的整数
    * */
    public static int readNumber() {
        int n;
        for (;;) { // for循环用于防止输入错误，即不断循环直到一次输入正确
            String str = readKeyBoard(4);
            try {
                n = Integer.parseInt(str);
                if (n >= 0) {
                    break;
                } else {
                    System.out.println("输入金额非负数： ");
                }
            } catch (NumberFormatException e) {
                System.out.println("数字输入错误，请重新输入");
            }
        }
        return n;
    }

    /*
    * 用于收入和指出的输入，读取不超过8位长度的字符串
    * */
    public static String readString() {
        return readKeyBoard(8);
    }

    /*
    * 用于确认选择的输入，读取'Y'或'N'
    * */
    public static char readConfirmSelection() {
        char c;
        for (;;) {
            String str = readKeyBoard(1).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.println("选择错误，请重新输入（Y or N）: ");
            }
        }
        return c;
    }


    private static String readKeyBoard(int inputlimit) {
        String line = "";

        while (SCANNER.hasNext()) {
            line = SCANNER.nextLine();
            if (line.isEmpty() || line.length() > inputlimit) {
                System.out.println("输入长度（不大于" + inputlimit + "）错误，请重新输入：");
                continue;
            }
            break;
        }
        return line;
    }
}
