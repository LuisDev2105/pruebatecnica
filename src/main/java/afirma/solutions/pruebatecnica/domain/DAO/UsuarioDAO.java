package afirma.solutions.pruebatecnica.domain.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import afirma.solutions.pruebatecnica.domain.Usuario;

public interface UsuarioDAO  extends JpaRepository < Usuario, Integer > {
}