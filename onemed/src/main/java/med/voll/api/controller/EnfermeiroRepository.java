package med.voll.api.controller;

import med.voll.api.enfermeiro.Enfermeiro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnfermeiroRepository  extends JpaRepository<Enfermeiro, Long> {

}
