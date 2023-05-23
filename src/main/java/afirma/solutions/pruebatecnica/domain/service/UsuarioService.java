package afirma.solutions.pruebatecnica.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import afirma.solutions.pruebatecnica.domain.Usuario;
import afirma.solutions.pruebatecnica.domain.DAO.UsuarioDAO;
import afirma.solutions.pruebatecnica.domain.repository.UsuarioRepository;

@Service
public class UsuarioService implements UsuarioRepository{
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Override
    @Transactional(readOnly=true)
    public List<Usuario> findAll()
    {
        return (List<Usuario>) usuarioDAO.findAll();
    }

    @Override
    @Transactional(readOnly=true)
    public Usuario findById(Integer id)
    {
        return usuarioDAO.findById(id).orElse(null);
    }
    
    @Override
    @Transactional(readOnly=false)
    public Usuario save(Usuario bitacora)
    {
        return usuarioDAO.save(bitacora);
    }
    
    @Override
    @Transactional(readOnly=false)
    public void delete(Integer id)
    {
        usuarioDAO.deleteById(id);
    }
}