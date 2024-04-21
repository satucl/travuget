package kamarpelajar.travuget.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kamarpelajar.travuget.entity.Negara;
import kamarpelajar.travuget.repository.NegaraRepository;

@Service
public class NegaraService {
    
    @Autowired
    private NegaraRepository negaraRepository;

    @Transactional(readOnly = true)
    public List<Negara> get() {
        List<Negara> negara = negaraRepository.findAll();

        return negara;
    }
}
