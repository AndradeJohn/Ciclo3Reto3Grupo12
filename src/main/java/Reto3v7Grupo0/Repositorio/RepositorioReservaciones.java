package Reto3v7Grupo0.Repositorio;

import Reto3v7Grupo0.Modelo.Reservaciones;
import Reto3v7Grupo0.Interface.InterfaceReservaciones;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author John Andrade
 */
@Repository
public class RepositorioReservaciones {

    @Autowired
    private InterfaceReservaciones crud4;

    public List<Reservaciones> getAll() {
        return (List<Reservaciones>) crud4.findAll();
    }

    public Optional<Reservaciones> getReservation(int id) {
        return crud4.findById(id);
    }

    public Reservaciones save(Reservaciones reservation) {
        return crud4.save(reservation);
    }

    public void delete(Reservaciones reservation) {
        crud4.delete(reservation);
    }
}
