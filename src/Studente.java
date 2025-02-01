public class Studente {
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
