public class Main {
    public static void main(String[] args) {

        usuario usuario = new usuario("Isabela", "12345678", "isabela@gmail.com");
        usuario.autenticar();
        usuario.concederAcessos();

        usuarioAdm usuarioadm = new usuarioAdm("Murilo", "12345678", "murilo@gmail.com");
        usuarioadm.autenticar();
        usuarioadm.concederAcessos();
    }
}