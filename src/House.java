abstract class House {
    private String adress;
    private Integer postCode;
    private String ownerName;
    private Integer houseArea;//площадь дома
    private Integer residents;//кол-во проживающих
    public House(String adress,Integer postCode,String ownerName,Integer houseArea,Integer residents){
        this.adress=adress;
        this.postCode=postCode;
        this.ownerName=ownerName;
        this.houseArea=houseArea;
        this.residents=residents;

    }
    public interface CanEnter{
        void CanEnter();
    }
    public interface CanOut{
        void CanOut();
    }

    @Override
    public String toString() {
        return "House{" +
                "adress='" + adress + '\'' +
                ", postCode=" + postCode +
                ", OwnerName='" + ownerName + '\'' +
                ", houseArea=" + houseArea +
                ", residents=" + residents +
                '}';
    }
}
