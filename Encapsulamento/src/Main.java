//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 5000, 5);
        produto.setNome("Computador");
        produto.setPreco(4500);
        produto.setQuantidade(10);


        System.out.println(produto.getNome());
        System.out.println(produto.getPreco());
        System.out.println(produto.getQuantidade());




    }
}