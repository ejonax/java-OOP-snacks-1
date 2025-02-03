
public class RegistroStudenti {
    public static void main(String[] args) {
       
       
 
       RegistroStudenti regSt = new RegistroStudenti();
       
        /*
            Studente1[] studens= new Studente1[5];
            studens[0]=new Studente1("ejona1","xheka1");
            studens[1]=new Studente1("ejona2","xheka2");
            studens[2]=new Studente1("ejona3","xheka3");
            studens[3]=new Studente1("ejona4","xheka4");
            studens[4]=new Studente1("ejona5","xheka5");
        
            for (int i = 0; i < studens.length; i++) {
                System.out.println(studens[i].getNome()+ " " + studens[i].getCognome());
                
            }
        */
            System.out.println(regSt);

        
    }

   // costruttore per la classe RegistroStudenti
    public RegistroStudenti(){
          Studente1[] regStudenti= new Studente1[5];

    }

    public void setNewStudent(String nome, String cognome){
        Studente1  st=new Studente1(nome,cognome);

    }
   
    public void stampaRegStudenti(Studente1[] studens){
        for (int i = 0; i < studens.length; i++) {
            System.out.println(studens[i].getNome()+ " " + studens[i].getCognome());
            
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
    }