abstract class Animal implements CanMove,Enter,GoOut,Touchable,Drink {
    private String name;
    private Double weight;
    private Double height;
    private Integer age;
    private String ownerName;
    public Animal(String name,Double weight,Double height,Integer age,String ownerName){
        this.name=name;
        this.weight=weight;
        this.height=height;
        this.age=age;
        this.ownerName=ownerName;
    }

    @Override
    public void CanMove() {

    }

    @Override
    public void Drink() {

    }

    @Override
    public void Enter() {

    }

    @Override
    public void GoOut() {

    }

    @Override
    public void Touchable() {

    }

    @Override
    public String toString() {
        return "Это животное." +
                "Его зовут " + name  +
                ", и весит он " + weight +"кг"+
                ", его рост " + height +
                ", ему " + age +"годиков"+
                ", его владелец " + ownerName ;
    }
}
