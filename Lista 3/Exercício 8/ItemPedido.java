public class ItemPedido{
  private String product;
  private int quantity;

  public ItemPedido(String product,int quantity){
    this.product=product;
    this.quantity=quantity;
  }

  public String getProduct(){
    return product;
  }

  public int getQuantity(){
    return quantity;
  }
}
