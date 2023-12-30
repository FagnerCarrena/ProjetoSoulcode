package com.projetoFinal.universiaTour.model;

import java.time.LocalDate;
import java.time.LocalTime;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "intinerarios")
public class Intinerario {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  
  @Column(nullable = false)
  private LocalDate dia;
  
  @Column(nullable = false)
  private LocalTime hora;
  
  @Column(nullable = false)
  private String atividade;

@ManyToOne
@JoinColumn
@OnDelete(action = OnDeleteAction.CASCADE)
Usuario usuario;

@ManyToOne
@JoinColumn
Turistico turistico;

public Intinerario(){

}

public Integer getId() {
  return id;
}

public void setId(Integer id) {
  this.id = id;
}

public LocalDate getDia() {
  return dia;
}

public void setDia(LocalDate dia) {
  this.dia = dia;
}

public LocalTime getHora() {
  return hora;
}

public void setHora(LocalTime hora) {
  this.hora = hora;
}

public String getAtividade() {
  return atividade;
}

public void setAtividade(String atividade) {
  this.atividade = atividade;
}

public Usuario getUsuario() {
  return usuario;
}

public void setUsuario(Usuario usuario) {
  this.usuario = usuario;
}

public Turistico getTuristico() {
  return turistico;
}

public void setTuristico(Turistico turistico) {
  this.turistico = turistico;
}



}
