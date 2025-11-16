package T4;

public class ViolacaoCltException extends IllegalArgumentException {
    int codigoClt;

    public ViolacaoCltException(String mensagem, int cod) {
        super(mensagem);

        this.codigoClt=cod;
    }

    public int getCodigo() {
        return this.codigoClt;
    }
}
