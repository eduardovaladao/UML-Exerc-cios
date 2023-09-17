package domain;

public class Voo {

    private String prefixo;

    private Aeroporto origem;

    private Aeroporto destino;

    private String partida; //formato data e tempo ???
    
    private String chegada; //formato data e tempo ???

    private String aeronave;

    private Integer limite;

    public Voo(String prefixo, Aeroporto origem, Aeroporto destino, String partida, String chegada, String aeronave,
            Integer limite) {
        this.prefixo = prefixo;
        this.origem = origem;
        this.destino = destino;
        this.partida = partida;
        this.chegada = chegada;
        this.aeronave = aeronave;
        this.limite = limite;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public Aeroporto getOrigem() {
        return origem;
    }

    public void setOrigem(Aeroporto origem) {
        this.origem = origem;
    }

    public Aeroporto getDestino() {
        return destino;
    }

    public void setDestino(Aeroporto destino) {
        this.destino = destino;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public String getChegada() {
        return chegada;
    }

    public void setChegada(String chegada) {
        this.chegada = chegada;
    }

    public String getAeronave() {
        return aeronave;
    }

    public void setAeronave(String aeronave) {
        this.aeronave = aeronave;
    }

    public Integer getLimite() {
        return limite;
    }

    public void setLimite(Integer limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "Voo [prefixo=" + prefixo + ", origem=" + origem + ", destino=" + destino + ", partida=" + partida
                + ", chegada=" + chegada + ", aeronave=" + aeronave + ", limite=" + limite + "]";
    }

        
}
