package tech.xmob.mongodb.service;

import org.springframework.stereotype.Service;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import tech.xmob.mongodb.model.Wakander;
import tech.xmob.mongodb.repository.WakandaRepository;

@Service
@Log4j2
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class WakandaMongoService implements WakandaService {
	private WakandaRepository wakandaRepository;

	@Override
	public Wakander salvaWakander(Wakander wakander) {
		log.info("[Inicia] WakandaMongoService - salvaWakander");
		Wakander wakanderSalvo = wakandaRepository.save(wakander);
		log.info("[Finaliza] WakandaMongoService - salvaWakander");
		return wakanderSalvo;
	}

}
