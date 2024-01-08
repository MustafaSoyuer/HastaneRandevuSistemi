package com.mustafa.utility.enums;


import com.mustafa.entity.Brans;
import com.mustafa.entity.Doktor;
import com.mustafa.entity.Hasta;
import com.mustafa.entity.Randevu;
import com.mustafa.repository.BransRepository;
import com.mustafa.repository.DoktorRepository;
import com.mustafa.repository.HastaRepository;
import com.mustafa.repository.RandevuRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Random;

public class CreateRepoImpl {
    private final RandevuRepository randevuRepository;
    private final HastaRepository hastaRepository;
    private final DoktorRepository doktorRepository;
    private final BransRepository bransRepository;
    public CreateRepoImpl(){
        this.bransRepository = new BransRepository();
        this.randevuRepository = new RandevuRepository();
        this.hastaRepository = new HastaRepository();
        this.doktorRepository = new DoktorRepository();
    }

    public void  createDemoData(){
        createBrans();
        createDoktor();
        createHasta();
        createRandevu();
    }
    private void createBrans(){
       bransRepository.save(Brans.builder()
               .ad("Dahiliye")
               .build());
        bransRepository.save(Brans.builder()
                .ad("Kardiyoloji")
                .build());
        bransRepository.save(Brans.builder()
                .ad("Gogus Hastaliklari")
                .build());
        bransRepository.save(Brans.builder()
                .ad("Enfeksiyon Hastaliklari")
                .build());
        bransRepository.save(Brans.builder()
                .ad("Agiz ve Dis Sagligi")
                .build());
        bransRepository.save(Brans.builder()
                .ad("Deri ve Zuhrevi Hastaliklar")
                .build());
        bransRepository.save(Brans.builder()
                .ad("Fizik Tedavi ve Rehabilitasyon")
                .build());
        bransRepository.save(Brans.builder()
                .ad("Ortopedi ve Travmatoloji")
                .build());
        bransRepository.save(Brans.builder()
                .ad("Genel Cerrahi")
                .build());
        bransRepository.save(Brans.builder()
                .ad("Kulak Burun Bogaz")
                .build());
        bransRepository.save(Brans.builder()
                .ad("Ruh Sagligi ve Hastaliklari")
                .build());

    }

    private void createDoktor(){
       doktorRepository.save(Doktor.builder()
               .ad("Mustafa SOYUER")
               .adres("Kadikoy")
               .telefon("0 555 111 2233")
               .bransid(1L)
               .unvan("Profesor Dr.")
               .build());
        doktorRepository.save(Doktor.builder()
                .ad("Derya KAPLAN")
                .adres("Atasehir")
                .telefon("0 555 111 2234")
                .bransid(2L)
                .unvan("Profesor Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Ahmet YILDIZ")
                .adres("Kadikoy")
                .telefon("0 555 111 2235")
                .bransid(3L)
                .unvan("Profesor Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Esra BOZER")
                .adres("Maltepe")
                .telefon("0 555 111 2236")
                .bransid(4L)
                .unvan("Docent Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Turkan YILDIRIM")
                .adres("Umraniye")
                .telefon("0 555 111 2237")
                .bransid(5L)
                .unvan("Docent Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Samet BATUR")
                .adres("Uskudar")
                .telefon("0 555 111 2238")
                .bransid(6L)
                .unvan("Operator Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Bahar Ozturk")
                .adres("Kartal")
                .telefon("0 555 111 2239")
                .bransid(7L)
                .unvan("Pratisyen Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Tahir KANLI")
                .adres("Beykoz")
                .telefon("0 555 111 2240")
                .bransid(8L)
                .unvan("Docent Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Banu USLU")
                .adres("Sile")
                .telefon("0 555 111 2241")
                .bransid(9L)
                .unvan("Yardimci Docent Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Demet KALKAN")
                .adres("Kadikoy")
                .telefon("0 555 111 2242")
                .bransid(10L)
                .unvan("Yardimci Docent Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Murat SAKAOGLU")
                .adres("Tuzla")
                .telefon("0 555 111 2243")
                .bransid(11L)
                .unvan("Pratisyen Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Bahadir UZMEZ")
                .adres("Uskudar")
                .telefon("0 555 111 2244")
                .bransid(10L)
                .unvan("Uzman Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Seda ASLAN")
                .adres("Umraniye")
                .telefon("0 555 111 2245")
                .bransid(9L)
                .unvan("Docent Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Kemal SEVCAN")
                .adres("Kartal")
                .telefon("0 555 111 2246")
                .bransid(8L)
                .unvan("Uzman Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Asli ASLIHAN")
                .adres("Kadikoy")
                .telefon("0 555 111 2247")
                .bransid(7L)
                .unvan("Docent Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Ali MUTLU")
                .adres("Kadikoy")
                .telefon("0 555 111 2248")
                .bransid(6L)
                .unvan("Uzman Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Defne DURMAZ")
                .adres("Uskudar")
                .telefon("0 555 111 2249")
                .bransid(5L)
                .unvan("Operator Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Mahsun KIRMIZI")
                .adres("Kartal")
                .telefon("0 555 111 2250")
                .bransid(4L)
                .unvan("Uzman Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Meltem GUMUSCU")
                .adres("Pendik")
                .telefon("0 555 111 2251")
                .bransid(3L)
                .unvan("Docent Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Merve SOLMAZ")
                .adres("Umraniye")
                .telefon("0 555 111 2252")
                .bransid(2L)
                .unvan("Uzman Dr.")
                .build());
        doktorRepository.save(Doktor.builder()
                .ad("Bekir BARUTCU")
                .adres("Maltepe")
                .telefon("0 555 111 2253")
                .bransid(1L)
                .unvan("Docent Dr.")
                .build());

    }

