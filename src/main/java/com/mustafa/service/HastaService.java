package com.mustafa.service;

import com.mustafa.entity.Brans;
import com.mustafa.entity.Hasta;
import com.mustafa.entity.Randevu;
import com.mustafa.repository.BransRepository;
import com.mustafa.repository.DoktorRepository;
import com.mustafa.repository.HastaRepository;
import com.mustafa.repository.RandevuRepository;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.*;
import java.util.stream.Stream;

public class HastaService {
    private final BransRepository bransRepository;
    private final DoktorRepository doktorRepository;
    private final HastaRepository hastaRepository;
    private final RandevuRepository randevuRepository;

    public HastaService(){
        this.bransRepository = new BransRepository();
        this.doktorRepository = new DoktorRepository();
        this.hastaRepository = new HastaRepository();
        this.randevuRepository = new RandevuRepository();

    }


    /**
     * Id si verilen hastanin randevularını listeleyen metod
     * @param id
     */
    public void idsiVerilenHastaninRandevulari(Long id){
        Optional<Hasta> hasta = hastaRepository.findById(id);
        hasta.ifPresent(h->{
            System.out.println("*** Hasta Bilgisi ***");
            System.out.println(h);
            System.out.println();
            List<Randevu> randevuList = randevuRepository.findByColumnAndValue("hastaid",h.getId());
            randevuList.forEach(randevu->{
                System.out.println("--- Randevular ---");
                System.out.println(randevu);
                System.out.println();
            });

        });

    }

    /**
     * Adı verilen hastanın randevularını listeyen method.
     * Parametre almaz. Method içinde Hastanın ismi kullanıcı tarafından istenilir.
     */
    public void adiVerilenHastaninRandevulari(){
        System.out.println("Lütfen randevularini gormek istediginiz hastanin adini soyadini giriniz.");
        String name = new Scanner(System.in).nextLine();
        Stream<Long> id = hastaRepository.findByColumnAndValue("ad", name).stream().map(Hasta::getId);
        Optional<Hasta> hasta = hastaRepository.findById(id.count());
        hasta.ifPresent(h->{
            System.out.println("*** Hasta Bilgisi ***");
            System.out.println(h);
            System.out.println();
            List<Randevu> randevuList = randevuRepository.findByColumnAndValue("hastaid",h.getId());
            randevuList.forEach(randevu->{
                System.out.println("--- Randevular ---");
                System.out.println(randevu);
                System.out.println();
            });

        });

    }


    /**
     * Belli Tarih Aralığındaki Randevuları listeleyen ve sayısını veren metot
     */
    public void belliTarihAraligindakiRandevular(){
        System.out.println("Başlangıc tarihini giriniz..");
        Long baslangic = new HastaService().tarihGir();

        System.out.println("Bitis tarihini giriniz..");
        Long bitis = new HastaService().tarihGir();

        List<Randevu> randevu = randevuRepository.findAll();
        List<Randevu> rndv = new ArrayList<>();
        randevu.forEach(r-> {
            if(baslangic<=r.getTarih() && bitis>=r.getTarih()){
                System.out.println(r);
                rndv.add(r);
            }
        });
        System.out.println("Girilen tarihler arasındaki randevu sayısı :"+rndv.size());

    }

    public Long tarihGir(){
        System.out.println("Tarih için yılı giriniz...");
        int yil = new Scanner(System.in).nextInt();

        System.out.println("Ayı giriniz...");
        int ay = new Scanner(System.in).nextInt();

        System.out.println("Günü giriniz...");
        int gun = new Scanner(System.in).nextInt();

        LocalDate tarih = LocalDate.of(yil,ay,gun);
        System.out.println("Girilen tarih..: "+tarih);

        Instant instant = tarih.atStartOfDay().atZone(ZoneOffset.UTC).toInstant();
        Long t = instant.toEpochMilli();
        return t;
    }




}