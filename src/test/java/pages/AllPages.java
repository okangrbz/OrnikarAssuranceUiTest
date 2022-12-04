package pages;

public class AllPages {

    private PageConnexion pageConnexion;;
    private PageFormulaireCréerUnCompte créerUnCompte;
    private PageConnecteOrnikar pageConnecteOrnikar;
    private PageConnecteOrnikarAssurance pageConnecteOrnikarAssurance;

public AllPages(){}

     public PageConnexion pageConnexion(){

        if ((pageConnexion==null)){

            pageConnexion=new PageConnexion();

        }
        return pageConnexion;
    }


    public PageFormulaireCréerUnCompte créerUnCompte(){

        if ((créerUnCompte==null)){

            créerUnCompte=new PageFormulaireCréerUnCompte();

        }
        return créerUnCompte;
    }

    public PageConnecteOrnikar pageConnecteOrnikar(){

        if ((pageConnecteOrnikar==null)){

            pageConnecteOrnikar=new PageConnecteOrnikar();

        }
        return pageConnecteOrnikar;
    }

    public PageConnecteOrnikarAssurance pageConnecteOrnikarAssurance(){

        if ((pageConnecteOrnikarAssurance==null)){

            pageConnecteOrnikarAssurance=new PageConnecteOrnikarAssurance();

        }
        return pageConnecteOrnikarAssurance;
    }




}
