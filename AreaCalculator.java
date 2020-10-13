import java.util.Scanner;
public class AreaCalculator {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("1.Circle \n 2.Rectangle \n 3.Square \n 4.Triangle \n 5.Exit ");
        int userInput = Input.nextInt();
        Area(userInput);

        }
        public static void Area(int userInput){
            if(userInput == 1){
                Scanner rd = new Scanner(System.in);
                System.out.println("Enter radius of Circle : ");
                int radius = rd.nextInt();
                double pi = Math.PI;
                double rad = Math.pow(radius,2);
                double area = Math.round(pi * rad);
                System.out.println("Area of circle is "+area + " of radius " +radius);
            }
            else if(userInput == 2){
                Scanner l = new Scanner(System.in);
                System.out.println("Enter Length of Rectangle : ");
                double len = l.nextDouble();

                Scanner w = new Scanner(System.in);
                System.out.println("Enter width of Rectangle : ");
                double wid = w.nextDouble();

                double area = len * wid;
                System.out.println("Area of Rectangle is "+area);
                }
            else if(userInput == 3){
                Scanner s = new Scanner(System.in);
                System.out.println("Enter side length of Square : ");
                double side = s.nextDouble();

                double area = Math.pow(side,2);
                System.out.println("Area of Square is "+area);
            }
            else if(userInput == 4){
                Scanner b = new Scanner(System.in);
                System.out.println("Enter base of Triangle : ");
                double base = b.nextDouble();

                Scanner h = new Scanner(System.in);
                System.out.println("Enter height of Triangle : ");
                double height = h.nextDouble();

                double area = (base * height)/2;
                System.out.println("Area of Triangle is "+area);
            }
            else
            {
                System.out.println("Invalid Value!");
            }
            }
}
