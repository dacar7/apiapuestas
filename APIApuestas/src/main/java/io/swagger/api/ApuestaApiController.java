package io.swagger.api;

import io.swagger.model.Apuesta;
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
public class ApuestaApiController implements ApuestaApi {

    private static final Logger log = LoggerFactory.getLogger(ApuestaApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ApuestaApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> agregarApuesta(@ApiParam(value = "id de apuesta a buscar",required=true) @PathVariable("idApuesta") String idApuesta,@ApiParam(value = "apuesta a agregar"  )  @Valid @RequestBody Apuesta apuesta) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Apuesta> buscarApuesta(@ApiParam(value = "id de la apuesta a buscar",required=true) @PathVariable("idApuesta") String idApuesta) {

        Apuesta apuesta = new Apuesta();
        apuesta.setIdApuesta(idApuesta);
        apuesta.setIdCotejo("1");
        apuesta.setValor(100000);

        //Headers
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setExpires(1000);
        responseHeaders.set("MiHeader", "valor x");

        return new ResponseEntity<Apuesta>(apuesta, responseHeaders, HttpStatus.OK);
    }

}
