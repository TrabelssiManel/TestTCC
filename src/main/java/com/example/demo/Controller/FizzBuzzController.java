package com.example.demo.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.RequestDTO;
import com.example.demo.Model.ResponseDTO;
import com.example.demo.Service.FizzBuzzService;

@RestController
public class FizzBuzzController {

	private final FizzBuzzService fbservice;

	public FizzBuzzController(FizzBuzzService fbservice) {
		this.fbservice = fbservice;
	}
/**
 * is a rest api to call our method from service
 * @param request
 * @return ResponseDTO
 */
	@PostMapping("/FizzBuzz")
	public ResponseDTO getNum(@RequestBody RequestDTO request) {
		return fbservice.fbMethod(request.getNum());
	}
}
