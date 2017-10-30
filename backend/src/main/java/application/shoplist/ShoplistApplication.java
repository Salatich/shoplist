package application.shoplist;

import config.JpaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class  ShoplistApplication {

	public static void main(String[] args) {
		SpringApplication.run(new Class<?>[] {ShoplistApplication.class, JpaConfig.class}, args);
	}
}
