package DZ5.Farm;

public class Farm {

    private LiveStock liveStock;

    public void setNewLiveStock(LiveStock liveStock){
        this.liveStock = liveStock;
    }

    public void feedLiveStock(){
        liveStock.eat();
    }

//    public void takeProduct(){
//        if(this.liveStock instanceof GivingProduct){
//            GivingProduct givingProduct = (GivingProduct) this.liveStock;
//            givingProduct.giveProduct();
//        }else System.out.println("Это животное не даёт продукт");
//    }
    public void takeProduct(GivingProduct giveProductStock){
        giveProductStock.giveProduct();
    }

}
