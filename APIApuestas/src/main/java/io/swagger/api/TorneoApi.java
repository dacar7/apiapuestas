/**
 * NOTE: This class is auto generated by the swagger code generator program (1.0.13).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Cotejo;
import io.swagger.model.Torneo;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@Api(value = "torneo", description = "the torneo API")
@RequestMapping("/torneo")
public interface TorneoApi {

    @ApiOperation(value = "agrega un torneo nuevo", nickname = "agregarTorneo", notes = "agrega un nuevo torneo", tags={ "administradores", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "torneo creado"),
        @ApiResponse(code = 400, message = "objeto invalido"),
        @ApiResponse(code = 409, message = "ya existe un objeto con este id") })
    @RequestMapping(value = "/{idTorneo}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> agregarTorneo(@ApiParam(value = "id del torneo a buscar",required=true) @PathVariable("idTorneo") String idTorneo,@ApiParam(value = "Torneo a agregar"  )  @Valid @RequestBody Torneo torneo);


    @ApiOperation(value = "busca un torneo", nickname = "buscarTorneo", notes = "Enviando un ID valido devuelve la informacion del torneo ", response = Object.class, tags={ "administradores","apostadores", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "devolver el resultado obtenido", response = Object.class),
        @ApiResponse(code = 400, message = "parametro incorrecto") })
    @RequestMapping(value = "/{idTorneo}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Torneo> buscarTorneo(@ApiParam(value = "id del torneo a buscar",required=true) @PathVariable("idTorneo") String idTorneo);

    @ApiOperation(value = "busca un listado de cotejos dado un torneo", nickname = "listarCotejos", notes = " ", response = Object.class, tags={ "administradores","apostadores", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "devolver el resultado obtenido", response = Object.class),
            @ApiResponse(code = 400, message = "parametro incorrecto") })
    @RequestMapping(value = "/{idTorneo}/cotejos",
            produces = { "application/json" },
            method = RequestMethod.GET)
    List<Cotejo> listarCotejos(@ApiParam(value = "id del torneo a buscar",required=true) @PathVariable("idTorneo") String idTorneo);

}
