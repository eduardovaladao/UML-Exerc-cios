package domain;

public class Tratamento {

    private Integer codigo;

    private Animal animal;

    private String sintomas;

    public Tratamento(Integer codigo, Animal animal, String sintomas) {
        this.codigo = codigo;
        this.animal = animal;
        this.sintomas = sintomas;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    @Override
    public String toString() {
        return "Tratamento [codigo=" + codigo + ", animal=" + animal + ", sintomas=" + sintomas + "]";
    }

}