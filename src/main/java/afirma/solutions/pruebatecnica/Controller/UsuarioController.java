package afirma.solutions.pruebatecnica.Controller;

import java.util.List;
import java.util.Collections;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import afirma.solutions.pruebatecnica.domain.Usuario;
import afirma.solutions.pruebatecnica.domain.service.UsuarioService;

@RestController
@RequestMapping( "/api/usuarios" )
public class UsuarioController {

    private static final Logger loggerAfirma = Logger.getLogger( "afirma" );

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping( "/all" )
    public List<Usuario> findAll()
    {
        try {
            return usuarioService.findAll();
        } catch (Exception e) {
            loggerAfirma.warning(e.getMessage());
            return Collections.emptyList();
        }
    }

    @GetMapping( "/id/{id}" )
    public Usuario findById(@PathVariable Integer id)
    {
        try {
            return usuarioService.findById(id);
        } catch (Exception e) {
            loggerAfirma.warning(e.getMessage());
            return new Usuario();
        }
    }

    @PostMapping( "/save" )
    public Usuario save(@RequestBody Usuario usuario)
    {
        try {
            return usuarioService.save(usuario);
        } catch (Exception e) {
            loggerAfirma.warning(e.getMessage());
            return new Usuario();
        }
    }

    @PutMapping( "/edit" )
    public Usuario edit(@RequestBody Usuario usuario)
    {        
        try {
            return usuarioService.save(usuario);
        } catch (Exception e) {
            loggerAfirma.warning(e.getMessage());
            return new Usuario();
        }
    }
    
    @DeleteMapping( "/delete/{id}" )
    public void eliminar(@PathVariable Integer id)
    {
        try {
            usuarioService.delete(id);
        } catch (Exception e) {
            loggerAfirma.warning(e.getMessage());
        }
    }
    
}
