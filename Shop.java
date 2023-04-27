package T72new;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Shop  {

    private  static int countProduct;


    List<Object> listPro = new LinkedList<>();


    public void addProduct(Object product){
        listPro.add(product);
        System.out.println("Товар добавлен!!!");
        countProduct++;
    }

    public void deleteProduct(String name){
        try {
            for (int i = 0; i < listPro.size();i++){
                if (listPro.get(i).toString().equals(name)){
                    listPro.remove(i);
                    System.out.println("Товар удален!!!");
                    countProduct--;
                    break;
                }
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public <T> void findToys(T age){
        for (int i = 0; i < listPro.size();i++){
            if (listPro.get(i) instanceof Toy){
               int numAge = Integer.parseInt(age.toString());
               if (numAge >= ((Toy) listPro.get(i)).getAge()){
                   System.out.println(listPro.get(i).toString());
               }
            }
        }
    }
    public <T> void findFood(T date) throws ParseException {
        for (int i = 0; i < listPro.size();i++){
            if (listPro.get(i) instanceof Food){
                if (date instanceof Date){
                    if (((Date) date).after(((Food) listPro.get(i)).getExpirationDate())){
                        System.out.println(listPro.get(i).toString());
                    }else {
                        System.out.println("Просрочен");
                    }
                } else if (date instanceof String){
                    SimpleDateFormat format = new SimpleDateFormat("yy,MM,dd");
                    Date strDate1 = format.parse((String) date);
                    if (strDate1.after(((Food) listPro.get(i)).getExpirationDate())){
                        System.out.println(listPro.get(i).toString());
                    }else{
                        System.out.println("Просрочен");
                    }
                }
            }
        }
    }
    public void size(){
        System.out.println("Товаров в магазине: " + countProduct );
    }

}
