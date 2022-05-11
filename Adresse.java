public class Adresse {
    private String numero;
    private String voie;
    private String ville;
    private String cp;

    public Adresse(String numero, String voie, String ville, String cp) {
        this.numero = validate(numero,5);
        this.voie = validate(voie,30);
        this.ville = validate(ville,50) ;
        this.cp = validate(cp,5) ;
    }
    private String validate (String chaine, Integer taille)
    { if(chaine.length()>taille){
        chaine=chaine.substring(0,taille);
    }
        return chaine; }

}
