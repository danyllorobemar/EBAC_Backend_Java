package br.com.devdan.services;

import br.com.devdan.dao.IContratoDAO;

public class ContratoService implements IContratoService {

    private IContratoDAO contratoDAO;

    public ContratoService(IContratoDAO contrato) {
        this.contratoDAO = contrato;
    }

    @Override
    public String salvar() {
        contratoDAO.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        contratoDAO.buscar();
        return "Sucesso";
    }

    @Override
    public String atualizar() {
        contratoDAO.atualizar();
        return "Sucesso";
    }

    @Override
    public String excluir() {
        contratoDAO.excluir();
        return "Sucesso";
    }
}
