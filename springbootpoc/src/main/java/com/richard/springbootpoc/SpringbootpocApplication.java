package com.richard.springbootpoc;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
@SpringBootConfiguration
public class SpringbootpocApplication {

        @RequestMapping("/")
        @ResponseBody
        public String home() { return "It is a poc home"; }


	public static void main(String[] args) {
		SpringApplication.run(SpringbootpocApplication.class, args);
	}
}
