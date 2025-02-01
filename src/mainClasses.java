public class mainClasses {
    public static void main(String[] args) {
        
        /*************** richiamare la classe Studente **************************/
        Studente studente1=new Studente("Ejona", "Xheka", 71);
        System.out.println( studente1.getDescrizzione());

        Studente studente2=new Studente("Paolo", "Pinzone", 43);
        System.out.println( studente2.getDescrizzione());
        /*************************************************************************/

        /************** richiamare la classe ContoBancario ************************/
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

        /*************************************************************************/
    }
}
