package med.escaioni.api.paciente;

import jakarta.validation.Valid;
import med.escaioni.api.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        Long id,
        String nome,
        String telefone,
        @Valid DadosEndereco endereco
) {
}
