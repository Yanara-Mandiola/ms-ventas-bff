package cl.ferremas.ms.ms_ventas_bff.service;

import cl.ferremas.ms.ms_ventas_bff.client.VentaMsFeignClient;
import cl.ferremas.ms.ms_ventas_bff.dto.VentaDto;
import org.springframework.stereotype.Service;

@Service
public class VentaBffService {

    private final VentaMsFeignClient ventaMsFeignClient;

    public VentaBffService(VentaMsFeignClient ventaMsFeignClient) {
        this.ventaMsFeignClient = ventaMsFeignClient;
    }

    public VentaDto crearVenta(VentaDto ventaDto) {
        return ventaMsFeignClient.crearVenta(ventaDto);
    }
}
