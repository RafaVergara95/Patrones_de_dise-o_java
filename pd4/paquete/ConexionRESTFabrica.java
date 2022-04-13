package paquete;

import conexion.ConexionRESTCompras;
import conexion.ConexionRESTNoArea;
import conexion.ConexionRESTVentas;
import inter.FabricaAbstracta;
import inter.IConexionBD;
import inter.IConexionREST;

public class ConexionRESTFabrica implements FabricaAbstracta {

    public IConexionREST getREST(String area) {
        if (area == null) {
            return new ConexionRESTNoArea();
        }
        if (area.equalsIgnoreCase("COMPRAS")){
            return new ConexionRESTCompras();
        }
        else if (area.equalsIgnoreCase("VENTAS")){
            return new ConexionRESTVentas();
        }

        return new ConexionRESTNoArea();
    }
    
    public IConexionBD getBD(String motor){
        return null;
    }
}
