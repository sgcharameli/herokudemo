package es.sergio.herokudemo.controladores;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import es.sergio.herokudemo.controladores.vo.MonitorVO;

@Controller
@RequestMapping("monitor")
public class Monitor {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Monitor.class);

	public Monitor() {
		LOGGER.info("Servicio '/Monitor' arrancado correctamente");
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public MonitorVO estado() {
		return new MonitorVO();
	}
}
