package pameguti.bootcamp.miempresa;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class CursoServiceTest {

    @Test
    void red_CalcularPromedioFallaPorNoImplementacion() {
        CursoService svc = new CursoService();
        assertThrows(UnsupportedOperationException.class, () ->
            svc.calcularPromedio(Arrays.asList(5.0, 7.0, 9.0))
        );
    }
    @Test
    void green_CalcularPromedioConValoresCorrectos_RetornaPromedio() {
        CursoService svc = new CursoService();
        double resultado = svc.calcularPromedio(Arrays.asList(5.0, 7.0, 9.0));
        // Esperamos (5 + 7 + 9) / 3 == 7.0
        assertEquals(7.0, resultado);
    }

    // Podrías mantener el test de lista vacía para error, por ejemplo:
    @Test
    void calcularPromedio_ListaVacia_LanzaIllegalArgument() {
        CursoService svc = new CursoService();
        assertThrows(IllegalArgumentException.class,
                () -> svc.calcularPromedio(Collections.emptyList()));
    }
}
