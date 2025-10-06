/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siriuscred;

/**
 *
 * @author 053280
 */
public class Urna {
    private int votoCand1;
    private int votoCand2;

    public int getVotoCand1() {
        return votoCand1;
    }

    public void setVotoCand1(int votoCand1) {
        this.votoCand1 = this.votoCand1 + votoCand1;
    }

    public int getVotoCand2() {
        return votoCand2;
    }

    public void setVotoCand2(int votoCand2) {
        this.votoCand2 = this.votoCand2 + votoCand2;
    }
    
    
}
