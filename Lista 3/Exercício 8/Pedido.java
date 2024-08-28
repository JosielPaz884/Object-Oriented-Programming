import java.util.ArrayList;
import java.util.List;

public class Pedido{
  private int number;
  private String date;
  private List<ItemPedido> item;

  public Pedido(int number,String date){
    this.number=number;
    this.date=date;
    this.item= new ArrayList<>();
  }

  public int getNumber(){
    return number;
  }

  public String getDate(){
    return date;
  }

  public List<ItemPedido> getItem(){
    return item;
  }
}
