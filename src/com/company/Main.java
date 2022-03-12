package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        StringBuilder resultOfCreation = new StringBuilder("History: ");
        File games = new File("C://Games");
            if(games.mkdir() ){
                System.out.println("Каталог создан");
                resultOfCreation.append("games: \"Каталог создан\"");
            }
        File src = new File(games, "src");
            if(src.mkdir() ){
                System.out.println("Каталог создан");
                resultOfCreation.append("src: \"Каталог создан\"");
            }
        File res = new File(games, "res");
            if(res.mkdir() ){
                System.out.println("Каталог создан");
                resultOfCreation.append("res: \"Каталог создан\"");
            }
        File drawables = new File(res, "drawables");
            if(drawables.mkdir() ) {
                System.out.println("Каталог создан");
                resultOfCreation.append("drawables: \"Каталог создан\"");
            }
        File vectors = new File(res, "vectors");
            if(vectors.mkdir() ) {
                System.out.println("Каталог создан");
                resultOfCreation.append("vectors: \"Каталог создан\"");
            }
        File icons = new File(res, "icons");
            if(icons.mkdir() ) {
                System.out.println("Каталог создан");
                resultOfCreation.append("icons: \"Каталог создан\"");
            }
        File savegames = new File(games, "savegames");
            if(savegames.mkdir() ){
                System.out.println("Каталог создан");
                resultOfCreation.append("savegames: \"Каталог создан\"");
            }
        File temp = new File(games, "temp");
            if(temp.mkdir() ){
                System.out.println("Каталог создан");
                resultOfCreation.append("temp: \"Каталог создан\"");
            }
        File main = new File(src, "main");
            if(main.mkdir() ){
                System.out.println("Каталог создан");
                resultOfCreation.append("main: \"Каталог создан\"");
            }
        File test = new File(src, "test");
            if(test.mkdir() ){
                System.out.println("Каталог создан");
                resultOfCreation.append("test: \"Каталог создан\"");
            }
        File mainJava = new File(main, "Main.java");
            try {
                if(mainJava.createNewFile())
                    System.out.println("File created.");
                    resultOfCreation.append("Main.java: \"файл создан\"");
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

        File utilsJava = new File(main, "Utils.java");
            try {
                if(utilsJava.createNewFile())
                    System.out.println("File created.");
                    resultOfCreation.append("Utils.java: \"файл создан\"");
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        File tempTxt = new File(temp, "temp.txt");
            try {
                if(tempTxt.createNewFile())
                    System.out.println("File created.");
                    resultOfCreation.append("temp.txt: \"файл создан\"");
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        try(FileWriter bw = new FileWriter(tempTxt)) {
            bw.write(resultOfCreation.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
