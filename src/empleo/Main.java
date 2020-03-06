
package empleo;

public class Main {public static void main(String [] args){
Empleo em = new Empleo(" = Carlos");
Directiva di = new Directiva(" = Alejandro");
Oficial of = new Oficial(" = Keith");
Operativa op = new Operativa(" = Jose");
Tecnico te = new Tecnico(" = Roberto");

            System.out.println(em);
            System.out.println(di.toString()+" * Directivo."); 
            System.out.println(of.toString()+" * Oficial."); 
            System.out.println(op.toString()+" * Operativo."); 
            System.out.println(te.toString()+" * Tecnico."); 




            
}
    
}
