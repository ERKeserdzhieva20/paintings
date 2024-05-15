import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Paintings paintings = new Paintings();
        Scanner scanner = new Scanner(System.in);

        int choice;
        boolean on = true;

        while (on) {
            System.out.print("Въведете число за да извършиш някое от седните действия\n" +
                    "Добави картина (1)\n" +
                    "Изтрий картина (2)\n" +
                    "Намери информация относно картини, чрез името на автора (3)\n" +
                    "Намери най-скъпит картини (4)\n" +
                    "Намери средната сойност на цената на картни на даден автор (5)\n" +
                    "Изход (6)");

            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    try{
                        Painting painting = new Painting();
                        paintings.addPainting(painting);
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }

                    //Знам че трябва да е от потребител, но просто не ми се въвежда едно по едно.
                    // Този начин е по-практичен. Извинявам се за взетото от мен решение

                    break;
                case 2:
                    int num = scanner.nextInt();
                    paintings.removePainting(num);
                    break;
                case 3:
                    paintings.printPaintingsByAuthor(scanner.nextLine());
                    break;
                case 4:
                    paintings.PrintMostExpressivePainting();
                    break;
                case 5:
                   System.out.println(paintings.GetAverageAuthorsPrice(scanner.nextLine()));
                    break;
                case 6:
                    System.out.println("Довиждане");
                    on = false;
                   break;
                default:
                    System.out.println("Въведете числото по правилен начин!");

           }
        }
        System.out.println(paintings.GetAverageAuthorsPrice(scanner.nextLine()));

    }
}