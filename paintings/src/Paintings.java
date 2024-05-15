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

    public void addPainting(Painting Painting) {
        for (Painting n : Paintings) {
            if (n.getId() == Painting.getId()) {
                System.out.println("Картината вече съществува");
                return;
            }
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
}

