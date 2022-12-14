package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="client")
@NoArgsConstructor
@Getter
@Setter

public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClient;
    private String email;
    private String name;
    private String password;
    private Integer age;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "client")
    @JsonIgnoreProperties("client")
    private List<Message> message;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "client")
    @JsonIgnoreProperties("client")
    private List<Reservation> reservation;

}
