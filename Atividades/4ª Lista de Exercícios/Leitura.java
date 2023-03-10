//Nome: Pedro de Oliveira Machado -  RA: 2417855

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Leitura{

	public static String entDados(String saida){

		String r = "";

		System.out.println(saida);

		InputStreamReader tec =  new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(tec);

		try{
			r = buff.readLine();
		}
		catch(IOException erro){
			System.out.println("\n== ERRO ==");
		}

		return r;
	}
}








