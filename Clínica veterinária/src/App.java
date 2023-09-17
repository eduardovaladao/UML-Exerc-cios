import domain.Cliente;

public class App {
    public static void main(String[] args) throws Exception {
        
        Cliente cliente = new Cliente(1, "Advaldo",
                                         "R. dos Papagaios, 70, Pingamonhangaba, MG",
                                          "+55 34 99765-0807",
                                           null);
        System.out.println(cliente);

    }
}
