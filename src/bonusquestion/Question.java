/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonusquestion;

/**
 * Submission to bonus question
 * 
 * @author Lina's PC
 */
public class Question {
    
    private String question;
    ////////////////////////////////////////
    public Question(String question){
        this.question = question;
    }
    ////////////////////////////////////////
    public boolean isQuestion(){
        return question.endsWith("?'");
    }
    ////////////////////////////////////////
    public String toString(){
        return(question);
    }
}
