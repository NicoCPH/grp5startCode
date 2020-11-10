/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

/**
 *
 * @author GRP 5
 */
public class DailyDTO {
    
    String boredActivity;
    String boredType;
    String boredParticipants;
    String catMessage;
    String kanyeMessage;
    String trumpMessage;

//    public DailyDTO(BoredDTO b, CatFactsDTO c, KanyeQuotesDTO k, TrumpQuotesDTO t) {
//        this.boredActivity = b.activity;
//        this.boredType = b.type;
//        this.boredParticipants = b.participants;
//        this.catMessage = c.getFact();
//        this.kanyeMessage = k.getQuote();
//        this.trumpMessage = t.getMessage();
//    }
    
    public DailyDTO(BoredDTO b, CatFactsDTO c, TrumpQuotesDTO t) {
        this.boredActivity = b.activity;
        this.boredType = b.type;
        this.boredParticipants = b.participants;
        this.catMessage = c.getFact();
        this.kanyeMessage = "Kanye";
        this.trumpMessage = t.getMessage();
    }

    public String getBoredActivity() {
        return boredActivity;
    }

    public void setBoredActivity(String boredActivity) {
        this.boredActivity = boredActivity;
    }

    public String getBoredType() {
        return boredType;
    }

    public void setBoredType(String boredType) {
        this.boredType = boredType;
    }

    public String getBoredParticipants() {
        return boredParticipants;
    }

    public void setBoredParticipants(String boredParticipants) {
        this.boredParticipants = boredParticipants;
    }

    public String getCatMessage() {
        return catMessage;
    }

    public void setCatMessage(String catMessage) {
        this.catMessage = catMessage;
    }

    public String getKanyeMessage() {
        return kanyeMessage;
    }

    public void setKanyeMessage(String kanyeMessage) {
        this.kanyeMessage = kanyeMessage;
    }

    public String getTrumpMessage() {
        return trumpMessage;
    }

    public void setTrumpMessage(String trumpMessage) {
        this.trumpMessage = trumpMessage;
    }
    
    
    
    
    
}
