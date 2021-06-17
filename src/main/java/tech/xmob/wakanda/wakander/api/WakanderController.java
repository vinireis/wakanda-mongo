package tech.xmob.wakanda.wakander.api;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import tech.xmob.wakanda.wakander.model.Wakander;
import tech.xmob.wakanda.wakander.service.WakandaService;

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
