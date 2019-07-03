/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopractica;

import java.util.Random;

/**
 *
 * @author ldurider
 */
public class Fake {
    
   public String letterify(String letterString) {
        
        try
        { 
            char [] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
            int charsLength = chars.length;
            Random random = new Random();
            char[] aCaracteres = letterString.toCharArray();

            for(int i=0;i<aCaracteres.length;i++){
                if(aCaracteres[i]=='?'){
                    aCaracteres[i]=chars[random.nextInt(charsLength)];
                }
            }

            //System.out.println(String.valueOf(aCaracteres));
            return String.valueOf(aCaracteres); 
        } 
        catch(NullPointerException e) 
        { 
            //System.out.println("NullPointerException Caught"); 
            return null;
        } 
    }

    public String numerify(String numberString) {
        try
        { 
            char [] chars = "0123456789".toCharArray();
            int charsLength = chars.length;
            Random random = new Random();
            char[] aCaracteres = numberString.toCharArray();

            for(int i=0;i<aCaracteres.length;i++){
                if(aCaracteres[i]=='#'){
                    aCaracteres[i]=chars[random.nextInt(charsLength)];
                }
            }

            //System.out.println(String.valueOf(aCaracteres));
            return String.valueOf(aCaracteres); 
        } 
        catch(NullPointerException e) 
        { 
            //System.out.println("NullPointerException Caught"); 
            return null;
        }
    }

    public String bothify(String string) {
        
        try
        {
            char [] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
            char [] charsNum = "0123456789".toCharArray();
            int charsLength = chars.length;
            int charsNumLength = charsNum.length;
            Random random = new Random();
            
            char[] aCaracteres = string.toCharArray();

            for(int i=0;i<aCaracteres.length;i++){
                if(aCaracteres[i]=='?'){
                    aCaracteres[i]=chars[random.nextInt(charsLength)];
                }
                else if(aCaracteres[i]=='#'){
                    aCaracteres[i]=charsNum[random.nextInt(charsNumLength)];
            }
            }

            //System.out.println(String.valueOf(aCaracteres));
            return String.valueOf(aCaracteres);
        }
        catch(NullPointerException e) 
        { 
            //System.out.println("NullPointerException Caught"); 
            return null;
        }
    }
    
}
