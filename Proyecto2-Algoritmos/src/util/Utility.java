/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

//import domain.EdgeWeight;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Profesor Lic. Gilberth Chaves Avila
 */
public class Utility {

    public static int random(){
        return 1+(int) Math.floor(Math.random()*99); 
    }
    
    public static int random(int bound){
        //return 1+random.nextInt(bound);
        return 1+(int) Math.floor(Math.random()*bound); 
    }
    
    public static String format(double value){
        return new DecimalFormat("###,###,###,###.##")
                .format(value);
    }
    
    public static String $format(double value){
        return new DecimalFormat("$###,###,###,###.##")
                .format(value);
    }
     public static String perFormat(double value){
         //#,##0.00 '%'
        return new DecimalFormat("#,##0.00'%'")
                .format(value);
    }
     
    public static String dateFormat(Date value) {
        return new SimpleDateFormat("dd/MM/yyyy")
                .format(value);
    }

    public static boolean equals(Object a, Object b) {
        switch(instanceOf(a, b)){
            case "integer":
               Integer x =(Integer)a; Integer y = (Integer)b;
               return x.equals(y);
            case "string":
                String s1 =(String)a; String s2 = (String)b;
               //return s1.compareTo(s2)==0; //OPCION 1
               return s1.equalsIgnoreCase(s2); //OPCION 2
            case "character":
                Character c1=(Character)a; Character c2=(Character)b;
                return c1.equals(c2);
//            case "edgeWeight":
//                EdgeWeight ew1=(EdgeWeight)a; EdgeWeight ew2=(EdgeWeight)b;
//                //return ew1.getEdge().equals(ew2.getEdge());
//                return equals(ew1.getEdge(), ew2.getEdge());
        }
        return false; //en cualquier otro caso
    }

    public static String instanceOf(Object a, Object b) {
        if(a instanceof Integer && b instanceof Integer) return "integer";
        if(a instanceof String && b instanceof String) return "string";
        if(a instanceof Character && b instanceof Character) return "character";
        //if(a instanceof EdgeWeight && b instanceof EdgeWeight) return "edgeWeight";
        return "unknown"; //desconocido
    }
    
     public static boolean lessT(Object a, Object b) {
        switch(instanceOf(a, b)){
            case "integer":
               Integer x =(Integer)a; Integer y = (Integer)b;
               return x<y;
            case "string":
                String s1 =(String)a; String s2 = (String)b;
               return s1.compareTo(s2)<0;
            case "character":
                Character c1=(Character)a; Character c2=(Character)b;
                return c1.compareTo(c2)<0;
        }
        return false; //en cualquier otro caso
    }
     

    public static boolean greaterT(Object a, Object b) {
        switch(instanceOf(a, b)){
            case "integer":
               Integer x =(Integer)a; Integer y = (Integer)b;
               return x>y;
            case "string":
                String s1 =(String)a; String s2 = (String)b;
               return s1.compareTo(s2)>0;
            case "character":
                Character c1=(Character)a; Character c2=(Character)b;
                return c1.compareTo(c2)>0;
        }
        return false; //en cualquier otro caso
    }
    
    //less or equal to (menor o igual que)
    public static boolean lessOrEqualT(Object a, Object b){
        switch(instanceOf(a, b)){
            case "integer":
                Integer x=(Integer) a; Integer y=(Integer) b;
                return x<=y;
            case "string":
                String v=(String) a; String w=(String) b;
                return v.compareToIgnoreCase(w)<=0;
            case "character":
                Character c1=(Character)a; Character c2=(Character)b;
                return c1.compareTo(c2)<=0;
        }
        return false; //en cualquier otro caso
    }

    public static Character randAlphabet() {
        char abc[] = new char[26];
        int cont=0;
        for (char i = 'a'; i <= 'z'; i++) 
            abc[cont++] = i;
        return abc[random(25)-1];
    }
    
    public static int maxArray(int[] a) {
        int max = a[0]; //first element
        for (int i = 1; i < a.length; i++) {
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }


}
