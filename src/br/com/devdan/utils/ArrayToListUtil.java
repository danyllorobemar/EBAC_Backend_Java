package br.com.devdan.utils;

import br.com.devdan.domain.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class ArrayToListUtil {
    public static List<Pessoa> formatarArrayToList(String[] listaArray){

        List<Pessoa> listaPessoa = new ArrayList<>();

        for (String st : listaArray){
            String[] aux = st.split("-");
            String nome = aux[0];
            String sexo = aux[1];
            listaPessoa.add(new Pessoa(nome,sexo));
        }

        return listaPessoa;
    }
}
