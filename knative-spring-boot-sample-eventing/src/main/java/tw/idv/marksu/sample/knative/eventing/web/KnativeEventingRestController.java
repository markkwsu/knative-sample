package tw.idv.marksu.sample.knative.eventing.web;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import tw.idv.marksu.sample.knative.eventing.service.KnativeEventingService;

@RestController
public class KnativeEventingRestController {

	@Autowired
	private KnativeEventingService knativeEventingService;

	@GetMapping(value = "/", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<String> status() {
		return ResponseEntity.ok("{\"status\": \"UP\"}");
	}

	@PostMapping(value = "/")
	public ResponseEntity<Void> event(@RequestHeader Map<String, Object> headers, @RequestBody String body)
			throws Exception {
		System.out.println(LocalDateTime.now() + ", " + body);
		return ResponseEntity.accepted().build();
	}

}
