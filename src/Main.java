import java.io.*;
import java.text.NumberFormat;

public class Main {
    private static String[] cod = {"p1", "p2", "p3"};
    private static String[] desc = {"parafusos", "cravos", "tachas"};
    private static int[] prezo = {3, 4, 5};
    public static void main(String[] args) {
        escribirFichero();
        leerFichero();
    }
    /**
     * Metodo que escribe en un fichero los productos utilizando PrintWriter
     */
    public static void escribirFichero(){
        try (
                FileWriter fw = new FileWriter("productos.txt");
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
        ){
            for (int i = 0; i < cod.length; i++){
                pw.println("Codigo:\t"+ cod[i]);
                pw.println("Descripcion: "+ desc[i]);
                pw.println("Prezo: "+ prezo[i] + NumberFormat.getCurrencyInstance().getCurrency().getSymbol());
                pw.println();
            }
        }catch (IOException e){
            System.out.println("Erro de escritura");
        }
    }
    /**
     * Metodo que lee en un fichero los productos utilizando Buffered Reader
     */
    public static void leerFichero() {
        try (
                FileReader fr = new FileReader("productos.txt");
                BufferedReader br = new BufferedReader(fr);
        ) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Erro de lectura");
        }
    }
}
