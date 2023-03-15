package com.xworkz.bankReg.Controaller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/")
public class Image {
	
	public Image() {
		System.out.println("image constructor is created ...");
	}

	@PostMapping("/upload")
	public String onUpload(@RequestParam("ganesh") MultipartFile multipartFile) throws IOException {
		
		System.out.println("multipartFile" +multipartFile);
		System.out.println(multipartFile.getOriginalFilename());
		System.out.println(multipartFile.getContentType());
		System.out.println(multipartFile.getSize());
		System.out.println(multipartFile.getBytes());
		
		byte[] bytes=multipartFile.getBytes();
		Path path=Paths.get("C:\\image- upload\\" +multipartFile.getOriginalFilename());
		Files.write(path, bytes);
		return "uplode";
	}
}
