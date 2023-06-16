package br.com.alura.forum.modelo;

import java.time.LocalDateTime;

public class Resposta {

    //Atributos e Objeto
    private Long id;
    private String mensagem;
//    private Topico topico;
    private LocalDateTime dataCriacao = LocalDateTime.now();
    private Usuario autor;
    private Boolean solucao = false;

    /*Método hashCode serve como uma "forma" do Java organizar e agrupar os objetos da lista,
 com a intenção de localizar mais rápido um determinado objeto.
 */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    //Equals é um padrão universal para comparação de objetos
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Resposta other = (Resposta) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    // Método Getters(recuperem os valores contidos nos atributos) e Setters(modificar valores contidos nos atributos)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

//    public Topico getTopico() {
//        return topico;
//    }
//
//    public void setTopico(Topico topico) {
//        this.topico = topico;
//    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public Boolean getSolucao() {
        return solucao;
    }

    public void setSolucao(Boolean solucao) {
        this.solucao = solucao;
    }

}
