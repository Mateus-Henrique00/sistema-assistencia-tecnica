import model.OrdemServico;
import model.Status;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class OrdemServicoTest {

    @Test
    void criarOS(){
        OrdemServico ordemServico = new OrdemServico();
        ordemServico.setDataFinalizada(LocalDate.now());
    }
}
