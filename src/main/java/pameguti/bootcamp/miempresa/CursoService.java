package pameguti.bootcamp.miempresa;

import java.util.List;

public class CursoService {

    public double calcularPromedio(List<Double> notas) {
        validarNotas(notas);
        // Green: calcular promedio real
        return notas.stream()
                    .mapToDouble(Double::doubleValue)
                    .average()
                    .getAsDouble();
    }

    private void validarNotas(List<Double> notas) {
        if (notas == null || notas.isEmpty()) {
            throw new IllegalArgumentException("La lista de notas no puede estar vacía");
        }
    }
}
