package br.com.devdan.test;

import br.com.devdan.dao.ClienteDAO;
import br.com.devdan.dao.mocks.ClienteDAOMock;
import br.com.devdan.services.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {

    @Test
    public void salvarTest(){
        ClienteService clienteService = new ClienteService(new ClienteDAOMock());
        String retorno = clienteService.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarTest(){
        ClienteService clienteService = new ClienteService(new ClienteDAOMock());
        String retorno = clienteService.buscar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void atualizarTest(){
        ClienteService clienteService = new ClienteService(new ClienteDAOMock());
        String retorno = clienteService.atualizar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void excluirTest(){
        ClienteService clienteService = new ClienteService(new ClienteDAOMock());
        String retorno = clienteService.excluir();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNosalvarTest(){
        ClienteService clienteService = new ClienteService(new ClienteDAO());
        Assert.assertEquals("Sucesso", clienteService.salvar());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarTest(){
        ClienteService clienteService = new ClienteService(new ClienteDAO());
        Assert.assertEquals("Sucesso", clienteService.buscar());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizarTest(){
        ClienteService clienteService = new ClienteService(new ClienteDAO());
        Assert.assertEquals("Sucesso", clienteService.atualizar());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluirTest(){
        ClienteService clienteService = new ClienteService(new ClienteDAO());
        Assert.assertEquals("Sucesso", clienteService.excluir());
    }
}