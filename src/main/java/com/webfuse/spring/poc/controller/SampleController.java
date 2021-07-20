package com.webfuse.spring.poc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RestController
@RequestMapping("/poc/v1")
public class SampleController {

	@GetMapping("/accept-file")
	public void acceptFile() {
		System.out.println("I reached here!!");
	}

	@PostMapping("/")
	public String handleFileUpload(@RequestPart("file") MultipartFile file, RedirectAttributes redirectAttributes) {

		System.out.println("You successfully uploaded " + file.getOriginalFilename() + "!");

		// return "redirect:/";
		return null;
	}

}
