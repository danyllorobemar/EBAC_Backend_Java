package br.com.devdan.test;

import br.com.devdan.dao.ContratoDAO;
import br.com.devdan.dao.mocks.ContratoDAOMock;
import br.com.devdan.services.ContratoService;
import br.com.devdan.services.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void salvarTest(){
        IContratoService service = new ContratoService(new ContratoDAOMock());
        Assert.assertEquals("Sucesso", service.salvar());
    }

    @Test
    public void buscarTest(){
        IContratoService service = new ContratoService(new ContratoDAOMock());
        Assert.assertEquals("Sucesso", service.buscar());
    }

    @Test
    public void atualizarTest(){
        IContratoService service = new ContratoService(new ContratoDAOMock());
        Assert.assertEquals("Sucesso", service.atualizar());
    }

    @Test
    public void excluirTest(){
        IContratoService service = new ContratoService(new ContratoDAOMock());
        Assert.assertEquals("Sucesso", service.excluir());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDEDadosTest(){
        IContratoService service = new ContratoService(new ContratoDAO());
        Assert.assertEquals("Sucesso", service.salvar());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarComBancoDEDadosTest(){
        IContratoService service = new ContratoService(new ContratoDAO());
        Assert.assertEquals("Sucesso", service.buscar());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizarComBancoDEDadosTest(){
        IContratoService service = new ContratoService(new ContratoDAO());
        Assert.assertEquals("Sucesso", service.atualizar());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluirComBancoDEDadosTest(){
        IContratoService service = new ContratoService(new ContratoDAO());
        Assert.assertEquals("Sucesso", service.excluir());
    }
}
