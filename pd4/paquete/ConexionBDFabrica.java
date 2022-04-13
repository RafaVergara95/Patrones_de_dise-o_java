package paquete;

import conexion.ConexionMySQL;
import conexion.ConexionOracle;
import conexion.ConexionPostgreSQL;
import conexion.ConexionSQLServer;
import conexion.ConexionVacia;
import inter.IConexionBD;
import inter.IConexionREST;
import inter.FabricaAbstracta;


public class ConexionBDFabrica implements FabricaAbstracta{
    
    public IConexionBD getConexion(String motor){
        if (motor == null){
            return new ConexionVacia();
        }
        if (motor.equalsIgnoreCase("MYSQL")){
            return new ConexionMySQL();
        }
        else if (motor.equalsIgnoreCase("ORACLE")){
            return new ConexionOracle();
        }
        else if (motor.equalsIgnoreCase("POSTGRE")){
            return new ConexionPostgreSQL();
        }
        else if (motor.equalsIgnoreCase("SQL")){
            return new ConexionSQLServer();
        }
        return new ConexionVacia();
    }
    public IConexionREST getREST(String area){
        return null;    
    }
}
