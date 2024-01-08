package com.mustafa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbldoktor")
public class Doktor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(length = 100)
    String ad;
    @Column(length = 20)
    String adres;
    @Column(length = 15,unique = true)
    String telefon;
    Long bransid;
    @Column(length = 50)
    String unvan;

}
