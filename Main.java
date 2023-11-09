import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = 0;
        System.out.println("BMIを計算します。");
        System.out.println("--------------");
        //身長入力
        System.out.println("体重(kg)を入力してください");
        double  weight= Integer.parseInt(sc.nextLine());

        //体重入力
        System.out.println("身長(cm)を入力してください。");
        double height = Integer.parseInt(sc.nextLine());
        height = height / 100;
        num = height * height;
        num = weight / num;
        num = (Math.floor(num * 100)) / 100;
        System.out.print("BMIの計算結果は");
        System.out.println( num +"です。");

        if( num < 18.5){
            System.out.print("低体重(やせ型)");
        } else if (num >=18.5 && num < 25) {
            System.out.print("普通体重");
        } else if (num >= 25 && num < 30) {
            System.out.print("肥満(Level1)");
        } else if (num >= 30 && num < 35) {
            System.out.print("肥満(Level2)");
        } else if (num >= 35 && num < 40) {
            System.out.print("肥満(Level3)");
        } else if (num >= 40 ) {
            System.out.print("肥満(Level4)");
        }
        System.out.println("です。");

    }
}
