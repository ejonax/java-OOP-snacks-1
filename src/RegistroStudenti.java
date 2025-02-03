
public class RegistroStudenti {
    public static void main(String[] args) {
       Studente1 st1;
       String nome1;
       String cognome1;
       
 
       RegistroStudenti regSt = new RegistroStudenti();
       System.out.println(regSt);

       //new student
       st1=regSt.setNewStudent("ejonaTest", "xhekaTest");
       System.out.println(regSt.setNewStudent("ejonaTest", "xhekaTest"));

       // Studente1 method
       nome1=st1.getNome();
       System.out.println(nome1);
       cognome1=st1.getCognome();
       System.out.println(cognome1);

       regSt[0]=st1; // devo assegnare il nuovo studente creato al RegistroStudenti ?????

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
           
           
            
        
    }


    public RegistroStudenti(){
          Studente1[] regStudenti= new Studente1[5];

    }

    public Studente1 setNewStudent(String nome, String cognome){
        Studente1 st;
        return st=new Studente1(nome,cognome);

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