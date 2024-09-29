public class Main {
    public static void main(String[] args) {
        System.out.println("¯\\_(ツ)_/¯");
        StackLL<String> myQA = new StackLL<>();
        QueueArray<String> myQA2 = new QueueArray<String>(7);
        for(int i=0; i<7; i++) {
            myQA.push("HI" + i);

        }


//        for(int i=0; i<8; i++) {
//            myQA.dequeue();
//        }
        myQA.pop();


myQA.display();

       System.out.println(myQA.size());
    }
}