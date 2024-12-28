package br.com.devdan.dao;

public class ContratoDAO implements IContratoDAO{
    @Override
    public void salvar() {
        throw new  UnsupportedOperationException("Não funciona o banco de dados");
    }

    @Override
    public void buscar() {
        throw new  UnsupportedOperationException("Não funciona o banco de dados");
    }

    @Override
    public void atualizar() {
        throw new  UnsupportedOperationException("Não funciona o banco de dados");
    }

    @Override
    public void excluir() {
        throw new  UnsupportedOperationException("Não funciona o banco de dados");
    }
}
