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

    @Test
    public void test_al_subir_de_marcha_se_engrana_una_mas_alta(){
        Tmoto moto = new Tmoto();
        moto.setMarcha(2);
        moto.SubeMarcha(1);
        Assertions.assertEquals(3, moto.getMarcha());
    }

    @Test
    public void test_al_bajar_de_marcha_se_engrana_una_mas_baja() {
        Tmoto moto = new Tmoto();
        moto.setMarcha(5);
        moto.BajaMarcha(1);
        Assertions.assertEquals(4, moto.getMarcha());
    }
}
