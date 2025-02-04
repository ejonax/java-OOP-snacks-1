public class mainStudente {
    public static void main(String[] args) {
        
        /*************** richiamare la classe Studente **************************/
        Studente studente1=new Studente("Ejona", "Xheka", 71);
        System.out.println( studente1.getDescrizzione());

        Studente studente2=new Studente("Paolo", "Pinzone", 43);
        System.out.println( studente2.getDescrizzione());
    }
}

class Studente {
        String nome;
        String cognome;
        int eta;

        public Studente(String nome, String cognome, int eta){
                this.nome=nome;
                this.cognome=cognome;
                this.eta=eta;
        }

        public String getDescrizzione(){
            String stringaLunga="";
            stringaLunga +="" + nome +" " + cognome + ", " + eta + " anni";
                    
            return stringaLunga;
        }
}
