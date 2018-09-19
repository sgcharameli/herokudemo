package es.sergio.herokudemo.controladores;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import es.sergio.herokudemo.modelos.Usuario;


@RestController
@RequestMapping("usuarios")
public class UsuariosRest {
	
	private static final Logger LOG = LoggerFactory.getLogger(UsuariosRest.class);
	
	@PreAuthorize("hasAuthority('Administrador')")
	@RequestMapping(method = RequestMethod.GET, produces="application/json")
    public Usuario usuarios() {
		Usuario user = new Usuario("prueba", "prueba");
        return user;
    }
	
	@RequestMapping(value = "/registro", method = RequestMethod.POST, produces="application/json")
	@ResponseStatus(HttpStatus.CREATED)
    public void crearUsuario() {
		LOG.info("Creando usuario!!");
    }
}
