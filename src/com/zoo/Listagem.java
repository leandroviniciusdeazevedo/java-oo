package com.zoo;

import java.util.ArrayList;
import java.util.List;

public class Listagem {

    public static void main(String[] args) {
        List<String> listaNomes = new ArrayList<>();
        listaNomes.add("Maria");
        listaNomes.add("João");
        listaNomes.add("Pedro");

        for (int i = 0; i < listaNomes.size(); i++){
            System.out.println(listaNomes.get(i));
        }

        for (String x:listaNomes){
            System.out.println(x);
        }
        System.out.println("---------------------");
        listaNomes.add("Jose");

        for (String x:listaNomes){
            System.out.println(x);
        }
        System.out.println("---------------------");
        listaNomes.remove("Maria");
        for (String x:listaNomes){
            System.out.println(x);
        }
        System.out.println(listaNomes.get(listaNomes.size()-1));
        System.out.println("---------------------");

        listaNomes.removeIf(x->x.charAt(0) == 'j');

        for (String x:listaNomes){
            System.out.println(x);
        }

        System.out.println("Posição de João é: "+listaNomes.indexOf("João"));

        listaNomes.forEach(s-> System.out.println(s));

        String nomeFiltrado = listaNomes.stream().filter(cond->cond.charAt(0) == 'A').
                findFirst().orElse("Não encontrado");
        System.out.println(nomeFiltrado);


    }
}
