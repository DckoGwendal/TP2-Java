public class Forme {
    private int f0;
    private int f1;
    private int f2;

public Forme() {
        this.f0 = 0;
        this.f1 = 0;
        this.f2 = 0;
    }
  public void setF0(int value) {
        this.f0 = value;
    }
   public void setF1(int value) {
        this.f1 = value;
    } 
  public void setF2(int value) {
        this.f2 = value;
    }

public int compute() {
        return (int) (0.1 * (f0 + f1 + f2 - 200));
    }

public static void displayResult(int result) {
        if (result <= 0)
            System.out.println("La condition est excellente.");
        else if (result < 5)
            System.out.println("La condition est très bonne.");
        else if (result < 10)
            System.out.println("La condition est bonne.");
        else if (result < 15)
            System.out.println("La condition est moyenne.");
        else
            System.out.println("La condition est faible.");
    }
}
