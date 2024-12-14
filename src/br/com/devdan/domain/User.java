package br.com.devdan.domain;

import br.com.devdan.annotations.Tabela;

@Tabela(value = "users")
public class User {
    @Tabela("id")
    private Long id;
    @Tabela("name")
    private String name;
    @Tabela(value = "dimension", dimension = {3,3})
    private long[] dimension;
}
