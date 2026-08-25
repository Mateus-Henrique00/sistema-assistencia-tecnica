package com.Mateus.assistencia_tecnica_api.model;

public class LoginRequest {
    private  String senha;
    private String email;

    public LoginRequest() {
    }



    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
