package microsservices.fornecedor.controller;

import lombok.RequiredArgsConstructor;
import microsservices.fornecedor.model.InfoFornecedor;
import microsservices.fornecedor.service.InfoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
@RequiredArgsConstructor
public class InfoController {
    private InfoService infoService;

    @RequestMapping("/{estado}")
    public InfoFornecedor getInfoPorEstado(@PathVariable String estado) {
        return infoService.getInfoPorEstado(estado);
    }
}
