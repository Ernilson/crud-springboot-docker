package br.com.Docker2.Repository;

import br.com.Docker2.Model.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadRepository extends JpaRepository<Cadastro, Long> {
}
