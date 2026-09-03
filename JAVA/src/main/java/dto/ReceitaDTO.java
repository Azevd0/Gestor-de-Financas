package dto;

import entity.Receita;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReceitaDTO {
    private Long id;
    private String titulo;
    private BigDecimal valor;
    private String tipo;
    private LocalDate dataCadastro = LocalDate.now();

    public ReceitaDTO(){}
    public ReceitaDTO(Receita receita){
        this.id = receita.getId();
        this.titulo = receita.getTitulo();
        this.valor = receita.getValor();
        this.tipo = receita.getTipo();
        this.dataCadastro = receita.getDataCadastro().toLocalDate();
    }
    public ReceitaDTO(Long id, String titulo, BigDecimal valor, String tipo, LocalDate dataCadastro) {
        this.id = id;
        this.titulo = titulo;
        this.valor = valor;
        this.tipo = tipo;
        this.dataCadastro = dataCadastro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }


}
