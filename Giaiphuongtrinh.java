package Giaiphuongtrinh.java;  

import java.util.Scanner;

public class Giaiphuongtrinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chon loai phuong trinh muon giai:");
        System.out.println("1. Phuong trinh bac nhat (ax + b = 0)");
        System.out.println("2. Phuong trinh bac hai (ax^2 + bx + c = 0)");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Nhap he so a: ");
                double a1 = scanner.nextDouble();
                System.out.print("Nhap he so b: ");
                double b1 = scanner.nextDouble();

                giaiPhuongTrinhBacNhat(a1, b1);
                break;
            case 2:
                System.out.print("Nhap he so a: ");
                double a2 = scanner.nextDouble();
                System.out.print("Nhap he so b: ");
                double b2 = scanner.nextDouble();
                System.out.print("Nhap he so c: ");
                double c = scanner.nextDouble();

                giaiPhuongTrinhBacHai(a2, b2, c);
                break;
            default:
                System.out.println("Lua chon khong hop le!");
        }
        
        scanner.close(); 
    }

    static void giaiPhuongTrinhBacNhat(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem.");
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        } else {
            double x = -b / a;
            System.out.println("Phuong trinh co nghiem x = " + x);
        }
    }

    static void giaiPhuongTrinhBacHai(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phuong trinh có nghiem kep x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co hai nghiem phan biet:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
