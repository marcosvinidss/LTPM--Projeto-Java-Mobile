package br.com.mv.mvcutsapp.domain;



public class Service {
    private int id;             // ID único do serviço
    private String name;        // Nome do serviço (ex.: Corte de cabelo, Barba)
    private String description; // Descrição detalhada do serviço
    private double price;       // Preço do serviço
    private int duration;       // Duração estimada do serviço em minutos
    private String iconUrl;     // URL ou referência ao ícone do serviço

    // Construtor vazio
    public Service() {}

    // Construtor com todos os campos
    public Service(int id, String name, String description, double price, int duration, String iconUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.duration = duration;
        this.iconUrl = iconUrl;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", duration=" + duration +
                ", iconUrl='" + iconUrl + '\'' +
                '}';
    }
}
