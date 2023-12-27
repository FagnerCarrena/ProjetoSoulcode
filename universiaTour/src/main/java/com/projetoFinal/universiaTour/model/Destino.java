package com.projetoFinal.universiaTour.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Destino {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
@Column(nullable = false)
  private String estado;
  @Column(nullable = false)
  private String cidade;
  @Column(nullable = false)
  private String epocas;
  @Column(nullable = false)
  private String clima;
  @Column(nullable = false)
  private String linkImagem;

public Destino (){

}

public Integer getId() {
  return id;
}

public void setId(Integer id) {
  this.id = id;
}

public String getEstado() {
  return estado;
}

public void setEstado(String estado) {
  this.estado = estado;
}

public String getCidade() {
  return cidade;
}

public void setCidade(String cidade) {
  this.cidade = cidade;
}

public String getEpocas() {
  return epocas;
}

public void setEpocas(String epocas) {
  this.epocas = epocas;
}

public String getClima() {
  return clima;
}

public void setClima(String clima) {
  this.clima = clima;
}

public String getLinkImagem() {
  return linkImagem;
}

public void setLinkImagem(String linkImagem) {
  this.linkImagem = linkImagem;
}



}
