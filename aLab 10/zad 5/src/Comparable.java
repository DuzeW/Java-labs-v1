import java.util.Comparator;

class c implements Comparator<Figura> {
    @Override
    public int compare(Figura figura1, Figura figura2) {
        double pole1 = figura1.obliczPole();
        double pole2 = figura2.obliczPole();

        if (pole1 < pole2) {
            return -1;
        } else if (pole1 > pole2) {
            return 1;
        } else {
            return 0;
        }
    }
}