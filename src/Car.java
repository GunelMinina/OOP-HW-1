import java.util.ArrayList;
/*
Напишите класс Car.
В классе должна храниться следующая информация:
название автомобиля - model;
год выпуска - year;
стоимость - price;
цвет - color;
объем двигателя - power.
 */


public class Car {
   String model;
   int year;
   double price;
   String color;
   double power;
   boolean indrive = false;
    ArrayList<String> RoadList = new ArrayList<>();


   Car( String model, int year, double price, String color, double power){
    this.model=model;
    this.year=year;
    this.price=price;
    this.color=color;
    this.power=power;

   }

   public void getInfo(){
      System.out.println(this.model+ " " + this.year+ " " + this.price+ " " + this.color+ " " + this.power+ " ");
   }
   public void start(){
       this.indrive = true;
   }
    public void stop(){
        this.indrive = false;
    }
    public void road(String address){
       if (this.indrive){
           System.out.println(this.model + " едет по адресу: " + address);
       } else {
           System.out.println("Никуда не едем. Заведите двигатель.");
       }
   }
    public void addRoadList(String street){
       this.RoadList.add(street);
    }

    public void printRoadList(){
        System.out.println(this.RoadList);
    }

    public void drive(){
       this.start();
       for (String address : this.RoadList)
       {
           this.road(address);
       }
       this.stop();
    }
    }