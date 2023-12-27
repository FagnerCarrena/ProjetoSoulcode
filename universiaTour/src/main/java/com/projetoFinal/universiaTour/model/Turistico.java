package com.projetoFinal.universiaTour.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "turisticos")
public class Turistico {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(nullable = false)
  private String localidade;
  @Column(nullable = false)
  private String localMaps;
  @Column(nullable = false)
  private String descricao;

  @ManyToOne
  @JoinColumn
  Destino destino;

  public Turistico(){

  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getLocalidade() {
    return localidade;
  }

  public void setLocalidade(String localidade) {
    this.localidade = localidade;
  }

  public String getLocalMaps() {
    return localMaps;
  }

  public void setLocalMaps(String localMaps) {
    this.localMaps = localMaps;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Destino getDestino() {
    return destino;
  }

  public void setDestino(Destino destino) {
    this.destino = destino;
  }

  
}
