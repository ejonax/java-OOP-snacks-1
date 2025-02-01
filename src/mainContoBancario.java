public class mainContoBancario {
    public static void main(String[] args) {
        ContoBancario conto1= new ContoBancario("12345EX67");
        System.out.println( "Il tuo saldo corrente è: "+ conto1.getSaldoCorrente());

        conto1.depositareSoldi(0.5);
        System.out.println( "Il tuo saldo corrente sul contoBancario " + conto1.getNumeroConto()+ " è "+ conto1.getSaldoCorrente()+ " euro");

        conto1.depositareSoldi(-10);
        System.out.println( "Il tuo saldo corrente sul contoBancario " + conto1.getNumeroConto()+ " è "+ conto1.getSaldoCorrente()+ " euro");

        conto1.depositareSoldi(100);
        System.out.println( "Il tuo saldo corrente sul contoBancario " + conto1.getNumeroConto()+ " è "+ conto1.getSaldoCorrente()+ " euro");

        conto1.prelevareSoldi(200);
        System.out.println( "Il tuo saldo corrente sul contoBancario " + conto1.getNumeroConto()+ " è "+ conto1.getSaldoCorrente()+ " euro");

        conto1.prelevareSoldi(-30);
        System.out.println( "Il tuo saldo corrente sul contoBancario " + conto1.getNumeroConto()+ " è "+ conto1.getSaldoCorrente()+ " euro");

        // 0-iamo il conto :D 
        conto1.prelevareSoldi(conto1.getSaldoCorrente());
        System.out.println( "Il tuo saldo corrente sul contoBancario " + conto1.getNumeroConto()+ " è "+ conto1.getSaldoCorrente()+ " euro");
    }
}

class ContoBancario {
    private String numeroConto;
    private double saldo;
    private double saldoCorrente;

    public ContoBancario(String conto){
       numeroConto=conto;
       saldo=0;
    }

    public double getSaldoCorrente(){
        return this.saldo;
    }

    public String getNumeroConto(){
        return this.numeroConto;
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
