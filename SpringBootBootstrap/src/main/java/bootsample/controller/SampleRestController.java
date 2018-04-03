package bootsample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import bootsample.service.TaskService;

@RestController
public class SampleRestController {

	@Autowired
	private TaskService taskService;

	@GetMapping("/")
	public String hello() {
		return "HelloWorld";
	}

	@GetMapping("/findAll")
	public String allTask() {
		return taskService.findAll().toString();
	}
}
