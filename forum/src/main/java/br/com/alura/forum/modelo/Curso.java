package br.com.alura.forum.modelo;

public class Curso {

    //Atributos
    private Long id;
    private String nome;
    private String categoria;

    //Construtor com argumentos
    public Curso(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

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
        Curso other = (Curso) obj;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
