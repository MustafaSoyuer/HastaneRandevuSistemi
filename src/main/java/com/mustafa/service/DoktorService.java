package com.mustafa.service;

import com.mustafa.entity.Brans;
import com.mustafa.entity.Doktor;
import com.mustafa.entity.Hasta;
import com.mustafa.entity.Randevu;
import com.mustafa.repository.BransRepository;
import com.mustafa.repository.DoktorRepository;
import com.mustafa.repository.HastaRepository;
import com.mustafa.repository.RandevuRepository;

import java.util.List;
import java.util.Optional;

public class DoktorService {
    private final BransRepository bransRepository;
    private final DoktorRepository doktorRepository;
    private final HastaRepository hastaRepository;
    private final RandevuRepository randevuRepository;

    public DoktorService(){
        this.bransRepository = new BransRepository();
        this.doktorRepository = new DoktorRepository();
        this.hastaRepository = new HastaRepository();
        this.randevuRepository = new RandevuRepository();

    }


    /**
     * Id si verilen Doktorun baktığı randevu listesini ve sayısını veren metod
     * @param id
     */
    public void idsiVerilenDoktorunHastaSayisi(Long id){
        Optional<Doktor> doktor = doktorRepository.findById(id);
        doktor.ifPresent(d->{
            System.out.println("*** DOKTOR BILGISI ***");
            System.out.println(d);
            System.out.println();
            List<Randevu> randevuList = randevuRepository.findByColumnAndValue("doktorid",d.getId());
            randevuList.forEach(randevu -> {
                System.out.println("    ***  RANDEVU BİLGİLERİ   ***   ");
                System.out.println(randevu);
                System.out.println();
            });
            System.out.println("********************************************");
            System.out.println("Doktorun Hasta Sayısı "+randevuList.size());

        });
    }

    /**
     * Id si verilen branştaki doktorları veren metod
     * @param id
     */
    public void belliBranstaGorevYapanDoktorlar(Long id){
        Optional<Brans> brans = bransRepository.findById(id);
        brans.ifPresent(b->{
            System.out.println("*****       BRANS BİLGİLERİ     *****");
            System.out.println(b);
            System.out.println();
            List<Doktor> doktorList = doktorRepository.findByColumnAndValue("bransid",b.getId());
            doktorList.forEach(doktor -> {
                System.out.println("***     DOKTOR BILGILERI    ***");
                System.out.println(doktor);
                System.out.println();

            });
        });
    }


}
