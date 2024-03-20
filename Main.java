public class Main {
    public static void main(String[] args) {
        Forme formevide = new Forme();
        formevide.setF0(0);
        formevide.setF1(0);
        formevide.setF2(0);
        int result = formevide.compute();
        Forme.displayResult(result);
    }
}
