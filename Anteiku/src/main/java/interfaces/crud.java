package interfaces;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface crud<T> {
    
    // listar los objetos usando una list
    List<T> listar();
    // crear el registro del objeto
    boolean crear(T obj);
    // buscar al objeto por la id
    boolean buscar(long id);
    // obtener al objeto por la id
    T obtener(long id);
    // modificar el objeto por la id
    boolean modificar(T obj);
    // eliminar el objeto por la id
    boolean eliminar(long id);
    // me retorna el objeto directamente desde el resultado en la base de datos
    T map(ResultSet rs) throws SQLException;
    
}
