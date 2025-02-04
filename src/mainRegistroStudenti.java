public class mainRegistroStudenti {
    public static void main(String[] args) {
        
        Studente1 st1,st2,st3,st4,st5,st6;
        
        // array degli studenti, length=5 perche cosi creato dal costroctor della classe RegistroStudenti
        RegistroStudenti regStudenti= new RegistroStudenti();
       
        //new student
        st1=new Studente1("ejona1","xheka1");
        st2=new Studente1("ejona2","xheka2");
        st3=new Studente1("ejona3","xheka3");
        st4=new Studente1("ejona4","xheka4");
        st5=new Studente1("ejona5","xheka5");
        st6=new Studente1("ejona6","xheka6");
        

        regStudenti.addNewStudente(st1);
        regStudenti.addNewStudente(st5);
        regStudenti.addNewStudente(st4);
        regStudenti.addNewStudente(st2);
        regStudenti.addNewStudente(st3);
        regStudenti.addNewStudente(st6);// non è salvato nell'array perche' l'array si crea con solo 5 elementi e questo è il sesto elemento che cerchiamo di inserire nell'array degli oggetti

        // stampa nome e cognome degli studenti nell'array degli oggetti
        regStudenti.stampaListaStudenti();
  
     }
 }

class RegistroStudenti {

    private Studente1[] regStudenti;

    public RegistroStudenti (){
        this.regStudenti=new Studente1[5];
    }

    public void addNewStudente (Studente1 st){

            int indexOfLastEl=0;
            while ( indexOfLastEl < this.regStudenti.length) { 
                if (this.regStudenti[indexOfLastEl] != null) {
                    indexOfLastEl++;
                }
                else {
                    this.regStudenti[indexOfLastEl]=st;
                    return;
                }
                
            }
    }
    

    /**
     * 
     */
    public void  stampaListaStudenti(){

            String nomeCompleto;

            for (int i = 0; i < this.regStudenti.length; i++) {
                if (this.regStudenti[i] != null){
                    //nomeCompleto= this.regStudenti[i].getNome()+ " " + this.regStudenti[i].getCognome();
                    nomeCompleto= this.regStudenti[i].getDescrizzione();
                    System.out.println(nomeCompleto);
                }
            }
    }

}

class Studente1 {
        String nome;
        String cognome;
    
        public Studente1(String nome, String cognome){
            this.nome=nome;
            this.cognome=cognome;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public String getCognome() {
            return cognome;
        }
    
        public void setCogome(String cognome) {
            this.cognome = cognome;
        }

        public String getDescrizzione(){
            String stringaLunga="";
            stringaLunga +="" + nome +" " + cognome;
            
            return stringaLunga;
        }
}