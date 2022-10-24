package laby.lab_2;

public class Human {
    private String name;
    //  человека две руки, две ноги и одна голова
    private Hand rightHand = new Hand(10);
    private Hand leftHand = new Hand(10);
    private Leg leftLeg = new Leg(15);
    private Leg rightLeg = new Leg(15);
    private Head head = new Head(20);
    // пол, вес, рост
    private String gender="none";
    private int weigth = 50;
    private int height = 160;

    public Human(String name){
        this.name = name;
    }

    public void setHandsLength(int hands) {
        leftHand.setHandLength(hands);
        rightHand.setHandLength(hands);
    }
    public void setLegsLength(int legs) {
        leftLeg.setLegLength(legs);
        rightLeg.setLegLength(legs);
    }

    public void setHeadSize(int size){
        head.setHeadSize(size);
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public void getInfo(){
        System.out.println("Informathion about "+name);
        System.out.println("The gender is:\t"+gender);
        System.out.println("The height is:\t"+height);
        System.out.println("The weight is:\t"+weigth);
        System.out.println("Hands length:\t"+rightHand.getHandLength());
        System.out.println("Legs length:\t"+rightLeg.getLegLength());
        System.out.println("Head size\t"+head.getHeadSize());
    }
}
