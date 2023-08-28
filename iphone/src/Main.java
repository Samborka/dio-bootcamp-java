import iphone.ReprodutorMusical;
import iphone.Telefone;
import iphone.NavegadorInternet;
import iphone.Camera;

public class Main {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        Telefone telefone = new Telefone();
        NavegadorInternet navegador = new NavegadorInternet();
        Camera camera = new Camera();

        // Exemplo de utilização dos métodos
        reprodutor.tocar();
        telefone.ligar();
        navegador.exibirPagina("https://www.exemplo.com");
        camera.tirarFoto();
    }
}