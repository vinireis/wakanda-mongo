package tech.xmob.mongodb.api;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import tech.xmob.mongodb.model.Wakander;
import tech.xmob.mongodb.service.WakandaService;

@RestController
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Log4j2
public class WakanderController implements WakanderAPI {
	private WakandaService wakandaService;

	@Override
	public WakanderDTO criaWakander(@Valid WakanderForm wakanderForm) {
		log.info("[Inicia] WakanderController - criaWakander");
		Wakander wakander = wakandaService.salvaWakander(wakanderForm.paraWakanderModel());
		log.info("[Finaliza] WakanderController - criaWakander");
		return new WakanderDTO(wakander);
	}
}
