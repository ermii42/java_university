package practiki.prac_10.task_2;

import practiki.prac_10.task_2.Chair;

public class Client {
    public Chair chair;
    public void sit(){
        System.out.println("Вы сели на стул");
    }
    public void setChair(Chair chair){this.chair=chair;}
}
