package pl.paulina.mini_usos;

import pl.paulina.mini_usos.Przedmioty;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface PrzedmiotyRepository extends CrudRepository<Przedmioty, Long> {

}