import java.util.List;

public class ContextoDeOrdenacao {
    private EstrategiaOrdenacao estrategia;

    public ContextoDeOrdenacao(EstrategiaOrdenacao estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(EstrategiaOrdenacao estrategia) {
        this.estrategia = estrategia;
    }

    public void executarOrdenacao(List<Integer> numeros) {
        estrategia.ordenar(numeros);
    }
}
