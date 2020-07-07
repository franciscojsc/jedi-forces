package br.com.franciscochaves.springwebmvc.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.franciscochaves.springwebmvc.model.Jedi;
import org.springframework.stereotype.Repository;

@Repository
public class JediRepository {

    public List<Jedi> getAllJedi() {

        final List<Jedi> jedi = new ArrayList<>();

        jedi.add(new Jedi("Luke", "Skywalker"));

        return jedi;
    }

}
