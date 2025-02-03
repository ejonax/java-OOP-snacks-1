
public class mainRegistroStudenti {
    public static void main(String[] args) {
       Studente1 st1,st2,st3,st4,st5;
       String nome1,nome2,nome3,nome4,nome5;
       String cognome1,cognome2,cognome3,cognome4,cognome5;;
       
 
       RegistroStudenti regSt = new RegistroStudenti();
       System.out.println(regSt);

       //new student
       st1=regSt.setNewStudent("ejona1","xheka1");
       st2=regSt.setNewStudent("ejona2","xheka2");
       st3=regSt.setNewStudent("ejona3","xheka3");
       st4=regSt.setNewStudent("ejona4","xheka4");
       st5=regSt.setNewStudent("ejona5","xheka5");
       
       // Studente1 method
       nome1=st1.getNome();
       nome2=st2.getNome();
       nome3=st3.getNome();
       nome4=st4.getNome();
       nome5=st5.getNome();
       System.out.println(nome1);

       cognome1=st1.getCognome();
       cognome2=st2.getCognome();
       cognome3=st3.getCognome();
       cognome4=st4.getCognome();
       cognome5=st5.getCognome();
       System.out.println(cognome1);

       regSt[0]=st1; // devo assegnare il nuovo studente creato st1 al RegistroStudenti ?????
       regSt[1]=st2;
       regSt[2]=st3;
       regSt[3]=st4;
       regSt[4]=st5;

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
}

    class RegistroStudenti{

        private Studente1[] regStudenti;
        Studente1 st;

        public RegistroStudenti(){
           regStudenti= new Studente1[5];
        }
    

        public Studente1 setNewStudent(String nome, String cognome){
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