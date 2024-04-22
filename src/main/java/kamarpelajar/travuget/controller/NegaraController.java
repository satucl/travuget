package kamarpelajar.travuget.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kamarpelajar.travuget.entity.Negara;
import kamarpelajar.travuget.model.WebResponse;
import kamarpelajar.travuget.service.NegaraService;

@RestController
public class NegaraController {
    
    @Autowired
    private NegaraService negaraService;

    @GetMapping(
        path = "/api/v1/negara",
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public WebResponse<List<Negara>> get() {
        List<Negara> negaraResponse = negaraService.get();
        return WebResponse.<List<Negara>>builder().data(negaraResponse).build();
    }
}
