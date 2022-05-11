public class Architecte extends Personne{
    private String conseilRegional;
    private Adresse adresse;
    private String telephone;
    private boolean inscriptionOrdre;

    public Architecte(String nom, String prenom, String conseilRegional, Adresse adresse, String telephone, boolean inscriptionOrdre) {
        super(nom, prenom);
        this.conseilRegional = conseilRegional;
        this.adresse = adresse;
        this.telephone = telephone;
        this.inscriptionOrdre = inscriptionOrdre;
        if (telephoneValide(telephone))
        { this.telephone = telephone; }
        else
        { this.telephone = ""; }
    }

    private boolean telephoneValide(String telephone){
        if (telephone.length()==10){
            return true;
        }else {
            return false;
        }
    }

    public void Maj_conseilRegional(String conseilRegional) {
        this.conseilRegional=conseilRegional;
    }

    @Override
    public String toString() {
        return "Architecte{" +
                "conseilRegional='" + conseilRegional + '\'' +
                ", adresse=" + adresse +
                ", telephone='" + telephone + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }
}
