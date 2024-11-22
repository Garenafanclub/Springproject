package com.example.demo.app;

import com.example.demo.app.model.Laptop;
import com.example.demo.app.service.ServiceLaptop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoFirstApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoFirstApplication.class, args);

		ServiceLaptop service = context.getBean(ServiceLaptop.class);


		Laptop laptop = context.getBean(Laptop.class);
		service.addLaptop(laptop);




//		Alice object = context.getBean(Alice.class);  // which class object you want as if you have multiple classes..
//		System.out.println(object.getAge());
//		object.run();
	}
}
