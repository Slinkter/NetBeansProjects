package edu.ulima.jdbc;

import edu.ulima.bean.cliente;
import edu.ulima.bean.encuesta;
import edu.ulima.bean.encuesta_realizada;
import java.util.List;

public interface VeterinariaIF {

    public List<cliente> listarClientes() ;
    
    /* Operaciones de Escritura */
    public cliente create(cliente Cliente);
    public cliente update(cliente Cliente);
    public boolean remove(cliente Cliente);
    public cliente habilitarEncuestaCliente(cliente Cliente);
    public cliente findById(int id);
    public encuesta finddById(int id);
    
    
    public List<encuesta> listarEncuesta() ;
    /* Operaciones de Escritura */
    public encuesta create(encuesta Encuesta);
    public encuesta update(encuesta Encuesta);
    public boolean remove(encuesta Encuesta);
    public encuesta_realizada RegistrarEncuestaRealizada(encuesta_realizada Encuesta_realizada);
}
