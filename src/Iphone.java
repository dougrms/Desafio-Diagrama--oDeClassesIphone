
import java.util.Scanner;

public class Iphone implements NavegadorInternet, AparelhoTelefonico , ReprodutorMusical {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Iphone iphone = new Iphone();

        int opcao;

        do { 
            System.out.println("\n Menu Principal");
            System.out.println("1. Selecionar musica");
            System.out.println("2. Tocar musica");
            System.out.println("3. Pausar musica");
            System.out.println("4. Fazer ligação");
            System.out.println("5. Atender ligação");
            System.out.println("6. Correio de voz");
            System.out.println("7. Exibir pagina na internet");
            System.out.println("8. Atualizar pagina");
            System.out.println("9. Adicionar nova aba");
            System.out.println("0. Sair");
            System.out.println("Selecione uma opção:");

            opcao = sc.nextInt();
            sc.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome da musica: ");
                    String musica = sc.nextLine();
                    iphone.selecionarMusica(musica);
                    break;

                case 2:
                    iphone.tocar();;
                    break;
                
                case 3:
                    iphone.pausar();
                    break;

                case 4:
                    System.out.println("Digite o numero para fazer a ligação: ");
                    String numero = sc.nextLine();
                    iphone.ligar(numero);
                    break;

                case 5: 
                    iphone.atender();;
                    break;
                
                case 6: 
                    iphone.iniciarCorreioVoz();
                    break;
                    
                 
                case 7:
                    System.out.println("Digite o url da pagina: ");
                    String url = sc.nextLine();
                    iphone.exibirPagina(url);

                case 8:
                    iphone.atualizarPagina();
                    break;

                case 9: 
                    iphone.adicionarNovaAba();
                    break;

                case 0:
                    System.out.println("Saindo....");
                    return;

                default:
                    System.out.println("Opção invalida");
            }


        } while (opcao != 0);



 


            


    }


                
    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("A musica selecionada foi " + musica);
                
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o numero " + numero);

    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");

    }

    @Override
    public void exibirPagina(String url) {

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    } 
    
}