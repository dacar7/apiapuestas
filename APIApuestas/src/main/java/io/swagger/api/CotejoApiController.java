package io.swagger.api;

import io.swagger.model.Cotejo;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@Controller
public class CotejoApiController implements CotejoApi {

    private static final Logger log = LoggerFactory.getLogger(CotejoApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CotejoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> agregarCotejo(@ApiParam(value = "id del cotejo a buscar",required=true) @PathVariable("idCotejo") String idCotejo,@ApiParam(value = "Cotejo a agregar"  )  @Valid @RequestBody Cotejo cotejo) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Cotejo> buscarCotejo(@ApiParam(value = "id del cotejo a buscar",required=true) @PathVariable("idCotejo") String idCotejo) {
        //DTO
        Cotejo cotejo = new Cotejo();
        cotejo.idTorneo("1");
        cotejo.idCotejo(idCotejo);
        cotejo.setNombre("partido de cuartos");
        cotejo.setEquipo1("Inglaterra");
        cotejo.setEquipo2("Suecia");

        //Headers
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setExpires(1000);
        responseHeaders.set("MiHeader", "valor x");

        return new ResponseEntity<Cotejo>(cotejo,responseHeaders,HttpStatus.OK);
    }

}
