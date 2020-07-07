package br.com.franciscochaves.springwebmvc.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.franciscochaves.springwebmvc.model.Jedi;
import org.springframework.stereotype.Repository;

@Repository
public class JediRepository {

    private List<Jedi> jedi;

    public JediRepository() {
        jedi = new ArrayList<>();
        jedi.add(new Jedi("Luke", "Skywalker"));
        jedi.add(new Jedi("Obi-Wan", "Kenobi"));
        jedi.add(new Jedi("Qui-Gon", "Jinn"));
    }

    public List<Jedi> getAllJedi() {
        return jedi;
    }

    public void add(final Jedi jedi) {
       this.jedi.add(jedi);
    }

}
