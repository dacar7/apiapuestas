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
 * Apuesta
 */
@Validated

public class Apuesta extends ResourceSupport {
  @JsonProperty("idApuesta")
  private String idApuesta = null;

  @JsonProperty("idCotejo")
  private String idCotejo = null;

  @JsonProperty("valor")
  private Integer valor = null;

  public Apuesta idApuesta(String idApuesta) {
    this.idApuesta = idApuesta;
    return this;
  }

  /**
   * Get idApuesta
   * @return idApuesta
  **/
  @ApiModelProperty(example = "a123", required = true, value = "")
  @NotNull


  public String getIdApuesta() {
    return idApuesta;
  }

  public void setIdApuesta(String idApuesta) {
    this.idApuesta = idApuesta;
  }

  public Apuesta idCotejo(String idCotejo) {
    this.idCotejo = idCotejo;
    return this;
  }

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

  public Apuesta valor(Integer valor) {
    this.valor = valor;
    return this;
  }

  /**
   * Get valor
   * @return valor
  **/
  @ApiModelProperty(example = "200000", required = true, value = "")
  @NotNull


  public Integer getValor() {
    return valor;
  }

  public void setValor(Integer valor) {
    this.valor = valor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Apuesta apuesta = (Apuesta) o;
    return Objects.equals(this.idApuesta, apuesta.idApuesta) &&
        Objects.equals(this.idCotejo, apuesta.idCotejo) &&
        Objects.equals(this.valor, apuesta.valor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idApuesta, idCotejo, valor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Apuesta {\n");
    
    sb.append("    idApuesta: ").append(toIndentedString(idApuesta)).append("\n");
    sb.append("    idCotejo: ").append(toIndentedString(idCotejo)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
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

