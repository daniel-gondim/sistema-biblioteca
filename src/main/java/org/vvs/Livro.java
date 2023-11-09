package org.vvs;

public class Livro {

    private String título;
    private String autor;

    private float isbn;

    private boolean emprestado;

    public Livro(String título, String autor, float isbn, boolean emprestado) {
        this.título = título;
        this.autor = autor;
        this.isbn = isbn;
        this.emprestado = emprestado;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getIsbn() {
        return isbn;
    }

    public void setIsbn(float isbn) {
        this.isbn = isbn;
    }

    public boolean isEmprestado() {
        return emprestado;
    }
}
