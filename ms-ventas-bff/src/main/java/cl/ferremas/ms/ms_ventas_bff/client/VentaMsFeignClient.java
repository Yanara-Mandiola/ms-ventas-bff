package cl.ferremas.ms.ms_ventas_bff.client;

import cl.ferremas.ms.ms_ventas_bff.dto.VentaDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "ms-ventas-ms", url = "${ms-ventas-ms.url}")
public interface VentaMsFeignClient {

    @PostMapping("/ventas")
    VentaDto crearVenta(@RequestBody VentaDto ventaDto);
}
