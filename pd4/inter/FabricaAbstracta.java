package inter;

public interface FabricaAbstracta {
    IConexionBD getBD(String motor);
    IConexionREST getRest(String area);
}
