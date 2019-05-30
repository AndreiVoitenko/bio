package bio.demo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import bio.demo.dao.InputsRepository;
import bio.demo.model.Inputs;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class InpImpl {

    @Autowired
    InputsRepository inputsRepository;

    Inputs first = new Inputs();
    Inputs second = new Inputs();
    Inputs third = new Inputs();

    public void addCards(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

        first.setAcronym("firstOne");
        first.setCultivation_conditions("kdsm");
        first.setGenus("akdfm");
        first.setIsolation_date(LocalDate.parse("1/04/2019", formatter));
        //first.setIsolation_date("10/08/2018");
        first.setIsolation_source("ioemwfd");
        first.setMALDI_score(1);
        first.setOld_nummeration("2342");
        first.setPosition_in_fridge("34");
        first.setSpecies("epord");
        first.setStorage_date(234);
        first.setSubspecies("kmsd");

        inputsRepository.save(first);


        second.setAcronym("dog");
        second.setCultivation_conditions("kdsm");
        second.setGenus("akdfm");
        second.setIsolation_date(LocalDate.parse("12/04/2019", formatter));
        //second.setIsolation_date("12/08/2018");
        second.setIsolation_source("ioqjd");
        second.setMALDI_score(2);
        second.setOld_nummeration("8473");
        second.setPosition_in_fridge("83");
        second.setSpecies("epord");
        second.setStorage_date(02341);
        second.setSubspecies("kmsd");

        inputsRepository.save(second);


        third.setAcronym("dog cat rat");
        third.setCultivation_conditions("kdsm");
        third.setGenus("akdfm");
        third.setIsolation_date(LocalDate.parse("22/04/2019", formatter));
        //third.setIsolation_date("20/08/2018");
        third.setIsolation_source("ioemwfd");
        third.setMALDI_score(3);
        third.setOld_nummeration("9801");
        third.setPosition_in_fridge("7372");
        third.setSpecies("epord");
        third.setStorage_date(902348907);
        third.setSubspecies("kmsd");

        inputsRepository.save(third);
    }
}
