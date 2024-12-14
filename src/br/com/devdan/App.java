package br.com.devdan;

import br.com.devdan.annotations.Tabela;
import br.com.devdan.domain.User;

import java.lang.reflect.Field;

public class App {
    public static void main(String[] args) {
        Class<User> userClass = User.class;

        // Annotation na classe
        if (userClass.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = userClass.getAnnotation(Tabela.class);
            System.out.println("Nome da tabela (classe): " + tabela.value());
        }

        // Annotations nos campos
        for (Field field : userClass.getDeclaredFields()) {
            if (field.isAnnotationPresent(Tabela.class)) {
                Tabela tabela = field.getAnnotation(Tabela.class);
                System.out.println("Nome do campo: " + field.getName() + " -> " + tabela.value());

                // Exibindo dimensões, se disponíveis
                if (tabela.dimension().length > 0) {
                    System.out.print("Dimensão: ");
                    long[] dimensions = tabela.dimension();
                    StringBuilder output = new StringBuilder();
                    for (int i = 0; i < dimensions.length; i++) {
                        output.append(dimensions[i]);
                        if (i < dimensions.length - 1) {
                            output.append("x");
                        }
                    }
                    System.out.println(output.toString());
                }
            }
        }

    }
}
