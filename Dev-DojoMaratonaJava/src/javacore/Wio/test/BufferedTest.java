package javacore.Wio.test;

import java.io.*;

public class BufferedTest {
    /*
 No Buffer existe uma área de memória que é utilizada para 
 armazenamento temporário dos elementos que foram produzidos mas
 ainda não foram consumidos.
    */
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            BufferedReader br = new BufferedReader(new FileReader(file))){
            bw.write("Escrevendo uma mensagem no arquivo\n");
            bw.newLine();
            bw.write("E pulando uma linha 3");
            bw.flush();
            String s = null;
            while((s=br.readLine()) != null) {
                System.out.println(s);
            }

        }catch (IOException e) {
            e.printStackTrace();
        }

//        try {
//
//            FileWriter fw = new FileWriter(file);
//            BufferedWriter bw = new BufferedWriter(fw);
//
//            bw.write("Escrevendo uma mensagem no arquivo\n");
//            bw.newLine();
//            bw.write("E pulando uma linha 3");
//            bw.flush();
//            bw.close();
//            //Flush só ultilizado para escrita
//            FileReader fr = new FileReader(file);
//            BufferedReader br = new BufferedReader(fr);
//            String s = null;
//            while((s=br.readLine()) != null) {
//                System.out.println(s);
//            }
//            br.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}

