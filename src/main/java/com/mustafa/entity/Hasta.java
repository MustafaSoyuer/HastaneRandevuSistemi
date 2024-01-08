package com.mustafa.entity;

import com.mustafa.utility.enums.Cinsiyet;
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
@Table(name = "tblhasta")
public class Hasta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(length = 100)
    String ad;
    @Column(length = 15,unique = true)
    String telefon;
    @Column(length = 20)
    String adres;
    Integer yas;
    @Enumerated(EnumType.STRING)
    Cinsiyet cinsiyet;
}
