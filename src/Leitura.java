// Nome: Lucas Feliciano Bassetto - RA: 1750658

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura {

    private static Leitura l;

    public static Leitura getLeitura() {

        if(l == null) {
            l = new Leitura();
            return l;
        } else {
            return l;
        }
    }

    public String entDados(String rotulo){

        System.out.println(rotulo);
        String resp = "";

        InputStreamReader tec = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(tec);

        try {
            resp = buff.readLine();
        }
        catch(IOException ioe){
            System.out.println("\n ERRO");
        }

        return resp;
    }

}
