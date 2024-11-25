package br.com.mv.mvcutsapp.domain;


public class Barber {
    private int id;              // ID único do barbeiro
    private String name;         // Nome do barbeiro
    private String bio;          // Breve biografia ou descrição
    private String phoneNumber;  // Telefone de contato
    private String photoUrl;     // URL da foto do barbeiro
    private float rating;        // Avaliação do barbeiro (0 a 5)

    // Construtor vazio
    public Barber() {}

    // Construtor com todos os campos
    public Barber(int id, String name, String bio, String phoneNumber, String photoUrl, float rating) {
        this.id = id;
        this.name = name;
        this.bio = bio;
        this.phoneNumber = phoneNumber;
        this.photoUrl = photoUrl;
        this.rating = rating;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Barber{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bio='" + bio + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", photoUrl='" + photoUrl + '\'' +
                ", rating=" + rating +
                '}';
    }
}
