package es.sergio.herokudemo.controladores;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import es.sergio.herokudemo.controladores.vo.MonitorVO;

@RestController
@RequestMapping("/monitor")
public class Monitor {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Monitor.class);

	public Monitor() {
		LOGGER.info("Servicio '/monitor' arrancado correctamente");
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody MonitorVO estado() {
		return new MonitorVO();
	}
}
