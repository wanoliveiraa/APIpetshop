package com.br.wando.petsetosa.animais.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ordemservico")
public class OrdemServico {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ordem",nullable = false)
    private Integer id;
    @Column(nullable = false)
    private Double valor;
    @Column(name = "hora_entrada")
    private LocalDate horaEntrada;
    @Column(name = "hora_saida")
    private LocalDate horaSaida;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public LocalDate getHoraEntrada() {
        return horaEntrada;
    }
    public void setHoraEntrada(LocalDate horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
    public LocalDate getHoraSaida() {
        return horaSaida;
    }
    public void setHoraSaida(LocalDate horaSaida) {
        this.horaSaida = horaSaida;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

   
}
