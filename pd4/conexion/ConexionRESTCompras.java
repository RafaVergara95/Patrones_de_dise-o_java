package conexion;

import inter.IConexionREST;

public class ConexionRESTCompras implements IConexionREST{
    public void leerURL(String url){
        System.out.println("Conectandose a " + url);
    }
}
