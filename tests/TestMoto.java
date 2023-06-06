import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMoto {
    @Test
    public void test_al_acelerar_moto_su_velocidad_aumenta_DanielVitalTorres(){
        Tmoto moto = new Tmoto();
        moto.acelerar(30);
        Assertions.assertEquals(30, moto.getVelActual());
    }

    @Test
    public void test_al_frenar_moto_su_velocidad_disminuye_DanielVitalTorres(){
        Tmoto moto = new Tmoto();
        moto.setVelActual(40);
        moto.frenar(30);
        Assertions.assertEquals(10, moto.getVelActual());
    }
}
