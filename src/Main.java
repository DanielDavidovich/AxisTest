import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AxisSystem axisSystem = new AxisSystem(); //this line displays the initial axis
        drawPoint1(axisSystem);
        drawPoint2(axisSystem);
        draw3Points(axisSystem);
        drawAmountOfRandomPoints(axisSystem);
        drawFunctionLine(axisSystem);
    }

    public static void drawPoint1(AxisSystem axisSystem){
        axisSystem.addSinglePoint(100,150,"red");
    }
    public static void drawPoint2(AxisSystem axisSystem){
        axisSystem.addSinglePoint(-200, 200, "red");
    }
    public static void draw3Points(AxisSystem axisSystem){
        int[] coordinates = {50,50,60,60,70,70};
        axisSystem.addMultiplePoints(coordinates, "red");
    }
    public static void drawWithXAndY(AxisSystem axisSystem, int x, int y){
        axisSystem.addSinglePoint(x, y, "red");
    }
    public static void drawAmountOfRandomPoints(AxisSystem axisSystem){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomX, randomY;
        System.out.println("Enter amount of points to draw");
        int amount = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter color for points");
        String color = scanner.nextLine();
        int[] coordinates = new int[amount*2];
        for (int i = 0; i<coordinates.length; i+=2){
            coordinates[i] = random.nextInt(-250, 251);
            coordinates[i+1] = random.nextInt(-250, 251);

        }
        axisSystem.addMultiplePoints(coordinates, color);
    }
    public static void drawFunctionLine(AxisSystem axisSystem){
        int[] coordinates = new int[100*2];
        for (int i = 0; i<coordinates.length; i++){
            if(i%2==0){
                coordinates[i] = -100+i;
            }
            if(i%2!=0) {
                coordinates[i] = (-100 + i) * 2;
            }
        }
        axisSystem.addMultiplePoints(coordinates, "red");
    }
    public static void drawUserFunctionLine(AxisSystem axisSystem){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Function format: y=mx+n");
        System.out.println("Enter number for M:");
        int userM = scanner.nextInt();
        System.out.println("Enter number for N");
        int userN = scanner.nextInt();
    }
    public static void drawAccordingToMAndN(AxisSystem axisSystem, int m, int n){
    }



}
