class mammals{
    void mam(){
        System.out.println("inside the mammal class");
    }
}

class lion extends mammals{
    void roar(){
        System.out.println("inside the lion class");
    }
}

class human extends mammals {
    void hum(){
        System.out.println("inside the human class");
    }
}
class main{
    public static void main(String args[]){
    lion obj=new lion();
    obj.mam();
    //obj.hum();
    obj.roar();
    human obj1=new human();
    obj1.hum();
    }
}