public class MinhaClasse {
    
    //criação de um método main, que é o ponto de entrada do programa
    public static void main (String[] args){

        String primeiroNome = "Domingos";
        String segundoNome = "Savio";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.print (nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){

        return "Resuldado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
