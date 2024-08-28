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

  public void addItem(ItemPedido items){
    item.add(items);
  }

  public void removeItem(ItemPedido items){
    item.remove(items);
  }

  public double sum(){
    double sum=0;
    for(ItemPedidos items: item){
      sum+=items.getQuantity(); 
    }
    total=sum*10;
    return total;
  }
}
