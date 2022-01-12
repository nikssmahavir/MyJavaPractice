package constructer;

public class Person {
    private int id = 5;
    private String name = "veer";
    


    Person(int i){
        System.out.println("in Constructor");
    }
    Person (int id, String name){
        this.id = id;
        this.name= name;

    }
//    Person (String name,int id){
//        this.name =  name;
//        this.name= name;
//    }

    public static void main(String[] args) {
        System.out.println("b4 obj creation");
        Person person = new Person(5 ) ;
        System.out.println("after object created");
        System.out.println("id:"+person.id);
        System.out.println("name:"+person.name);




    }

}


//    public class Person {
//        private int id;
//        private String name;
//
//
//        Person (int id){
//            this.id = id;
//        }
//        Person(int id ,String name){
//            this.id = id;
//            this.name = name;
//        }
//
//    }
//}
