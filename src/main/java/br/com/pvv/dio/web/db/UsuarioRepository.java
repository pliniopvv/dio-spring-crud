package br.com.pvv.dio.web.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import br.com.pvv.dio.web.db.model.Usuario;

@RepositoryRestResource
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
