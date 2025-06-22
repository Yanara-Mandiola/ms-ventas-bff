package cl.ferremas.ms.ms_ventas_bff.dto;

import lombok.Data;

@Data
public class VentaDto {
    private Long id;
    private String descripcion;
    private Double monto;
    
}
