package tech.xmob.mongodb.api;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public/v1/cliente")
public interface WakanderAPI {
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public WakanderDTO criaWakander(@RequestBody @Valid WakanderForm clienteDto);
}
