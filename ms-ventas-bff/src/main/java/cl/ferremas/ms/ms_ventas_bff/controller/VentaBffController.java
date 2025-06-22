package cl.ferremas.ms.ms_ventas_bff.controller;

import cl.ferremas.ms.ms_ventas_bff.dto.VentaDto;
import cl.ferremas.ms.ms_ventas_bff.service.VentaBffService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bff/ventas")
public class VentaBffController {

    private final VentaBffService ventaBffService;

    public VentaBffController(VentaBffService ventaBffService) {
        this.ventaBffService = ventaBffService;
    }

    @PostMapping
    public ResponseEntity<VentaDto> crearVenta(@RequestBody VentaDto ventaDto) {
        VentaDto ventaCreada = ventaBffService.crearVenta(ventaDto);
        return ResponseEntity.ok(ventaCreada);
    }
}
