public interface kewan {
    void bergerak();
}

interface InnerHewan {
    void makan();
}

class Kucing implements kewan, InnerHewan {
    @Override
    public void bergerak() {
        System.out.println("Kucing berjalan dengan empat kaki.");
    }

    @Override
    public void makan() {
        System.out.println("Kucing makan ikan.");
    }

}
public class Hewan {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing();
        kucing1.bergerak();
        kucing1.makan();
    }
}