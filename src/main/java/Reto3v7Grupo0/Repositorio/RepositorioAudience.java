
package Reto3v7Grupo0.Repositorio;

import Reto3v7Grupo0.Modelo.Audience;
import Reto3v7Grupo0.Interface.InterfaceAudience;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author John Andrade
 */
@Repository
public class RepositorioAudience {

    @Autowired
    private InterfaceAudience crud;

    public List<Audience> getAll(){
        return (List<Audience>) crud.findAll();
    }

    public Optional<Audience> getAudience(int id){
        return crud.findById(id);
    }

    public Audience save(Audience audience){
        return crud.save(audience);
    }
    public void delete(Audience audience){
        crud.delete(audience);
    }
    
}