    private void createHasta(){
       hastaRepository.save(Hasta.builder()
               .ad("Baris OKKAN")
               .telefon("0 555 222 3311")
               .adres("Kadikoy")
               .yas(36)
               .cinsiyet(Cinsiyet.ERKEK)
               .build());
        hastaRepository.save(Hasta.builder()
                .ad("Emine TARLAN")
                .telefon("0 555 222 3312")
                .adres("Kartal")
                .yas(54)
                .cinsiyet(Cinsiyet.KADIN)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Gunes YUKSEK")
                .telefon("0 555 222 3313")
                .adres("Maltepe")
                .yas(32)
                .cinsiyet(Cinsiyet.KADIN)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Mehmet TEMIZ")
                .telefon("0 555 222 3314")
                .adres("Tuzla")
                .yas(27)
                .cinsiyet(Cinsiyet.ERKEK)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Hilmi OZGUL")
                .telefon("0 555 222 3315")
                .adres("Atasehir")
                .yas(66)
                .cinsiyet(Cinsiyet.ERKEK)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Sevtap DALYAN")
                .telefon("0 555 222 3316")
                .adres("Beykoz")
                .yas(47)
                .cinsiyet(Cinsiyet.KADIN)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Metin TEZER")
                .telefon("0 555 222 3317")
                .adres("Pendik")
                .yas(41)
                .cinsiyet(Cinsiyet.ERKEK)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Senay AKDAG")
                .telefon("0 555 222 3318")
                .adres("Beykoz")
                .yas(26)
                .cinsiyet(Cinsiyet.KADIN)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Sebahat KARAER")
                .telefon("0 555 222 3319")
                .adres("Pendik")
                .yas(51)
                .cinsiyet(Cinsiyet.KADIN)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Davut KUCUKBAS")
                .telefon("0 555 222 3320")
                .adres("Sile")
                .yas(14)
                .cinsiyet(Cinsiyet.ERKEK)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Onder KARADAG")
                .telefon("0 555 222 3321")
                .adres("Sile")
                .yas(69)
                .cinsiyet(Cinsiyet.ERKEK)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Nihal UNALAN")
                .telefon("0 555 222 3322")
                .adres("Beykoz")
                .yas(19)
                .cinsiyet(Cinsiyet.KADIN)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Zekiye SECENGIL")
                .telefon("0 555 222 3323")
                .adres("Uskudar")
                .yas(42)
                .cinsiyet(Cinsiyet.KADIN)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Ceyda YENIK")
                .telefon("0 555 222 3324")
                .adres("Umraniye")
                .yas(33)
                .cinsiyet(Cinsiyet.KADIN)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Cemile DEVELI")
                .telefon("0 555 222 3325")
                .adres("Atasehir")
                .yas(64)
                .cinsiyet(Cinsiyet.KADIN)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Talha TASCI")
                .telefon("0 555 222 3326")
                .adres("Uskudar")
                .yas(17)
                .cinsiyet(Cinsiyet.ERKEK)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Onur YAPICI")
                .telefon("0 555 222 3327")
                .adres("Kartal")
                .yas(29)
                .cinsiyet(Cinsiyet.ERKEK)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Omur ZEYBEK")
                .telefon("0 555 222 3328")
                .adres("Maltepe")
                .yas(52)
                .cinsiyet(Cinsiyet.KADIN)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Hilal CANBAZ")
                .telefon("0 555 222 3329")
                .adres("Umraniye")
                .yas(48)
                .cinsiyet(Cinsiyet.KADIN)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Hatice DEGIRMENCI")
                .telefon("0 555 222 3330")
                .adres("Tuzla")
                .yas(27)
                .cinsiyet(Cinsiyet.KADIN)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Murat TURETMEZ")
                .telefon("0 555 222 3331")
                .adres("Atasehir")
                .yas(42)
                .cinsiyet(Cinsiyet.ERKEK)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Emre GOKDELEN")
                .telefon("0 555 222 3332")
                .adres("Maltepe")
                .yas(21)
                .cinsiyet(Cinsiyet.ERKEK)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Emrah ADALI")
                .telefon("0 555 222 3333")
                .adres("Kartal")
                .yas(35)
                .cinsiyet(Cinsiyet.ERKEK)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Aysu BAHCECI")
                .telefon("0 555 222 3334")
                .adres("Maltepe")
                .yas(39)
                .cinsiyet(Cinsiyet.KADIN)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Basak AKARSU")
                .telefon("0 555 222 3335")
                .adres("Beykoz")
                .yas(50)
                .cinsiyet(Cinsiyet.KADIN)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Emir SELAMSIZ")
                .telefon("0 555 222 3336")
                .adres("Pendik")
                .yas(22)
                .cinsiyet(Cinsiyet.ERKEK)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Ismail CANKAN")
                .telefon("0 555 222 3337")
                .adres("Tuzla")
                .yas(33)
                .cinsiyet(Cinsiyet.ERKEK)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Irem SARSILMAZ")
                .telefon("0 555 222 3338")
                .adres("Kadikoy")
                .yas(29)
                .cinsiyet(Cinsiyet.KADIN)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Meric GUCLU")
                .telefon("0 555 222 3339")
                .adres("Uskudar")
                .yas(34)
                .cinsiyet(Cinsiyet.KADIN)
                .build());
        hastaRepository.save(Hasta.builder()
                .ad("Ozan TARAKCI")
                .telefon("0 555 222 3340")
                .adres("Sile")
                .yas(48)
                .cinsiyet(Cinsiyet.ERKEK)
                .build());



    }

