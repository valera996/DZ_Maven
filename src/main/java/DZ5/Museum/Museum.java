package DZ5.Museum;

public class Museum {

    private Exhibit exhibit;

    public void setnNewExhibit(Exhibit exhibit){
        this.exhibit = exhibit;
    }

    public void showInfoForVisitors(){
        exhibit.showInfo();
    }
    public void maintainTheExhibit(){
        exhibit.showRequirements();
    }
}
