import java.io.*;

public class Exemplo {

    public static void main(String[] args) {

        // lendo da entrada padrão
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = "";
            // Cabeçalho
            System.out.println("alg time sample");
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(" ");
               
                // medindo tempo de execução 
                long start = System.nanoTime();
                
                // TODO incluir aqui chamada para o método sob análise        
        
                long end = System.nanoTime();
                long time = end - start;
                
                // saída padrão: método tempo tamanho_da_entrada
                System.out.println("nome-metodo " + (time) + " " + tokens.length);

            }
        } catch (IOException ioe) {}

    }


    public static boolean comparaExtremos(String[] tokens) {
        return false; 
        //TODO: implementar
    }

    public static int indexOf(String[] tokens, String key) {
        return -1;
        // TODO: implementar
    }

}
