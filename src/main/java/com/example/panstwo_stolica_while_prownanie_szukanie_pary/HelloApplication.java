package com.example.panstwo_stolica_while_prownanie_szukanie_pary;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        //w zadaniu wykorzystujemy mapę stringów

        Map<String, String> pairs = new HashMap<>();



//skaner do wczytywania danych

        Scanner input = new Scanner(System.in);



//deklarujemy dwie zmienne symbolizujące stolicę (zm1)  i kraj (zm2)

        String zm1, zm2;



//wykorzystujemy pętle while (można przerobic na do while, albo for)

        while(true) {



//podajemy stolicę dopóki użuytkownik nie przerwie znakiem /

            System.out.println("Podaj stolice: ");

            zm1 = input.next();

            if (zm1.equals("/")) {

                break;

            }



//podajemy kraj dopóki użuytkownik nie przerwie znakiem /

            System.out.println("Podaj kraj: ");

            zm2 = input.next();

            if (zm2.equals("/")) {

                break;

            }

//dodajemy w pary podane elemrnty

            pairs.put(zm1, zm2);

        }



//sprawdzanie par


        System.out.println("Podaj stolicę do sprawdzenia: ");

        zm1 = input.next();

        System.out.println("Kraj dla " + zm1 + " to " + pairs.get(zm1));

    }
    }
