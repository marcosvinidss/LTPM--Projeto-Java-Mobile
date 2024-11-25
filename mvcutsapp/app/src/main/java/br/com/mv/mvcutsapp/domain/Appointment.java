package br.com.mv.mvcutsapp.domain;

import java.util.Date;


public class Appointment {
    private int id;                 // ID único do agendamento
    private int userId;             // ID do cliente (usuário)
    private int barberId;           // ID do barbeiro
    private int serviceId;          // ID do serviço agendado
    private Date date;              // Data e hora do agendamento
    private String status;          // Status do agendamento (ex.: Confirmado, Cancelado)

    // Construtor vazio
    public Appointment() {}

    // Construtor completo
    public Appointment(int id, int userId, int barberId, int serviceId, Date date, String status) {
        this.id = id;
        this.userId = userId;
        this.barberId = barberId;
        this.serviceId = serviceId;
        this.date = date;
        this.status = status;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBarberId() {
        return barberId;
    }

    public void setBarberId(int barberId) {
        this.barberId = barberId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", userId=" + userId +
                ", barberId=" + barberId +
                ", serviceId=" + serviceId +
                ", date=" + date +
                ", status='" + status + '\'' +
                '}';
    }
}
