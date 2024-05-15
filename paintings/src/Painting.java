import java.util.Scanner;

public class Painting {
    private Scanner scanner = new Scanner(System.in);
    private String Name;
    private String Author;
    private double Price;
    private int Year;
    private int Id;

    public Painting() {

        System.out.print("Въведете име: ");
        this.Name = scanner.nextLine();

        System.out.print("Въведете автор: ");
        this.Author = scanner.nextLine();

        System.out.print("Въведете цена: ");
        this.Price = scanner.nextDouble();

        System.out.print("Въведете година: ");
        this.Year = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Въведете уникален номер: ");
        this.Id = scanner.nextInt();
    }

    public Painting(String Name, String Author, double Price, int Year, int Id) {
        this.Name = Name;
        this.Author = Author;
        this.Price = Price;
        this.Year = Year;
        this.Id = Id;
    }


    public void printInfo() {
        System.out.println("Име на картината: " + Name);
        System.out.println("Автор: " + Author);
        System.out.println("Цена: " + Price + " лв.");
        System.out.println("Година на създаване: " + Year);
        System.out.println("Уникален номер: " + Id);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
