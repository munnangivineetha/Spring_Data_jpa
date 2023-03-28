package in.ashokit;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

		BookRepo bean = context.getBean(BookRepo.class);

	/*	BookEntity b1 = new BookEntity();
		b1.setBookid(103);
		b1.setBookname("python");
		b1.setPrice(1800.0);
		bean.save(b1);
		System.out.println("inserted");*/
		
		
	 /* Optional<BookEntity> findById = bean.findById(101);
		System.out.println(findById.get(103));*/
		 //bean.findAll();//
		 
		
		
		 
		 

	}

}
