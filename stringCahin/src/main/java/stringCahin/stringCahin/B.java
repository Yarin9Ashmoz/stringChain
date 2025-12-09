package stringCahin.stringCahin;


//מחלקה B
public class B {
    private C next;

    public B(C next) {
        this.next = next;
    }

//    public String process(String prefix) {
//        String updated = prefix + "E";
//        return next.process(updated);
//    }

   public String process(String prefix) {
      String update = next.process(prefix + "E");
      return prefix + "E";   //
   }


}