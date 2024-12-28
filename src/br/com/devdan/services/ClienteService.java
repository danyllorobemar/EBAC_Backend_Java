package br.com.devdan.services;

import br.com.devdan.dao.ClienteDAO;
import br.com.devdan.dao.IClienteDAO;

public class ClienteService {

    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO) {
        //clienteDAO = new ClienteDAO();
        this.clienteDAO = clienteDAO;

    }

    public String salvar(){
        clienteDAO.salvar();
        return "Sucesso";
    }

    public String buscar(){
        clienteDAO.buscar();
        return "Sucesso";
    }

    public String atualizar(){
        clienteDAO.atualizar();
        return "Sucesso";
    }

    public String excluir(){
        clienteDAO.excluir();
        return "Sucesso";
    }
}
