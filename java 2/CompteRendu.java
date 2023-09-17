import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CompteRendu {
    public static void main (String[] args){
			
        try {
            BufferedReader h= new BufferedReader(new FileReader("C:\\Users\\SIWAR\\Desktop\\ingenierie 1\\java 2\\hero.txt"));
            BufferedReader m= new BufferedReader(new FileReader("C:\\Users\\SIWAR\\Desktop\\ingenierie 1\\java 2\\monstre.txt"));
            String S;
            while((S=h.readLine())!=null){
                Hero hero=Hero.creerHero(S);
                System.out.println("hero: "+hero.getNom()+" ,force: "+hero.getForce()+" ,point de vie :"+hero.getPointdevie()+" ,Arme: "+ hero.getArme());
            }
            while((S=m.readLine())!=null){
                Monstre monstre=Monstre.creerMonstre(S);
                System.out.println("monstre: "+monstre.getNom()+" ,force: "+monstre.getForce()+" ,point de vie :"+monstre.getPointdevie()+" ,Arme: "+ monstre.getArme());
            }
            
       } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
