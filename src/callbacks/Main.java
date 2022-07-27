package callbacks;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        hello("Jhon", null, value -> {
            System.out.println("Last name not provided for " + value);
        });
    }

    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }

    }
    //JavaScript
//    function hello(firstname, lastname, callback){
//        console.log(firstname);
//        if(lastanme){
//            console.log(lastname)
//        }else{
//            callback();
//        }
//    }

}
