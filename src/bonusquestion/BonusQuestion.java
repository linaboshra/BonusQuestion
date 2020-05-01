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
public class BonusQuestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Question q = new Question("'What time is it?'");
        System.out.println(q);
        System.out.println("Is this a question? " + q.isQuestion());
        System.out.println("");
        
        Question a = new Question("'Noon'");
        System.out.println(a);
        System.out.println("Is this a question? " + a.isQuestion());
    }
    
}
