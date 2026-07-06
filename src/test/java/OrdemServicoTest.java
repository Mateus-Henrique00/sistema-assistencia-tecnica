import model.OrdemServico;
import model.Status;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class OrdemServicoTest {

    @Test
    void criarOS(){
        OrdemServico ordemServico = new OrdemServico("IPHONE 14", null, Status.ORCAMENTO, 3000 );
        assertNotNull(ordemServico.getDataAbertura());
    }


    @Test
    void verificarStatus(){
        OrdemServico ordemServico = new OrdemServico("IPHONE 14", null, Status.ORCAMENTO, 3000);
        ordemServico.setStatus(Status.FINALIZADO);
        assertEquals(Status.FINALIZADO, ordemServico.getStatus());
    }
}
