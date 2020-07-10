package br.com.franciscochaves.jediforces.repository;

import br.com.franciscochaves.jediforces.model.Jedi;
import org.springframework.data.repository.CrudRepository;

public interface JediRepository extends CrudRepository<Jedi, Long> {
}
