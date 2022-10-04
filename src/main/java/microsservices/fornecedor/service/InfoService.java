package microsservices.fornecedor.service;


import lombok.RequiredArgsConstructor;
import microsservices.fornecedor.model.InfoFornecedor;
import microsservices.fornecedor.repository.InfoRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InfoService {

    private final InfoRepository infoRepository;

    public InfoFornecedor getInfoPorEstado(String estado) {
        return infoRepository.findByEstado(estado);
    }
}
