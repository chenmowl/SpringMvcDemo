package com.ymtz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/path")
public class HelloController {

	@RequestMapping(value="/hello", method=RequestMethod.GET,headers = "Accept=application/xml, application/json", produces = {
			"application/json", "application/xml"})
	@ResponseBody
	public String test() {
		return "{1:3}";
	}

}
