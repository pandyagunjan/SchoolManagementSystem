package runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AppRunner {
    public static void main(String[] args) {
//        Menu menu = new Menu();
//        menu.displayMenu();
        SpringApplication.run(AppRunner.class, args);
    }
}
