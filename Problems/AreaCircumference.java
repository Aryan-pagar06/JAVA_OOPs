// {
//     public static void main(String[] args) {
//         Scanner input = new Scanner (System.in);
//         System.out.print("Enter the radius of the circle = ");
//         int radius = input.nextInt();
//         double area = Math.PI * Math.pow(radius, 2);
//         double cir = 2 * Math.PI * radius;
//         System.out.println("Area is = " + area);
//         System.out.println("Circumference is = " + cir);
//     }
// }

import java.util.Scanner;

public class AreaCircumference {

    double radius;

    AreaCircumference(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    double circumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Cricle properties : Radius = " + radius + ", Area = " + area()
                + ", Circumference " + circumference();
    }
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle = ");
        int radius = input.nextInt();
        AreaCircumference C1 = new AreaCircumference(radius);
        System.out.print(C1);

    }
}
