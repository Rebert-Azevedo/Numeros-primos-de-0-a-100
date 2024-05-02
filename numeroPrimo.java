public class numeroPrimo {
    public static void main(String[] args) {

        // Laço para contar de 1 até 0 100
        for(int num = 2; num <= 100; num++){

            // Variável para verificar se o número é primo
            boolean primo = true;
            
            // Laço para verificar os divisores de 2 e a raiz quadrada do número
            for (int divisor = 2; divisor * divisor <= num; divisor++) {
                if (num % divisor ==0) {
                    primo = false;
                    break;                   
                } 
            }
            // Vai exibir caso o número seja primo
            if (primo) {
                System.err.println("N° " + num + ", ");                
            }
        }
    }
}