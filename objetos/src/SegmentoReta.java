public class SegmentoReta {

    private Ponto ponto1;
    private Ponto ponto2;

    public SegmentoReta(Ponto ponto1, Ponto ponto2) {
        this.ponto1 = ponto1;
        this.ponto2 = ponto2;
    }

    public SegmentoReta(float x1, float y1, float x2, float y2) {
        this.ponto1.setX(x1);
        this.ponto1.setY(y1);
        this.ponto2.setX(x2);
        this.ponto2.setY(y2);
    }

    @Override
    public String toString() {
        return "SegmentoReta{" +
                "ponto1=" + ponto1 +
                ", ponto2=" + ponto2 +
                '}';
    }
}
