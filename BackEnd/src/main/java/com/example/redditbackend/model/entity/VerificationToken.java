package com.example.redditbackend.model.entity;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "tokens")
public class VerificationToken {

    private Long id;
    private String token;
    private UserEntity user;
    private Instant expiryDate;

    public VerificationToken() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    @Column
    public Instant getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Instant expiryDate) {
        this.expiryDate = expiryDate;
    }
}
