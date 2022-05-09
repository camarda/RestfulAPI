import java.sql.Date;

public class Prestito {
    private int ID, Libro;
    private String Utente;
    private Date inizioPrestito, finePrestito;

    public String getUtente(){
        return Utente;
    }

    public void setUtente(String utente){
        this.Utente = utente;
    }

    public int getID(){
        return ID;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public int getLibro(){
        return Libro;
    }

    public void setLibro(int Libro){
        this.Libro = Libro;
    }

    public Date getInzioPrestito(){
        return inizioPrestito;
    }

    public void setInizioPrestito(Date inizioPrestito){
        this.inizioPrestito = inizioPrestito;
    }

    public Date getFinePrestito(){
        return finePrestito;
    }

    public void setFinePrestito(Date finePrestito){
        this.finePrestito = finePrestito;
    }
}
