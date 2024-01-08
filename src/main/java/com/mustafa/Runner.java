package com.mustafa;

import com.mustafa.service.DoktorService;
import com.mustafa.service.HastaService;
import com.mustafa.utility.enums.CreateRepoImpl;

public class Runner {
    public static void main(String[] args) {
        new HastaService().idsiVerilenHastaninRandevulari(1L);
        new HastaService().adiVerilenHastaninRandevulari();
        new HastaService().belliTarihAraligindakiRandevular();
        
        new DoktorService().belliBranstaGorevYapanDoktorlar(2L);
        new DoktorService().idsiVerilenDoktorunHastaSayisi(1L);




    }
}