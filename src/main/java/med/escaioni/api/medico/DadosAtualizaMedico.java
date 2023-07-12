package med.escaioni.api.medico;

import jakarta.validation.constraints.NotNull;
import med.escaioni.api.endereco.DadosEndereco;

public record DadosAtualizaMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
