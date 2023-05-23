package afirma.solutions.pruebatecnica.domain.repository;

import java.util.List;
import afirma.solutions.pruebatecnica.domain.Usuario;

public interface UsuarioRepository {

    public void delete(Integer id);
    
    public List<Usuario> findAll();
    
    public Usuario findById(Integer id);
    
    public Usuario save(Usuario archivoOrigen);
}
