
package com.biblioteca.biblioteca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BibliotecaApplication {

    public static void main(String[] args) {

        SpringApplication.run(BibliotecaApplication.class, args);

        System.out.println();
        System.out.println("==================================");
        System.out.println("   BIBLIOTECA INICIADA! ");
        System.out.println("   Acesse: http://localhost:8080/livros");
        System.out.println("==================================");
        System.out.println();

    }
}
