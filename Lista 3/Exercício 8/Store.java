import java.util.Scanner;

public class Store{
  public static void main(String[]args){
    Scanner scanner= new Scanner(System.in);
    System.out.println("Digite o número do pedido:")
    int number= scanner.nextInt();
    System.out.println("Digite a data do pedido:")
    String date= scanner.nextLine();
    Pedido order= new Pedido(number,date);
    while(true){
      System.out.println("1-Adicionar um item no pedido");
      System.out.println("2-Remover um item no pedido");
      System.out.println("3-Concluir pedido");
      System.out.println("Escolha uma opção");
      int option=scanner.nextInt();
      System.out.println("");

      switch(option){
        case 1:
          System.out.println("Digite nome do produto:");
          String name= scanner.nextLine();
          System.out.println("Digite a quantidade do produto");
          int quantity= scanner.nextInt();
          ItemPedido item= new ItemPedido(name,quantity);
          order.addItem(item);
          Systemo.out.println("Item adicionado com sucesso");

        case 2:
          System.out.println("Digite nome do produto:");
          String name= scanner.nextLine();
          for(int x=0;x<order.size();x++){
            
          }
      }
    }
  }
}
