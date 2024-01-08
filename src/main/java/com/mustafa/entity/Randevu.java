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
@Table(name = "tblrandevu")
public class Randevu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long doktorid;
    Long hastaid;
    Long tarih;
    Long zaman;
    Long durum;
}