    private void createRandevu(){
        Random random = new Random();
        LocalDate baslangicTarihi = LocalDate.of(2023, 1, 1);
        LocalDate bitisTarihi = LocalDate.of(2023, 12, 31);

        LocalTime baslangicSaat = LocalTime.of(9, 0);
        LocalTime bitisSaat = LocalTime.of(16, 0);

        for (int i = 0; i < 200; i++) { // 200 randevu
            randevuRepository.save(Randevu.builder()
                    .doktorid(random.nextLong(1,22)) //21 tane doktor
                    .hastaid(random.nextLong(1,31)) //30 tane hasta
                    .tarih(rastgeleTarihUret(baslangicTarihi,bitisTarihi))
                    .zaman(rastgeleSaatUret(baslangicSaat,bitisSaat,10))
                    .durum(random.nextLong(1,4))
                    .build());
        }

    }
    public Long rastgeleTarihUret(LocalDate baslangic, LocalDate bitis) {
        long baslangicMillis = baslangic.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
        long bitisMillis = bitis.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();

        Random random = new Random();
        return baslangicMillis + (long) (random.nextDouble() * (bitisMillis - baslangicMillis));
    }
    public Long rastgeleSaatUret(LocalTime baslangic, LocalTime bitis, int dakikaAraligi) {
        Random random = new Random();
        int saatFarki = bitis.getHour() - baslangic.getHour();
        int dakikaFarki = bitis.getMinute() - baslangic.getMinute();

        int rastgeleSaat = baslangic.getHour() + random.nextInt(saatFarki + 1);
        int rastgeleDakika = baslangic.getMinute() + random.nextInt(dakikaFarki / dakikaAraligi + 1) * dakikaAraligi;

        return rastgeleSaat * 3600000L + rastgeleDakika * 60000L;
    }


}
