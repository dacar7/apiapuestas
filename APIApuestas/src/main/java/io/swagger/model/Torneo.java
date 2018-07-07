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
 * Torneo
 */
@Validated

public class Torneo extends ResourceSupport {
  @JsonProperty("idTorneo")
  private String idTorneo = null;

  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("fechaTorneo")
  private String fechaTorneo = null;

  public Torneo idTorneo(String idTorneo) {
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

  public Torneo nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * Get nombre
   * @return nombre
  **/
  @ApiModelProperty(example = "rusia 2018", required = true, value = "")
  @NotNull


  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Torneo fechaTorneo(String fechaTorneo) {
    this.fechaTorneo = fechaTorneo;
    return this;
  }

  /**
   * Get fechaTorneo
   * @return fechaTorneo
  **/
  @ApiModelProperty(example = "2016-08-29T09:12:33.001Z", required = true, value = "")
  @NotNull


  public String getFechaTorneo() {
    return fechaTorneo;
  }

  public void setFechaTorneo(String fechaTorneo) {
    this.fechaTorneo = fechaTorneo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Torneo torneo = (Torneo) o;
    return Objects.equals(this.idTorneo, torneo.idTorneo) &&
        Objects.equals(this.nombre, torneo.nombre) &&
        Objects.equals(this.fechaTorneo, torneo.fechaTorneo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTorneo, nombre, fechaTorneo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Torneo {\n");
    
    sb.append("    idTorneo: ").append(toIndentedString(idTorneo)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    fechaTorneo: ").append(toIndentedString(fechaTorneo)).append("\n");
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

