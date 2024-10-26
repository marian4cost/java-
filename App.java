public class App{
    public static void main(String[] args) {
        //TIPOS PRIMITIVOS
        int idade = 18; // 2147483647 esse é o valor limite que o int recebe, passou disso tem que ser long
        double altura = 1.48;
        char letra = 'a';
        long inteiroGigante = 2147483648L; 

        //MEMÓRIA
        // sobre memória: int = 32 bits, double = 16 bits, char = 16 bits, long = 64 bits  

        //TIPOS NÃO PRIMITIVOS
        String texto = "mariana costa";
        
        //qual a diferença de um tipo primitivo para um não primitivo
        //um tipo não primitivo pode ser um objetivo que pode receber um atributo 
        //isso é um exemplo de atributo:
        String textoCaixaAlta = texto.toUpperCase();
        System.out.println(textoCaixaAlta);

        mostrarMeuNome("mariana");
    }

    private static void mostrarMeuNome(String nome){
        System.out.println("meu nome é " + nome);
    }
}