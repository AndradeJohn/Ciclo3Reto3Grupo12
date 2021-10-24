package Reto3v7Grupo0.Repositorio;

import Reto3v7Grupo0.Modelo.Mensaje;
import Reto3v7Grupo0.Interface.InterfaceMensaje;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author John Andrade
 */
@Repository
public class RepositorioMensaje {

    @Autowired
    private InterfaceMensaje crud3;

    public List<Mensaje> getAll() {
        return (List<Mensaje>) crud3.findAll();
    }

    public Optional<Mensaje> getMessage(int id) {
        return crud3.findById(id);
    }

    public Mensaje save(Mensaje message) {
        return crud3.save(message);
    }

    public void delete(Mensaje message) {
        crud3.delete(message);
    }
}
