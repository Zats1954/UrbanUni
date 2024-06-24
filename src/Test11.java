public class Test11 {

    public static void main(String[] args) {
        /* Домашнее задание по теме "Debugger"*/
        int[] numbers = {2, 3, 9, -12, 4, -5, 11, 6};
        int maxOdd = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++ ){
             if(numbers[i] % 2 == 0){
                 maxOdd = Math.max(maxOdd, numbers[i]);
             }
        }
        System.out.println("max odd in list is " + maxOdd);
//---------------------------------------------------------
      String str = "Привет, Александр, с праздником, с Новым Годом";
      StringBuffer newStr = new StringBuffer();
      for(int i = 0; i < str.length(); i++){
          char tmp = str.charAt(i);
          if(Character.isUpperCase(tmp)){
              newStr.append(Character.toLowerCase(tmp));
          } else {
              newStr.append(Character.toUpperCase(tmp));
          };
      }
      System.out.println(newStr.toString());
    }
}


