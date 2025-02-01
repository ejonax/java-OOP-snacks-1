public class ContoBancario {
    String numeroConto;
    double saldo;
    double saldoCorrente;

    public ContoBancario(String conto){
       numeroConto=conto;
       saldo=0;
    }

    public double getSaldoCorrente(){
        return saldo;
    }

    public String getNumeroConto(){
        return numeroConto;
    }

    public void depositareSoldi(double soldi){
        if ( soldi<=0){
            System.out.println("La cifra per depositare deve essere maggiore di 0");
        }else {
            saldoCorrente=getSaldoCorrente();
            saldo = saldoCorrente + soldi;
        }
    }

    public void prelevareSoldi(double soldi){
        if (soldi<=0) {
            System.out.println("La cifra per prelevare deve essere maggiore di 0");
        } else {
            saldoCorrente=getSaldoCorrente();
            if (saldoCorrente<soldi) {
                System.out.println("Non puoi prelevare la cifra di " + soldi + " euro dal tuo conto perchè non gli hai a disposizione momentaniamente");
            }
            else {
               saldo = saldoCorrente - soldi;
            }
        }
    }

}
