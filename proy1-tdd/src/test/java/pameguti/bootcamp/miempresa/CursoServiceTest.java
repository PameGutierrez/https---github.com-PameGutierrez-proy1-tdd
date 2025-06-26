package pameguti.bootcamp.miempresa;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class CursoServiceTest {
    @Test
    void red_CalcularPromedioFallaPorNoImplementacion() {
        CursoService svc = new CursoService();
        assertThrows(UnsupportedOperationException.class, () ->
            svc.calcularPromedio(Arrays.asList(5.0, 7.0, 9.0))
        );
    }
}

