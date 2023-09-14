package med.escaioni.api.domain.paciente;

import jakarta.validation.Valid;
import med.escaioni.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        Long id,
        String nome,
        String telefone,
        @Valid DadosEndereco endereco
) {
}
