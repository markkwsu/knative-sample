package tw.idv.marksu.sample.knative.serving.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import tw.idv.marksu.sample.knative.serving.service.KnativeServingService;

@Controller
public class KnativeServingController {

	@Autowired
	private KnativeServingService knativeServingService;

	@RequestMapping("/")
	@ResponseBody
	public String helloWorld() {
		return this.knativeServingService.getHelloMessage();
	}

}
