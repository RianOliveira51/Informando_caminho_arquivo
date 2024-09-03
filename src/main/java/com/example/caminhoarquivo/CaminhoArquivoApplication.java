package com.example.caminhoarquivo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.util.Scanner;

@SpringBootApplication
public class CaminhoArquivoApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Etner a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        //imprimindo o nome do arquivo e ignorando o caminho.
        System.out.println("getName: " + path.getName());
        //imprimindo somente o caminho, ignorando o nome;
        System.out.println("getParent: " + path.getParent());
        //caminho + nome
        System.out.println("getPath: " + path.getPath());
        sc.close();
    }

}
