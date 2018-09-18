package es.sergio.herokudemo.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.sergio.herokudemo.modelos.Usuario;


@RestController
@RequestMapping("Usuarios")
public class UsuariosRest {
	
	@RequestMapping(method = RequestMethod.GET, produces="application/json")
    public Usuario usuarios() {
		Usuario user = new Usuario("prueba", "prueba");
        return user;
    }
}
