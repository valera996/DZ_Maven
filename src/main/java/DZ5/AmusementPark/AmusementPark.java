package DZ5.AmusementPark;

public class AmusementPark {

    private Attraction attraction;

    public void setNewAttraction(Attraction attraction){
        this.attraction = attraction;
    }

    public void showInfoForVisitor(){
        attraction.showInfo();
    }

    public void maintainTheAttraction(){
        attraction.showRequirements();
    }
}
