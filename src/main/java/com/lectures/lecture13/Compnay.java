package com.lectures.lecture13;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Compnay {
    private String name ;
    private String dateEstablished;
    private String bulstat;

    public Compnay(String name, String dateEstablished, String bulstat) {
        this.name = name;
        this.dateEstablished = dateEstablished;
        this.bulstat = bulstat;
    }

    public String bustastSymbol(String bulstat){

        if (bulstat.length()>0 && bulstat.length()<=10){
            return bulstat;
        }
        else return "wrong" ;


    }

}
