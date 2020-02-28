package it.contrader.dto;
import it.contrader.dto.PairDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecuritypatternDTO {
	
	private Long ids;
	
	private String nome;
	
	private String tipo;
}
