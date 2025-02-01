
    public class Prova {
        public static void main(String[] args) {
            Persona mario = new Persona();
            mario.setNome("Mario");
            mario.setCogome("Pinzone");
    
            Persona.Hobby hobby1 = mario.new Hobby();
            hobby1.setDescrizione("Suonare il pianoforte");
    
            System.out.println(hobby1);
        }
    }
    
    class Persona {
        private String nome;
        private String cognome;
    
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
    
        class Hobby {
            private String descrizione;
    
            public String getDescrizione() {
                return descrizione;
            }
    
            public void setDescrizione(String descrizione) {
                this.descrizione = descrizione;
            }
    
            public String toString() {
                return getDescrizione() + " è l'hobby di " + getNome() +" " +getCognome();
            }
        }
    }
