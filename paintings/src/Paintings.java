import java.util.ArrayList;
import java.util.List;

public class Paintings {
    private List<Painting> Paintings;

    public Paintings() {
        this.Paintings = new ArrayList<>();
    }

    public List<Painting> getPaintings() {
        return Paintings;
    }

    public void setPaintings(List<Painting> paintings) {
        this.Paintings = paintings;
    }

    public void addPainting(Painting Painting) throws Exception {
        if (Paintings.stream().anyMatch(k -> k.getId() == Painting.getId())) {
            throw new Exception("Duplicate a picture by id: " + Painting.getId());
        }
        Paintings.add(Painting);
    }

    public void removePainting(int Id) {
        Painting toRemove = null;
        for (Painting n : Paintings) {
            if (n.getId() ==Id) {
                toRemove = n;
                break;
            }
        }
        if (toRemove != null) {
            Paintings.remove(toRemove);
            System.out.println("Картината е изтрита.");
        } else {
            System.out.println("Картината не е намерена.");
        }
    }

    public void printPaintingsByAuthor(String Name) {
        if (Name == null) {
            for (Painting n : Paintings) {
                n.printInfo();
            }
        }
        else {
            for (Painting n : Paintings) {
                if (n.getName() == Name)
                    n.printInfo();
            }
        }
    }

    private double FindHighestPrice() {
        double price = Paintings.get(1).getPrice();
        for (Painting n : Paintings) {
            if (n.getPrice() >= price){
                price = n.getPrice();
            }
        }
        return price;
    }

    public void PrintMostExpressivePainting() {
        for (Painting n : Paintings) {
            if (n.getPrice() == FindHighestPrice()){
                n.printInfo();
            }
        }
    }

    public double GetAverageAuthorsPrice(String Name) {
        double sum = 0;
        int num = 0;
        for (Painting n : Paintings) {
            if (n.getAuthor() == Name){
                sum += n.getPrice();
                num++;
            }
        }
        return sum/num;
    }

}

