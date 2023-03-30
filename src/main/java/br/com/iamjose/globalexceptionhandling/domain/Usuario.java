package br.com.iamjose.globalexceptionhandling.domain;

public class Usuario {

    private String usuario;
    private Double altura;

    public Usuario(String usuario, Double altura) {
        this.usuario = usuario;
        this.altura = altura;
    }

    // Getters and Setters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
