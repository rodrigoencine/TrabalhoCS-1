import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import br.com.restful.model.Cliente;


public class App {

	public static void main(String[] args) throws FileNotFoundException {
		 buscaArquivo();
	
	}

    public static void buscaArquivo(){
    	try {
    	      FileReader arq = new FileReader("/home/user/banco_dados.xml");
    	      BufferedReader lerArq = new BufferedReader(arq);
    	 
    	      String linha = lerArq.readLine(); // lê a primeira linha
    	// a variável "linha" recebe o valor "null" quando o processo
    	// de repetição atingir o final do arquivo texto
    	     
    	      while (linha != null) {
    	        System.out.printf("%s\n", linha);
    	        if(linha.equals("<Cliente>")) {
    	        	linha = lerArq.readLine();
    	        	linha.split("  <nome>");
    	        	Cliente cli = new Cliente();
    	        }
    	        linha = lerArq.readLine(); // lê da segunda até a última linha
    	      }
    	 
    	      arq.close();
    	    } catch (IOException e) {
    	        System.err.printf("Erro na abertura do arquivo: %s.\n",
    	          e.getMessage());
    	    }
    	 
    	    System.out.println();
    }
}


