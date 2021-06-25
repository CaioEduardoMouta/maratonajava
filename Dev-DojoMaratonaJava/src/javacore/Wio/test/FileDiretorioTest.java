package javacore.Wio.test;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTest {
/*
ByteArrayInputStream – Valores são originários de um arranjo de bytes;
FileInputStream – Bytes com originalidade de um arquivo.
FilterInputStream – Filtra os dados de um InputStream.
BufferedInputStream – Faz a leitura de grandes volumes de bytes que armazena em um buffer interno.
DataInputStream – Permite a leitura de representações binárias dos tipos primitivos de Java.
ObjectInputStream – Oferece o método readObject para a leitura de objetos que foram serializados para um ObjectOutputStream.
PipedInputStream – Faz a leitura de um pipe de bytes cuja origem está associada a um objeto PipedOutputStream.
*/
    public static void main(String[] args) throws IOException {
//        File diretorio = new File("folder");
//        boolean mkdir = diretorio.mkdir();
//        System.out.println("Diretorio Criado" +mkdir);
//        File arquivo = new File(diretorio,"Arquivo.txt");
//        boolean newFile = arquivo.createNewFile();
//        System.out.println("Arquivo criado " + newFile);
//        File arquivoNovoNome = new File(diretorio,"arquivo renomeado.txt");
//        boolean renamed = arquivo.renameTo(arquivoNovoNome);
//        System.out.println("Renomeado "+renamed);
//        File diretorioRenomeado = new File("folder2");
//        boolean diretrioRenamed = diretorio.renameTo(diretorioRenomeado);
//        System.out.println("diretorio renomeado" +diretorioRenomeado);
        buscarArquivos();
    }

    public static void buscarArquivos() {
        File file = new File("folder2");
        String[] list = file.list();
        for(String arquivo : list) {
            System.out.println(arquivo);
        }
    }
}
