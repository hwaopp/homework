package Box;

import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {

        float length, width;
        int height;

        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入長度: ");
        length = scanner.nextFloat();
        System.out.print("請輸入寬度: ");
        width = scanner.nextFloat();
        System.out.print("請輸入高度: ");
        height = scanner.nextInt();

        Box3 box3 = new Box3();
        Box5 box5 = new Box5();

        if (box3.validate(length, width, height)){
            System.out.println("可選擇Box3");
        }else if (box5.validate(length, width, height)){
            System.out.println("可選擇Box5");
        } else
        System.out.println("不符合容量大小！");

    }
}
