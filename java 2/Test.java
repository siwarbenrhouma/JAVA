import java.io.*;
import java.util.Scanner;

public class Test {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Scanner s = new Scanner(System.in);
		System.out.println("donner le nom de l'Hero");
		String nomHeros=s.nextLine();
		System.out.println("donner le arme de l'Hero");
		String armeHeros=s.nextLine();
		System.out.println("donner le force de l'Hero");
		int forceHeros=s.nextInt();
		System.out.println("donner le point de vie de l'Hero");
		int pointdevieHeros=s.nextInt();
		s.nextLine();
		System.out.println("donner le nom du monstre");
		String nomMonstre=s.nextLine();
		System.out.println("donner le arme du monstre");
		String armeMonstre=s.nextLine();
		System.out.println("donner le force du monstre");
		int forceMonstre=s.nextInt();
		System.out.println("donner le point de vie du monstre");
		int pointdevieMonstre=s.nextInt();
		try {
			FileOutputStream f= new FileOutputStream("C:\\Users\\SIWAR\\Desktop\\ingenierie 1\\java 2\\personnes.txt");
			f.write(("hero \t"+nomHeros+"\t"+pointdevieHeros+"\t"+forceHeros+"\t"+armeHeros).getBytes());
			f.write(System.lineSeparator().getBytes());
			f.write(("Monstre \t"+nomMonstre+"\t"+pointdevieMonstre+"\t"+forceMonstre+"\t"+armeMonstre).getBytes());
			f.write(System.lineSeparator().getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		try {
			BufferedReader b= new BufferedReader(new FileReader("C:\\Users\\SIWAR\\Desktop\\ingenierie 1\\java 2\\personnes.txt"));
			BufferedWriter h=new BufferedWriter(new FileWriter("C:\\Users\\SIWAR\\Desktop\\ingenierie 1\\java 2\\hero.txt"));
			BufferedWriter m=new BufferedWriter(new FileWriter("C:\\Users\\SIWAR\\Desktop\\ingenierie 1\\java 2\\monstre.txt"));
			String S;
			while((S=b.readLine())!=null){
				if(S.startsWith("hero"))
				{
					h.write(S);
				}
				if(S.startsWith("monstre"))
				{
					m.write(S);
				}
			}
			h.close();
			m.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}