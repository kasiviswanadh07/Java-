package com.example.demo.CrudController;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Mobile;

@RestController
@RequestMapping("/mobile")
public class Controller {

	Mobile mobile;

	@PostMapping
	public String create(@RequestBody Mobile mobile) {
		this.mobile = mobile;
		return "Mobile Object Created Successfully";

	}

	@GetMapping(value = "{imeiNumber}")
	public Mobile read(@PathVariable String imeiNumber) {
		return mobile;

	}
	@PutMapping()
	public String update(@RequestBody Mobile mobile) {
		this.mobile=mobile;
		return "Mobile Updated Successfully";
		
	}
	@DeleteMapping(value="{imeiNumber}")
	public String delete(@PathVariable String imeiNumber) {
		mobile=null;
		return "Deletion Successfull";
		
	}
	

}
