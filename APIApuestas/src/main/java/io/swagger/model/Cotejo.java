package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Cotejo
 */
@Validated

public class Cotejo extends ResourceSupport {
  @JsonProperty("idCotejo")
  private String idCotejo = null;

  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("equipo1")
  private String equipo1 = null;

  @JsonProperty("equipo2")
  private String equipo2 = null;

  @JsonProperty("idTorneo")
  private String idTorneo = null;

  public Cotejo idCotejo(String idCotejo) {
    this.idCotejo = idCotejo;
    return this;
  }

  public Cotejo(String idCotejo, String idTorneo, String equipo1, String equipo2, String nombre){
    this.idCotejo = idCotejo;
    this.idTorneo = idTorneo;
    this.equipo1 = equipo1;
    this.equipo2 = equipo2;
    this.nombre = nombre;
  }

  public Cotejo(){};

  /**
   * Get idCotejo
   * @return idCotejo
  **/
  @ApiModelProperty(example = "c123", required = true, value = "")
  @NotNull


  public String getIdCotejo() {
    return idCotejo;
  }

  public void setIdCotejo(String idCotejo) {
    this.idCotejo = idCotejo;
  }

  public Cotejo nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * Get nombre
   * @return nombre
  **/
  @ApiModelProperty(example = "semifinal", required = true, value = "")
  @NotNull


  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Cotejo equipo1(String equipo1) {
    this.equipo1 = equipo1;
    return this;
  }

  /**
   * Get equipo1
   * @return equipo1
  **/
  @ApiModelProperty(example = "Croacia", required = true, value = "")
  @NotNull


  public String getEquipo1() {
    return equipo1;
  }

  public void setEquipo1(String equipo1) {
    this.equipo1 = equipo1;
  }

  public Cotejo equipo2(String equipo2) {
    this.equipo2 = equipo2;
    return this;
  }

  /**
   * Get equipo2
   * @return equipo2
  **/
  @ApiModelProperty(example = "Rusia", required = true, value = "")
  @NotNull


  public String getEquipo2() {
    return equipo2;
  }

  public void setEquipo2(String equipo2) {
    this.equipo2 = equipo2;
  }

  public Cotejo idTorneo(String idTorneo) {
    this.idTorneo = idTorneo;
    return this;
  }

  /**
   * Get idTorneo
   * @return idTorneo
  **/
  @ApiModelProperty(example = "t123", required = true, value = "")
  @NotNull


  public String getIdTorneo() {
    return idTorneo;
  }

  public void setIdTorneo(String idTorneo) {
    this.idTorneo = idTorneo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cotejo cotejo = (Cotejo) o;
    return Objects.equals(this.idCotejo, cotejo.idCotejo) &&
        Objects.equals(this.nombre, cotejo.nombre) &&
        Objects.equals(this.equipo1, cotejo.equipo1) &&
        Objects.equals(this.equipo2, cotejo.equipo2) &&
        Objects.equals(this.idTorneo, cotejo.idTorneo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCotejo, nombre, equipo1, equipo2, idTorneo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cotejo {\n");
    
    sb.append("    idCotejo: ").append(toIndentedString(idCotejo)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    equipo1: ").append(toIndentedString(equipo1)).append("\n");
    sb.append("    equipo2: ").append(toIndentedString(equipo2)).append("\n");
    sb.append("    idTorneo: ").append(toIndentedString(idTorneo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

