package io.swagger.api;

import io.swagger.configuration.Utiles;
import io.swagger.model.Cotejo;
import io.swagger.model.Torneo;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@Controller
public class TorneoApiController implements TorneoApi {

    private static final Logger log = LoggerFactory.getLogger(TorneoApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private Utiles u = new Utiles();

    @org.springframework.beans.factory.annotation.Autowired
    public TorneoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> agregarTorneo(@ApiParam(value = "id del torneo a buscar",required=true) @PathVariable("idTorneo") String idTorneo,@ApiParam(value = "Torneo a agregar"  )  @Valid @RequestBody Torneo torneo) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Torneo> buscarTorneo(@ApiParam(value = "id del torneo a buscar",required=true) @PathVariable("idTorneo") String idTorneo) {
        //DTO
        Torneo torneo = new Torneo();
        torneo.idTorneo(idTorneo);
        torneo.setNombre("Mundial de Rusia");
        torneo.setFechaTorneo("20180601");

        //HATEOAS
        torneo.add(linkTo(TorneoApi.class).slash(torneo.getIdTorneo()).withSelfRel());

        //Asignar referencia a cotejos
        List<Cotejo> linkBuilder = methodOn(TorneoApiController.class).listarCotejos(torneo.getIdTorneo());
        Link cotejosLink = linkTo(linkBuilder).withRel("todosCotejos");
        torneo.add(cotejosLink);

        //Headers
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setExpires(1000);
        responseHeaders.set("MiHeader", "valor x");

        return new ResponseEntity<Torneo>(torneo,responseHeaders,HttpStatus.OK);
    }

    public @ResponseBody List<Cotejo> listarCotejos(@PathVariable("idTorneo") String idTorneo){
        List<Cotejo> lstResponse = u.listaCotejos();
        for(Cotejo cotejo:lstResponse){
            Link cotejoLink = linkTo(CotejoApi.class).slash(cotejo.getIdCotejo()).withSelfRel();
            cotejo.add(cotejoLink);
        }
        return lstResponse;
    }


}
