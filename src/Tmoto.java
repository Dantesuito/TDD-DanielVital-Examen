public class Tmoto {
    private int cilindrada;
    private int numRuedas;
    private int marcha;
    private int velActual;

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public int getVelActual() {
        return velActual;
    }

    public void setVelActual(int velActual) {
        this.velActual = velActual;
    }


    public void acelerar(int i) {
        velActual += i;
    }

    public void frenar(int i) {
        velActual -= i;
    }

    public void SubeMarcha(int i) {
        marcha += i;
    }
}
