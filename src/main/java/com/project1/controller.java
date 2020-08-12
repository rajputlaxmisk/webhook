package com.project1;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	
	@RequestMapping("/")
	public String show()
	{
		return "Hello";
	}
	@PostMapping("/webhook")
    public void getMyJson(@RequestBody Map<String, Object> json) {
    System.out.println("WebHook collected JSON: " + json);
    }

}
