
public class RegistroStudenti {
    public static void main(String[] args) {
       
        Studente[] studens= new Studente[5];
        
        studens[0]=new Studente("ejona1","xheka1",41);
        studens[1]=new Studente("ejona2","xheka2",42);
        studens[2]=new Studente("ejona3","xheka3",43);
        studens[3]=new Studente("ejona4","xheka4",44);
        studens[4]=new Studente("ejona5","xheka5",45);
        System.out.println(studens[0].getNome());
    }
} 

   /* 
   class Studente {
        String nome;
        String cognome;
    
        public Studente(String nome, String cognome){
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
    }

*/