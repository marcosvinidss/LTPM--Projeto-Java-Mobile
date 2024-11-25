package br.com.mv.mvcutsapp.domain;



public class Address {
    public static final int REQUEST_ZIP_CODE_CODE = 566;
    public static final String ZIP_CODE_KEY = "zip_code_key";

    private String cep;          // Código postal (CEP)
    private String logradouro;   // Rua / Avenida
    private String numero;       // Número da propriedade
    private String complemento;  // Complemento (Ex.: apto, bloco)
    private String bairro;       // Bairro
    private String cidade;       // Cidade
    private String estado;       // Estado (UF)

    // Getters e Setters
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
