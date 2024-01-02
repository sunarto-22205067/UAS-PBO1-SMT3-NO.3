package Jawab_3;

/**
 *
 * @author mr.sun
 */

import java.util.Scanner;

public class UAS2 {

    class Shape {
        private final String color;

        public Shape(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public double getArea() {
            return 0;
        }
    }

    class Circle extends Shape {
        private final double radius;

        public Circle(String color, double radius) {
            super(color);
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    class Rectangle extends Shape {
        private final double length;
        private final double width;

        public Rectangle(String color, double length, double width) {
            super(color);
            this.length = length;
            this.width = width;
        }

        @Override
        public double getArea() {
            return length * width;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Perhitungan Luas Lingkaran");
        System.out.print("Masukkan warna lingkaran: ");
        String colorCircle = scanner.nextLine();
        System.out.print("Masukkan radius lingkaran: ");
        double radius = scanner.nextDouble();
        Circle circle = new UAS2().new Circle(colorCircle, radius);
        System.out.println("Luas Lingkaran: " + circle.getArea());
        scanner.nextLine(); // Clear the buffer

        System.out.println("\nPerhitungan Luas Persegi Panjang");
        System.out.print("Masukkan warna persegi panjang: ");
        String colorRectangle = scanner.nextLine();
        System.out.print("Masukkan panjang persegi panjang: ");
        double length = scanner.nextDouble();
        System.out.print("Masukkan lebar persegi panjang: ");
        double width = scanner.nextDouble();
        Rectangle rectangle = new UAS2().new Rectangle(colorRectangle, length, width);
        System.out.println("Luas Persegi Panjang: " + rectangle.getArea());

        scanner.close();
    }
}