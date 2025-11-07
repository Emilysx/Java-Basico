public class Lincenca {
    String software, departamento;
    static int lincencasAtribuidas;

    public Lincenca(String software, String departamento) {
        this.software = software;
        this.departamento = departamento;
        lincencasAtribuidas++;
    }

    static int retornaLincencasAtribuidas(){
        return lincencasAtribuidas;
    }
}
