public class Hero {
    private String nom,arme;
    private int force,pointdevie;
    public Hero(String nom,int force, int pointdevie,String arme){
        this.nom=nom;
        this.force=force;
        this.arme=arme;
        this.pointdevie=pointdevie;
    }
    public static Hero creerHero(String s){
        String[] att=s.split("\t");
        return new Hero(att[1],Integer.parseInt(att[2]),Integer.parseInt(att[3]),att[4]);
    }
    public String getNom(){return nom;}
    public String getArme(){return arme;}
    public int getForce(){return force;}
    public int getPointdevie(){return pointdevie;}
}
